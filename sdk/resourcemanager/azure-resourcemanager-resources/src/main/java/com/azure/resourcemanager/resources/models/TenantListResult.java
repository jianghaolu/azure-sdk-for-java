// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.fluent.inner.TenantIdDescriptionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TenantListResult model. */
@Fluent
public final class TenantListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TenantListResult.class);

    /*
     * An array of tenants.
     */
    @JsonProperty(value = "value")
    private List<TenantIdDescriptionInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink", required = true)
    private String nextLink;

    /**
     * Get the value property: An array of tenants.
     *
     * @return the value value.
     */
    public List<TenantIdDescriptionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of tenants.
     *
     * @param value the value value to set.
     * @return the TenantListResult object itself.
     */
    public TenantListResult withValue(List<TenantIdDescriptionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the TenantListResult object itself.
     */
    public TenantListResult withNextLink(String nextLink) {
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
        if (nextLink() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property nextLink in model TenantListResult"));
        }
    }
}
