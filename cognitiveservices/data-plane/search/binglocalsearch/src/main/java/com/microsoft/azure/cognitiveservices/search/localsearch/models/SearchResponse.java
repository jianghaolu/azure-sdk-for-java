/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.localsearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines the top-level object that the response includes when the request
 * succeeds.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("SearchResponse")
public final class SearchResponse extends Response {
    /**
     * An object that contains the query string that Bing used for the request.
     * This object contains the query string as entered by the user. It may
     * also contain an altered query string that Bing used for the query if the
     * query string contained a spelling mistake.
     */
    @JsonProperty(value = "queryContext", access = JsonProperty.Access.WRITE_ONLY)
    private QueryContext queryContext;

    /**
     * A list of local entities such as restaurants or hotels that are relevant
     * to the query.
     */
    @JsonProperty(value = "places", access = JsonProperty.Access.WRITE_ONLY)
    private Places places;

    /**
     * The lottery property.
     */
    @JsonProperty(value = "lottery", access = JsonProperty.Access.WRITE_ONLY)
    private SearchResultsAnswer lottery;

    /**
     * The searchResultsConfidenceScore property.
     */
    @JsonProperty(value = "searchResultsConfidenceScore", access = JsonProperty.Access.WRITE_ONLY)
    private Double searchResultsConfidenceScore;

    /**
     * Get the queryContext value.
     *
     * @return the queryContext value.
     */
    public QueryContext queryContext() {
        return this.queryContext;
    }

    /**
     * Get the places value.
     *
     * @return the places value.
     */
    public Places places() {
        return this.places;
    }

    /**
     * Get the lottery value.
     *
     * @return the lottery value.
     */
    public SearchResultsAnswer lottery() {
        return this.lottery;
    }

    /**
     * Get the searchResultsConfidenceScore value.
     *
     * @return the searchResultsConfidenceScore value.
     */
    public Double searchResultsConfidenceScore() {
        return this.searchResultsConfidenceScore;
    }
}
