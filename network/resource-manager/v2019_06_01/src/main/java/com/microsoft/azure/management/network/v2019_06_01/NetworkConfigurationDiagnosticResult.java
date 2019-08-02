/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network configuration diagnostic result corresponded to provided traffic
 * query.
 */
public class NetworkConfigurationDiagnosticResult {
    /**
     * Network configuration diagnostic profile.
     */
    @JsonProperty(value = "profile")
    private NetworkConfigurationDiagnosticProfile profile;

    /**
     * Network security group result.
     */
    @JsonProperty(value = "networkSecurityGroupResult")
    private NetworkSecurityGroupResult networkSecurityGroupResult;

    /**
     * Get network configuration diagnostic profile.
     *
     * @return the profile value
     */
    public NetworkConfigurationDiagnosticProfile profile() {
        return this.profile;
    }

    /**
     * Set network configuration diagnostic profile.
     *
     * @param profile the profile value to set
     * @return the NetworkConfigurationDiagnosticResult object itself.
     */
    public NetworkConfigurationDiagnosticResult withProfile(NetworkConfigurationDiagnosticProfile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Get network security group result.
     *
     * @return the networkSecurityGroupResult value
     */
    public NetworkSecurityGroupResult networkSecurityGroupResult() {
        return this.networkSecurityGroupResult;
    }

    /**
     * Set network security group result.
     *
     * @param networkSecurityGroupResult the networkSecurityGroupResult value to set
     * @return the NetworkConfigurationDiagnosticResult object itself.
     */
    public NetworkConfigurationDiagnosticResult withNetworkSecurityGroupResult(NetworkSecurityGroupResult networkSecurityGroupResult) {
        this.networkSecurityGroupResult = networkSecurityGroupResult;
        return this;
    }

}
