/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2015_08_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.eventhubs.v2015_08_01.Operations;
import com.microsoft.azure.management.eventhubs.v2015_08_01.Namespaces;
import com.microsoft.azure.management.eventhubs.v2015_08_01.EventHubs;
import com.microsoft.azure.management.eventhubs.v2015_08_01.ConsumerGroups;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure EventHubs resource management.
 */
public final class EventHubsManager extends ManagerCore<EventHubsManager, EventHubManagementClientImpl> {
    private Operations operations;
    private Namespaces namespaces;
    private EventHubs eventHubs;
    private ConsumerGroups consumerGroups;
    /**
    * Get a Configurable instance that can be used to create EventHubsManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new EventHubsManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of EventHubsManager that exposes EventHubs resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the EventHubsManager
    */
    public static EventHubsManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new EventHubsManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of EventHubsManager that exposes EventHubs resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the EventHubsManager
    */
    public static EventHubsManager authenticate(RestClient restClient, String subscriptionId) {
        return new EventHubsManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of EventHubsManager that exposes EventHubs management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing EventHubs management API entry points that work across subscriptions
        */
        EventHubsManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Namespaces.
     */
    public Namespaces namespaces() {
        if (this.namespaces == null) {
            this.namespaces = new NamespacesImpl(this);
        }
        return this.namespaces;
    }

    /**
     * @return Entry point to manage EventHubs.
     */
    public EventHubs eventHubs() {
        if (this.eventHubs == null) {
            this.eventHubs = new EventHubsImpl(this);
        }
        return this.eventHubs;
    }

    /**
     * @return Entry point to manage ConsumerGroups.
     */
    public ConsumerGroups consumerGroups() {
        if (this.consumerGroups == null) {
            this.consumerGroups = new ConsumerGroupsImpl(this);
        }
        return this.consumerGroups;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public EventHubsManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return EventHubsManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private EventHubsManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new EventHubManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
