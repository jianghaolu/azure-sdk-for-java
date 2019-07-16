/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_05_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.netapp.v2019_05_01.NetAppAccount;
import rx.Observable;
import com.microsoft.azure.management.netapp.v2019_05_01.NetAppAccountPatch;
import java.util.List;
import com.microsoft.azure.management.netapp.v2019_05_01.ActiveDirectory;
import rx.functions.Func1;

class NetAppAccountImpl extends GroupableResourceCoreImpl<NetAppAccount, NetAppAccountInner, NetAppAccountImpl, NetAppManager> implements NetAppAccount, NetAppAccount.Definition, NetAppAccount.Update {
    private NetAppAccountPatch updateParameter;
    NetAppAccountImpl(String name, NetAppAccountInner inner, NetAppManager manager) {
        super(name, inner, manager);
        this.updateParameter = new NetAppAccountPatch();
    }

    @Override
    public Observable<NetAppAccount> createResourceAsync() {
        AccountsInner client = this.manager().inner().accounts();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<NetAppAccountInner, NetAppAccountInner>() {
               @Override
               public NetAppAccountInner call(NetAppAccountInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NetAppAccount> updateResourceAsync() {
        AccountsInner client = this.manager().inner().accounts();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<NetAppAccountInner, NetAppAccountInner>() {
               @Override
               public NetAppAccountInner call(NetAppAccountInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<NetAppAccountInner> getInnerAsync() {
        AccountsInner client = this.manager().inner().accounts();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new NetAppAccountPatch();
    }

    @Override
    public List<ActiveDirectory> activeDirectories() {
        return this.inner().activeDirectories();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public NetAppAccountImpl withActiveDirectories(List<ActiveDirectory> activeDirectories) {
        if (isInCreateMode()) {
            this.inner().withActiveDirectories(activeDirectories);
        } else {
            this.updateParameter.withActiveDirectories(activeDirectories);
        }
        return this;
    }

}
