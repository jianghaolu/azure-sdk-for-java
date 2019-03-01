/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A long term retention policy.
 */
@JsonFlatten
public class BackupLongTermRetentionPolicyInner extends ProxyResource {
    /**
     * The weekly retention policy for an LTR backup in an ISO 8601 format.
     */
    @JsonProperty(value = "properties.weeklyRetention")
    private String weeklyRetention;

    /**
     * The monthly retention policy for an LTR backup in an ISO 8601 format.
     */
    @JsonProperty(value = "properties.monthlyRetention")
    private String monthlyRetention;

    /**
     * The yearly retention policy for an LTR backup in an ISO 8601 format.
     */
    @JsonProperty(value = "properties.yearlyRetention")
    private String yearlyRetention;

    /**
     * The week of year to take the yearly backup in an ISO 8601 format.
     */
    @JsonProperty(value = "properties.weekOfYear")
    private Integer weekOfYear;

    /**
     * Get the weekly retention policy for an LTR backup in an ISO 8601 format.
     *
     * @return the weeklyRetention value
     */
    public String weeklyRetention() {
        return this.weeklyRetention;
    }

    /**
     * Set the weekly retention policy for an LTR backup in an ISO 8601 format.
     *
     * @param weeklyRetention the weeklyRetention value to set
     * @return the BackupLongTermRetentionPolicyInner object itself.
     */
    public BackupLongTermRetentionPolicyInner withWeeklyRetention(String weeklyRetention) {
        this.weeklyRetention = weeklyRetention;
        return this;
    }

    /**
     * Get the monthly retention policy for an LTR backup in an ISO 8601 format.
     *
     * @return the monthlyRetention value
     */
    public String monthlyRetention() {
        return this.monthlyRetention;
    }

    /**
     * Set the monthly retention policy for an LTR backup in an ISO 8601 format.
     *
     * @param monthlyRetention the monthlyRetention value to set
     * @return the BackupLongTermRetentionPolicyInner object itself.
     */
    public BackupLongTermRetentionPolicyInner withMonthlyRetention(String monthlyRetention) {
        this.monthlyRetention = monthlyRetention;
        return this;
    }

    /**
     * Get the yearly retention policy for an LTR backup in an ISO 8601 format.
     *
     * @return the yearlyRetention value
     */
    public String yearlyRetention() {
        return this.yearlyRetention;
    }

    /**
     * Set the yearly retention policy for an LTR backup in an ISO 8601 format.
     *
     * @param yearlyRetention the yearlyRetention value to set
     * @return the BackupLongTermRetentionPolicyInner object itself.
     */
    public BackupLongTermRetentionPolicyInner withYearlyRetention(String yearlyRetention) {
        this.yearlyRetention = yearlyRetention;
        return this;
    }

    /**
     * Get the week of year to take the yearly backup in an ISO 8601 format.
     *
     * @return the weekOfYear value
     */
    public Integer weekOfYear() {
        return this.weekOfYear;
    }

    /**
     * Set the week of year to take the yearly backup in an ISO 8601 format.
     *
     * @param weekOfYear the weekOfYear value to set
     * @return the BackupLongTermRetentionPolicyInner object itself.
     */
    public BackupLongTermRetentionPolicyInner withWeekOfYear(Integer weekOfYear) {
        this.weekOfYear = weekOfYear;
        return this;
    }

}
