// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the getProperties operation.
 */
public final class ServicesGetPropertiesResponse extends ResponseBase<ServiceGetPropertiesHeaders, FileServiceProperties> {
    /**
     * Creates an instance of ServicesGetPropertiesResponse.
     *
     * @param request the request which resulted in this ServicesGetPropertiesResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ServicesGetPropertiesResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, FileServiceProperties value, ServiceGetPropertiesHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public FileServiceProperties value() {
        return super.value();
    }
}
