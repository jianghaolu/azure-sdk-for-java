// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.scanning;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.Configuration;
import com.azure.core.util.serializer.JsonSerializerProviders;
import com.azure.core.util.serializer.ObjectSerializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** A builder for creating a new instance of the MicrosoftScanningClient type. */
@ServiceClientBuilder(
        serviceClients = {
            AzureKeyVaultsClient.class,
            BloomFilterClient.class,
            ClassificationRulesClient.class,
            DataSourcesClient.class,
            DataSourceClient.class,
            FiltersClient.class,
            ScansClient.class,
            ScanRulesetsClient.class,
            SystemScanRulesetsClient.class,
            SystemScanRulesetSettingsClient.class,
            TriggersClient.class
        })
public final class MicrosoftScanningClientBuilder {
    private static final String SDK_NAME = "name";

    private static final String SDK_VERSION = "version";

    static final String[] DEFAULT_SCOPES = new String[] {"https://purview.azure.net/.default"};

    private final Map<String, String> properties = new HashMap<>();

    /** Create an instance of the MicrosoftScanningClientBuilder. */
    public MicrosoftScanningClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The name of your purview account
     */
    private String accountName;

    /**
     * Sets The name of your purview account.
     *
     * @param accountName the accountName value.
     * @return the MicrosoftScanningClientBuilder.
     */
    public MicrosoftScanningClientBuilder accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /*
     * Api Version
     */
    private String apiVersion;

