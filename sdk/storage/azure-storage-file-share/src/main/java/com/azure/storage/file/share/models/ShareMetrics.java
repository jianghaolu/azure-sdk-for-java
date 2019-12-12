// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Storage Analytics metrics for file service.
 */
@JacksonXmlRootElement(localName = "Metrics")
@Fluent
public final class ShareMetrics {
    /*
     * The version of Storage Analytics to configure.
     */
    @JsonProperty(value = "Version", required = true)
    private String version;

    /*
     * Indicates whether metrics are enabled for the File service.
     */
    @JsonProperty(value = "Enabled", required = true)
    private boolean enabled;

    /*
     * The retentionPolicy property.
     */
    @JsonProperty(value = "RetentionPolicy")
    private ShareRetentionPolicy retentionPolicy;

    /*
     * Indicates whether metrics should generate summary statistics for called
     * API operations.
     */
    @JsonProperty(value = "IncludeAPIs")
    private Boolean includeApis;

    /**
     * Get the version property: The version of Storage Analytics to configure.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of Storage Analytics to configure.
     *
     * @param version the version value to set.
     * @return the ShareMetrics object itself.
     */
    public ShareMetrics setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether metrics are enabled for the
     * File service.
     *
     * @return the enabled value.
     */
    public boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether metrics are enabled for the
     * File service.
     *
     * @param enabled the enabled value to set.
     * @return the ShareMetrics object itself.
     */
    public ShareMetrics setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the retentionPolicy property: The retentionPolicy property.
     *
     * @return the retentionPolicy value.
     */
    public ShareRetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: The retentionPolicy property.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the ShareMetrics object itself.
     */
    public ShareMetrics setRetentionPolicy(ShareRetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Get the includeApis property: Indicates whether metrics should generate
     * summary statistics for called API operations.
     *
     * @return the includeApis value.
     */
    public Boolean isIncludeApis() {
        return this.includeApis;
    }

    /**
     * Set the includeApis property: Indicates whether metrics should generate
     * summary statistics for called API operations.
     *
     * @param includeApis the includeApis value to set.
     * @return the ShareMetrics object itself.
     */
    public ShareMetrics setIncludeApis(Boolean includeApis) {
        this.includeApis = includeApis;
        return this;
    }
}
