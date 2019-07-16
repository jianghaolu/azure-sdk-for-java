/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.management.logic.v2018_07_01_preview.IntegrationAccountSku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The integration account.
 */
@SkipParentValidation
public class IntegrationAccountInner extends Resource {
    /**
     * The integration account properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * The sku.
     */
    @JsonProperty(value = "sku")
    private IntegrationAccountSku sku;

    /**
     * Get the integration account properties.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the integration account properties.
     *
     * @param properties the properties value to set
     * @return the IntegrationAccountInner object itself.
     */
    public IntegrationAccountInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku.
     *
     * @return the sku value
     */
    public IntegrationAccountSku sku() {
        return this.sku;
    }

    /**
     * Set the sku.
     *
     * @param sku the sku value to set
     * @return the IntegrationAccountInner object itself.
     */
    public IntegrationAccountInner withSku(IntegrationAccountSku sku) {
        this.sku = sku;
        return this;
    }

}
