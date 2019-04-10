/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SignedResource.
 */
public final class SignedResource extends ExpandableStringEnum<SignedResource> {
    /** Static value b for SignedResource. */
    public static final SignedResource B = fromString("b");

    /** Static value c for SignedResource. */
    public static final SignedResource C = fromString("c");

    /** Static value f for SignedResource. */
    public static final SignedResource F = fromString("f");

    /** Static value s for SignedResource. */
    public static final SignedResource S = fromString("s");

    /**
     * Creates or finds a SignedResource from its string representation.
     * @param name a name to look for
     * @return the corresponding SignedResource
     */
    @JsonCreator
    public static SignedResource fromString(String name) {
        return fromString(name, SignedResource.class);
    }

    /**
     * @return known SignedResource values
     */
    public static Collection<SignedResource> values() {
        return values(SignedResource.class);
    }
}
