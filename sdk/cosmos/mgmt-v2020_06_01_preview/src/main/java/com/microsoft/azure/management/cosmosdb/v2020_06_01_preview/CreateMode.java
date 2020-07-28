/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CreateMode.
 */
public final class CreateMode extends ExpandableStringEnum<CreateMode> {
    /** Static value Default for CreateMode. */
    public static final CreateMode DEFAULT = fromString("Default");

    /** Static value Restore for CreateMode. */
    public static final CreateMode RESTORE = fromString("Restore");

    /**
     * Creates or finds a CreateMode from its string representation.
     * @param name a name to look for
     * @return the corresponding CreateMode
     */
    @JsonCreator
    public static CreateMode fromString(String name) {
        return fromString(name, CreateMode.class);
    }

    /**
     * @return known CreateMode values
     */
    public static Collection<CreateMode> values() {
        return values(CreateMode.class);
    }
}
