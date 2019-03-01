/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.labservices.v2018_10_15.implementation.LabServicesManager;
import com.microsoft.azure.management.labservices.v2018_10_15.implementation.GetEnvironmentResponseInner;

/**
 * Type representing GetEnvironmentResponse.
 */
public interface GetEnvironmentResponse extends HasInner<GetEnvironmentResponseInner>, HasManager<LabServicesManager> {
    /**
     * @return the environment value.
     */
    EnvironmentDetails environment();

}
