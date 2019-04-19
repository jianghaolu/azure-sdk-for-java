/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.autosuggest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The SearchAction model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("SearchAction")
public final class SearchAction extends Action {
    /**
     * The displayText property.
     */
    @JsonProperty(value = "displayText", access = JsonProperty.Access.WRITE_ONLY)
    private String displayText;

    /**
     * The query property.
     */
    @JsonProperty(value = "query", access = JsonProperty.Access.WRITE_ONLY)
    private String query;

    /**
     * Possible values include: 'WebSearch', 'HistorySearch', 'DocumentSearch',
     * 'TagSearch', 'LocationSearch', 'CustomSearch'.
     */
    @JsonProperty(value = "searchKind", access = JsonProperty.Access.WRITE_ONLY)
    private SearchKind searchKind;

    /**
     * Get the displayText value.
     *
     * @return the displayText value.
     */
    public String displayText() {
        return this.displayText;
    }

    /**
     * Get the query value.
     *
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Get the searchKind value.
     *
     * @return the searchKind value.
     */
    public SearchKind searchKind() {
        return this.searchKind;
    }
}
