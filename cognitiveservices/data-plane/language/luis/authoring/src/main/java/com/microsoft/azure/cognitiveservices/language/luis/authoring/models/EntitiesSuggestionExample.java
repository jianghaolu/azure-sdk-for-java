/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Predicted/suggested entity.
 */
public final class EntitiesSuggestionExample {
    /**
     * The utterance. For example, "What's the weather like in seattle?".
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * The utterance tokenized.
     */
    @JsonProperty(value = "tokenizedText")
    private List<String> tokenizedText;

    /**
     * Predicted/suggested intents.
     */
    @JsonProperty(value = "intentPredictions")
    private List<IntentPrediction> intentPredictions;

    /**
     * Predicted/suggested entities.
     */
    @JsonProperty(value = "entityPredictions")
    private List<EntityPrediction> entityPredictions;

    /**
     * Get the text value.
     *
     * @return the text value.
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set.
     * @return the EntitiesSuggestionExample object itself.
     */
    public EntitiesSuggestionExample withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the tokenizedText value.
     *
     * @return the tokenizedText value.
     */
    public List<String> tokenizedText() {
        return this.tokenizedText;
    }

    /**
     * Set the tokenizedText value.
     *
     * @param tokenizedText the tokenizedText value to set.
     * @return the EntitiesSuggestionExample object itself.
     */
    public EntitiesSuggestionExample withTokenizedText(List<String> tokenizedText) {
        this.tokenizedText = tokenizedText;
        return this;
    }

    /**
     * Get the intentPredictions value.
     *
     * @return the intentPredictions value.
     */
    public List<IntentPrediction> intentPredictions() {
        return this.intentPredictions;
    }

    /**
     * Set the intentPredictions value.
     *
     * @param intentPredictions the intentPredictions value to set.
     * @return the EntitiesSuggestionExample object itself.
     */
    public EntitiesSuggestionExample withIntentPredictions(List<IntentPrediction> intentPredictions) {
        this.intentPredictions = intentPredictions;
        return this;
    }

    /**
     * Get the entityPredictions value.
     *
     * @return the entityPredictions value.
     */
    public List<EntityPrediction> entityPredictions() {
        return this.entityPredictions;
    }

    /**
     * Set the entityPredictions value.
     *
     * @param entityPredictions the entityPredictions value to set.
     * @return the EntitiesSuggestionExample object itself.
     */
    public EntitiesSuggestionExample withEntityPredictions(List<EntityPrediction> entityPredictions) {
        this.entityPredictions = entityPredictions;
        return this;
    }
}
