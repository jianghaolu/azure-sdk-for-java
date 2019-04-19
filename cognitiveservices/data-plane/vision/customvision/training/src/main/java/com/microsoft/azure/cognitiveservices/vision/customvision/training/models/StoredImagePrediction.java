/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * result of an image classification request.
 */
public final class StoredImagePrediction {
    /**
     * The URI to the (resized) prediction image.
     */
    @JsonProperty(value = "resizedImageUri", access = JsonProperty.Access.WRITE_ONLY)
    private String resizedImageUri;

    /**
     * The URI to the thumbnail of the original prediction image.
     */
    @JsonProperty(value = "thumbnailUri", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbnailUri;

    /**
     * The URI to the original prediction image.
     */
    @JsonProperty(value = "originalImageUri", access = JsonProperty.Access.WRITE_ONLY)
    private String originalImageUri;

    /**
     * Domain used for the prediction.
     */
    @JsonProperty(value = "domain", access = JsonProperty.Access.WRITE_ONLY)
    private UUID domain;

    /**
     * Prediction Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /**
     * Project Id.
     */
    @JsonProperty(value = "project", access = JsonProperty.Access.WRITE_ONLY)
    private UUID project;

    /**
     * Iteration Id.
     */
    @JsonProperty(value = "iteration", access = JsonProperty.Access.WRITE_ONLY)
    private UUID iteration;

    /**
     * Date this prediction was created.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /**
     * List of predictions.
     */
    @JsonProperty(value = "predictions", access = JsonProperty.Access.WRITE_ONLY)
    private List<Prediction> predictions;

    /**
     * Get the resizedImageUri value.
     *
     * @return the resizedImageUri value.
     */
    public String resizedImageUri() {
        return this.resizedImageUri;
    }

    /**
     * Get the thumbnailUri value.
     *
     * @return the thumbnailUri value.
     */
    public String thumbnailUri() {
        return this.thumbnailUri;
    }

    /**
     * Get the originalImageUri value.
     *
     * @return the originalImageUri value.
     */
    public String originalImageUri() {
        return this.originalImageUri;
    }

    /**
     * Get the domain value.
     *
     * @return the domain value.
     */
    public UUID domain() {
        return this.domain;
    }

    /**
     * Get the id value.
     *
     * @return the id value.
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get the project value.
     *
     * @return the project value.
     */
    public UUID project() {
        return this.project;
    }

    /**
     * Get the iteration value.
     *
     * @return the iteration value.
     */
    public UUID iteration() {
        return this.iteration;
    }

    /**
     * Get the created value.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the predictions value.
     *
     * @return the predictions value.
     */
    public List<Prediction> predictions() {
        return this.predictions;
    }
}
