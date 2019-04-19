/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The response for a Match request.
 */
public final class MatchResponse {
    /**
     * The tracking id.
     */
    @JsonProperty(value = "TrackingId")
    private String trackingId;

    /**
     * The cache id.
     */
    @JsonProperty(value = "CacheID")
    private String cacheID;

    /**
     * Indicates if there is a match.
     */
    @JsonProperty(value = "IsMatch")
    private Boolean isMatch;

    /**
     * The match details.
     */
    @JsonProperty(value = "Matches")
    private List<Match> matches;

    /**
     * The evaluate status.
     */
    @JsonProperty(value = "Status")
    private Status status;

    /**
     * Get the trackingId value.
     *
     * @return the trackingId value.
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Set the trackingId value.
     *
     * @param trackingId the trackingId value to set.
     * @return the MatchResponse object itself.
     */
    public MatchResponse withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * Get the cacheID value.
     *
     * @return the cacheID value.
     */
    public String cacheID() {
        return this.cacheID;
    }

    /**
     * Set the cacheID value.
     *
     * @param cacheID the cacheID value to set.
     * @return the MatchResponse object itself.
     */
    public MatchResponse withCacheID(String cacheID) {
        this.cacheID = cacheID;
        return this;
    }

    /**
     * Get the isMatch value.
     *
     * @return the isMatch value.
     */
    public Boolean isMatch() {
        return this.isMatch;
    }

    /**
     * Set the isMatch value.
     *
     * @param isMatch the isMatch value to set.
     * @return the MatchResponse object itself.
     */
    public MatchResponse withIsMatch(Boolean isMatch) {
        this.isMatch = isMatch;
        return this;
    }

    /**
     * Get the matches value.
     *
     * @return the matches value.
     */
    public List<Match> matches() {
        return this.matches;
    }

    /**
     * Set the matches value.
     *
     * @param matches the matches value to set.
     * @return the MatchResponse object itself.
     */
    public MatchResponse withMatches(List<Match> matches) {
        this.matches = matches;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set.
     * @return the MatchResponse object itself.
     */
    public MatchResponse withStatus(Status status) {
        this.status = status;
        return this;
    }
}
