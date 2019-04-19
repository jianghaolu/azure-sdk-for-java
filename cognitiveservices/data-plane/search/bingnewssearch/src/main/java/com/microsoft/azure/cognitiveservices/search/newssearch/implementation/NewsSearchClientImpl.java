/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.newssearch.implementation;

import com.azure.common.ServiceClient;
import com.azure.common.http.HttpPipeline;
import com.azure.common.implementation.RestProxy;
import com.microsoft.azure.cognitiveservices.search.newssearch.News;
import com.microsoft.azure.cognitiveservices.search.newssearch.NewsSearchClient;
import reactor.util.annotation.NonNull;

/**
 * Initializes a new instance of the NewsSearchClient type.
 */
public final class NewsSearchClientImpl extends ServiceClient implements NewsSearchClient {
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
    public NewsSearchClientImpl withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * The News object to access its operations.
     */
    private News news;

    /**
     * Gets the News object to access its operations.
     *
     * @return the News object.
     */
    public News news() {
        return this.news;
    }

    /**
     * Initializes an instance of NewsSearchClient client.
     */
    public NewsSearchClientImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of NewsSearchClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public NewsSearchClientImpl(@NonNull HttpPipeline httpPipeline) {
        super(httpPipeline);
        this.endpoint = "https://api.cognitive.microsoft.com";
        this.news = new NewsImpl(this);
    }
}
