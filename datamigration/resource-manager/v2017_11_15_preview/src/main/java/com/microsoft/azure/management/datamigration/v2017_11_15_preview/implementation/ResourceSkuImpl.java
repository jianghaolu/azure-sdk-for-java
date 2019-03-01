/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview.implementation;

import com.microsoft.azure.management.datamigration.v2017_11_15_preview.ResourceSku;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.datamigration.v2017_11_15_preview.ResourceSkuCapabilities;
import com.microsoft.azure.management.datamigration.v2017_11_15_preview.ResourceSkuCapacity;
import com.microsoft.azure.management.datamigration.v2017_11_15_preview.ResourceSkuCosts;
import com.microsoft.azure.management.datamigration.v2017_11_15_preview.ResourceSkuRestrictions;

class ResourceSkuImpl extends WrapperImpl<ResourceSkuInner> implements ResourceSku {
    private final DataMigrationManager manager;
    ResourceSkuImpl(ResourceSkuInner inner, DataMigrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataMigrationManager manager() {
        return this.manager;
    }

    @Override
    public List<String> apiVersions() {
        return this.inner().apiVersions();
    }

    @Override
    public List<ResourceSkuCapabilities> capabilities() {
        return this.inner().capabilities();
    }

    @Override
    public ResourceSkuCapacity capacity() {
        return this.inner().capacity();
    }

    @Override
    public List<ResourceSkuCosts> costs() {
        return this.inner().costs();
    }

    @Override
    public String family() {
        return this.inner().family();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public List<String> locations() {
        return this.inner().locations();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public List<ResourceSkuRestrictions> restrictions() {
        return this.inner().restrictions();
    }

    @Override
    public String size() {
        return this.inner().size();
    }

    @Override
    public String tier() {
        return this.inner().tier();
    }

}
