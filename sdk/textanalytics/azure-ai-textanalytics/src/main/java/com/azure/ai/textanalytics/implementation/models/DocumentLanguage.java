// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.ai.textanalytics.models.DetectedLanguage;
import com.azure.ai.textanalytics.models.TextDocumentStatistics;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The DocumentLanguage model.
 */
@Fluent
public final class DocumentLanguage {
    /*
     * Unique, non-empty document identifier.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * A list of extracted languages.
     */
    @JsonProperty(value = "detectedLanguages", required = true)
    private List<DetectedLanguage> detectedLanguages;

    /*
     * if showStats=true was specified in the request this field will contain
     * information about the document payload.
     */
    @JsonProperty(value = "statistics")
    private TextDocumentStatistics statistics;

    /**
     * Get the id property: Unique, non-empty document identifier.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Unique, non-empty document identifier.
     *
     * @param id the id value to set.
     * @return the DocumentLanguage object itself.
     */
    public DocumentLanguage setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the detectedLanguages property: A list of extracted languages.
     *
     * @return the detectedLanguages value.
     */
    public List<DetectedLanguage> getDetectedLanguages() {
        return this.detectedLanguages;
    }

    /**
     * Set the detectedLanguages property: A list of extracted languages.
     *
     * @param detectedLanguages the detectedLanguages value to set.
     * @return the DocumentLanguage object itself.
     */
    public DocumentLanguage setDetectedLanguages(List<DetectedLanguage> detectedLanguages) {
        this.detectedLanguages = detectedLanguages;
        return this;
    }

    /**
     * Get the statistics property: if showStats=true was specified in the
     * request this field will contain information about the document payload.
     *
     * @return the statistics value.
     */
    public TextDocumentStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: if showStats=true was specified in the
     * request this field will contain information about the document payload.
     *
     * @param statistics the statistics value to set.
     * @return the DocumentLanguage object itself.
     */
    public DocumentLanguage setStatistics(TextDocumentStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
}
