// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The IpAddressAvailabilityResult model. */
@Fluent
public final class IpAddressAvailabilityResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpAddressAvailabilityResultInner.class);

    /*
     * Private IP address availability.
     */
    @JsonProperty(value = "available")
    private Boolean available;

    /*
     * Contains other available private IP addresses if the asked for address
     * is taken.
     */
    @JsonProperty(value = "availableIPAddresses")
    private List<String> availableIpAddresses;

    /**
     * Get the available property: Private IP address availability.
     *
     * @return the available value.
     */
    public Boolean available() {
        return this.available;
    }

    /**
     * Set the available property: Private IP address availability.
     *
     * @param available the available value to set.
     * @return the IpAddressAvailabilityResultInner object itself.
     */
    public IpAddressAvailabilityResultInner withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Get the availableIpAddresses property: Contains other available private IP addresses if the asked for address is
     * taken.
     *
     * @return the availableIpAddresses value.
     */
    public List<String> availableIpAddresses() {
        return this.availableIpAddresses;
    }

    /**
     * Set the availableIpAddresses property: Contains other available private IP addresses if the asked for address is
     * taken.
     *
     * @param availableIpAddresses the availableIpAddresses value to set.
     * @return the IpAddressAvailabilityResultInner object itself.
     */
    public IpAddressAvailabilityResultInner withAvailableIpAddresses(List<String> availableIpAddresses) {
        this.availableIpAddresses = availableIpAddresses;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
