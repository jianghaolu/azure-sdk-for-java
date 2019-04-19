/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * An object describing additional category details.
 */
public final class CategoryDetail {
    /**
     * An array of celebrities if any identified.
     */
    @JsonProperty(value = "celebrities")
    private List<CelebritiesModel> celebrities;

    /**
     * An array of landmarks if any identified.
     */
    @JsonProperty(value = "landmarks")
    private List<LandmarksModel> landmarks;

    /**
     * Get the celebrities value.
     *
     * @return the celebrities value.
     */
    public List<CelebritiesModel> celebrities() {
        return this.celebrities;
    }

    /**
     * Set the celebrities value.
     *
     * @param celebrities the celebrities value to set.
     * @return the CategoryDetail object itself.
     */
    public CategoryDetail withCelebrities(List<CelebritiesModel> celebrities) {
        this.celebrities = celebrities;
        return this;
    }

    /**
     * Get the landmarks value.
     *
     * @return the landmarks value.
     */
    public List<LandmarksModel> landmarks() {
        return this.landmarks;
    }

    /**
     * Set the landmarks value.
     *
     * @param landmarks the landmarks value to set.
     * @return the CategoryDetail object itself.
     */
    public CategoryDetail withLandmarks(List<LandmarksModel> landmarks) {
        this.landmarks = landmarks;
        return this;
    }
}
