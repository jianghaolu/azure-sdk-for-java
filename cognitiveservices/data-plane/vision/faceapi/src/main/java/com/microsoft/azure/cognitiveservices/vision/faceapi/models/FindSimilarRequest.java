/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/**
 * Request body for find similar operation.
 */
public final class FindSimilarRequest {
    /**
     * FaceId of the query face. User needs to call Face - Detect first to get
     * a valid faceId. Note that this faceId is not persisted and will expire
     * 24 hours after the detection call.
     */
    @JsonProperty(value = "faceId", required = true)
    private UUID faceId;

    /**
     * An existing user-specified unique candidate face list, created in Face
     * List - Create a Face List. Face list contains a set of persistedFaceIds
     * which are persisted and will never expire. Parameter faceListId,
     * largeFaceListId and faceIds should not be provided at the same time.
     */
    @JsonProperty(value = "faceListId")
    private String faceListId;

    /**
     * An existing user-specified unique candidate large face list, created in
     * LargeFaceList - Create. Large face list contains a set of
     * persistedFaceIds which are persisted and will never expire. Parameter
     * faceListId, largeFaceListId and faceIds should not be provided at the
     * same time.
     */
    @JsonProperty(value = "largeFaceListId")
    private String largeFaceListId;

    /**
     * An array of candidate faceIds. All of them are created by Face - Detect
     * and the faceIds will expire 24 hours after the detection call. The
     * number of faceIds is limited to 1000. Parameter faceListId,
     * largeFaceListId and faceIds should not be provided at the same time.
     */
    @JsonProperty(value = "faceIds")
    private List<UUID> faceIds;

    /**
     * The number of top similar faces returned. The valid range is [1, 1000].
     */
    @JsonProperty(value = "maxNumOfCandidatesReturned")
    private Integer maxNumOfCandidatesReturned;

    /**
     * Similar face searching mode. It can be "matchPerson" or "matchFace".
     * Possible values include: 'matchPerson', 'matchFace'.
     */
    @JsonProperty(value = "mode")
    private FindSimilarMatchMode mode;

    /**
     * Get the faceId value.
     *
     * @return the faceId value.
     */
    public UUID faceId() {
        return this.faceId;
    }

    /**
     * Set the faceId value.
     *
     * @param faceId the faceId value to set.
     * @return the FindSimilarRequest object itself.
     */
    public FindSimilarRequest withFaceId(UUID faceId) {
        this.faceId = faceId;
        return this;
    }

    /**
     * Get the faceListId value.
     *
     * @return the faceListId value.
     */
    public String faceListId() {
        return this.faceListId;
    }

    /**
     * Set the faceListId value.
     *
     * @param faceListId the faceListId value to set.
     * @return the FindSimilarRequest object itself.
     */
    public FindSimilarRequest withFaceListId(String faceListId) {
        this.faceListId = faceListId;
        return this;
    }

    /**
     * Get the largeFaceListId value.
     *
     * @return the largeFaceListId value.
     */
    public String largeFaceListId() {
        return this.largeFaceListId;
    }

    /**
     * Set the largeFaceListId value.
     *
     * @param largeFaceListId the largeFaceListId value to set.
     * @return the FindSimilarRequest object itself.
     */
    public FindSimilarRequest withLargeFaceListId(String largeFaceListId) {
        this.largeFaceListId = largeFaceListId;
        return this;
    }

    /**
     * Get the faceIds value.
     *
     * @return the faceIds value.
     */
    public List<UUID> faceIds() {
        return this.faceIds;
    }

    /**
     * Set the faceIds value.
     *
     * @param faceIds the faceIds value to set.
     * @return the FindSimilarRequest object itself.
     */
    public FindSimilarRequest withFaceIds(List<UUID> faceIds) {
        this.faceIds = faceIds;
        return this;
    }

    /**
     * Get the maxNumOfCandidatesReturned value.
     *
     * @return the maxNumOfCandidatesReturned value.
     */
    public Integer maxNumOfCandidatesReturned() {
        return this.maxNumOfCandidatesReturned;
    }

    /**
     * Set the maxNumOfCandidatesReturned value.
     *
     * @param maxNumOfCandidatesReturned the maxNumOfCandidatesReturned value
     * to set.
     * @return the FindSimilarRequest object itself.
     */
    public FindSimilarRequest withMaxNumOfCandidatesReturned(Integer maxNumOfCandidatesReturned) {
        this.maxNumOfCandidatesReturned = maxNumOfCandidatesReturned;
        return this;
    }

    /**
     * Get the mode value.
     *
     * @return the mode value.
     */
    public FindSimilarMatchMode mode() {
        return this.mode;
    }

    /**
     * Set the mode value.
     *
     * @param mode the mode value to set.
     * @return the FindSimilarRequest object itself.
     */
    public FindSimilarRequest withMode(FindSimilarMatchMode mode) {
        this.mode = mode;
        return this;
    }
}
