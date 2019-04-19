/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.entitysearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Defines a local entity answer.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("Places")
public final class Places extends SearchResultsAnswer {
    /**
     * A list of local entities, such as restaurants or hotels.
     */
    @JsonProperty(value = "value", required = true)
    private List<Thing> value;

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public List<Thing> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set.
     * @return the Places object itself.
     */
    public Places withValue(List<Thing> value) {
        this.value = value;
        return this;
    }
}
