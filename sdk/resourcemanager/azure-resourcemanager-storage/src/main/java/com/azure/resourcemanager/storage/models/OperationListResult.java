// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.fluent.inner.OperationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OperationListResult model. */
@Fluent
public final class OperationListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationListResult.class);

    /*
     * List of Storage operations supported by the Storage resource provider.
     */
    @JsonProperty(value = "value")
    private List<OperationInner> value;

    /**
     * Get the value property: List of Storage operations supported by the Storage resource provider.
     *
     * @return the value value.
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Storage operations supported by the Storage resource provider.
     *
     * @param value the value value to set.
     * @return the OperationListResult object itself.
     */
    public OperationListResult withValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
