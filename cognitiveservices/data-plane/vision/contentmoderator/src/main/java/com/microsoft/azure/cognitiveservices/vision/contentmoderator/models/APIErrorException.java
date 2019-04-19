/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import com.azure.common.exception.ServiceRequestException;
import com.azure.common.http.HttpResponse;

/**
 * Exception thrown for an invalid response with APIError information.
 */
public final class APIErrorException extends ServiceRequestException {
    /**
     * Initializes a new instance of the APIErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public APIErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the APIErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public APIErrorException(String message, HttpResponse response, APIError value) {
        super(message, response, value);
    }

    @Override
    public APIError value() {
        return (APIError) super.value();
    }
}
