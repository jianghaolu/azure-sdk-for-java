// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.inner.ApplicationGatewayPrivateEndpointConnectionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApplicationGatewayPrivateEndpointConnectionListResult model. */
@Fluent
public final class ApplicationGatewayPrivateEndpointConnectionListResult {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ApplicationGatewayPrivateEndpointConnectionListResult.class);

    /*
     * List of private endpoint connections on an application gateway.
     */
    @JsonProperty(value = "value")
    private List<ApplicationGatewayPrivateEndpointConnectionInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of private endpoint connections on an application gateway.
     *
     * @return the value value.
     */
    public List<ApplicationGatewayPrivateEndpointConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of private endpoint connections on an application gateway.
     *
     * @param value the value value to set.
     * @return the ApplicationGatewayPrivateEndpointConnectionListResult object itself.
     */
    public ApplicationGatewayPrivateEndpointConnectionListResult withValue(
        List<ApplicationGatewayPrivateEndpointConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ApplicationGatewayPrivateEndpointConnectionListResult object itself.
     */
    public ApplicationGatewayPrivateEndpointConnectionListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
