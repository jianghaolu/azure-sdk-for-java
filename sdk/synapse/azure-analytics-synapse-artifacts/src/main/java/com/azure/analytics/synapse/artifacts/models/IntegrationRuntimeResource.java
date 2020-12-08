// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Integration runtime resource type. */
@Fluent
public final class IntegrationRuntimeResource extends AzureEntityResource {
    /*
     * Integration runtime properties.
     */
    @JsonProperty(value = "properties", required = true)
    private IntegrationRuntime properties;

    /**
     * Get the properties property: Integration runtime properties.
     *
     * @return the properties value.
     */
    public IntegrationRuntime getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Integration runtime properties.
     *
     * @param properties the properties value to set.
     * @return the IntegrationRuntimeResource object itself.
     */
    public IntegrationRuntimeResource setProperties(IntegrationRuntime properties) {
        this.properties = properties;
        return this;
    }
}
