/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RegionProposal model.
 */
public final class RegionProposal {
    /**
     * The confidence property.
     */
    @JsonProperty(value = "confidence", access = JsonProperty.Access.WRITE_ONLY)
    private double confidence;

    /**
     * The boundingBox property.
     */
    @JsonProperty(value = "boundingBox", access = JsonProperty.Access.WRITE_ONLY)
    private BoundingBox boundingBox;

    /**
     * Get the confidence value.
     *
     * @return the confidence value.
     */
    public double confidence() {
        return this.confidence;
    }

    /**
     * Get the boundingBox value.
     *
     * @return the boundingBox value.
     */
    public BoundingBox boundingBox() {
        return this.boundingBox;
    }
}
