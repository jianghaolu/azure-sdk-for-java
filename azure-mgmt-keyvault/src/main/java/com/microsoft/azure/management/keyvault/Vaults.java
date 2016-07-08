/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.keyvault.models.PageImpl;
import com.microsoft.azure.management.keyvault.models.Vault;
import com.microsoft.azure.management.keyvault.models.VaultCreateOrUpdateParameters;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in Vaults.
 */
public interface Vaults {
    /**
     * Create or update a key vault in the specified subscription.
     *
     * @param resourceGroupName The name of the Resource Group to which the server belongs.
     * @param vaultName Name of the vault
     * @param parameters Parameters to create or update the vault
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Vault object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Vault> createOrUpdate(String resourceGroupName, String vaultName, VaultCreateOrUpdateParameters parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create or update a key vault in the specified subscription.
     *
     * @param resourceGroupName The name of the Resource Group to which the server belongs.
     * @param vaultName Name of the vault
     * @param parameters Parameters to create or update the vault
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String vaultName, VaultCreateOrUpdateParameters parameters, final ServiceCallback<Vault> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes the specified Azure key vault.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault to delete
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Vault object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Vault> delete(String resourceGroupName, String vaultName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes the specified Azure key vault.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault to delete
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String vaultName, final ServiceCallback<Vault> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the specified Azure key vault.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Vault object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Vault> get(String resourceGroupName, String vaultName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the specified Azure key vault.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String vaultName, final ServiceCallback<Vault> serviceCallback) throws IllegalArgumentException;

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param top Maximum number of results to return.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Vault&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Vault>> listByResourceGroup(final String resourceGroupName, final int top) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param top Maximum number of results to return.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listByResourceGroupAsync(final String resourceGroupName, final int top, final ListOperationCallback<Vault> serviceCallback) throws IllegalArgumentException;

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @param top Maximum number of results to return.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Vault&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Vault>> list(final int top) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @param top Maximum number of results to return.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final int top, final ListOperationCallback<Vault> serviceCallback) throws IllegalArgumentException;

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Vault&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<Vault>> listByResourceGroupNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listByResourceGroupNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<Vault> serviceCallback) throws IllegalArgumentException;

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Vault&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<Vault>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<Vault> serviceCallback) throws IllegalArgumentException;

}
