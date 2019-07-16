/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2019_02_01.implementation.UsagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Usages.
 */
public interface Usages extends HasInner<UsagesInner> {
    /**
     * List network usages for a subscription.
     *
     * @param location The location where resource usage is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Usage> listAsync(final String location);

}
