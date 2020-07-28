// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FileSystemApplicationLogsConfig model. */
@Fluent
public final class FileSystemApplicationLogsConfig {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FileSystemApplicationLogsConfig.class);

    /*
     * Log level.
     */
    @JsonProperty(value = "level")
    private LogLevel level;

    /**
     * Get the level property: Log level.
     *
     * @return the level value.
     */
    public LogLevel level() {
        return this.level;
    }

    /**
     * Set the level property: Log level.
     *
     * @param level the level value to set.
     * @return the FileSystemApplicationLogsConfig object itself.
     */
    public FileSystemApplicationLogsConfig withLevel(LogLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
