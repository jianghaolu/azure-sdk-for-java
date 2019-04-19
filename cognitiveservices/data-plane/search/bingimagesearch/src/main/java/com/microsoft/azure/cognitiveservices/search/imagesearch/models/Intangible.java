/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.imagesearch.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A utility class that serves as the umbrella for a number of 'intangible'
 * things such as quantities, structured values, etc.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = Intangible.class)
@JsonTypeName("Intangible")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "StructuredValue", value = StructuredValue.class)
})
public class Intangible extends Thing {
}
