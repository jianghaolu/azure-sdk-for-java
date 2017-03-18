/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.appservice.AppServiceOperatingSystem;
import com.microsoft.azure.management.appservice.AppServicePlan;
import com.microsoft.azure.management.appservice.AppServicePricingTier;
import com.microsoft.azure.management.appservice.FunctionApp;
import com.microsoft.azure.management.appservice.SkuDescription;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.utils.SdkContext;
import com.microsoft.azure.management.storage.SkuName;
import com.microsoft.azure.management.storage.StorageAccount;
import com.microsoft.azure.management.storage.StorageAccountKey;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Func1;

import java.util.List;

/**
 * The implementation for FunctionApp.
 */
@LangDefinition(ContainerName = "/Microsoft.Azure.Management.AppService.Fluent")
class FunctionAppImpl
    extends AppServiceBaseImpl<FunctionApp, FunctionAppImpl, FunctionApp.DefinitionStages.WithCreate, FunctionApp.Update>
    implements
        FunctionApp,
        FunctionApp.Definition,
        FunctionApp.Update,
        FunctionApp.UpdateStages.WithNewAppServicePlan {

    private Creatable<StorageAccount> storageAccountCreatable;
    private StorageAccount storageAccountToSet;
    private StorageAccount currentStorageAccount;

    FunctionAppImpl(String name, SiteInner innerObject, SiteConfigInner configObject, AppServiceManager manager) {
        super(name, innerObject, configObject, manager);
        innerObject.withKind("functionapp");
    }

    @Override
    public FunctionAppImpl withNewConsumptionPlan(String regionName) {
        return withNewAppServicePlan(regionName, AppServiceOperatingSystem.WINDOWS)
            .withPricingTier(new AppServicePricingTier("Dynamic", "Y1"));
    }

    @Override
    public FunctionApp.DefinitionStages.WithNewAppServicePlan withNewAppServicePlan(Region region) {
        return withNewAppServicePlan(region.name());
    }

    @Override
    public FunctionApp.DefinitionStages.WithNewAppServicePlan withNewAppServicePlan(String regionName) {
        return withNewAppServicePlan(regionName, AppServiceOperatingSystem.WINDOWS);
    }

    @Override
    public FunctionAppImpl withNewConsumptionPlan(Region region) {
        return withNewConsumptionPlan(region.name());
    }

    @Override
    public FunctionAppImpl withNewConsumptionPlan() {
        return withNewConsumptionPlan(regionName());
    }

    @Override
    public FunctionAppImpl withRuntimeVersion(String version) {
        return withAppSetting("FUNCTIONS_EXTENSION_VERSION", version.startsWith("~") ? version : "~" + version);
    }

    @Override
    public FunctionAppImpl withLatestRuntimeVersion() {
        return withRuntimeVersion("latest");
    }

    @Override
    Observable<SiteInner> submitAppSettings(final SiteInner site) {
        if (storageAccountCreatable != null && createdResource(storageAccountCreatable.key()) != null) {
            storageAccountToSet = (StorageAccount) createdResource(storageAccountCreatable.key());
        }
        if (storageAccountToSet == null) {
            return super.submitAppSettings(site);
        } else {
            return storageAccountToSet.getKeysAsync()
                .flatMapIterable(new Func1<List<StorageAccountKey>, Iterable<StorageAccountKey>>() {
                    @Override
                    public Iterable<StorageAccountKey> call(List<StorageAccountKey> storageAccountKeys) {
                        return storageAccountKeys;
                    }
                })
                .first().flatMap(new Func1<StorageAccountKey, Observable<SiteInner>>() {
                @Override
                public Observable<SiteInner> call(StorageAccountKey storageAccountKey) {
                    String connectionString = String.format("DefaultEndpointsProtocol=https;AccountName=%s;AccountKey=%s",
                        storageAccountToSet.name(), storageAccountKey.value());
                    withAppSetting("AzureWebJobsStorage", connectionString);
                    withAppSetting("AzureWebJobsDashboard", connectionString);
                    withAppSetting("WEBSITE_CONTENTAZUREFILECONNECTIONSTRING", connectionString);
                    withAppSetting("WEBSITE_CONTENTSHARE", SdkContext.randomResourceName(name(), 32));
                    return FunctionAppImpl.super.submitAppSettings(site);
                }
            }).doOnCompleted(new Action0() {
                    @Override
                    public void call() {
                        currentStorageAccount = storageAccountToSet;
                        storageAccountToSet = null;
                        storageAccountCreatable = null;
                    }
                });
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public FunctionAppImpl withPricingTier(AppServicePricingTier pricingTier) {
        super.withPricingTier(pricingTier);
        return autoSetAlwaysOn(pricingTier);
    }

    @Override
    @SuppressWarnings("unchecked")
    public FunctionAppImpl withExistingAppServicePlan(AppServicePlan appServicePlan) {
        super.withExistingAppServicePlan(appServicePlan);
        return autoSetAlwaysOn(appServicePlan.pricingTier());
    }

    private FunctionAppImpl autoSetAlwaysOn(AppServicePricingTier pricingTier) {
        SkuDescription description = pricingTier.toSkuDescription();
        if (description.tier().equalsIgnoreCase("Basic")
                || description.tier().equalsIgnoreCase("Standard")
                || description.tier().equalsIgnoreCase("Premium")) {
            return withWebAppAlwaysOn(true);
        } else {
            return withWebAppAlwaysOn(false);
        }
    }

    @Override
    public FunctionAppImpl withNewStorageAccount() {
        return withNewStorageAccount(SdkContext.randomResourceName(name(), 20), SkuName.STANDARD_GRS);
    }

    @Override
    public FunctionAppImpl withNewStorageAccount(String name, SkuName sku) {
        StorageAccount.DefinitionStages.WithGroup storageDefine = manager().storageManager().storageAccounts()
            .define(name)
            .withRegion(regionName());
        if (super.creatableGroup != null && isInCreateMode()) {
            storageAccountCreatable = storageDefine.withNewResourceGroup(super.creatableGroup)
                .withGeneralPurposeAccountKind()
                .withSku(sku);
        } else {
            storageAccountCreatable = storageDefine.withExistingResourceGroup(resourceGroupName())
                .withGeneralPurposeAccountKind()
                .withSku(sku);
        }
        addCreatableDependency(storageAccountCreatable);
        return this;
    }

    @Override
    public FunctionAppImpl withExistingStorageAccount(StorageAccount storageAccount) {
        this.storageAccountToSet = storageAccount;
        return this;
    }

    @Override
    public FunctionAppImpl withDailyUsageQuota(int quota) {
        inner().withDailyMemoryTimeQuota(quota);
        return this;
    }

    @Override
    public FunctionAppImpl removeDailyUsageQuota() {
        return withDailyUsageQuota(0);
    }

    @Override
    public StorageAccount storageAccount() {
        return currentStorageAccount;
    }
}