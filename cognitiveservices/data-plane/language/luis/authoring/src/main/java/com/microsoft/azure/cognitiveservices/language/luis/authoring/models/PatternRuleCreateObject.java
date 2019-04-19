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
 * Object model for creating a pattern.
 */
public final class PatternRuleCreateObject {
    /**
     * The pattern text.
     */
    @JsonProperty(value = "pattern")
    private String pattern;

    /**
     * The intent's name which the pattern belongs to.
     */
    @JsonProperty(value = "intent")
    private String intent;

    /**
     * Get the pattern value.
     *
     * @return the pattern value.
     */
    public String pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern value.
     *
     * @param pattern the pattern value to set.
     * @return the PatternRuleCreateObject object itself.
     */
    public PatternRuleCreateObject withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the intent value.
     *
     * @return the intent value.
     */
    public String intent() {
        return this.intent;
    }

    /**
     * Set the intent value.
     *
     * @param intent the intent value to set.
     * @return the PatternRuleCreateObject object itself.
     */
    public PatternRuleCreateObject withIntent(String intent) {
        this.intent = intent;
        return this;
    }
}
