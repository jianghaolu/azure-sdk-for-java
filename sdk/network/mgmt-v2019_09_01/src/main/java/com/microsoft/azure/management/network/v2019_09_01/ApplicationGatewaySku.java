/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SKU of an application gateway.
 */
public class ApplicationGatewaySku {
    /**
     * Name of an application gateway SKU. Possible values include:
     * 'Standard_Small', 'Standard_Medium', 'Standard_Large', 'WAF_Medium',
     * 'WAF_Large', 'Standard_v2', 'WAF_v2'.
     */
    @JsonProperty(value = "name")
    private ApplicationGatewaySkuName name;

    /**
     * Tier of an application gateway. Possible values include: 'Standard',
     * 'WAF', 'Standard_v2', 'WAF_v2'.
     */
    @JsonProperty(value = "tier")
    private ApplicationGatewayTier tier;

    /**
     * Capacity (instance count) of an application gateway.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get name of an application gateway SKU. Possible values include: 'Standard_Small', 'Standard_Medium', 'Standard_Large', 'WAF_Medium', 'WAF_Large', 'Standard_v2', 'WAF_v2'.
     *
     * @return the name value
     */
    public ApplicationGatewaySkuName name() {
        return this.name;
    }

    /**
     * Set name of an application gateway SKU. Possible values include: 'Standard_Small', 'Standard_Medium', 'Standard_Large', 'WAF_Medium', 'WAF_Large', 'Standard_v2', 'WAF_v2'.
     *
     * @param name the name value to set
     * @return the ApplicationGatewaySku object itself.
     */
    public ApplicationGatewaySku withName(ApplicationGatewaySkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get tier of an application gateway. Possible values include: 'Standard', 'WAF', 'Standard_v2', 'WAF_v2'.
     *
     * @return the tier value
     */
    public ApplicationGatewayTier tier() {
        return this.tier;
    }

    /**
     * Set tier of an application gateway. Possible values include: 'Standard', 'WAF', 'Standard_v2', 'WAF_v2'.
     *
     * @param tier the tier value to set
     * @return the ApplicationGatewaySku object itself.
     */
    public ApplicationGatewaySku withTier(ApplicationGatewayTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get capacity (instance count) of an application gateway.
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set capacity (instance count) of an application gateway.
     *
     * @param capacity the capacity value to set
     * @return the ApplicationGatewaySku object itself.
     */
    public ApplicationGatewaySku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

}
