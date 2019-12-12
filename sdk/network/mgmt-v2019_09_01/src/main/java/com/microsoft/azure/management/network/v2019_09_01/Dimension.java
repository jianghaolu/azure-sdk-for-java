/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dimension of the metric.
 */
public class Dimension {
    /**
     * The name of the dimension.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The display name of the dimension.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The internal name of the dimension.
     */
    @JsonProperty(value = "internalName")
    private String internalName;

    /**
     * Get the name of the dimension.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the dimension.
     *
     * @param name the name value to set
     * @return the Dimension object itself.
     */
    public Dimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display name of the dimension.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the dimension.
     *
     * @param displayName the displayName value to set
     * @return the Dimension object itself.
     */
    public Dimension withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the internal name of the dimension.
     *
     * @return the internalName value
     */
    public String internalName() {
        return this.internalName;
    }

    /**
     * Set the internal name of the dimension.
     *
     * @param internalName the internalName value to set
     * @return the Dimension object itself.
     */
    public Dimension withInternalName(String internalName) {
        this.internalName = internalName;
        return this;
    }

}
