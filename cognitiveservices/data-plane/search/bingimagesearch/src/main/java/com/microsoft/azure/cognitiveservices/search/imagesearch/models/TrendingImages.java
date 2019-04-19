/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.imagesearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * The top-level object that the response includes when a trending images
 * request succeeds.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("TrendingImages")
public final class TrendingImages extends Response {
    /**
     * A list that identifies categories of images and a list of trending
     * images in that category.
     */
    @JsonProperty(value = "categories", required = true)
    private List<TrendingImagesCategory> categories;

    /**
     * Get the categories value.
     *
     * @return the categories value.
     */
    public List<TrendingImagesCategory> categories() {
        return this.categories;
    }

    /**
     * Set the categories value.
     *
     * @param categories the categories value to set.
     * @return the TrendingImages object itself.
     */
    public TrendingImages withCategories(List<TrendingImagesCategory> categories) {
        this.categories = categories;
        return this;
    }
}
