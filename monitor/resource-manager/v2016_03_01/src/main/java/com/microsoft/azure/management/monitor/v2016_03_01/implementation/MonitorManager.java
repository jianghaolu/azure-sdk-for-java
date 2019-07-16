/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2016_03_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.monitor.v2016_03_01.AlertRules;
import com.microsoft.azure.management.monitor.v2016_03_01.AlertRuleIncidents;
import com.microsoft.azure.management.monitor.v2016_03_01.LogProfiles;
import com.microsoft.azure.management.monitor.v2016_03_01.MetricDefinitions;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Monitor resource management.
 */
public final class MonitorManager extends ManagerCore<MonitorManager, MonitorManagementClientImpl> {
    private AlertRules alertRules;
    private AlertRuleIncidents alertRuleIncidents;
    private LogProfiles logProfiles;
    private MetricDefinitions metricDefinitions;
    /**
    * Get a Configurable instance that can be used to create MonitorManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new MonitorManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of MonitorManager that exposes Monitor resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the MonitorManager
    */
    public static MonitorManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new MonitorManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of MonitorManager that exposes Monitor resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the MonitorManager
    */
    public static MonitorManager authenticate(RestClient restClient, String subscriptionId) {
        return new MonitorManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of MonitorManager that exposes Monitor management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Monitor management API entry points that work across subscriptions
        */
        MonitorManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage AlertRules.
     */
    public AlertRules alertRules() {
        if (this.alertRules == null) {
            this.alertRules = new AlertRulesImpl(this);
        }
        return this.alertRules;
    }

    /**
     * @return Entry point to manage AlertRuleIncidents.
     */
    public AlertRuleIncidents alertRuleIncidents() {
        if (this.alertRuleIncidents == null) {
            this.alertRuleIncidents = new AlertRuleIncidentsImpl(this);
        }
        return this.alertRuleIncidents;
    }

    /**
     * @return Entry point to manage LogProfiles.
     */
    public LogProfiles logProfiles() {
        if (this.logProfiles == null) {
            this.logProfiles = new LogProfilesImpl(this);
        }
        return this.logProfiles;
    }

    /**
     * @return Entry point to manage MetricDefinitions.
     */
    public MetricDefinitions metricDefinitions() {
        if (this.metricDefinitions == null) {
            this.metricDefinitions = new MetricDefinitionsImpl(this);
        }
        return this.metricDefinitions;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public MonitorManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return MonitorManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private MonitorManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new MonitorManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
