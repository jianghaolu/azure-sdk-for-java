/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 * PersonFace object.
 */
public final class PersistedFace {
    /**
     * The persistedFaceId of the target face, which is persisted and will not
     * expire. Different from faceId created by Face - Detect and will expire
     * in 24 hours after the detection call.
     */
    @JsonProperty(value = "persistedFaceId", required = true)
    private UUID persistedFaceId;

    /**
     * User-provided data attached to the face. The size limit is 1KB.
     */
    @JsonProperty(value = "userData")
    private String userData;

    /**
     * Get the persistedFaceId value.
     *
     * @return the persistedFaceId value.
     */
    public UUID persistedFaceId() {
        return this.persistedFaceId;
    }

    /**
     * Set the persistedFaceId value.
     *
     * @param persistedFaceId the persistedFaceId value to set.
     * @return the PersistedFace object itself.
     */
    public PersistedFace withPersistedFaceId(UUID persistedFaceId) {
        this.persistedFaceId = persistedFaceId;
        return this;
    }

    /**
     * Get the userData value.
     *
     * @return the userData value.
     */
    public String userData() {
        return this.userData;
    }

    /**
     * Set the userData value.
     *
     * @param userData the userData value to set.
     * @return the PersistedFace object itself.
     */
    public PersistedFace withUserData(String userData) {
        this.userData = userData;
        return this;
    }
}
