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

/** The TruncateTokenFilter model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.TruncateTokenFilter")
@JsonFlatten
@Fluent
public class TruncateTokenFilter extends TokenFilter {
    /*
     * The length at which terms will be truncated. Default and maximum is 300.
     */
    @JsonProperty(value = "length")
    private Integer length;

    /** Creates an instance of TruncateTokenFilter class. */
    @JsonCreator
    public TruncateTokenFilter(@JsonProperty(value = "name") String name) {
        super(name);
    }

    /**
     * Get the length property: The length at which terms will be truncated. Default and maximum is 300.
     *
     * @return the length value.
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * Set the length property: The length at which terms will be truncated. Default and maximum is 300.
     *
     * @param length the length value to set.
     * @return the TruncateTokenFilter object itself.
     */
    public TruncateTokenFilter setLength(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
