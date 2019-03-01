// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DependencyAction.
 */
public enum DependencyAction {
    /** Satisfy the task's dependencies. */
    SATISFY("satisfy"),

    /** Block the task's dependencies. */
    BLOCK("block");

    /** The actual serialized value for a DependencyAction instance. */
    private String value;

    DependencyAction(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DependencyAction instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DependencyAction object, or null if unable to parse.
     */
    @JsonCreator
    public static DependencyAction fromString(String value) {
        DependencyAction[] items = DependencyAction.values();
        for (DependencyAction item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
