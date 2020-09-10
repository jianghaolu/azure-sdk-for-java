// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The HighWaterMarkChangeDetectionPolicy model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.HighWaterMarkChangeDetectionPolicy")
@JsonFlatten
@Fluent
public class HighWaterMarkChangeDetectionPolicy extends DataChangeDetectionPolicy {
    /*
     * The name of the high water mark column.
     */
    @JsonProperty(value = "highWaterMarkColumnName", required = true)
    private String highWaterMarkColumnName;

    /**
     * Creates an instance of HighWaterMarkChangeDetectionPolicy class.
     *
     * @param highWaterMarkColumnName the highWaterMarkColumnName value to set.
     */
    @JsonCreator
    public HighWaterMarkChangeDetectionPolicy(
            @JsonProperty(value = "highWaterMarkColumnName", required = true) String highWaterMarkColumnName) {
        this.highWaterMarkColumnName = highWaterMarkColumnName;
    }

    /**
     * Get the highWaterMarkColumnName property: The name of the high water mark column.
     *
     * @return the highWaterMarkColumnName value.
     */
    public String getHighWaterMarkColumnName() {
        return this.highWaterMarkColumnName;
    }
}
