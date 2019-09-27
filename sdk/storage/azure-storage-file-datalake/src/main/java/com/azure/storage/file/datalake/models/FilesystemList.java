// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The FilesystemList model.
 */
@Fluent
public final class FilesystemList {
    /*
     * The filesystems property.
     */
    @JsonProperty(value = "filesystems")
    private List<Filesystem> filesystems;

    /**
     * Get the filesystems property: The filesystems property.
     *
     * @return the filesystems value.
     */
    public List<Filesystem> getFilesystems() {
        return this.filesystems;
    }

    /**
     * Set the filesystems property: The filesystems property.
     *
     * @param filesystems the filesystems value to set.
     * @return the FilesystemList object itself.
     */
    public FilesystemList setFilesystems(List<Filesystem> filesystems) {
        this.filesystems = filesystems;
        return this;
    }
}
