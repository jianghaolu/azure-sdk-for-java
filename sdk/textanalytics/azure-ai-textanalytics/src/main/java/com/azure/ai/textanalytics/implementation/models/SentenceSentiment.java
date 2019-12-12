// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The SentenceSentiment model.
 */
@Fluent
public final class SentenceSentiment {
    /*
     * The predicted Sentiment for the sentence. Possible values include:
     * 'positive', 'neutral', 'negative'
     */
    @JsonProperty(value = "sentiment", required = true)
    private String sentiment;

    /*
     * The sentiment confidence score between 0 and 1 for the sentence for all
     * classes.
     */
    @JsonProperty(value = "sentenceScores", required = true)
    private Object sentenceScores;

    /*
     * The sentence offset from the start of the document.
     */
    @JsonProperty(value = "offset", required = true)
    private int offset;

    /*
     * The length of the sentence by Unicode standard.
     */
    @JsonProperty(value = "length", required = true)
    private int length;

    /*
     * The warnings generated for the sentence.
     */
    @JsonProperty(value = "warnings")
    private List<String> warnings;

    /**
     * Get the sentiment property: The predicted Sentiment for the sentence.
     * Possible values include: 'positive', 'neutral', 'negative'.
     *
     * @return the sentiment value.
     */
    public String getSentiment() {
        return this.sentiment;
    }

    /**
     * Set the sentiment property: The predicted Sentiment for the sentence.
     * Possible values include: 'positive', 'neutral', 'negative'.
     *
     * @param sentiment the sentiment value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setSentiment(String sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    /**
     * Get the sentenceScores property: The sentiment confidence score between
     * 0 and 1 for the sentence for all classes.
     *
     * @return the sentenceScores value.
     */
    public Object getSentenceScores() {
        return this.sentenceScores;
    }

    /**
     * Set the sentenceScores property: The sentiment confidence score between
     * 0 and 1 for the sentence for all classes.
     *
     * @param sentenceScores the sentenceScores value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setSentenceScores(Object sentenceScores) {
        this.sentenceScores = sentenceScores;
        return this;
    }

    /**
     * Get the offset property: The sentence offset from the start of the
     * document.
     *
     * @return the offset value.
     */
    public int getOffset() {
        return this.offset;
    }

    /**
     * Set the offset property: The sentence offset from the start of the
     * document.
     *
     * @param offset the offset value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the length property: The length of the sentence by Unicode standard.
     *
     * @return the length value.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Set the length property: The length of the sentence by Unicode standard.
     *
     * @param length the length value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setLength(int length) {
        this.length = length;
        return this;
    }

    /**
     * Get the warnings property: The warnings generated for the sentence.
     *
     * @return the warnings value.
     */
    public List<String> getWarnings() {
        return this.warnings;
    }

    /**
     * Set the warnings property: The warnings generated for the sentence.
     *
     * @param warnings the warnings value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setWarnings(List<String> warnings) {
        this.warnings = warnings;
        return this;
    }
}
