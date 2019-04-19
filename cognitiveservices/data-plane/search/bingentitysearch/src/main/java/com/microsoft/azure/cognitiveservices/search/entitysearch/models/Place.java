/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.entitysearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines information about a local entity, such as a restaurant or hotel.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = Place.class)
@JsonTypeName("Place")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "LocalBusiness", value = LocalBusiness.class),
    @JsonSubTypes.Type(name = "CivicStructure", value = CivicStructure.class),
    @JsonSubTypes.Type(name = "TouristAttraction", value = TouristAttraction.class)
})
public class Place extends Thing {
    /**
     * The postal address of where the entity is located.
     */
    @JsonProperty(value = "address", access = JsonProperty.Access.WRITE_ONLY)
    private PostalAddress address;

    /**
     * The entity's telephone number.
     */
    @JsonProperty(value = "telephone", access = JsonProperty.Access.WRITE_ONLY)
    private String telephone;

    /**
     * Get the address value.
     *
     * @return the address value.
     */
    public PostalAddress address() {
        return this.address;
    }

    /**
     * Get the telephone value.
     *
     * @return the telephone value.
     */
    public String telephone() {
        return this.telephone;
    }
}
