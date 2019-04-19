/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.azure.common.http.HttpRequest;
import com.azure.common.http.rest.ResponseBase;
import java.util.Map;

/**
 * Contains all response data for the recognizeText operation.
 */
public final class RecognizeTextResponse extends ResponseBase<RecognizeTextHeaders, Void> {
    /**
     * Creates an instance of RecognizeTextResponse.
     *
     * @param request the request which resulted in this RecognizeTextResponse.
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     */
    public RecognizeTextResponse(HttpRequest request, int statusCode, RecognizeTextHeaders headers, Map<String, String> rawHeaders, Void value) {
        super(request, statusCode, headers, rawHeaders, value);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public RecognizeTextHeaders headers() {
        return super.headers();
    }
}
