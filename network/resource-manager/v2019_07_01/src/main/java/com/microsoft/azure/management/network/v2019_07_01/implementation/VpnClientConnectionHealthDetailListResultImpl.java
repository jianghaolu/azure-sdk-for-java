/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import com.microsoft.azure.management.network.v2019_07_01.VpnClientConnectionHealthDetailListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.network.v2019_07_01.VpnClientConnectionHealthDetail;

class VpnClientConnectionHealthDetailListResultImpl extends WrapperImpl<VpnClientConnectionHealthDetailListResultInner> implements VpnClientConnectionHealthDetailListResult {
    private final NetworkManager manager;
    VpnClientConnectionHealthDetailListResultImpl(VpnClientConnectionHealthDetailListResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public List<VpnClientConnectionHealthDetail> value() {
        return this.inner().value();
    }

}
