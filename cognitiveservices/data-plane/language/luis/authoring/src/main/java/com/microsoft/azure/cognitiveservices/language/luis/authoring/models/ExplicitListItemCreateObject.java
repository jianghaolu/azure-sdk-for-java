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
 * Object model for creating an explicit (exception) list item.
 */
public final class ExplicitListItemCreateObject {
    /**
     * The explicit list item.
     */
    @JsonProperty(value = "explicitListItem")
    private String explicitListItem;

    /**
     * Get the explicitListItem value.
     *
     * @return the explicitListItem value.
     */
    public String explicitListItem() {
        return this.explicitListItem;
    }

    /**
     * Set the explicitListItem value.
     *
     * @param explicitListItem the explicitListItem value to set.
     * @return the ExplicitListItemCreateObject object itself.
     */
    public ExplicitListItemCreateObject withExplicitListItem(String explicitListItem) {
        this.explicitListItem = explicitListItem;
        return this;
    }
}
