// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob;

import com.azure.core.configuration.Configuration;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.implementation.util.ImplUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Fluent builder for blob clients.
 */
public final class BlobClientBuilder {
    private BlobAsyncClientBuilder builder;

    BlobClientBuilder() {
        builder = new BlobAsyncClientBuilder();
    }

    /**
     * Constructs an instance of BlobClient based on the configurations stored in the builder.
     * @return a new client instance
     */
    public BlobClient build() {
        return new BlobClient(builder.build());
    }

    /**
     * Sets the service endpoint, additionally parses it for information (SAS token, blob name)
     * @param endpoint URL of the service
     * @return the updated BlobClientBuilder object
     */
    public BlobClientBuilder endpoint(String endpoint) {
        builder.endpoint(endpoint);
        return this;
    }

    /**
     * Sets the credentials used to authorize requests sent to the service
     * @param credentials authorization credentials
     * @return the updated BlobClientBuilder object
     */
    public BlobClientBuilder credentials(SharedKeyCredentials credentials) {
        builder.credentials(credentials);
        return this;
    }

    /**
     * Sets the credentials used to authorize requests sent to the service
     * @param credentials authorization credentials
     * @return the updated BlobClientBuilder object
     */
    public BlobClientBuilder credentials(TokenCredentials credentials) {
        builder.credentials(credentials);
        return this;
    }

    /**
     * Clears the credentials used to authorize requests sent to the service
     * @return the updated BlobClientBuilder object
     */
    public BlobClientBuilder anonymousCredentials() {
        builder.anonymousCredentials();
        return this;
    }

    /**
     * Sets the connection string for the service, parses it for authentication information (account name, account key)
     * @param connectionString connection string from access keys section
     * @return the updated BlobClientBuilder object
     */
    public BlobClientBuilder connectionString(String connectionString) {
        builder.connectionString(connectionString);
        return this;
    }

    /**
     * Sets the http client used to send service requests
     * @param httpClient http client to send requests
     * @return the updated BlobClientBuilder object
     */
    public BlobClientBuilder httpClient(HttpClient httpClient) {
        builder.httpClient(httpClient);
        return this;
    }

    /**
     * Adds a pipeline policy to apply on each request sent
     * @param pipelinePolicy a pipeline policy
     * @return the updated BlobClientBuilder object
     */
    public BlobClientBuilder addPolicy(HttpPipelinePolicy pipelinePolicy) {
        builder.addPolicy(pipelinePolicy);
        return this;
    }

    /**
     * Sets the logging level for service requests
     * @param logLevel logging level
     * @return the updated BlobClientBuilder object
     */
    public BlobClientBuilder httpLogDetailLevel(HttpLogDetailLevel logLevel) {
        builder.httpLogDetailLevel(logLevel);
        return this;
    }

    /**
     * Sets the configuration object used to retrieve environment configuration values used to build the client with
     * when they are not set in the builder, defaults to Configuration.NONE
     * @param configuration configuration store
     * @return the updated BlobClientBuilder object
     */
    public BlobClientBuilder configuration(Configuration configuration) {
        builder.configuration(configuration);
        return this;
    }
}
