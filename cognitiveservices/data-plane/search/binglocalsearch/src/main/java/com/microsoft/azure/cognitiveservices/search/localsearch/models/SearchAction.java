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
import java.util.List;

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
     * The richContent property.
     */
    @JsonProperty(value = "richContent", access = JsonProperty.Access.WRITE_ONLY)
    private List<Answer> richContent;

    /**
     * The formattingRuleId property.
     */
    @JsonProperty(value = "formattingRuleId", access = JsonProperty.Access.WRITE_ONLY)
    private String formattingRuleId;

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
     * Get the richContent value.
     *
     * @return the richContent value.
     */
    public List<Answer> richContent() {
        return this.richContent;
    }

    /**
     * Get the formattingRuleId value.
     *
     * @return the formattingRuleId value.
     */
    public String formattingRuleId() {
        return this.formattingRuleId;
    }
}
