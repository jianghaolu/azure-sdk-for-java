/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A Policy.
 */
@JsonFlatten
public class PolicyFragment extends UpdateResource {
    /**
     * The description of the policy.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The status of the policy. Possible values include: 'Enabled',
     * 'Disabled'.
     */
    @JsonProperty(value = "properties.status")
    private PolicyStatus status;

    /**
     * The fact name of the policy (e.g. LabVmCount, LabVmSize,
     * MaxVmsAllowedPerLab, etc. Possible values include:
     * 'UserOwnedLabVmCount', 'UserOwnedLabPremiumVmCount', 'LabVmCount',
     * 'LabPremiumVmCount', 'LabVmSize', 'GalleryImage',
     * 'UserOwnedLabVmCountInSubnet', 'LabTargetCost', 'EnvironmentTemplate',
     * 'ScheduleEditPermission'.
     */
    @JsonProperty(value = "properties.factName")
    private PolicyFactName factName;

    /**
     * The fact data of the policy.
     */
    @JsonProperty(value = "properties.factData")
    private String factData;

    /**
     * The threshold of the policy (i.e. a number for MaxValuePolicy, and a
     * JSON array of values for AllowedValuesPolicy).
     */
    @JsonProperty(value = "properties.threshold")
    private String threshold;

    /**
     * The evaluator type of the policy (i.e. AllowedValuesPolicy,
     * MaxValuePolicy). Possible values include: 'AllowedValuesPolicy',
     * 'MaxValuePolicy'.
     */
    @JsonProperty(value = "properties.evaluatorType")
    private PolicyEvaluatorType evaluatorType;

    /**
     * Get the description of the policy.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the policy.
     *
     * @param description the description value to set
     * @return the PolicyFragment object itself.
     */
    public PolicyFragment withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the status of the policy. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the status value
     */
    public PolicyStatus status() {
        return this.status;
    }

    /**
     * Set the status of the policy. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param status the status value to set
     * @return the PolicyFragment object itself.
     */
    public PolicyFragment withStatus(PolicyStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the fact name of the policy (e.g. LabVmCount, LabVmSize, MaxVmsAllowedPerLab, etc. Possible values include: 'UserOwnedLabVmCount', 'UserOwnedLabPremiumVmCount', 'LabVmCount', 'LabPremiumVmCount', 'LabVmSize', 'GalleryImage', 'UserOwnedLabVmCountInSubnet', 'LabTargetCost', 'EnvironmentTemplate', 'ScheduleEditPermission'.
     *
     * @return the factName value
     */
    public PolicyFactName factName() {
        return this.factName;
    }

    /**
     * Set the fact name of the policy (e.g. LabVmCount, LabVmSize, MaxVmsAllowedPerLab, etc. Possible values include: 'UserOwnedLabVmCount', 'UserOwnedLabPremiumVmCount', 'LabVmCount', 'LabPremiumVmCount', 'LabVmSize', 'GalleryImage', 'UserOwnedLabVmCountInSubnet', 'LabTargetCost', 'EnvironmentTemplate', 'ScheduleEditPermission'.
     *
     * @param factName the factName value to set
     * @return the PolicyFragment object itself.
     */
    public PolicyFragment withFactName(PolicyFactName factName) {
        this.factName = factName;
        return this;
    }

    /**
     * Get the fact data of the policy.
     *
     * @return the factData value
     */
    public String factData() {
        return this.factData;
    }

    /**
     * Set the fact data of the policy.
     *
     * @param factData the factData value to set
     * @return the PolicyFragment object itself.
     */
    public PolicyFragment withFactData(String factData) {
        this.factData = factData;
        return this;
    }

    /**
     * Get the threshold of the policy (i.e. a number for MaxValuePolicy, and a JSON array of values for AllowedValuesPolicy).
     *
     * @return the threshold value
     */
    public String threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold of the policy (i.e. a number for MaxValuePolicy, and a JSON array of values for AllowedValuesPolicy).
     *
     * @param threshold the threshold value to set
     * @return the PolicyFragment object itself.
     */
    public PolicyFragment withThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Get the evaluator type of the policy (i.e. AllowedValuesPolicy, MaxValuePolicy). Possible values include: 'AllowedValuesPolicy', 'MaxValuePolicy'.
     *
     * @return the evaluatorType value
     */
    public PolicyEvaluatorType evaluatorType() {
        return this.evaluatorType;
    }

    /**
     * Set the evaluator type of the policy (i.e. AllowedValuesPolicy, MaxValuePolicy). Possible values include: 'AllowedValuesPolicy', 'MaxValuePolicy'.
     *
     * @param evaluatorType the evaluatorType value to set
     * @return the PolicyFragment object itself.
     */
    public PolicyFragment withEvaluatorType(PolicyEvaluatorType evaluatorType) {
        this.evaluatorType = evaluatorType;
        return this;
    }

}
