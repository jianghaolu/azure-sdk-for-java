/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mixedreality.v2019_02_28_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.mixedreality.v2019_02_28_preview.SpatialAnchorsAccount;
import rx.Observable;

class SpatialAnchorsAccountImpl extends GroupableResourceCoreImpl<SpatialAnchorsAccount, SpatialAnchorsAccountInner, SpatialAnchorsAccountImpl, MixedRealityManager> implements SpatialAnchorsAccount, SpatialAnchorsAccount.Definition, SpatialAnchorsAccount.Update {
    SpatialAnchorsAccountImpl(String name, SpatialAnchorsAccountInner inner, MixedRealityManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<SpatialAnchorsAccount> createResourceAsync() {
        SpatialAnchorsAccountsInner client = this.manager().inner().spatialAnchorsAccounts();
        return client.createAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SpatialAnchorsAccount> updateResourceAsync() {
        SpatialAnchorsAccountsInner client = this.manager().inner().spatialAnchorsAccounts();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SpatialAnchorsAccountInner> getInnerAsync() {
        SpatialAnchorsAccountsInner client = this.manager().inner().spatialAnchorsAccounts();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String accountDomain() {
        return this.inner().accountDomain();
    }

    @Override
    public String accountId() {
        return this.inner().accountId();
    }
}
