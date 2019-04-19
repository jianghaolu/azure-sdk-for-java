/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ImageTagCreateSummary model.
 */
public final class ImageTagCreateSummary {
    /**
     * The created property.
     */
    @JsonProperty(value = "created")
    private List<ImageTagCreateEntry> created;

    /**
     * The duplicated property.
     */
    @JsonProperty(value = "duplicated")
    private List<ImageTagCreateEntry> duplicated;

    /**
     * The exceeded property.
     */
    @JsonProperty(value = "exceeded")
    private List<ImageTagCreateEntry> exceeded;

    /**
     * Get the created value.
     *
     * @return the created value.
     */
    public List<ImageTagCreateEntry> created() {
        return this.created;
    }

    /**
     * Set the created value.
     *
     * @param created the created value to set.
     * @return the ImageTagCreateSummary object itself.
     */
    public ImageTagCreateSummary withCreated(List<ImageTagCreateEntry> created) {
        this.created = created;
        return this;
    }

    /**
     * Get the duplicated value.
     *
     * @return the duplicated value.
     */
    public List<ImageTagCreateEntry> duplicated() {
        return this.duplicated;
    }

    /**
     * Set the duplicated value.
     *
     * @param duplicated the duplicated value to set.
     * @return the ImageTagCreateSummary object itself.
     */
    public ImageTagCreateSummary withDuplicated(List<ImageTagCreateEntry> duplicated) {
        this.duplicated = duplicated;
        return this;
    }

    /**
     * Get the exceeded value.
     *
     * @return the exceeded value.
     */
    public List<ImageTagCreateEntry> exceeded() {
        return this.exceeded;
    }

    /**
     * Set the exceeded value.
     *
     * @param exceeded the exceeded value to set.
     * @return the ImageTagCreateSummary object itself.
     */
    public ImageTagCreateSummary withExceeded(List<ImageTagCreateEntry> exceeded) {
        this.exceeded = exceeded;
        return this;
    }
}
