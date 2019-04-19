/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.customimagesearch.implementation;

import com.azure.common.ServiceClient;
import com.azure.common.http.HttpPipeline;
import com.azure.common.implementation.RestProxy;
import com.microsoft.azure.cognitiveservices.search.customimagesearch.CustomImageSearchClient;
import com.microsoft.azure.cognitiveservices.search.customimagesearch.CustomInstances;
import reactor.util.annotation.NonNull;

/**
 * Initializes a new instance of the CustomImageSearchClient type.
 */
public final class CustomImageSearchClientImpl extends ServiceClient implements CustomImageSearchClient {
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
    public CustomImageSearchClientImpl withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * The CustomInstances object to access its operations.
     */
    private CustomInstances customInstances;

    /**
     * Gets the CustomInstances object to access its operations.
     *
     * @return the CustomInstances object.
     */
    public CustomInstances customInstances() {
        return this.customInstances;
    }

    /**
     * Initializes an instance of CustomImageSearchClient client.
     */
    public CustomImageSearchClientImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of CustomImageSearchClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public CustomImageSearchClientImpl(@NonNull HttpPipeline httpPipeline) {
        super(httpPipeline);
        this.endpoint = "https://api.cognitive.microsoft.com";
        this.customInstances = new CustomInstancesImpl(this);
    }
}
