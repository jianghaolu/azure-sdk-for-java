/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.autosuggest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * The Action model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = Action.class)
@JsonTypeName("Action")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SearchAction", value = SearchAction.class)
})
public class Action extends CreativeWork {
    /**
     * The result property.
     */
    @JsonProperty(value = "result", access = JsonProperty.Access.WRITE_ONLY)
    private List<Thing> result;

    /**
     * The displayName property.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * The isTopAction property.
     */
    @JsonProperty(value = "isTopAction", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isTopAction;

    /**
     * The serviceUrl property.
     */
    @JsonProperty(value = "serviceUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceUrl;

    /**
     * Get the result value.
     *
     * @return the result value.
     */
    public List<Thing> result() {
        return this.result;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the isTopAction value.
     *
     * @return the isTopAction value.
     */
    public Boolean isTopAction() {
        return this.isTopAction;
    }

    /**
     * Get the serviceUrl value.
     *
     * @return the serviceUrl value.
     */
    public String serviceUrl() {
        return this.serviceUrl;
    }
}
