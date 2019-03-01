/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Blob container storage information.
 */
public class BlobShare {
    /**
     * SAS URI of Azure Storage Account Container.
     */
    @JsonProperty(value = "sasUri", required = true)
    private String sasUri;

    /**
     * Get sAS URI of Azure Storage Account Container.
     *
     * @return the sasUri value
     */
    public String sasUri() {
        return this.sasUri;
    }

    /**
     * Set sAS URI of Azure Storage Account Container.
     *
     * @param sasUri the sasUri value to set
     * @return the BlobShare object itself.
     */
    public BlobShare withSasUri(String sasUri) {
        this.sasUri = sasUri;
        return this;
    }

}
