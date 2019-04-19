/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Q-A object.
 */
public final class QnADTO {
    /**
     * Unique id for the Q-A.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /**
     * Answer text.
     */
    @JsonProperty(value = "answer", required = true)
    private String answer;

    /**
     * Source from which Q-A was indexed. eg.
     * https://docs.microsoft.com/en-us/azure/cognitive-services/QnAMaker/FAQs.
     */
    @JsonProperty(value = "source")
    private String source;

    /**
     * List of questions associated with the answer.
     */
    @JsonProperty(value = "questions", required = true)
    private List<String> questions;

    /**
     * List of metadata associated with the answer.
     */
    @JsonProperty(value = "metadata")
    private List<MetadataDTO> metadata;

    /**
     * Get the id value.
     *
     * @return the id value.
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set.
     * @return the QnADTO object itself.
     */
    public QnADTO withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the answer value.
     *
     * @return the answer value.
     */
    public String answer() {
        return this.answer;
    }

    /**
     * Set the answer value.
     *
     * @param answer the answer value to set.
     * @return the QnADTO object itself.
     */
    public QnADTO withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    /**
     * Get the source value.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set.
     * @return the QnADTO object itself.
     */
    public QnADTO withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the questions value.
     *
     * @return the questions value.
     */
    public List<String> questions() {
        return this.questions;
    }

    /**
     * Set the questions value.
     *
     * @param questions the questions value to set.
     * @return the QnADTO object itself.
     */
    public QnADTO withQuestions(List<String> questions) {
        this.questions = questions;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value.
     */
    public List<MetadataDTO> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set.
     * @return the QnADTO object itself.
     */
    public QnADTO withMetadata(List<MetadataDTO> metadata) {
        this.metadata = metadata;
        return this;
    }
}
