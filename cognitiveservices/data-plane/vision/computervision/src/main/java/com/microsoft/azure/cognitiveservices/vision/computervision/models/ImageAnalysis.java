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
 * Result of AnalyzeImage operation.
 */
public final class ImageAnalysis {
    /**
     * An array indicating identified categories.
     */
    @JsonProperty(value = "categories")
    private List<Category> categories;

    /**
     * An object describing whether the image contains adult-oriented content
     * and/or is racy.
     */
    @JsonProperty(value = "adult")
    private AdultInfo adult;

    /**
     * An object providing additional metadata describing color attributes.
     */
    @JsonProperty(value = "color")
    private ColorInfo color;

    /**
     * An object providing possible image types and matching confidence levels.
     */
    @JsonProperty(value = "imageType")
    private ImageType imageType;

    /**
     * A list of tags with confidence level.
     */
    @JsonProperty(value = "tags")
    private List<ImageTag> tags;

    /**
     * A collection of content tags, along with a list of captions sorted by
     * confidence level, and image metadata.
     */
    @JsonProperty(value = "description")
    private ImageDescriptionDetails description;

    /**
     * An array of possible faces within the image.
     */
    @JsonProperty(value = "faces")
    private List<FaceDescription> faces;

    /**
     * Array of objects describing what was detected in the image.
     */
    @JsonProperty(value = "objects")
    private List<DetectedObject> objects;

    /**
     * Array of brands detected in the image.
     */
    @JsonProperty(value = "brands")
    private List<DetectedBrand> brands;

    /**
     * Id of the REST API request.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * The metadata property.
     */
    @JsonProperty(value = "metadata")
    private ImageMetadata metadata;

    /**
     * Get the categories value.
     *
     * @return the categories value.
     */
    public List<Category> categories() {
        return this.categories;
    }

    /**
     * Set the categories value.
     *
     * @param categories the categories value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis withCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the adult value.
     *
     * @return the adult value.
     */
    public AdultInfo adult() {
        return this.adult;
    }

    /**
     * Set the adult value.
     *
     * @param adult the adult value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis withAdult(AdultInfo adult) {
        this.adult = adult;
        return this;
    }

    /**
     * Get the color value.
     *
     * @return the color value.
     */
    public ColorInfo color() {
        return this.color;
    }

    /**
     * Set the color value.
     *
     * @param color the color value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis withColor(ColorInfo color) {
        this.color = color;
        return this;
    }

    /**
     * Get the imageType value.
     *
     * @return the imageType value.
     */
    public ImageType imageType() {
        return this.imageType;
    }

    /**
     * Set the imageType value.
     *
     * @param imageType the imageType value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis withImageType(ImageType imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value.
     */
    public List<ImageTag> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis withTags(List<ImageTag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value.
     */
    public ImageDescriptionDetails description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis withDescription(ImageDescriptionDetails description) {
        this.description = description;
        return this;
    }

    /**
     * Get the faces value.
     *
     * @return the faces value.
     */
    public List<FaceDescription> faces() {
        return this.faces;
    }

    /**
     * Set the faces value.
     *
     * @param faces the faces value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis withFaces(List<FaceDescription> faces) {
        this.faces = faces;
        return this;
    }

    /**
     * Get the objects value.
     *
     * @return the objects value.
     */
    public List<DetectedObject> objects() {
        return this.objects;
    }

    /**
     * Set the objects value.
     *
     * @param objects the objects value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis withObjects(List<DetectedObject> objects) {
        this.objects = objects;
        return this;
    }

    /**
     * Get the brands value.
     *
     * @return the brands value.
     */
    public List<DetectedBrand> brands() {
        return this.brands;
    }

    /**
     * Set the brands value.
     *
     * @param brands the brands value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis withBrands(List<DetectedBrand> brands) {
        this.brands = brands;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value.
     */
    public ImageMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis withMetadata(ImageMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
}
