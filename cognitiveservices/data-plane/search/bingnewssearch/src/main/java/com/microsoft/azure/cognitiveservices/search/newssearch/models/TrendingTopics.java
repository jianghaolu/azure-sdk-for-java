/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.newssearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * The TrendingTopics model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("TrendingTopics")
public final class TrendingTopics extends Answer {
    /**
     * A list of trending news topics on Bing.
     */
    @JsonProperty(value = "value", required = true)
    private List<NewsTopic> value;

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public List<NewsTopic> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set.
     * @return the TrendingTopics object itself.
     */
    public TrendingTopics withValue(List<NewsTopic> value) {
        this.value = value;
        return this;
    }
}
