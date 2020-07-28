// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the copyCustomModel operation. */
public final class CopyCustomModelResponse extends ResponseBase<CopyCustomModelHeaders, Void> {
    /**
     * Creates an instance of CopyCustomModelResponse.
     *
     * @param request the request which resulted in this CopyCustomModelResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public CopyCustomModelResponse(
            HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, CopyCustomModelHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
