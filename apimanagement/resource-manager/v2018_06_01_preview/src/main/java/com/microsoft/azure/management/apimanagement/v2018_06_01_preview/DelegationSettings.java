/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.PortalDelegationSettingsInner;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.DelegationSettingsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DelegationSettings.
 */
public interface DelegationSettings extends HasInner<DelegationSettingsInner> {
    /**
     * Gets the entity state (Etag) version of the DelegationSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getEntityTagAsync(String resourceGroupName, String serviceName);

    /**
     * Get Delegation Settings for the Portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PortalDelegationSettings> getAsync(String resourceGroupName, String serviceName);

    /**
     * Update Delegation settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Update Delegation settings.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable updateAsync(String resourceGroupName, String serviceName, PortalDelegationSettingsInner parameters, String ifMatch);

    /**
     * Create or Update Delegation settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Create or update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PortalDelegationSettings> createOrUpdateAsync(String resourceGroupName, String serviceName, PortalDelegationSettingsInner parameters);

}
