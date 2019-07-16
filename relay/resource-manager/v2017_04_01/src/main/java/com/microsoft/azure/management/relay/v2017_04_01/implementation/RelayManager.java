/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2017_04_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.relay.v2017_04_01.Operations;
import com.microsoft.azure.management.relay.v2017_04_01.Namespaces;
import com.microsoft.azure.management.relay.v2017_04_01.HybridConnections;
import com.microsoft.azure.management.relay.v2017_04_01.WCFRelays;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Relay resource management.
 */
public final class RelayManager extends ManagerCore<RelayManager, RelayManagementClientImpl> {
    private Operations operations;
    private Namespaces namespaces;
    private HybridConnections hybridConnections;
    private WCFRelays wCFRelays;
    /**
    * Get a Configurable instance that can be used to create RelayManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new RelayManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of RelayManager that exposes Relay resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the RelayManager
    */
    public static RelayManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new RelayManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of RelayManager that exposes Relay resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the RelayManager
    */
    public static RelayManager authenticate(RestClient restClient, String subscriptionId) {
        return new RelayManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of RelayManager that exposes Relay management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Relay management API entry points that work across subscriptions
        */
        RelayManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
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
     * @return Entry point to manage HybridConnections.
     */
    public HybridConnections hybridConnections() {
        if (this.hybridConnections == null) {
            this.hybridConnections = new HybridConnectionsImpl(this);
        }
        return this.hybridConnections;
    }

    /**
     * @return Entry point to manage WCFRelays.
     */
    public WCFRelays wCFRelays() {
        if (this.wCFRelays == null) {
            this.wCFRelays = new WCFRelaysImpl(this);
        }
        return this.wCFRelays;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public RelayManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return RelayManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private RelayManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new RelayManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
