/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2015_08_01.implementation;

import java.util.List;
import com.microsoft.azure.management.eventhubs.v2015_08_01.AccessRights;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Single item in a List or Get AuthorizationRule operation.
 */
@JsonFlatten
public class SharedAccessAuthorizationRuleResourceInner extends ProxyResource {
    /**
     * The rights associated with the rule.
     */
    @JsonProperty(value = "properties.rights", required = true)
    private List<AccessRights> rights;

    /**
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the rights associated with the rule.
     *
     * @return the rights value
     */
    public List<AccessRights> rights() {
        return this.rights;
    }

    /**
     * Set the rights associated with the rule.
     *
     * @param rights the rights value to set
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withRights(List<AccessRights> rights) {
        this.rights = rights;
        return this;
    }

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

}
