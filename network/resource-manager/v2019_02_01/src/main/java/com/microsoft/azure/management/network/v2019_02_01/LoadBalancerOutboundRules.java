/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2019_02_01.implementation.LoadBalancerOutboundRulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LoadBalancerOutboundRules.
 */
public interface LoadBalancerOutboundRules extends HasInner<LoadBalancerOutboundRulesInner> {
    /**
     * Gets the specified load balancer outbound rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OutboundRule> getAsync(String resourceGroupName, String loadBalancerName, String outboundRuleName);

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OutboundRule> listAsync(final String resourceGroupName, final String loadBalancerName);

}
