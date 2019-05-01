// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.keyvault;

import com.azure.common.credentials.TokenCredential;
import com.azure.common.http.HttpClient;
import com.azure.common.http.HttpPipeline;
import com.azure.common.http.policy.HttpLogDetailLevel;
import com.azure.common.http.policy.HttpLoggingPolicy;
import com.azure.common.http.policy.HttpPipelinePolicy;
import com.azure.common.http.policy.RetryPolicy;
import com.azure.common.http.policy.UserAgentPolicy;
import com.azure.keyvault.authentication.KeyVaultCredentialPolicy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This class provides a fluent builder API to help aid the configuration and instantiation of the {@link SecretClient secret client},
 * calling {@link SecretClientBuilder#build() build} constructs an instance of the client.
 *
 * <p> The minimal configuration options required by {@link SecretClientBuilder secretClientBuilder} to build {@link SecretClient}
 * are {@link String vaultEndpoint} and {@link TokenCredential credential}. </p>
 * <pre>
 * SecretClient.builder()
 *   .vaultEndpoint("https://myvault.vault.azure.net/")
 *   .credentials(keyVaultCredentials)
 *   .build();
 * </pre>
 *
 * <p>The {@link HttpLogDetailLevel log detail level}, multiple custom {@link HttpLoggingPolicy policies} and custom
 * {@link HttpClient http client} can be optionally configured in the {@link SecretClientBuilder}.</p>
 * <pre>
 * SecretClient.builder()
 *   .vaultEndpoint("https://myvault.vault.azure.net/")
 *   .credentials(keyVaultCredentials)
 *   .httpLogDetailLevel(HttpLogDetailLevel.BODY_AND_HEADERS)
 *   .addPolicy(customPolicyOne)
 *   .addPolicy(customPolicyTwo)
 *   .httpClient(client)
 *   .build();
 * </pre>
 *
 * <p>Alternatively, custom {@link HttpPipeline http pipeline} with custom {@link HttpPipelinePolicy} policies and {@link String vaultEndpoint}
 * can be specified. It provides finer control over the construction of {@link SecretClient client}</p>
 * <pre>
 * SecretClient.builder()
 *   .pipeline(new HttpPipeline(customPoliciesList))
 *   .vaultEndpoint("https://myvault.vault.azure.net/")
 *   .build()
 * </pre>
 *
 * @see SecretClient
 * */
public final class SecretClientBuilder {
    private final List<HttpPipelinePolicy> policies;
    private TokenCredential credentials;
    private HttpPipeline pipeline;
    private URL vaultEndpoint;
    private HttpClient httpClient;
    private HttpLogDetailLevel httpLogDetailLevel;
    private RetryPolicy retryPolicy;
    private String userAgent;

    SecretClientBuilder() {
        userAgent = String.format("Azure-SDK-For-Java/%s (%s)", AzureKeyVaultConfiguration.SDK_NAME, AzureKeyVaultConfiguration.SDK_VERSION);
        retryPolicy = new RetryPolicy();
        httpLogDetailLevel = HttpLogDetailLevel.NONE;
        policies = new ArrayList<>();
    }

    /**
     * Creates a {@link SecretClient} based on options set in the builder.
     * Every time {@code build()} is called, a new instance of {@link SecretClient} is created.
     *
     * <p>If {@link SecretClientBuilder#pipeline(HttpPipeline) pipeline} is set, then the {@code pipeline} and
     * {@link SecretClientBuilder#vaultEndpoint(String) serviceEndpoint} are used to create the
     * {@link SecretClientBuilder client}. All other builder settings are ignored. If {@code pipeline} is not set,
     * then {@link SecretClientBuilder#credentials(TokenCredential) key vault credentials and
     * {@link SecretClientBuilder#vaultEndpoint(String)} key vault endpoint are required to build the {@link SecretClient client}.}</p>
     *
     * @return A SecretClient with the options set from the builder.
     * @throws IllegalStateException If {@link SecretClientBuilder#credentials(TokenCredential)} or
     * {@link SecretClientBuilder#vaultEndpoint(String)} have not been set.
     */
    public SecretClient build() {

        if (vaultEndpoint == null) {
            throw new IllegalStateException(KeyVaultErrorCodeStrings.getErrorString(KeyVaultErrorCodeStrings.VAULT_END_POINT_REQUIRED));
        }

        if (pipeline != null) {
            return new SecretClient(vaultEndpoint, pipeline);
        }

        if (credentials == null) {
            throw new IllegalStateException(KeyVaultErrorCodeStrings.getErrorString(KeyVaultErrorCodeStrings.CREDENTIALS_REQUIRED));
        }

        // Closest to API goes first, closest to wire goes last.
        final List<HttpPipelinePolicy> policies = new ArrayList<>();
        policies.add(new UserAgentPolicy(userAgent));
        policies.add(retryPolicy);
        policies.add(new KeyVaultCredentialPolicy(credentials));
        policies.addAll(this.policies);
        policies.add(new HttpLoggingPolicy(httpLogDetailLevel));

        HttpPipeline pipeline = httpClient == null
            ? new HttpPipeline(policies)
            : new HttpPipeline(httpClient, policies);

        return new SecretClient(vaultEndpoint, pipeline);
    }

    /**
     * Sets the vault endpoint url to send HTTP requests to.
     *
     * @param vaultEndPoint The vault endpoint url is used as destination on Azure to send requests to.
     * @return The updated Builder object.
     * @throws IllegalStateException if {@code vaultEndpoint} is null or it cannot be parsed into a valid URL.
     */
    public SecretClientBuilder vaultEndpoint(String vaultEndPoint) {
        try {
            this.vaultEndpoint = new URL(vaultEndPoint);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("The Azure Key Vault endpoint url is malformed.");
        }
        return this;
    }

    /**
     * Sets the credentials to use when authenticating HTTP requests.
     *
     * @param credentials The credentials to use for authenticating HTTP requests.
     * @return The updated Builder object.
     * @throws NullPointerException if {@code credentials} is {@code null}.
     */
    public SecretClientBuilder credentials(TokenCredential credentials) {
        Objects.requireNonNull(credentials);
        this.credentials = credentials;
        return this;
    }

    /**
     * Sets the logging level for HTTP requests and responses.
     *
     * <p>logLevel is optional. If not provided, default value of {@link HttpLogDetailLevel#NONE} is set.</p>
     *
     * @param logLevel The amount of logging output when sending and receiving HTTP requests/responses.
     * @return The updated Builder object.
     * @throws NullPointerException if {@code logLevel} is {@code null}.
     */
    public SecretClientBuilder httpLogDetailLevel(HttpLogDetailLevel logLevel) {
        Objects.requireNonNull(logLevel);
        httpLogDetailLevel = logLevel;
        return this;
    }

    /**
     * Adds a policy to the set of existing policies that are executed after
     * {@link SecretClient} required policies.
     *
     * @param policy The {@link HttpPipelinePolicy policy} to be added.
     * @return The updated Builder object.
     * @throws NullPointerException if {@code policy} is {@code null}.
     */
    public SecretClientBuilder addPolicy(HttpPipelinePolicy policy) {
        Objects.requireNonNull(policy);
        policies.add(policy);
        return this;
    }

    /**
     * Sets the HTTP client to use for sending and receiving requests to and from the service.
     *
     * @param client The HTTP client to use for requests.
     * @return The updated Builder object.
     * @throws NullPointerException If {@code client} is {@code null}.
     */
    public SecretClientBuilder httpClient(HttpClient client) {
        Objects.requireNonNull(client);
        this.httpClient = client;
        return this;
    }

    /**
     * Sets the HTTP pipeline to use for the service client.
     *
     * If {@code pipeline} is set, all other settings are ignored, aside from
     * {@link SecretClientBuilder#vaultEndpoint(String) vaultEndpoint} to build {@link SecretClient}.
     *
     * @param pipeline The HTTP pipeline to use for sending service requests and receiving responses.
     * @return The updated {@link SecretClientBuilder} object.
     */
    public SecretClientBuilder pipeline(HttpPipeline pipeline) {
        Objects.requireNonNull(pipeline);
        this.pipeline = pipeline;
        return this;
    }
}
