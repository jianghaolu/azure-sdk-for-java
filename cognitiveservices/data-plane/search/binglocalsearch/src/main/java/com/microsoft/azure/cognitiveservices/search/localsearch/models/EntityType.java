/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.localsearch.models;

import com.azure.common.implementation.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for EntityType.
 */
public final class EntityType extends ExpandableStringEnum<EntityType> {
    /**
     * Static value Place for EntityType.
     */
    public static final EntityType PLACE = fromString("Place");

    /**
     * Static value LocalBusiness for EntityType.
     */
    public static final EntityType LOCAL_BUSINESS = fromString("LocalBusiness");

    /**
     * Static value Restaurant for EntityType.
     */
    public static final EntityType RESTAURANT = fromString("Restaurant");

    /**
     * Static value Hotel for EntityType.
     */
    public static final EntityType HOTEL = fromString("Hotel");

    /**
     * Creates or finds a EntityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EntityType.
     */
    @JsonCreator
    public static EntityType fromString(String name) {
        return fromString(name, EntityType.class);
    }

    /**
     * @return known EntityType values.
     */
    public static Collection<EntityType> values() {
        return values(EntityType.class);
    }
}
