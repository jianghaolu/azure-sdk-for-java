/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Localized information describing this usage model.
 */
public class UsageModelDisplay {
    /**
     * String to display for this usage model.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get string to display for this usage model.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set string to display for this usage model.
     *
     * @param description the description value to set
     * @return the UsageModelDisplay object itself.
     */
    public UsageModelDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

}
