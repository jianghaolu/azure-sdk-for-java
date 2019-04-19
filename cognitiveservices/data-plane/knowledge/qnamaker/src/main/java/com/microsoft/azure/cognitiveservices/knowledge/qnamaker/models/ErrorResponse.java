/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response. As per Microsoft One API guidelines -
 * https://github.com/Microsoft/api-guidelines/blob/vNext/Guidelines.md#7102-error-condition-responses.
 */
public final class ErrorResponse {
    /**
     * The error object.
     */
    @JsonProperty(value = "error")
    private ErrorResponseError error;

    /**
     * Get the error value.
     *
     * @return the error value.
     */
    public ErrorResponseError error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withError(ErrorResponseError error) {
        this.error = error;
        return this;
    }
}
