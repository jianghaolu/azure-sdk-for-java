/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.imagesearch.implementation;

import com.azure.common.ServiceClient;
import com.azure.common.http.HttpPipeline;
import com.azure.common.implementation.RestProxy;
import com.microsoft.azure.cognitiveservices.search.imagesearch.Images;
import com.microsoft.azure.cognitiveservices.search.imagesearch.ImageSearchClient;
import reactor.util.annotation.NonNull;

/**
 * Initializes a new instance of the ImageSearchClient type.
 */
public final class ImageSearchClientImpl extends ServiceClient implements ImageSearchClient {
    /**
     * Supported Cognitive Services endpoints (protocol and hostname, for example: "https://westus.api.cognitive.microsoft.com", "https://api.cognitive.microsoft.com").
     */
    private String endpoint;

    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example: "https://westus.api.cognitive.microsoft.com", "https://api.cognitive.microsoft.com").
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Sets Supported Cognitive Services endpoints (protocol and hostname, for example: "https://westus.api.cognitive.microsoft.com", "https://api.cognitive.microsoft.com").
     *
     * @param endpoint the endpoint value.
     * @return the service client itself.
     */
    public ImageSearchClientImpl withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * The Images object to access its operations.
     */
    private Images images;

    /**
     * Gets the Images object to access its operations.
     *
     * @return the Images object.
     */
    public Images images() {
        return this.images;
    }

    /**
     * Initializes an instance of ImageSearchClient client.
     */
    public ImageSearchClientImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of ImageSearchClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public ImageSearchClientImpl(@NonNull HttpPipeline httpPipeline) {
        super(httpPipeline);
        this.endpoint = "https://api.cognitive.microsoft.com";
        this.images = new ImagesImpl(this);
    }
}
