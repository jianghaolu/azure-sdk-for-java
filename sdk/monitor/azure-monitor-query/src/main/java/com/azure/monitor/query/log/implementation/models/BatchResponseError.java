// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error response for a batch request. */
@Fluent
public final class BatchResponseError {
    /*
     * The error message describing the cause of the error.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The error code
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The innerError property.
     */
    @JsonProperty(value = "innerError")
    private BatchResponseErrorInnerError innerError;

    /**
     * Get the message property: The error message describing the cause of the error.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The error message describing the cause of the error.
     *
     * @param message the message value to set.
     * @return the BatchResponseError object itself.
     */
    public BatchResponseError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the code property: The error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: The error code.
     *
     * @param code the code value to set.
     * @return the BatchResponseError object itself.
     */
    public BatchResponseError setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the innerError property: The innerError property.
     *
     * @return the innerError value.
     */
    public BatchResponseErrorInnerError getInnerError() {
        return this.innerError;
    }

    /**
     * Set the innerError property: The innerError property.
     *
     * @param innerError the innerError value to set.
     * @return the BatchResponseError object itself.
     */
    public BatchResponseError setInnerError(BatchResponseErrorInnerError innerError) {
        this.innerError = innerError;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getInnerError() != null) {
            getInnerError().validate();
        }
    }
}
