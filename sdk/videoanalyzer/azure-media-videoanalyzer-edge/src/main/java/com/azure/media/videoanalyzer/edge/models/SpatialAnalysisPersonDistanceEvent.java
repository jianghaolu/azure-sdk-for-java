// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines a Spatial Analysis person distance operation eventing configuration. */
@Fluent
public final class SpatialAnalysisPersonDistanceEvent extends SpatialAnalysisOperationEventBase {
    /*
     * The event trigger type.
     */
    @JsonProperty(value = "trigger")
    private SpatialAnalysisPersonDistanceEventTrigger trigger;

    /*
     * The event or interval output frequency.
     */
    @JsonProperty(value = "outputFrequency")
    private String outputFrequency;

    /*
     * The minimum distance threshold
     */
    @JsonProperty(value = "minimumDistanceThreshold")
    private String minimumDistanceThreshold;

    /*
     * The maximum distance threshold
     */
    @JsonProperty(value = "maximumDistanceThreshold")
    private String maximumDistanceThreshold;

    /**
     * Get the trigger property: The event trigger type.
     *
     * @return the trigger value.
     */
    public SpatialAnalysisPersonDistanceEventTrigger getTrigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: The event trigger type.
     *
     * @param trigger the trigger value to set.
     * @return the SpatialAnalysisPersonDistanceEvent object itself.
     */
    public SpatialAnalysisPersonDistanceEvent setTrigger(SpatialAnalysisPersonDistanceEventTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the outputFrequency property: The event or interval output frequency.
     *
     * @return the outputFrequency value.
     */
    public String getOutputFrequency() {
        return this.outputFrequency;
    }

    /**
     * Set the outputFrequency property: The event or interval output frequency.
     *
     * @param outputFrequency the outputFrequency value to set.
     * @return the SpatialAnalysisPersonDistanceEvent object itself.
     */
    public SpatialAnalysisPersonDistanceEvent setOutputFrequency(String outputFrequency) {
        this.outputFrequency = outputFrequency;
        return this;
    }

    /**
     * Get the minimumDistanceThreshold property: The minimum distance threshold.
     *
     * @return the minimumDistanceThreshold value.
     */
    public String getMinimumDistanceThreshold() {
        return this.minimumDistanceThreshold;
    }

    /**
     * Set the minimumDistanceThreshold property: The minimum distance threshold.
     *
     * @param minimumDistanceThreshold the minimumDistanceThreshold value to set.
     * @return the SpatialAnalysisPersonDistanceEvent object itself.
     */
    public SpatialAnalysisPersonDistanceEvent setMinimumDistanceThreshold(String minimumDistanceThreshold) {
        this.minimumDistanceThreshold = minimumDistanceThreshold;
        return this;
    }

    /**
     * Get the maximumDistanceThreshold property: The maximum distance threshold.
     *
     * @return the maximumDistanceThreshold value.
     */
    public String getMaximumDistanceThreshold() {
        return this.maximumDistanceThreshold;
    }

    /**
     * Set the maximumDistanceThreshold property: The maximum distance threshold.
     *
     * @param maximumDistanceThreshold the maximumDistanceThreshold value to set.
     * @return the SpatialAnalysisPersonDistanceEvent object itself.
     */
    public SpatialAnalysisPersonDistanceEvent setMaximumDistanceThreshold(String maximumDistanceThreshold) {
        this.maximumDistanceThreshold = maximumDistanceThreshold;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnalysisPersonDistanceEvent setThreshold(String threshold) {
        super.setThreshold(threshold);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnalysisPersonDistanceEvent setFocus(SpatialAnalysisOperationFocus focus) {
        super.setFocus(focus);
        return this;
    }
}
