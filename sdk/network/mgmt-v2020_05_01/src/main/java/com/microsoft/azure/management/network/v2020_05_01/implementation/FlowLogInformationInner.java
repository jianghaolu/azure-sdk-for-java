/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.management.network.v2020_05_01.RetentionPolicyParameters;
import com.microsoft.azure.management.network.v2020_05_01.FlowLogFormatParameters;
import com.microsoft.azure.management.network.v2020_05_01.TrafficAnalyticsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Information on the configuration of flow log and traffic analytics
 * (optional) .
 */
@JsonFlatten
public class FlowLogInformationInner {
    /**
     * The ID of the resource to configure for flow log and traffic analytics
     * (optional) .
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /**
     * ID of the storage account which is used to store the flow log.
     */
    @JsonProperty(value = "properties.storageId", required = true)
    private String storageId;

    /**
     * Flag to enable/disable flow logging.
     */
    @JsonProperty(value = "properties.enabled", required = true)
    private boolean enabled;

    /**
     * Parameters that define the retention policy for flow log.
     */
    @JsonProperty(value = "properties.retentionPolicy")
    private RetentionPolicyParameters retentionPolicy;

    /**
     * Parameters that define the flow log format.
     */
    @JsonProperty(value = "properties.format")
    private FlowLogFormatParameters format;

    /**
     * Parameters that define the configuration of traffic analytics.
     */
    @JsonProperty(value = "flowAnalyticsConfiguration")
    private TrafficAnalyticsProperties flowAnalyticsConfiguration;

    /**
     * Get the ID of the resource to configure for flow log and traffic analytics (optional) .
     *
     * @return the targetResourceId value
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the ID of the resource to configure for flow log and traffic analytics (optional) .
     *
     * @param targetResourceId the targetResourceId value to set
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get iD of the storage account which is used to store the flow log.
     *
     * @return the storageId value
     */
    public String storageId() {
        return this.storageId;
    }

    /**
     * Set iD of the storage account which is used to store the flow log.
     *
     * @param storageId the storageId value to set
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * Get flag to enable/disable flow logging.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set flag to enable/disable flow logging.
     *
     * @param enabled the enabled value to set
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get parameters that define the retention policy for flow log.
     *
     * @return the retentionPolicy value
     */
    public RetentionPolicyParameters retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set parameters that define the retention policy for flow log.
     *
     * @param retentionPolicy the retentionPolicy value to set
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withRetentionPolicy(RetentionPolicyParameters retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Get parameters that define the flow log format.
     *
     * @return the format value
     */
    public FlowLogFormatParameters format() {
        return this.format;
    }

    /**
     * Set parameters that define the flow log format.
     *
     * @param format the format value to set
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withFormat(FlowLogFormatParameters format) {
        this.format = format;
        return this;
    }

    /**
     * Get parameters that define the configuration of traffic analytics.
     *
     * @return the flowAnalyticsConfiguration value
     */
    public TrafficAnalyticsProperties flowAnalyticsConfiguration() {
        return this.flowAnalyticsConfiguration;
    }

    /**
     * Set parameters that define the configuration of traffic analytics.
     *
     * @param flowAnalyticsConfiguration the flowAnalyticsConfiguration value to set
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withFlowAnalyticsConfiguration(TrafficAnalyticsProperties flowAnalyticsConfiguration) {
        this.flowAnalyticsConfiguration = flowAnalyticsConfiguration;
        return this;
    }

}
