/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object model for updating an application's publish settings.
 */
public final class PublishSettingUpdateObject {
    /**
     * Setting sentiment analysis as true returns the Sentiment of the input
     * utterance along with the response.
     */
    @JsonProperty(value = "sentimentAnalysis")
    private boolean sentimentAnalysis;

    /**
     * Setting speech as public enables speech priming in your app.
     */
    @JsonProperty(value = "speech")
    private boolean speech;

    /**
     * Setting spell checker as public enables spell checking the input
     * utterance.
     */
    @JsonProperty(value = "spellChecker")
    private boolean spellChecker;

    /**
     * Get the sentimentAnalysis value.
     *
     * @return the sentimentAnalysis value.
     */
    public boolean sentimentAnalysis() {
        return this.sentimentAnalysis;
    }

    /**
     * Set the sentimentAnalysis value.
     *
     * @param sentimentAnalysis the sentimentAnalysis value to set.
     * @return the PublishSettingUpdateObject object itself.
     */
    public PublishSettingUpdateObject withSentimentAnalysis(boolean sentimentAnalysis) {
        this.sentimentAnalysis = sentimentAnalysis;
        return this;
    }

    /**
     * Get the speech value.
     *
     * @return the speech value.
     */
    public boolean speech() {
        return this.speech;
    }

    /**
     * Set the speech value.
     *
     * @param speech the speech value to set.
     * @return the PublishSettingUpdateObject object itself.
     */
    public PublishSettingUpdateObject withSpeech(boolean speech) {
        this.speech = speech;
        return this;
    }

    /**
     * Get the spellChecker value.
     *
     * @return the spellChecker value.
     */
    public boolean spellChecker() {
        return this.spellChecker;
    }

    /**
     * Set the spellChecker value.
     *
     * @param spellChecker the spellChecker value to set.
     * @return the PublishSettingUpdateObject object itself.
     */
    public PublishSettingUpdateObject withSpellChecker(boolean spellChecker) {
        this.spellChecker = spellChecker;
        return this;
    }
}
