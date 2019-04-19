/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 * The base child entity type.
 */
public class ChildEntity {
    /**
     * The ID (GUID) belonging to a child entity.
     */
    @JsonProperty(value = "id", required = true)
    private UUID id;

    /**
     * The name of a child entity.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the id value.
     *
     * @return the id value.
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set.
     * @return the ChildEntity object itself.
     */
    public ChildEntity withId(UUID id) {
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
     * @return the ChildEntity object itself.
     */
    public ChildEntity withName(String name) {
        this.name = name;
        return this;
    }
}
