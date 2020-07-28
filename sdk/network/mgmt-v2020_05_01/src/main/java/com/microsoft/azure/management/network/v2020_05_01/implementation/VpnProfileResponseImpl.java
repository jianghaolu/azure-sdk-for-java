/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.management.network.v2020_05_01.VpnProfileResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class VpnProfileResponseImpl extends WrapperImpl<VpnProfileResponseInner> implements VpnProfileResponse {
    private final NetworkManager manager;
    VpnProfileResponseImpl(VpnProfileResponseInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public String profileUrl() {
        return this.inner().profileUrl();
    }

}
