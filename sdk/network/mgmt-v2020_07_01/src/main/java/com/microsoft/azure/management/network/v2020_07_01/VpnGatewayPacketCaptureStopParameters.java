/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Stop packet capture parameters.
 */
public class VpnGatewayPacketCaptureStopParameters {
    /**
     * SAS url for packet capture on vpn gateway.
     */
    @JsonProperty(value = "sasUrl")
    private String sasUrl;

    /**
     * Get sAS url for packet capture on vpn gateway.
     *
     * @return the sasUrl value
     */
    public String sasUrl() {
        return this.sasUrl;
    }

    /**
     * Set sAS url for packet capture on vpn gateway.
     *
     * @param sasUrl the sasUrl value to set
     * @return the VpnGatewayPacketCaptureStopParameters object itself.
     */
    public VpnGatewayPacketCaptureStopParameters withSasUrl(String sasUrl) {
        this.sasUrl = sasUrl;
        return this;
    }

}
