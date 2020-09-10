// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GetIndexStatisticsResult model. */
@Immutable
public final class GetIndexStatisticsResult {
    /*
     * The number of documents in the index.
     */
    @JsonProperty(value = "documentCount", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private long documentCount;

    /*
     * The amount of storage in bytes consumed by the index.
     */
    @JsonProperty(value = "storageSize", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private long storageSize;

    /**
     * Creates an instance of GetIndexStatisticsResult class.
     *
     * @param documentCount the documentCount value to set.
     * @param storageSize the storageSize value to set.
     */
    @JsonCreator
    public GetIndexStatisticsResult(
            @JsonProperty(value = "documentCount", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    long documentCount,
            @JsonProperty(value = "storageSize", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    long storageSize) {
        this.documentCount = documentCount;
        this.storageSize = storageSize;
    }

    /**
     * Get the documentCount property: The number of documents in the index.
     *
     * @return the documentCount value.
     */
    public long getDocumentCount() {
        return this.documentCount;
    }

    /**
     * Get the storageSize property: The amount of storage in bytes consumed by the index.
     *
     * @return the storageSize value.
     */
    public long getStorageSize() {
        return this.storageSize;
    }
}
