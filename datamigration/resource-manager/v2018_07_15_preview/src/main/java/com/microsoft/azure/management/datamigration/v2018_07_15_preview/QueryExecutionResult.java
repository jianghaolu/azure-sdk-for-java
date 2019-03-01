/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes query analysis results for execution in source and target.
 */
public class QueryExecutionResult {
    /**
     * Query text retrieved from the source server.
     */
    @JsonProperty(value = "queryText")
    private String queryText;

    /**
     * Total no. of statements in the batch.
     */
    @JsonProperty(value = "statementsInBatch")
    private Long statementsInBatch;

    /**
     * Query analysis result from the source.
     */
    @JsonProperty(value = "sourceResult")
    private ExecutionStatistics sourceResult;

    /**
     * Query analysis result from the target.
     */
    @JsonProperty(value = "targetResult")
    private ExecutionStatistics targetResult;

    /**
     * Get query text retrieved from the source server.
     *
     * @return the queryText value
     */
    public String queryText() {
        return this.queryText;
    }

    /**
     * Set query text retrieved from the source server.
     *
     * @param queryText the queryText value to set
     * @return the QueryExecutionResult object itself.
     */
    public QueryExecutionResult withQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }

    /**
     * Get total no. of statements in the batch.
     *
     * @return the statementsInBatch value
     */
    public Long statementsInBatch() {
        return this.statementsInBatch;
    }

    /**
     * Set total no. of statements in the batch.
     *
     * @param statementsInBatch the statementsInBatch value to set
     * @return the QueryExecutionResult object itself.
     */
    public QueryExecutionResult withStatementsInBatch(Long statementsInBatch) {
        this.statementsInBatch = statementsInBatch;
        return this;
    }

    /**
     * Get query analysis result from the source.
     *
     * @return the sourceResult value
     */
    public ExecutionStatistics sourceResult() {
        return this.sourceResult;
    }

    /**
     * Set query analysis result from the source.
     *
     * @param sourceResult the sourceResult value to set
     * @return the QueryExecutionResult object itself.
     */
    public QueryExecutionResult withSourceResult(ExecutionStatistics sourceResult) {
        this.sourceResult = sourceResult;
        return this;
    }

    /**
     * Get query analysis result from the target.
     *
     * @return the targetResult value
     */
    public ExecutionStatistics targetResult() {
        return this.targetResult;
    }

    /**
     * Set query analysis result from the target.
     *
     * @param targetResult the targetResult value to set
     * @return the QueryExecutionResult object itself.
     */
    public QueryExecutionResult withTargetResult(ExecutionStatistics targetResult) {
        this.targetResult = targetResult;
        return this;
    }

}
