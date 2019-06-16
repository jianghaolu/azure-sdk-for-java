/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_04_01.AvailableResourceGroupPrivateEndpointTypes;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_04_01.LocationAvailablePrivateEndpointTypeModel;

class AvailableResourceGroupPrivateEndpointTypesImpl extends WrapperImpl<AvailableResourceGroupPrivateEndpointTypesInner> implements AvailableResourceGroupPrivateEndpointTypes {
    private final NetworkManager manager;

    AvailableResourceGroupPrivateEndpointTypesImpl(NetworkManager manager) {
        super(manager.inner().availableResourceGroupPrivateEndpointTypes());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private LocationAvailablePrivateEndpointTypeModelImpl wrapLocationAvailablePrivateEndpointTypeModelModel(AvailablePrivateEndpointTypeInner inner) {
        return  new LocationAvailablePrivateEndpointTypeModelImpl(inner, manager());
    }

    @Override
    public Observable<LocationAvailablePrivateEndpointTypeModel> listAsync(final String location, final String resourceGroupName) {
        AvailableResourceGroupPrivateEndpointTypesInner client = this.inner();
        return client.listAsync(location, resourceGroupName)
        .flatMapIterable(new Func1<Page<AvailablePrivateEndpointTypeInner>, Iterable<AvailablePrivateEndpointTypeInner>>() {
            @Override
            public Iterable<AvailablePrivateEndpointTypeInner> call(Page<AvailablePrivateEndpointTypeInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailablePrivateEndpointTypeInner, LocationAvailablePrivateEndpointTypeModel>() {
            @Override
            public LocationAvailablePrivateEndpointTypeModel call(AvailablePrivateEndpointTypeInner inner) {
                return wrapLocationAvailablePrivateEndpointTypeModelModel(inner);
            }
        });
    }

}
