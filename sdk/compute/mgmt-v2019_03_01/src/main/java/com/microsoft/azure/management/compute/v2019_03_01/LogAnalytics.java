/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01;

import rx.Observable;

/**
 * Type representing LogAnalytics.
 */
public interface LogAnalytics {
    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LogAnalyticsOperationResult> exportRequestRateByIntervalAsync(String location, RequestRateByIntervalInput parameters);

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LogAnalyticsOperationResult> exportThrottledRequestsAsync(String location, ThrottledRequestsInput parameters);

}
