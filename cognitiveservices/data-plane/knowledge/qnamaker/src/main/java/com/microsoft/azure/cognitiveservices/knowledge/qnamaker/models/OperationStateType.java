/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import com.azure.common.implementation.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for OperationStateType.
 */
public final class OperationStateType extends ExpandableStringEnum<OperationStateType> {
    /**
     * Static value Failed for OperationStateType.
     */
    public static final OperationStateType FAILED = fromString("Failed");

    /**
     * Static value NotStarted for OperationStateType.
     */
    public static final OperationStateType NOT_STARTED = fromString("NotStarted");

    /**
     * Static value Running for OperationStateType.
     */
    public static final OperationStateType RUNNING = fromString("Running");

    /**
     * Static value Succeeded for OperationStateType.
     */
    public static final OperationStateType SUCCEEDED = fromString("Succeeded");

    /**
     * Creates or finds a OperationStateType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationStateType.
     */
    @JsonCreator
    public static OperationStateType fromString(String name) {
        return fromString(name, OperationStateType.class);
    }

    /**
     * @return known OperationStateType values.
     */
    public static Collection<OperationStateType> values() {
        return values(OperationStateType.class);
    }
}
