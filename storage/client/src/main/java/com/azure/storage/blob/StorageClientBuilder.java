// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob;

import com.azure.core.configuration.Configuration;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.implementation.util.ImplUtils;
import com.azure.storage.blob.implementation.AzureBlobStorageBuilder;
import com.azure.storage.blob.implementation.AzureBlobStorageImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Fluent StorageClientBuilder for instantiating a {@link StorageClient} or {@link StorageAsyncClient}.
 *
 * <p>
 * An instance of this builder may only be created from static method {@link StorageClient#storageClientBuilder()}.
 * The following information must be provided on this builder:
 *
 * <p><ul>
 *     <li>the endpoint through {@code .endpoint()}, in the format of {@code https://{accountName}.blob.core.windows.net}.
 *     <li>the credential through {@code .credentials()} or {@code .connectionString()} if the container is not publicly accessible.
 * </ul>
 *
 * <p>
 * Once all the configurations are set on this builder, call {@code .buildClient()} to create a
 * {@link StorageClient} or {@code .buildAsyncClient()} to create a {@link StorageAsyncClient}.
 */
public final class StorageClientBuilder {
    private static final String ACCOUNT_NAME = "AccountName".toLowerCase();
    private static final String ACCOUNT_KEY = "AccountKey".toLowerCase();

    private final List<HttpPipelinePolicy> policies;

    private URL endpoint;
    private ICredentials credentials = new AnonymousCredentials();
    private HttpClient httpClient;
    private HttpLogDetailLevel logLevel;
    private RetryPolicy retryPolicy;
    private Configuration configuration;

    public StorageClientBuilder() {
        retryPolicy = new RetryPolicy();
        logLevel = HttpLogDetailLevel.NONE;
        policies = new ArrayList<>();
    }

    private StorageClientBuilder(List<HttpPipelinePolicy> policies, URL endpoint, ICredentials credentials,
        HttpClient httpClient, HttpLogDetailLevel logLevel, RetryPolicy retryPolicy, Configuration configuration) {
        this.policies = policies;
        this.endpoint = endpoint;
        this.credentials = credentials;
        this.httpClient = httpClient;
        this.logLevel = logLevel;
        this.retryPolicy = retryPolicy;
        this.configuration = configuration;
    }

    StorageClientBuilder copyBuilder() {
        return new StorageClientBuilder(this.policies, this.endpoint, this.credentials, this.httpClient, this.logLevel, this.retryPolicy, this.configuration);
    }

    ContainerClientBuilder copyAsContainerBuilder() {
        return new ContainerClientBuilder(this.policies, this.endpoint, this.credentials, this.httpClient, this.logLevel, this.retryPolicy, this.configuration);
    }

    /**
     * Constructs an instance of ContainerAsyncClient based on the configurations stored in the appendBlobClientBuilder.
     * @return a new client instance
     */
    AzureBlobStorageImpl buildImpl() {
        Objects.requireNonNull(endpoint);

        // Closest to API goes first, closest to wire goes last.
        final List<HttpPipelinePolicy> policies = new ArrayList<>();

        policies.add(new UserAgentPolicy(BlobConfiguration.NAME, BlobConfiguration.VERSION));
        policies.add(new RequestIdPolicy());
        policies.add(new AddDatePolicy());
        policies.add(credentials); // This needs to be a different credential type.

        policies.add(retryPolicy);

        policies.addAll(this.policies);
        policies.add(new HttpLoggingPolicy(logLevel));

        HttpPipeline pipeline = HttpPipeline.builder()
            .policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient)
            .build();

        return new AzureBlobStorageBuilder()
            .url(endpoint.toString())
            .pipeline(pipeline)
            .build();
    }

    /**
     * @return a {@link StorageClient} created from the configurations in this builder.
     */
    public StorageClient buildClient() {
        return new StorageClient(this);
    }

    /**
     * @return a {@link StorageAsyncClient} created from the configurations in this builder.
     */
    public StorageAsyncClient buildAsyncClient() {
        return new StorageAsyncClient(this);
    }

    /**
     * Sets the blob service endpoint, additionally parses it for information (SAS token, queue name)
     * @param endpoint URL of the service
     * @return the updated StorageClientBuilder object
     */
    public StorageClientBuilder endpoint(String endpoint) {
        Objects.requireNonNull(endpoint);
        try {
            this.endpoint = new URL(endpoint);
        } catch (MalformedURLException ex) {
            throw new IllegalArgumentException("The Azure Storage Queue endpoint url is malformed.");
        }

        return this;
    }

    String endpoint() {
        return this.endpoint.toString();
    }

    /**
     * Sets the credentials used to authorize requests sent to the service
     * @param credentials authorization credentials
     * @return the updated ContainerClientBuilder object
     */
    public StorageClientBuilder credentials(SharedKeyCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Sets the credentials used to authorize requests sent to the service
     * @param credentials authorization credentials
     * @return the updated StorageClientBuilder object
     */
    public StorageClientBuilder credentials(TokenCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Clears the credentials used to authorize requests sent to the service
     * @return the updated StorageClientBuilder object
     */
    public StorageClientBuilder anonymousCredentials() {
        this.credentials = new AnonymousCredentials();
        return this;
    }

    /**
     * Sets the connection string for the service, parses it for authentication information (account name, account key)
     * @param connectionString connection string from access keys section
     * @return the updated StorageClientBuilder object
     */
    public StorageClientBuilder connectionString(String connectionString) {
        Objects.requireNonNull(connectionString);

        Map<String, String> connectionKVPs = new HashMap<>();
        for (String s : connectionString.split(";")) {
            String[] kvp = s.split("=", 2);
            connectionKVPs.put(kvp[0].toLowerCase(), kvp[1]);
        }

        String accountName = connectionKVPs.get(ACCOUNT_NAME);
        String accountKey = connectionKVPs.get(ACCOUNT_KEY);

        if (ImplUtils.isNullOrEmpty(accountName) || ImplUtils.isNullOrEmpty(accountKey)) {
            throw new IllegalArgumentException("Connection string must contain 'AccountName' and 'AccountKey'.");
        }

        // Use accountName and accountKey to get the SAS token using the credential class.
        credentials = new SharedKeyCredentials(accountName, accountKey);

        return this;
    }

    /**
     * Sets the http client used to send service requests
     * @param httpClient http client to send requests
     * @return the updated StorageClientBuilder object
     */
    public StorageClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /**
     * Adds a pipeline policy to apply on each request sent
     * @param pipelinePolicy a pipeline policy
     * @return the updated StorageClientBuilder object
     */
    public StorageClientBuilder addPolicy(HttpPipelinePolicy pipelinePolicy) {
        this.policies.add(pipelinePolicy);
        return this;
    }

    /**
     * Sets the logging level for service requests
     * @param logLevel logging level
     * @return the updated StorageClientBuilder object
     */
    public StorageClientBuilder httpLogDetailLevel(HttpLogDetailLevel logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * Sets the configuration object used to retrieve environment configuration values used to buildClient the client with
     * when they are not set in the appendBlobClientBuilder, defaults to Configuration.NONE
     * @param configuration configuration store
     * @return the updated StorageClientBuilder object
     */
    public StorageClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }
}
