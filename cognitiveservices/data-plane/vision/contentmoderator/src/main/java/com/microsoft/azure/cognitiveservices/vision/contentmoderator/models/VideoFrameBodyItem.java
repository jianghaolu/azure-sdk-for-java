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
 * Schema items of the body.
 */
public final class VideoFrameBodyItem {
    /**
     * Timestamp of the frame.
     */
    @JsonProperty(value = "Timestamp", required = true)
    private String timestamp;

    /**
     * Content to review.
     */
    @JsonProperty(value = "FrameImage", required = true)
    private String frameImage;

    /**
     * The reviewerResultTags property.
     */
    @JsonProperty(value = "ReviewerResultTags")
    private List<VideoFrameBodyItemReviewerResultTagsItem> reviewerResultTags;

    /**
     * Optional metadata details.
     */
    @JsonProperty(value = "Metadata")
    private List<VideoFrameBodyItemMetadataItem> metadata;

    /**
     * Get the timestamp value.
     *
     * @return the timestamp value.
     */
    public String timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp value.
     *
     * @param timestamp the timestamp value to set.
     * @return the VideoFrameBodyItem object itself.
     */
    public VideoFrameBodyItem withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the frameImage value.
     *
     * @return the frameImage value.
     */
    public String frameImage() {
        return this.frameImage;
    }

    /**
     * Set the frameImage value.
     *
     * @param frameImage the frameImage value to set.
     * @return the VideoFrameBodyItem object itself.
     */
    public VideoFrameBodyItem withFrameImage(String frameImage) {
        this.frameImage = frameImage;
        return this;
    }

    /**
     * Get the reviewerResultTags value.
     *
     * @return the reviewerResultTags value.
     */
    public List<VideoFrameBodyItemReviewerResultTagsItem> reviewerResultTags() {
        return this.reviewerResultTags;
    }

    /**
     * Set the reviewerResultTags value.
     *
     * @param reviewerResultTags the reviewerResultTags value to set.
     * @return the VideoFrameBodyItem object itself.
     */
    public VideoFrameBodyItem withReviewerResultTags(List<VideoFrameBodyItemReviewerResultTagsItem> reviewerResultTags) {
        this.reviewerResultTags = reviewerResultTags;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value.
     */
    public List<VideoFrameBodyItemMetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set.
     * @return the VideoFrameBodyItem object itself.
     */
    public VideoFrameBodyItem withMetadata(List<VideoFrameBodyItemMetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }
}
