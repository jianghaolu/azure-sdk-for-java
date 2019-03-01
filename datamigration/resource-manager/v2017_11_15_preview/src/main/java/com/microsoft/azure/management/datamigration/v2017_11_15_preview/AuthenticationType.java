/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AuthenticationType.
 */
public enum AuthenticationType {
    /** Enum value None. */
    NONE("None"),

    /** Enum value WindowsAuthentication. */
    WINDOWS_AUTHENTICATION("WindowsAuthentication"),

    /** Enum value SqlAuthentication. */
    SQL_AUTHENTICATION("SqlAuthentication"),

    /** Enum value ActiveDirectoryIntegrated. */
    ACTIVE_DIRECTORY_INTEGRATED("ActiveDirectoryIntegrated"),

    /** Enum value ActiveDirectoryPassword. */
    ACTIVE_DIRECTORY_PASSWORD("ActiveDirectoryPassword");

    /** The actual serialized value for a AuthenticationType instance. */
    private String value;

    AuthenticationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AuthenticationType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AuthenticationType object, or null if unable to parse.
     */
    @JsonCreator
    public static AuthenticationType fromString(String value) {
        AuthenticationType[] items = AuthenticationType.values();
        for (AuthenticationType item : items) {
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
