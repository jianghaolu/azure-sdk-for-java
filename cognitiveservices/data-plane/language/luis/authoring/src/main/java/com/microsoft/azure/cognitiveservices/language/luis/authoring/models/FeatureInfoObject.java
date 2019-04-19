/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The base class Features-related response objects inherit from.
 */
public class FeatureInfoObject {
    /**
     * A six-digit ID used for Features.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /**
     * The name of the Feature.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Indicates if the feature is enabled.
     */
    @JsonProperty(value = "isActive")
    private Boolean isActive;

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
     * @return the FeatureInfoObject object itself.
     */
    public FeatureInfoObject withId(Integer id) {
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
     * @return the FeatureInfoObject object itself.
     */
    public FeatureInfoObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isActive value.
     *
     * @return the isActive value.
     */
    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Set the isActive value.
     *
     * @param isActive the isActive value to set.
     * @return the FeatureInfoObject object itself.
     */
    public FeatureInfoObject withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }
}
