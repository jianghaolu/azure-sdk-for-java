/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2019_03_01.implementation.ComputeManager;
import com.microsoft.azure.management.compute.v2019_03_01.implementation.AccessUriInner;

/**
 * Type representing AccessUri.
 */
public interface AccessUri extends HasInner<AccessUriInner>, HasManager<ComputeManager> {
    /**
     * @return the accessSAS value.
     */
    String accessSAS();

}
