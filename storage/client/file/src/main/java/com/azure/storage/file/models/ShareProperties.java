// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.azure.core.annotations.HeaderCollection;
import com.azure.core.implementation.DateTimeRfc1123;
import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Properties of a share.
 */
@JacksonXmlRootElement(localName = "ShareProperties")
@Fluent
public final class ShareProperties {
    /*
     * The lastModified property.
     */
    @JsonProperty(value = "Last-Modified", required = true)
    private DateTimeRfc1123 lastModified;

    /*
     * The etag property.
     */
    @JsonProperty(value = "Etag", required = true)
    private String etag;

    /*
     * The quota property.
     */
    @JsonProperty(value = "Quota", required = true)
    private int quota;

    /*
     * The metadata property.
     */
    @JsonProperty(value = "Metadata")
    private Map<String, String> metadata;

    /**
     * Get the lastModified property: The lastModified property.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.dateTime();
    }

    /**
     * Set the lastModified property: The lastModified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the ShareProperties object itself.
     */
    public ShareProperties lastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the etag property: The etag property.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The etag property.
     *
     * @param etag the etag value to set.
     * @return the ShareProperties object itself.
     */
    public ShareProperties etag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the quota property: The quota property.
     *
     * @return the quota value.
     */
    public int quota() {
        return this.quota;
    }

    /**
     * Set the quota property: The quota property.
     *
     * @param quota the quota value to set.
     * @return the ShareProperties object itself.
     */
    public ShareProperties quota(int quota) {
        this.quota = quota;
        return this;
    }

    /**
     * Get the metadata property: The metadata property.
     *
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the ShareProperties object itself.
     */
    public ShareProperties metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
