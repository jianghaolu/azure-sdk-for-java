/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.Locations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.EntityNameAvailabilityCheckOutput;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.CheckNameAvailabilityInput;

class LocationsImpl extends WrapperImpl<LocationsInner> implements Locations {
    private final MediaManager manager;

    LocationsImpl(MediaManager manager) {
        super(manager.inner().locations());
        this.manager = manager;
    }

    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public Observable<EntityNameAvailabilityCheckOutput> checkNameAvailabilityAsync(String locationName, CheckNameAvailabilityInput parameters) {
        LocationsInner client = this.inner();
        return client.checkNameAvailabilityAsync(locationName, parameters)
        .map(new Func1<EntityNameAvailabilityCheckOutputInner, EntityNameAvailabilityCheckOutput>() {
            @Override
            public EntityNameAvailabilityCheckOutput call(EntityNameAvailabilityCheckOutputInner inner) {
                return new EntityNameAvailabilityCheckOutputImpl(inner, manager());
            }
        });
    }

}
