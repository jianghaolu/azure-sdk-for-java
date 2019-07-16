/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Tenant access information update parameters.
 */
@JsonFlatten
public class AccessInformationUpdateParameters {
    /**
     * Determines whether direct access is enabled.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Get determines whether direct access is enabled.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set determines whether direct access is enabled.
     *
     * @param enabled the enabled value to set
     * @return the AccessInformationUpdateParameters object itself.
     */
    public AccessInformationUpdateParameters withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
