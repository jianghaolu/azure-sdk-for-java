/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview.implementation;

import com.microsoft.azure.management.datamigration.v2018_07_15_preview.AvailableServiceSku;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.datamigration.v2018_07_15_preview.AvailableServiceSkuCapacity;
import com.microsoft.azure.management.datamigration.v2018_07_15_preview.AvailableServiceSkuSku;

class AvailableServiceSkuImpl extends WrapperImpl<AvailableServiceSkuInner> implements AvailableServiceSku {
    private final DataMigrationManager manager;

    AvailableServiceSkuImpl(AvailableServiceSkuInner inner,  DataMigrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataMigrationManager manager() {
        return this.manager;
    }



    @Override
    public AvailableServiceSkuCapacity capacity() {
        return this.inner().capacity();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public AvailableServiceSkuSku sku() {
        return this.inner().sku();
    }

}
