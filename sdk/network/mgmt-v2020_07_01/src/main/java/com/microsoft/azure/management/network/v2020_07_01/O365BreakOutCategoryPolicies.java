/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Office365 breakout categories.
 */
public class O365BreakOutCategoryPolicies {
    /**
     * Flag to control allow category.
     */
    @JsonProperty(value = "allow")
    private Boolean allow;

    /**
     * Flag to control optimize category.
     */
    @JsonProperty(value = "optimize")
    private Boolean optimize;

    /**
     * Flag to control default category.
     */
    @JsonProperty(value = "default")
    private Boolean defaultProperty;

    /**
     * Get flag to control allow category.
     *
     * @return the allow value
     */
    public Boolean allow() {
        return this.allow;
    }

    /**
     * Set flag to control allow category.
     *
     * @param allow the allow value to set
     * @return the O365BreakOutCategoryPolicies object itself.
     */
    public O365BreakOutCategoryPolicies withAllow(Boolean allow) {
        this.allow = allow;
        return this;
    }

    /**
     * Get flag to control optimize category.
     *
     * @return the optimize value
     */
    public Boolean optimize() {
        return this.optimize;
    }

    /**
     * Set flag to control optimize category.
     *
     * @param optimize the optimize value to set
     * @return the O365BreakOutCategoryPolicies object itself.
     */
    public O365BreakOutCategoryPolicies withOptimize(Boolean optimize) {
        this.optimize = optimize;
        return this;
    }

    /**
     * Get flag to control default category.
     *
     * @return the defaultProperty value
     */
    public Boolean defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set flag to control default category.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the O365BreakOutCategoryPolicies object itself.
     */
    public O365BreakOutCategoryPolicies withDefaultProperty(Boolean defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

}
