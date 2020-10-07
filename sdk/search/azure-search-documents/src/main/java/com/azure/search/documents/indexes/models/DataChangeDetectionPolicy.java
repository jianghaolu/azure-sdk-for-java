// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base type for data change detection policies. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@odata.type",
        defaultImpl = DataChangeDetectionPolicy.class)
@JsonTypeName("DataChangeDetectionPolicy")
@JsonSubTypes({
    @JsonSubTypes.Type(
            name = "#Microsoft.Azure.Search.HighWaterMarkChangeDetectionPolicy",
            value = HighWaterMarkChangeDetectionPolicy.class),
    @JsonSubTypes.Type(
            name = "#Microsoft.Azure.Search.SqlIntegratedChangeTrackingPolicy",
            value = SqlIntegratedChangeTrackingPolicy.class)
})
@Fluent
public abstract class DataChangeDetectionPolicy {}
