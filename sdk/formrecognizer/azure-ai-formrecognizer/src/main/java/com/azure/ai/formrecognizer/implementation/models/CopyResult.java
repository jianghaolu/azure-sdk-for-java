// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.ai.formrecognizer.models.ErrorInformation;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** The CopyResult model. */
@Fluent
public final class CopyResult {
    /*
     * Identifier of the target model.
     */
    @JsonProperty(value = "modelId", required = true)
    private UUID modelId;

    /*
     * Errors returned during the copy operation.
     */
    @JsonProperty(value = "errors")
    private List<ErrorInformation> errors;

    /**
     * Get the modelId property: Identifier of the target model.
     *
     * @return the modelId value.
     */
    public UUID getModelId() {
        return this.modelId;
    }

    /**
     * Set the modelId property: Identifier of the target model.
     *
     * @param modelId the modelId value to set.
     * @return the CopyResult object itself.
     */
    public CopyResult setModelId(UUID modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Get the errors property: Errors returned during the copy operation.
     *
     * @return the errors value.
     */
    public List<ErrorInformation> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: Errors returned during the copy operation.
     *
     * @param errors the errors value to set.
     * @return the CopyResult object itself.
     */
    public CopyResult setErrors(List<ErrorInformation> errors) {
        this.errors = errors;
        return this;
    }
}
