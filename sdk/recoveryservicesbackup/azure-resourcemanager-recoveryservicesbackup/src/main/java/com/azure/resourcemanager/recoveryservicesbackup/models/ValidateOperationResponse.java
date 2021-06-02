// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Base class for validate operation response. */
@Fluent
public final class ValidateOperationResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidateOperationResponse.class);

    /*
     * Gets the validation result
     */
    @JsonProperty(value = "validationResults")
    private List<ErrorDetail> validationResults;

    /**
     * Get the validationResults property: Gets the validation result.
     *
     * @return the validationResults value.
     */
    public List<ErrorDetail> validationResults() {
        return this.validationResults;
    }

    /**
     * Set the validationResults property: Gets the validation result.
     *
     * @param validationResults the validationResults value to set.
     * @return the ValidateOperationResponse object itself.
     */
    public ValidateOperationResponse withValidationResults(List<ErrorDetail> validationResults) {
        this.validationResults = validationResults;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (validationResults() != null) {
            validationResults().forEach(e -> e.validate());
        }
    }
}
