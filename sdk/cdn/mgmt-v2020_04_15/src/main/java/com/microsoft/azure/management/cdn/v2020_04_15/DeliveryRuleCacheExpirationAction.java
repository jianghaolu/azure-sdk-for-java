/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines the cache expiration action for the delivery rule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name", defaultImpl = DeliveryRuleCacheExpirationAction.class)
@JsonTypeName("CacheExpiration")
public class DeliveryRuleCacheExpirationAction extends DeliveryRuleAction {
    /**
     * Defines the parameters for the action.
     */
    @JsonProperty(value = "parameters", required = true)
    private CacheExpirationActionParameters parameters;

    /**
     * Get defines the parameters for the action.
     *
     * @return the parameters value
     */
    public CacheExpirationActionParameters parameters() {
        return this.parameters;
    }

    /**
     * Set defines the parameters for the action.
     *
     * @param parameters the parameters value to set
     * @return the DeliveryRuleCacheExpirationAction object itself.
     */
    public DeliveryRuleCacheExpirationAction withParameters(CacheExpirationActionParameters parameters) {
        this.parameters = parameters;
        return this;
    }

}
