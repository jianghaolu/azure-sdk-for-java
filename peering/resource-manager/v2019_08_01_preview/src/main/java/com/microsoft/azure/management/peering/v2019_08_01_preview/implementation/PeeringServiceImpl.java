/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_08_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.peering.v2019_08_01_preview.PeeringService;
import rx.Observable;
import com.microsoft.azure.management.peering.v2019_08_01_preview.ProvisioningState;

class PeeringServiceImpl extends GroupableResourceCoreImpl<PeeringService, PeeringServiceInner, PeeringServiceImpl, PeeringManager> implements PeeringService, PeeringService.Definition, PeeringService.Update {
    PeeringServiceImpl(String name, PeeringServiceInner inner, PeeringManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<PeeringService> createResourceAsync() {
        PeeringServicesInner client = this.manager().inner().peeringServices();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PeeringService> updateResourceAsync() {
        PeeringServicesInner client = this.manager().inner().peeringServices();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PeeringServiceInner> getInnerAsync() {
        PeeringServicesInner client = this.manager().inner().peeringServices();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String peeringServiceLocation() {
        return this.inner().peeringServiceLocation();
    }

    @Override
    public String peeringServiceProvider() {
        return this.inner().peeringServiceProvider();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PeeringServiceImpl withPeeringServiceLocation(String peeringServiceLocation) {
        this.inner().withPeeringServiceLocation(peeringServiceLocation);
        return this;
    }

    @Override
    public PeeringServiceImpl withPeeringServiceProvider(String peeringServiceProvider) {
        this.inner().withPeeringServiceProvider(peeringServiceProvider);
        return this;
    }

}
