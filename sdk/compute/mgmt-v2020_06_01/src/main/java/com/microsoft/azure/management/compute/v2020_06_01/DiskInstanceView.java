/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of the disk.
 */
public class DiskInstanceView {
    /**
     * The disk name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Specifies the encryption settings for the OS Disk. &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     */
    @JsonProperty(value = "encryptionSettings")
    private List<DiskEncryptionSettings> encryptionSettings;

    /**
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /**
     * Get the disk name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the disk name.
     *
     * @param name the name value to set
     * @return the DiskInstanceView object itself.
     */
    public DiskInstanceView withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get specifies the encryption settings for the OS Disk. &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15.
     *
     * @return the encryptionSettings value
     */
    public List<DiskEncryptionSettings> encryptionSettings() {
        return this.encryptionSettings;
    }

    /**
     * Set specifies the encryption settings for the OS Disk. &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15.
     *
     * @param encryptionSettings the encryptionSettings value to set
     * @return the DiskInstanceView object itself.
     */
    public DiskInstanceView withEncryptionSettings(List<DiskEncryptionSettings> encryptionSettings) {
        this.encryptionSettings = encryptionSettings;
        return this;
    }

    /**
     * Get the resource status information.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the resource status information.
     *
     * @param statuses the statuses value to set
     * @return the DiskInstanceView object itself.
     */
    public DiskInstanceView withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

}
