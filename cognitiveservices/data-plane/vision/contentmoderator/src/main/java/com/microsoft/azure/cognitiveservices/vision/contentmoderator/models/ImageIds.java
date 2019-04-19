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
 * Image Id properties.
 */
public final class ImageIds {
    /**
     * Source of the content.
     */
    @JsonProperty(value = "ContentSource")
    private String contentSource;

    /**
     * Id of the contents.
     */
    @JsonProperty(value = "ContentIds")
    private List<Integer> contentIds;

    /**
     * Get Image status.
     */
    @JsonProperty(value = "Status")
    private Status status;

    /**
     * Tracking Id.
     */
    @JsonProperty(value = "TrackingId")
    private String trackingId;

    /**
     * Get the contentSource value.
     *
     * @return the contentSource value.
     */
    public String contentSource() {
        return this.contentSource;
    }

    /**
     * Set the contentSource value.
     *
     * @param contentSource the contentSource value to set.
     * @return the ImageIds object itself.
     */
    public ImageIds withContentSource(String contentSource) {
        this.contentSource = contentSource;
        return this;
    }

    /**
     * Get the contentIds value.
     *
     * @return the contentIds value.
     */
    public List<Integer> contentIds() {
        return this.contentIds;
    }

    /**
     * Set the contentIds value.
     *
     * @param contentIds the contentIds value to set.
     * @return the ImageIds object itself.
     */
    public ImageIds withContentIds(List<Integer> contentIds) {
        this.contentIds = contentIds;
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
     * @return the ImageIds object itself.
     */
    public ImageIds withStatus(Status status) {
        this.status = status;
        return this;
    }

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
     * @return the ImageIds object itself.
     */
    public ImageIds withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }
}
