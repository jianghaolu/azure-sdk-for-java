/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.privatedns.v2018_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.privatedns.v2018_09_01.implementation.VirtualNetworkLinksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualNetworkLinks.
 */
public interface VirtualNetworkLinks extends SupportsCreating<VirtualNetworkLink.DefinitionStages.Blank>, HasInner<VirtualNetworkLinksInner> {
    /**
     * Gets a virtual network link to the specified Private DNS zone.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateZoneName The name of the Private DNS zone (without a terminating dot).
     * @param virtualNetworkLinkName The name of the virtual network link.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetworkLink> getAsync(String resourceGroupName, String privateZoneName, String virtualNetworkLinkName);

    /**
     * Lists the virtual network links to the specified Private DNS zone.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateZoneName The name of the Private DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetworkLink> listAsync(final String resourceGroupName, final String privateZoneName);

    /**
     * Deletes a virtual network link to the specified Private DNS zone. WARNING: In case of a registration virtual network, all auto-registered DNS records in the zone for the virtual network will also be deleted. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateZoneName The name of the Private DNS zone (without a terminating dot).
     * @param virtualNetworkLinkName The name of the virtual network link.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String privateZoneName, String virtualNetworkLinkName);

}
