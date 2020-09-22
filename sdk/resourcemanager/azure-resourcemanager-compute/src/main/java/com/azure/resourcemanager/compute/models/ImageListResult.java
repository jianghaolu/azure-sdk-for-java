// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.inner.ImageInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ImageListResult model. */
@Fluent
public final class ImageListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageListResult.class);

    /*
     * The list of Images.
     */
    @JsonProperty(value = "value", required = true)
    private List<ImageInner> value;

    /*
     * The uri to fetch the next page of Images. Call ListNext() with this to
     * fetch the next page of Images.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of Images.
     *
     * @return the value value.
     */
    public List<ImageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Images.
     *
     * @param value the value value to set.
     * @return the ImageListResult object itself.
     */
    public ImageListResult withValue(List<ImageInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of Images. Call ListNext() with this to fetch the next
     * page of Images.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of Images. Call ListNext() with this to fetch the next
     * page of Images.
     *
     * @param nextLink the nextLink value to set.
     * @return the ImageListResult object itself.
     */
    public ImageListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model ImageListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
