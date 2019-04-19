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
 * Collection of word alterations.
 */
public final class WordAlterationsDTO {
    /**
     * Collection of word alterations.
     */
    @JsonProperty(value = "wordAlterations", required = true)
    private List<AlterationsDTO> wordAlterations;

    /**
     * Get the wordAlterations value.
     *
     * @return the wordAlterations value.
     */
    public List<AlterationsDTO> wordAlterations() {
        return this.wordAlterations;
    }

    /**
     * Set the wordAlterations value.
     *
     * @param wordAlterations the wordAlterations value to set.
     * @return the WordAlterationsDTO object itself.
     */
    public WordAlterationsDTO withWordAlterations(List<AlterationsDTO> wordAlterations) {
        this.wordAlterations = wordAlterations;
        return this;
    }
}
