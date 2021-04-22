// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters used to update a firewall rule. */
@JsonFlatten
@Fluent
public class UpdateFirewallRuleParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateFirewallRuleParameters.class);

    /*
     * The start IP address for the firewall rule. This can be either ipv4 or
     * ipv6. Start and End should be in the same protocol.
     */
    @JsonProperty(value = "properties.startIpAddress")
    private String startIpAddress;

    /*
     * The end IP address for the firewall rule. This can be either ipv4 or
     * ipv6. Start and End should be in the same protocol.
     */
    @JsonProperty(value = "properties.endIpAddress")
    private String endIpAddress;

    /**
     * Get the startIpAddress property: The start IP address for the firewall rule. This can be either ipv4 or ipv6.
     * Start and End should be in the same protocol.
     *
     * @return the startIpAddress value.
     */
    public String startIpAddress() {
        return this.startIpAddress;
    }

    /**
     * Set the startIpAddress property: The start IP address for the firewall rule. This can be either ipv4 or ipv6.
     * Start and End should be in the same protocol.
     *
     * @param startIpAddress the startIpAddress value to set.
     * @return the UpdateFirewallRuleParameters object itself.
     */
    public UpdateFirewallRuleParameters withStartIpAddress(String startIpAddress) {
        this.startIpAddress = startIpAddress;
        return this;
    }

    /**
     * Get the endIpAddress property: The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start
     * and End should be in the same protocol.
     *
     * @return the endIpAddress value.
     */
    public String endIpAddress() {
        return this.endIpAddress;
    }

    /**
     * Set the endIpAddress property: The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start
     * and End should be in the same protocol.
     *
     * @param endIpAddress the endIpAddress value to set.
     * @return the UpdateFirewallRuleParameters object itself.
     */
    public UpdateFirewallRuleParameters withEndIpAddress(String endIpAddress) {
        this.endIpAddress = endIpAddress;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
