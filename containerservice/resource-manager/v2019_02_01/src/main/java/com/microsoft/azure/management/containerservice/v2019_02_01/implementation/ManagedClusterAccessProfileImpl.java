/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_02_01.implementation;

import com.microsoft.azure.management.containerservice.v2019_02_01.ManagedClusterAccessProfile;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;

class ManagedClusterAccessProfileImpl extends WrapperImpl<ManagedClusterAccessProfileInner> implements ManagedClusterAccessProfile {
    private final ContainerServiceManager manager;
    ManagedClusterAccessProfileImpl(ManagedClusterAccessProfileInner inner, ContainerServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerServiceManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public byte[] kubeConfig() {
        return this.inner().kubeConfig();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
