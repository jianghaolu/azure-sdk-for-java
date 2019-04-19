/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An entity observation in the image, along with the confidence score.
 */
public final class ImageTag {
    /**
     * Name of the entity.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The level of confidence that the entity was observed.
     */
    @JsonProperty(value = "confidence")
    private double confidence;

    /**
     * Optional hint/details for this tag.
     */
    @JsonProperty(value = "hint")
    private String hint;

    /**
     * Get the name value.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set.
     * @return the ImageTag object itself.
     */
    public ImageTag withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the confidence value.
     *
     * @return the confidence value.
     */
    public double confidence() {
        return this.confidence;
    }

    /**
     * Set the confidence value.
     *
     * @param confidence the confidence value to set.
     * @return the ImageTag object itself.
     */
    public ImageTag withConfidence(double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the hint value.
     *
     * @return the hint value.
     */
    public String hint() {
        return this.hint;
    }

    /**
     * Set the hint value.
     *
     * @param hint the hint value to set.
     * @return the ImageTag object itself.
     */
    public ImageTag withHint(String hint) {
        this.hint = hint;
        return this;
    }
}
