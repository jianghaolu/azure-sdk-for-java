/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import java.util.List;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.FirewallRuleInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A list of server firewall rules.
 */
public class FirewallRuleList {
    /**
     * The values property.
     */
    @JsonProperty(value = "values")
    private List<FirewallRuleInner> values;

    /**
     * Get the values value.
     *
     * @return the values value
     */
    public List<FirewallRuleInner> values() {
        return this.values;
    }

    /**
     * Set the values value.
     *
     * @param values the values value to set
     * @return the FirewallRuleList object itself.
     */
    public FirewallRuleList withValues(List<FirewallRuleInner> values) {
        this.values = values;
        return this;
    }

}
