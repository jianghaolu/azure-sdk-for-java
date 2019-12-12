/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for WhatIfResultFormat.
 */
public enum WhatIfResultFormat {
    /** Enum value ResourceIdOnly. */
    RESOURCE_ID_ONLY("ResourceIdOnly"),

    /** Enum value FullResourcePayloads. */
    FULL_RESOURCE_PAYLOADS("FullResourcePayloads");

    /** The actual serialized value for a WhatIfResultFormat instance. */
    private String value;

    WhatIfResultFormat(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a WhatIfResultFormat instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed WhatIfResultFormat object, or null if unable to parse.
     */
    @JsonCreator
    public static WhatIfResultFormat fromString(String value) {
        WhatIfResultFormat[] items = WhatIfResultFormat.values();
        for (WhatIfResultFormat item : items) {
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
