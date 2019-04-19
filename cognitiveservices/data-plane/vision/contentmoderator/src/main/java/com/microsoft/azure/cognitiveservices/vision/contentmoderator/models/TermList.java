/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Term List  Properties.
 */
public final class TermList {
    /**
     * Term list Id.
     */
    @JsonProperty(value = "Id")
    private Integer id;

    /**
     * Term list name.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * Description for term list.
     */
    @JsonProperty(value = "Description")
    private String description;

    /**
     * Term list metadata.
     */
    @JsonProperty(value = "Metadata")
    private Map<String, String> metadata;

    /**
     * Get the id value.
     *
     * @return the id value.
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set.
     * @return the TermList object itself.
     */
    public TermList withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set.
     * @return the TermList object itself.
     */
    public TermList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set.
     * @return the TermList object itself.
     */
    public TermList withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set.
     * @return the TermList object itself.
     */
    public TermList withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