    /**
     * Sets Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the MicrosoftScanningClientBuilder.
     */
    public MicrosoftScanningClientBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /*
     * The serializer to serialize an object into a string.
     */
    private ObjectSerializer objectSerializer;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param objectSerializer the objectSerializer value.
     * @return the MicrosoftScanningClientBuilder.
     */
    public MicrosoftScanningClientBuilder objectSerializer(ObjectSerializer objectSerializer) {
        this.objectSerializer = objectSerializer;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the MicrosoftScanningClientBuilder.
     */
    public MicrosoftScanningClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    private HttpClient httpClient;

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the MicrosoftScanningClientBuilder.
     */
    public MicrosoftScanningClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    private Configuration configuration;

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the MicrosoftScanningClientBuilder.
     */
    public MicrosoftScanningClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The TokenCredential used for authentication.
     */
    private TokenCredential tokenCredential;

    /**
     * Sets The TokenCredential used for authentication.
     *
     * @param tokenCredential the tokenCredential value.
     * @return the MicrosoftScanningClientBuilder.
     */
    public MicrosoftScanningClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    private HttpLogOptions httpLogOptions;

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the MicrosoftScanningClientBuilder.
     */
    public MicrosoftScanningClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the MicrosoftScanningClientBuilder.
     */
    public MicrosoftScanningClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /*
     * The list of Http pipeline policies to add.
     */
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the MicrosoftScanningClientBuilder.
     */
    public MicrosoftScanningClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        if (tokenCredential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPES));
        }
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        policies.add(
                new UserAgentPolicy(httpLogOptions.getApplicationId(), clientName, clientVersion, buildConfiguration));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(retryPolicy == null ? new RetryPolicy() : retryPolicy);
        policies.add(new CookiePolicy());
        policies.addAll(this.pipelinePolicies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of AzureKeyVaultsClient low level client.
     *
     * @return an instance of AzureKeyVaultsClient.
     */
    public AzureKeyVaultsClient buildAzureKeyVaultsClient() {
        if (apiVersion == null) {
            this.apiVersion = "2018-12-01-preview";
        }
        if (objectSerializer == null) {
            this.objectSerializer = JsonSerializerProviders.createInstance();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        AzureKeyVaultsClient client = new AzureKeyVaultsClient(accountName, apiVersion, pipeline, objectSerializer);
        return client;
    }

    /**
     * Builds an instance of BloomFilterClient low level client.
     *
     * @return an instance of BloomFilterClient.
     */
    public BloomFilterClient buildBloomFilterClient() {
        if (apiVersion == null) {
            this.apiVersion = "2018-12-01-preview";
        }
        if (objectSerializer == null) {
            this.objectSerializer = JsonSerializerProviders.createInstance();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        BloomFilterClient client = new BloomFilterClient(accountName, apiVersion, pipeline, objectSerializer);
        return client;
    }

    /**
     * Builds an instance of ClassificationRulesClient low level client.
     *
     * @return an instance of ClassificationRulesClient.
     */
    public ClassificationRulesClient buildClassificationRulesClient() {
        if (apiVersion == null) {
            this.apiVersion = "2018-12-01-preview";
        }
        if (objectSerializer == null) {
            this.objectSerializer = JsonSerializerProviders.createInstance();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        ClassificationRulesClient client =
                new ClassificationRulesClient(accountName, apiVersion, pipeline, objectSerializer);
        return client;
    }

    /**
     * Builds an instance of DataSourcesClient low level client.
     *
     * @return an instance of DataSourcesClient.
     */
    public DataSourcesClient buildDataSourcesClient() {
        if (apiVersion == null) {
            this.apiVersion = "2018-12-01-preview";
        }
        if (objectSerializer == null) {
            this.objectSerializer = JsonSerializerProviders.createInstance();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        DataSourcesClient client = new DataSourcesClient(accountName, apiVersion, pipeline, objectSerializer);
        return client;
    }

    /**
     * Builds an instance of DataSourceClient low level client.
     *
     * @return an instance of DataSourceClient.
     */
    public DataSourceClient buildDataSourceClient() {
        if (apiVersion == null) {
            this.apiVersion = "2018-12-01-preview";
        }
        if (objectSerializer == null) {
            this.objectSerializer = JsonSerializerProviders.createInstance();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        DataSourceClient client = new DataSourceClient(accountName, apiVersion, pipeline, objectSerializer);
        return client;
    }

    /**
     * Builds an instance of FiltersClient low level client.
     *
     * @return an instance of FiltersClient.
     */
    public FiltersClient buildFiltersClient() {
        if (apiVersion == null) {
            this.apiVersion = "2018-12-01-preview";
        }
        if (objectSerializer == null) {
            this.objectSerializer = JsonSerializerProviders.createInstance();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        FiltersClient client = new FiltersClient(accountName, apiVersion, pipeline, objectSerializer);
        return client;
    }

    /**
     * Builds an instance of ScansClient low level client.
     *
     * @return an instance of ScansClient.
     */
    public ScansClient buildScansClient() {
        if (apiVersion == null) {
            this.apiVersion = "2018-12-01-preview";
        }
        if (objectSerializer == null) {
            this.objectSerializer = JsonSerializerProviders.createInstance();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        ScansClient client = new ScansClient(accountName, apiVersion, pipeline, objectSerializer);
        return client;
    }

    /**
     * Builds an instance of ScanRulesetsClient low level client.
     *
     * @return an instance of ScanRulesetsClient.
     */
    public ScanRulesetsClient buildScanRulesetsClient() {
        if (apiVersion == null) {
            this.apiVersion = "2018-12-01-preview";
        }
        if (objectSerializer == null) {
            this.objectSerializer = JsonSerializerProviders.createInstance();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        ScanRulesetsClient client = new ScanRulesetsClient(accountName, apiVersion, pipeline, objectSerializer);
        return client;
    }

    /**
     * Builds an instance of SystemScanRulesetsClient low level client.
     *
     * @return an instance of SystemScanRulesetsClient.
     */
    public SystemScanRulesetsClient buildSystemScanRulesetsClient() {
        if (apiVersion == null) {
            this.apiVersion = "2018-12-01-preview";
        }
        if (objectSerializer == null) {
            this.objectSerializer = JsonSerializerProviders.createInstance();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        SystemScanRulesetsClient client =
                new SystemScanRulesetsClient(accountName, apiVersion, pipeline, objectSerializer);
        return client;
    }

    /**
     * Builds an instance of SystemScanRulesetSettingsClient low level client.
     *
     * @return an instance of SystemScanRulesetSettingsClient.
     */
    public SystemScanRulesetSettingsClient buildSystemScanRulesetSettingsClient() {
        if (apiVersion == null) {
            this.apiVersion = "2018-12-01-preview";
        }
        if (objectSerializer == null) {
            this.objectSerializer = JsonSerializerProviders.createInstance();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        SystemScanRulesetSettingsClient client =
                new SystemScanRulesetSettingsClient(accountName, apiVersion, pipeline, objectSerializer);
        return client;
    }

    /**
     * Builds an instance of TriggersClient low level client.
     *
     * @return an instance of TriggersClient.
     */
    public TriggersClient buildTriggersClient() {
        if (apiVersion == null) {
            this.apiVersion = "2018-12-01-preview";
        }
        if (objectSerializer == null) {
            this.objectSerializer = JsonSerializerProviders.createInstance();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        TriggersClient client = new TriggersClient(accountName, apiVersion, pipeline, objectSerializer);
        return client;
    }
}
