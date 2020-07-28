/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2020_04_01.ContainerNetworkInterface;
import com.microsoft.azure.management.network.v2020_04_01.ContainerNetworkInterfaceConfiguration;
import com.microsoft.azure.management.network.v2020_04_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Network profile resource.
 */
@JsonFlatten
@SkipParentValidation
public class NetworkProfileInner extends Resource {
    /**
     * List of child container network interfaces.
     */
    @JsonProperty(value = "properties.containerNetworkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<ContainerNetworkInterface> containerNetworkInterfaces;

    /**
     * List of chid container network interface configurations.
     */
    @JsonProperty(value = "properties.containerNetworkInterfaceConfigurations")
    private List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations;

    /**
     * The resource GUID property of the network profile resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * The provisioning state of the network profile resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get list of child container network interfaces.
     *
     * @return the containerNetworkInterfaces value
     */
    public List<ContainerNetworkInterface> containerNetworkInterfaces() {
        return this.containerNetworkInterfaces;
    }

    /**
     * Get list of chid container network interface configurations.
     *
     * @return the containerNetworkInterfaceConfigurations value
     */
    public List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations() {
        return this.containerNetworkInterfaceConfigurations;
    }

    /**
     * Set list of chid container network interface configurations.
     *
     * @param containerNetworkInterfaceConfigurations the containerNetworkInterfaceConfigurations value to set
     * @return the NetworkProfileInner object itself.
     */
    public NetworkProfileInner withContainerNetworkInterfaceConfigurations(List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations) {
        this.containerNetworkInterfaceConfigurations = containerNetworkInterfaceConfigurations;
        return this;
    }

    /**
     * Get the resource GUID property of the network profile resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioning state of the network profile resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the NetworkProfileInner object itself.
     */
    public NetworkProfileInner withId(String id) {
        this.id = id;
        return this;
    }

}
