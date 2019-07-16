/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_02_01.CircuitConnectionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Peer Express Route Circuit Connection in an ExpressRouteCircuitPeering
 * resource.
 */
@JsonFlatten
public class PeerExpressRouteCircuitConnectionInner extends SubResource {
    /**
     * Reference to Express Route Circuit Private Peering Resource of the
     * circuit.
     */
    @JsonProperty(value = "properties.expressRouteCircuitPeering")
    private SubResource expressRouteCircuitPeering;

    /**
     * Reference to Express Route Circuit Private Peering Resource of the
     * peered circuit.
     */
    @JsonProperty(value = "properties.peerExpressRouteCircuitPeering")
    private SubResource peerExpressRouteCircuitPeering;

    /**
     * /29 IP address space to carve out Customer addresses for tunnels.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /**
     * Express Route Circuit connection state. Possible values include:
     * 'Connected', 'Connecting', 'Disconnected'.
     */
    @JsonProperty(value = "properties.circuitConnectionStatus")
    private CircuitConnectionStatus circuitConnectionStatus;

    /**
     * The name of the express route circuit connection resource.
     */
    @JsonProperty(value = "properties.connectionName")
    private String connectionName;

    /**
     * The resource guid of the authorization used for the express route
     * circuit connection.
     */
    @JsonProperty(value = "properties.authResourceGuid")
    private String authResourceGuid;

    /**
     * Provisioning state of the peer express route circuit connection
     * resource. Possible values are: 'Succeeded', 'Updating', 'Deleting', and
     * 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get reference to Express Route Circuit Private Peering Resource of the circuit.
     *
     * @return the expressRouteCircuitPeering value
     */
    public SubResource expressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }

    /**
     * Set reference to Express Route Circuit Private Peering Resource of the circuit.
     *
     * @param expressRouteCircuitPeering the expressRouteCircuitPeering value to set
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withExpressRouteCircuitPeering(SubResource expressRouteCircuitPeering) {
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        return this;
    }

    /**
     * Get reference to Express Route Circuit Private Peering Resource of the peered circuit.
     *
     * @return the peerExpressRouteCircuitPeering value
     */
    public SubResource peerExpressRouteCircuitPeering() {
        return this.peerExpressRouteCircuitPeering;
    }

    /**
     * Set reference to Express Route Circuit Private Peering Resource of the peered circuit.
     *
     * @param peerExpressRouteCircuitPeering the peerExpressRouteCircuitPeering value to set
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withPeerExpressRouteCircuitPeering(SubResource peerExpressRouteCircuitPeering) {
        this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
        return this;
    }

    /**
     * Get /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @return the addressPrefix value
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @param addressPrefix the addressPrefix value to set
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get express Route Circuit connection state. Possible values include: 'Connected', 'Connecting', 'Disconnected'.
     *
     * @return the circuitConnectionStatus value
     */
    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    /**
     * Set express Route Circuit connection state. Possible values include: 'Connected', 'Connecting', 'Disconnected'.
     *
     * @param circuitConnectionStatus the circuitConnectionStatus value to set
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withCircuitConnectionStatus(CircuitConnectionStatus circuitConnectionStatus) {
        this.circuitConnectionStatus = circuitConnectionStatus;
        return this;
    }

    /**
     * Get the name of the express route circuit connection resource.
     *
     * @return the connectionName value
     */
    public String connectionName() {
        return this.connectionName;
    }

    /**
     * Set the name of the express route circuit connection resource.
     *
     * @param connectionName the connectionName value to set
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * Get the resource guid of the authorization used for the express route circuit connection.
     *
     * @return the authResourceGuid value
     */
    public String authResourceGuid() {
        return this.authResourceGuid;
    }

    /**
     * Set the resource guid of the authorization used for the express route circuit connection.
     *
     * @param authResourceGuid the authResourceGuid value to set
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withAuthResourceGuid(String authResourceGuid) {
        this.authResourceGuid = authResourceGuid;
        return this;
    }

    /**
     * Get provisioning state of the peer express route circuit connection resource. Possible values are: 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get gets name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
