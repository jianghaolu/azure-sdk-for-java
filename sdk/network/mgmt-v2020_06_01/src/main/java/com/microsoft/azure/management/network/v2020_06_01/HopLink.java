/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Hop link.
 */
@JsonFlatten
public class HopLink {
    /**
     * The ID of the next hop.
     */
    @JsonProperty(value = "nextHopId", access = JsonProperty.Access.WRITE_ONLY)
    private String nextHopId;

    /**
     * Link type.
     */
    @JsonProperty(value = "linkType", access = JsonProperty.Access.WRITE_ONLY)
    private String linkType;

    /**
     * Minimum roundtrip time in milliseconds.
     */
    @JsonProperty(value = "properties.roundTripTimeMin", access = JsonProperty.Access.WRITE_ONLY)
    private Integer roundTripTimeMin;

    /**
     * Average roundtrip time in milliseconds.
     */
    @JsonProperty(value = "properties.roundTripTimeAvg", access = JsonProperty.Access.WRITE_ONLY)
    private Integer roundTripTimeAvg;

    /**
     * Maximum roundtrip time in milliseconds.
     */
    @JsonProperty(value = "properties.roundTripTimeMax", access = JsonProperty.Access.WRITE_ONLY)
    private Integer roundTripTimeMax;

    /**
     * List of issues.
     */
    @JsonProperty(value = "issues", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectivityIssue> issues;

    /**
     * Provides additional context on links.
     */
    @JsonProperty(value = "context", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> context;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /**
     * Get the ID of the next hop.
     *
     * @return the nextHopId value
     */
    public String nextHopId() {
        return this.nextHopId;
    }

    /**
     * Get link type.
     *
     * @return the linkType value
     */
    public String linkType() {
        return this.linkType;
    }

    /**
     * Get minimum roundtrip time in milliseconds.
     *
     * @return the roundTripTimeMin value
     */
    public Integer roundTripTimeMin() {
        return this.roundTripTimeMin;
    }

    /**
     * Get average roundtrip time in milliseconds.
     *
     * @return the roundTripTimeAvg value
     */
    public Integer roundTripTimeAvg() {
        return this.roundTripTimeAvg;
    }

    /**
     * Get maximum roundtrip time in milliseconds.
     *
     * @return the roundTripTimeMax value
     */
    public Integer roundTripTimeMax() {
        return this.roundTripTimeMax;
    }

    /**
     * Get list of issues.
     *
     * @return the issues value
     */
    public List<ConnectivityIssue> issues() {
        return this.issues;
    }

    /**
     * Get provides additional context on links.
     *
     * @return the context value
     */
    public Map<String, String> context() {
        return this.context;
    }

    /**
     * Get resource ID.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

}
