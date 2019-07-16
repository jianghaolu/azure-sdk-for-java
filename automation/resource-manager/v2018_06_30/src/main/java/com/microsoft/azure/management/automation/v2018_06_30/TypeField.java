/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2018_06_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a field of a type.
 */
public class TypeField {
    /**
     * Gets or sets the name of the field.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets or sets the type of the field.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get gets or sets the name of the field.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets the name of the field.
     *
     * @param name the name value to set
     * @return the TypeField object itself.
     */
    public TypeField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets or sets the type of the field.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set gets or sets the type of the field.
     *
     * @param type the type value to set
     * @return the TypeField object itself.
     */
    public TypeField withType(String type) {
        this.type = type;
        return this;
    }

}
