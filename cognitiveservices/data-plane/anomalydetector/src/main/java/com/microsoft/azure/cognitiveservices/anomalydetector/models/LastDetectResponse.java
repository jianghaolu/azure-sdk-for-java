/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.anomalydetector.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LastDetectResponse model.
 */
public final class LastDetectResponse {
    /**
     * Frequency extracted from the series, zero means no recurrent pattern has
     * been found.
     */
    @JsonProperty(value = "period", required = true)
    private int period;

    /**
     * Suggested input series points needed for detecting the latest point.
     */
    @JsonProperty(value = "suggestedWindow", required = true)
    private int suggestedWindow;

    /**
     * Expected value of the latest point.
     */
    @JsonProperty(value = "expectedValue", required = true)
    private double expectedValue;

    /**
     * Upper margin of the latest point. UpperMargin is used to calculate
     * upperBoundary, which equals to expectedValue + (100 -
     * marginScale)*upperMargin. If the value of latest point is between
     * upperBoundary and lowerBoundary, it should be treated as normal value.
     * By adjusting marginScale value, anomaly status of latest point can be
     * changed.
     */
    @JsonProperty(value = "upperMargin", required = true)
    private double upperMargin;

    /**
     * Lower margin of the latest point. LowerMargin is used to calculate
     * lowerBoundary, which equals to expectedValue - (100 -
     * marginScale)*lowerMargin.
     */
    @JsonProperty(value = "lowerMargin", required = true)
    private double lowerMargin;

    /**
     * Anomaly status of the latest point, true means the latest point is an
     * anomaly either in negative direction or positive direction.
     */
    @JsonProperty(value = "isAnomaly", required = true)
    private boolean isAnomaly;

    /**
     * Anomaly status in negative direction of the latest point. True means the
     * latest point is an anomaly and its real value is smaller than the
     * expected one.
     */
    @JsonProperty(value = "isNegativeAnomaly", required = true)
    private boolean isNegativeAnomaly;

    /**
     * Anomaly status in positive direction of the latest point. True means the
     * latest point is an anomaly and its real value is larger than the
     * expected one.
     */
    @JsonProperty(value = "isPositiveAnomaly", required = true)
    private boolean isPositiveAnomaly;

    /**
     * Get the period value.
     *
     * @return the period value.
     */
    public int period() {
        return this.period;
    }

    /**
     * Set the period value.
     *
     * @param period the period value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse withPeriod(int period) {
        this.period = period;
        return this;
    }

    /**
     * Get the suggestedWindow value.
     *
     * @return the suggestedWindow value.
     */
    public int suggestedWindow() {
        return this.suggestedWindow;
    }

    /**
     * Set the suggestedWindow value.
     *
     * @param suggestedWindow the suggestedWindow value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse withSuggestedWindow(int suggestedWindow) {
        this.suggestedWindow = suggestedWindow;
        return this;
    }

    /**
     * Get the expectedValue value.
     *
     * @return the expectedValue value.
     */
    public double expectedValue() {
        return this.expectedValue;
    }

    /**
     * Set the expectedValue value.
     *
     * @param expectedValue the expectedValue value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse withExpectedValue(double expectedValue) {
        this.expectedValue = expectedValue;
        return this;
    }

    /**
     * Get the upperMargin value.
     *
     * @return the upperMargin value.
     */
    public double upperMargin() {
        return this.upperMargin;
    }

    /**
     * Set the upperMargin value.
     *
     * @param upperMargin the upperMargin value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse withUpperMargin(double upperMargin) {
        this.upperMargin = upperMargin;
        return this;
    }

    /**
     * Get the lowerMargin value.
     *
     * @return the lowerMargin value.
     */
    public double lowerMargin() {
        return this.lowerMargin;
    }

    /**
     * Set the lowerMargin value.
     *
     * @param lowerMargin the lowerMargin value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse withLowerMargin(double lowerMargin) {
        this.lowerMargin = lowerMargin;
        return this;
    }

    /**
     * Get the isAnomaly value.
     *
     * @return the isAnomaly value.
     */
    public boolean isAnomaly() {
        return this.isAnomaly;
    }

    /**
     * Set the isAnomaly value.
     *
     * @param isAnomaly the isAnomaly value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse withIsAnomaly(boolean isAnomaly) {
        this.isAnomaly = isAnomaly;
        return this;
    }

    /**
     * Get the isNegativeAnomaly value.
     *
     * @return the isNegativeAnomaly value.
     */
    public boolean isNegativeAnomaly() {
        return this.isNegativeAnomaly;
    }

    /**
     * Set the isNegativeAnomaly value.
     *
     * @param isNegativeAnomaly the isNegativeAnomaly value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse withIsNegativeAnomaly(boolean isNegativeAnomaly) {
        this.isNegativeAnomaly = isNegativeAnomaly;
        return this;
    }

    /**
     * Get the isPositiveAnomaly value.
     *
     * @return the isPositiveAnomaly value.
     */
    public boolean isPositiveAnomaly() {
        return this.isPositiveAnomaly;
    }

    /**
     * Set the isPositiveAnomaly value.
     *
     * @param isPositiveAnomaly the isPositiveAnomaly value to set.
     * @return the LastDetectResponse object itself.
     */
    public LastDetectResponse withIsPositiveAnomaly(boolean isPositiveAnomaly) {
        this.isPositiveAnomaly = isPositiveAnomaly;
        return this;
    }
}
