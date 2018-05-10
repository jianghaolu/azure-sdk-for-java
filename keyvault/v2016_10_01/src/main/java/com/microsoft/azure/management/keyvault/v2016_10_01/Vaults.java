/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.keyvault.v2016_10_01.implementation.VaultsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Vaults.
 */
public interface Vaults extends SupportsCreating<Vault.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Vault>, SupportsListingByResourceGroup<Vault>, SupportsListing<Vault>, HasInner<VaultsInner> {

    /**
     * @return Entry point to manage Vault AccessPolicy.
     */
    AccessPolicies accessPolicies();
    /**
     * Checks that the vault name is valid and is not already in use.
     *
     * @param name The vault name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckNameAvailabilityResult> checkNameAvailabilityAsync(String name);

}
