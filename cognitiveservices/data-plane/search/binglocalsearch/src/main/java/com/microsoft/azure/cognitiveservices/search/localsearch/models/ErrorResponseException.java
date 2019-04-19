/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.localsearch.models;

import com.azure.common.exception.ServiceRequestException;
import com.azure.common.http.HttpResponse;

/**
 * Exception thrown for an invalid response with ErrorResponse information.
 */
public final class ErrorResponseException extends ServiceRequestException {
    /**
     * Initializes a new instance of the ErrorResponseException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public ErrorResponseException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ErrorResponseException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public ErrorResponseException(String message, HttpResponse response, ErrorResponse value) {
        super(message, response, value);
    }

    @Override
    public ErrorResponse value() {
        return (ErrorResponse) super.value();
    }
}
