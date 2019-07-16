/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_03_01;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The types of conditions for a multi resource alert.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "criterionType")
@JsonTypeName("MultiMetricCriteria")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "StaticThresholdCriterion", value = MetricCriteria.class),
    @JsonSubTypes.Type(name = "DynamicThresholdCriterion", value = DynamicMetricCriteria.class)
})
public class MultiMetricCriteria {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Name of the criteria.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Name of the metric.
     */
    @JsonProperty(value = "metricName", required = true)
    private String metricName;

    /**
     * Namespace of the metric.
     */
    @JsonProperty(value = "metricNamespace")
    private String metricNamespace;

    /**
     * the criteria time aggregation types.
     */
    @JsonProperty(value = "timeAggregation", required = true)
    private Object timeAggregation;

    /**
     * List of dimension conditions.
     */
    @JsonProperty(value = "dimensions")
    private List<MetricDimension> dimensions;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the MultiMetricCriteria object itself.
     */
    public MultiMetricCriteria withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get name of the criteria.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the criteria.
     *
     * @param name the name value to set
     * @return the MultiMetricCriteria object itself.
     */
    public MultiMetricCriteria withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name of the metric.
     *
     * @return the metricName value
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set name of the metric.
     *
     * @param metricName the metricName value to set
     * @return the MultiMetricCriteria object itself.
     */
    public MultiMetricCriteria withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get namespace of the metric.
     *
     * @return the metricNamespace value
     */
    public String metricNamespace() {
        return this.metricNamespace;
    }

    /**
     * Set namespace of the metric.
     *
     * @param metricNamespace the metricNamespace value to set
     * @return the MultiMetricCriteria object itself.
     */
    public MultiMetricCriteria withMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
        return this;
    }

    /**
     * Get the criteria time aggregation types.
     *
     * @return the timeAggregation value
     */
    public Object timeAggregation() {
        return this.timeAggregation;
    }

    /**
     * Set the criteria time aggregation types.
     *
     * @param timeAggregation the timeAggregation value to set
     * @return the MultiMetricCriteria object itself.
     */
    public MultiMetricCriteria withTimeAggregation(Object timeAggregation) {
        this.timeAggregation = timeAggregation;
        return this;
    }

    /**
     * Get list of dimension conditions.
     *
     * @return the dimensions value
     */
    public List<MetricDimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set list of dimension conditions.
     *
     * @param dimensions the dimensions value to set
     * @return the MultiMetricCriteria object itself.
     */
    public MultiMetricCriteria withDimensions(List<MetricDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

}
