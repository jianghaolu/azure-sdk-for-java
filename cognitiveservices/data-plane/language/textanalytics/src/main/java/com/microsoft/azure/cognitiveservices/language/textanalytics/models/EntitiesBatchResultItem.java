/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.textanalytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The EntitiesBatchResultItem model.
 */
public final class EntitiesBatchResultItem {
    /**
     * Unique, non-empty document identifier.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Recognized entities in the document.
     */
    @JsonProperty(value = "entities", access = JsonProperty.Access.WRITE_ONLY)
    private List<EntityRecord> entities;

    /**
     * (Optional) if showStats=true was specified in the request this field
     * will contain information about the document payload.
     */
    @JsonProperty(value = "statistics")
    private DocumentStatistics statistics;

    /**
     * Get the id value.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set.
     * @return the EntitiesBatchResultItem object itself.
     */
    public EntitiesBatchResultItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the entities value.
     *
     * @return the entities value.
     */
    public List<EntityRecord> entities() {
        return this.entities;
    }

    /**
     * Get the statistics value.
     *
     * @return the statistics value.
     */
    public DocumentStatistics statistics() {
        return this.statistics;
    }

    /**
     * Set the statistics value.
     *
     * @param statistics the statistics value to set.
     * @return the EntitiesBatchResultItem object itself.
     */
    public EntitiesBatchResultItem withStatistics(DocumentStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
}
