/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import com.azure.common.implementation.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for TrainingType.
 */
public final class TrainingType extends ExpandableStringEnum<TrainingType> {
    /**
     * Static value Regular for TrainingType.
     */
    public static final TrainingType REGULAR = fromString("Regular");

    /**
     * Static value Advanced for TrainingType.
     */
    public static final TrainingType ADVANCED = fromString("Advanced");

    /**
     * Creates or finds a TrainingType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TrainingType.
     */
    @JsonCreator
    public static TrainingType fromString(String name) {
        return fromString(name, TrainingType.class);
    }

    /**
     * @return known TrainingType values.
     */
    public static Collection<TrainingType> values() {
        return values(TrainingType.class);
    }
}
