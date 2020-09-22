// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SearchIndexerStatus model. */
@Immutable
public final class SearchIndexerStatus {
    /*
     * Overall indexer status.
     */
    @JsonProperty(value = "status", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private IndexerStatus status;

    /*
     * The result of the most recent or an in-progress indexer execution.
     */
    @JsonProperty(value = "lastResult", access = JsonProperty.Access.WRITE_ONLY)
    private IndexerExecutionResult lastResult;

    /*
     * History of the recent indexer executions, sorted in reverse
     * chronological order.
     */
    @JsonProperty(value = "executionHistory", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<IndexerExecutionResult> executionHistory;

    /*
     * The execution limits for the indexer.
     */
    @JsonProperty(value = "limits", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private SearchIndexerLimits limits;

    /**
     * Creates an instance of SearchIndexerStatus class.
     *
     * @param status the status value to set.
     * @param executionHistory the executionHistory value to set.
     * @param limits the limits value to set.
     */
    @JsonCreator
    public SearchIndexerStatus(
            @JsonProperty(value = "status", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    IndexerStatus status,
            @JsonProperty(value = "executionHistory", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    List<IndexerExecutionResult> executionHistory,
            @JsonProperty(value = "limits", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    SearchIndexerLimits limits) {
        this.status = status;
        this.executionHistory = executionHistory;
        this.limits = limits;
    }

    /**
     * Get the status property: Overall indexer status.
     *
     * @return the status value.
     */
    public IndexerStatus getStatus() {
        return this.status;
    }

    /**
     * Get the lastResult property: The result of the most recent or an in-progress indexer execution.
     *
     * @return the lastResult value.
     */
    public IndexerExecutionResult getLastResult() {
        return this.lastResult;
    }

    /**
     * Get the executionHistory property: History of the recent indexer executions, sorted in reverse chronological
     * order.
     *
     * @return the executionHistory value.
     */
    public List<IndexerExecutionResult> getExecutionHistory() {
        return this.executionHistory;
    }

    /**
     * Get the limits property: The execution limits for the indexer.
     *
     * @return the limits value.
     */
    public SearchIndexerLimits getLimits() {
        return this.limits;
    }
}
