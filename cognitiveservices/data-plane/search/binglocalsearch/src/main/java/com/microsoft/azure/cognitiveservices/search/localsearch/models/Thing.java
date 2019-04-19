/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.localsearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines a thing.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = Thing.class)
@JsonTypeName("Thing")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Intangible", value = Intangible.class),
    @JsonSubTypes.Type(name = "Place", value = Place.class),
    @JsonSubTypes.Type(name = "CreativeWork", value = CreativeWork.class)
})
public class Thing extends Response {
    /**
     * The name of the thing represented by this object.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The URL to get more information about the thing represented by this
     * object.
     */
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /**
     * Additional information about the entity such as hints that you can use
     * to determine the entity's type. To determine the entity's type, use the
     * entityScenario and entityTypeHint fields.
     */
    @JsonProperty(value = "entityPresentationInfo", access = JsonProperty.Access.WRITE_ONLY)
    private EntitiesEntityPresentationInfo entityPresentationInfo;

    /**
     * Get the name value.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the url value.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Get the entityPresentationInfo value.
     *
     * @return the entityPresentationInfo value.
     */
    public EntitiesEntityPresentationInfo entityPresentationInfo() {
        return this.entityPresentationInfo;
    }
}
