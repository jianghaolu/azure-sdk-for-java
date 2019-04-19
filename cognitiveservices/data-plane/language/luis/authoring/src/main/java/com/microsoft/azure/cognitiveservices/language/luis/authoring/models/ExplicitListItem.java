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
 * Explicit (exception) list item.
 */
public final class ExplicitListItem {
    /**
     * The explicit list item ID.
     */
    @JsonProperty(value = "id")
    private Long id;

    /**
     * The explicit list item value.
     */
    @JsonProperty(value = "explicitListItem")
    private String explicitListItem;

    /**
     * Get the id value.
     *
     * @return the id value.
     */
    public Long id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set.
     * @return the ExplicitListItem object itself.
     */
    public ExplicitListItem withId(Long id) {
        this.id = id;
        return this;
    }

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
     * @return the ExplicitListItem object itself.
     */
    public ExplicitListItem withExplicitListItem(String explicitListItem) {
        this.explicitListItem = explicitListItem;
        return this;
    }
}
