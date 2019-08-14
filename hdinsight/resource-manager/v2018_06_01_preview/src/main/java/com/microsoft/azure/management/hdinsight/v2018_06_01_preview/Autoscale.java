/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The autoscale request parameters.
 */
public class Autoscale {
    /**
     * Parameters for load-based autoscale.
     */
    @JsonProperty(value = "capacity")
    private AutoscaleCapacity capacity;

    /**
     * Parameters for schedule-based autoscale.
     */
    @JsonProperty(value = "recurrence")
    private AutoscaleRecurrence recurrence;

    /**
     * Get parameters for load-based autoscale.
     *
     * @return the capacity value
     */
    public AutoscaleCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set parameters for load-based autoscale.
     *
     * @param capacity the capacity value to set
     * @return the Autoscale object itself.
     */
    public Autoscale withCapacity(AutoscaleCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get parameters for schedule-based autoscale.
     *
     * @return the recurrence value
     */
    public AutoscaleRecurrence recurrence() {
        return this.recurrence;
    }

    /**
     * Set parameters for schedule-based autoscale.
     *
     * @param recurrence the recurrence value to set
     * @return the Autoscale object itself.
     */
    public Autoscale withRecurrence(AutoscaleRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

}
