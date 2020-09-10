// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.search.documents.indexes.models.ScoringFunctionAggregation;
import com.azure.search.documents.indexes.models.TextWeights;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ScoringProfile model. */
@Fluent
public final class ScoringProfile {
    /*
     * The name of the scoring profile.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Parameters that boost scoring based on text matches in certain index
     * fields.
     */
    @JsonProperty(value = "text")
    private TextWeights textWeights;

    /*
     * The collection of functions that influence the scoring of documents.
     */
    @JsonProperty(value = "functions")
    private List<ScoringFunction> functions;

    /*
     * A value indicating how the results of individual scoring functions
     * should be combined. Defaults to "Sum". Ignored if there are no scoring
     * functions.
     */
    @JsonProperty(value = "functionAggregation")
    private ScoringFunctionAggregation functionAggregation;

    /**
     * Creates an instance of ScoringProfile class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public ScoringProfile(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the scoring profile.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the textWeights property: Parameters that boost scoring based on text matches in certain index fields.
     *
     * @return the textWeights value.
     */
    public TextWeights getTextWeights() {
        return this.textWeights;
    }

    /**
     * Set the textWeights property: Parameters that boost scoring based on text matches in certain index fields.
     *
     * @param textWeights the textWeights value to set.
     * @return the ScoringProfile object itself.
     */
    public ScoringProfile setTextWeights(TextWeights textWeights) {
        this.textWeights = textWeights;
        return this;
    }

    /**
     * Get the functions property: The collection of functions that influence the scoring of documents.
     *
     * @return the functions value.
     */
    public List<ScoringFunction> getFunctions() {
        return this.functions;
    }

    /**
     * Set the functions property: The collection of functions that influence the scoring of documents.
     *
     * @param functions the functions value to set.
     * @return the ScoringProfile object itself.
     */
    public ScoringProfile setFunctions(List<ScoringFunction> functions) {
        this.functions = functions;
        return this;
    }

    /**
     * Get the functionAggregation property: A value indicating how the results of individual scoring functions should
     * be combined. Defaults to "Sum". Ignored if there are no scoring functions.
     *
     * @return the functionAggregation value.
     */
    public ScoringFunctionAggregation getFunctionAggregation() {
        return this.functionAggregation;
    }

    /**
     * Set the functionAggregation property: A value indicating how the results of individual scoring functions should
     * be combined. Defaults to "Sum". Ignored if there are no scoring functions.
     *
     * @param functionAggregation the functionAggregation value to set.
     * @return the ScoringProfile object itself.
     */
    public ScoringProfile setFunctionAggregation(ScoringFunctionAggregation functionAggregation) {
        this.functionAggregation = functionAggregation;
        return this;
    }
}
