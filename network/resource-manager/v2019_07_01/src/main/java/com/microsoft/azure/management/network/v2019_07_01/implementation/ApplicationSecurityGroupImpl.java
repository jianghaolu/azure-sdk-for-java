/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationSecurityGroup;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_07_01.ProvisioningState;

class ApplicationSecurityGroupImpl extends GroupableResourceCoreImpl<ApplicationSecurityGroup, ApplicationSecurityGroupInner, ApplicationSecurityGroupImpl, NetworkManager> implements ApplicationSecurityGroup, ApplicationSecurityGroup.Definition, ApplicationSecurityGroup.Update {
    ApplicationSecurityGroupImpl(String name, ApplicationSecurityGroupInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ApplicationSecurityGroup> createResourceAsync() {
        ApplicationSecurityGroupsInner client = this.manager().inner().applicationSecurityGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ApplicationSecurityGroup> updateResourceAsync() {
        ApplicationSecurityGroupsInner client = this.manager().inner().applicationSecurityGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ApplicationSecurityGroupInner> getInnerAsync() {
        ApplicationSecurityGroupsInner client = this.manager().inner().applicationSecurityGroups();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

}
