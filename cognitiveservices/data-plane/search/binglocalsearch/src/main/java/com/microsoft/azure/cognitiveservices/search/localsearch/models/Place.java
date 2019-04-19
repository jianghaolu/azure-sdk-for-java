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

/**
 * Defines information about a local entity, such as a restaurant or hotel.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("Place")
public final class Place extends Thing {
    /**
     * The geo property.
     */
    @JsonProperty(value = "geo", access = JsonProperty.Access.WRITE_ONLY)
    private GeoCoordinates geo;

    /**
     * The routablePoint property.
     */
    @JsonProperty(value = "routablePoint", access = JsonProperty.Access.WRITE_ONLY)
    private GeoCoordinates routablePoint;

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
     * Get the geo value.
     *
     * @return the geo value.
     */
    public GeoCoordinates geo() {
        return this.geo;
    }

    /**
     * Get the routablePoint value.
     *
     * @return the routablePoint value.
     */
    public GeoCoordinates routablePoint() {
        return this.routablePoint;
    }

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
