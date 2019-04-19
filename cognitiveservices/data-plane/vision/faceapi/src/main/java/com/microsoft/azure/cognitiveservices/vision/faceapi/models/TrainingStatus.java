/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Training status object.
 */
public final class TrainingStatus {
    /**
     * Training status: notstarted, running, succeeded, failed. If the training
     * process is waiting to perform, the status is notstarted. If the training
     * is ongoing, the status is running. Status succeed means this person
     * group or large person group is ready for Face - Identify, or this large
     * face list is ready for Face - Find Similar. Status failed is often
     * caused by no person or no persisted face exist in the person group or
     * large person group, or no persisted face exist in the large face list.
     * Possible values include: 'nonstarted', 'running', 'succeeded', 'failed'.
     */
    @JsonProperty(value = "status", required = true)
    private TrainingStatusType status;

    /**
     * A combined UTC date and time string that describes the created time of
     * the person group, large person group or large face list.
     */
    @JsonProperty(value = "createdDateTime", required = true)
    private OffsetDateTime created;

    /**
     * A combined UTC date and time string that describes the last modify time
     * of the person group, large person group or large face list, could be
     * null value when the group is not successfully trained.
     */
    @JsonProperty(value = "lastActionDateTime")
    private OffsetDateTime lastAction;

    /**
     * A combined UTC date and time string that describes the last successful
     * training time of the person group, large person group or large face
     * list.
     */
    @JsonProperty(value = "lastSuccessfulTrainingDateTime")
    private OffsetDateTime lastSuccessfulTraining;

    /**
     * Show failure message when training failed (omitted when training
     * succeed).
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the status value.
     *
     * @return the status value.
     */
    public TrainingStatusType status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set.
     * @return the TrainingStatus object itself.
     */
    public TrainingStatus withStatus(TrainingStatusType status) {
        this.status = status;
        return this;
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
     * Set the created value.
     *
     * @param created the created value to set.
     * @return the TrainingStatus object itself.
     */
    public TrainingStatus withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get the lastAction value.
     *
     * @return the lastAction value.
     */
    public OffsetDateTime lastAction() {
        return this.lastAction;
    }

    /**
     * Set the lastAction value.
     *
     * @param lastAction the lastAction value to set.
     * @return the TrainingStatus object itself.
     */
    public TrainingStatus withLastAction(OffsetDateTime lastAction) {
        this.lastAction = lastAction;
        return this;
    }

    /**
     * Get the lastSuccessfulTraining value.
     *
     * @return the lastSuccessfulTraining value.
     */
    public OffsetDateTime lastSuccessfulTraining() {
        return this.lastSuccessfulTraining;
    }

    /**
     * Set the lastSuccessfulTraining value.
     *
     * @param lastSuccessfulTraining the lastSuccessfulTraining value to set.
     * @return the TrainingStatus object itself.
     */
    public TrainingStatus withLastSuccessfulTraining(OffsetDateTime lastSuccessfulTraining) {
        this.lastSuccessfulTraining = lastSuccessfulTraining;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set.
     * @return the TrainingStatus object itself.
     */
    public TrainingStatus withMessage(String message) {
        this.message = message;
        return this;
    }
}
