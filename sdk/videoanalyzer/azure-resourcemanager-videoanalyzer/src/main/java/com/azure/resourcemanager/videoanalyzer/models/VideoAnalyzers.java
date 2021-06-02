// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VideoAnalyzers. */
public interface VideoAnalyzers {
    /**
     * Lists the Video Analyzer accounts in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of VideoAnalyzer items.
     */
    VideoAnalyzerCollection list(String resourceGroupName);

    /**
     * Lists the Video Analyzer accounts in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of VideoAnalyzer items.
     */
    Response<VideoAnalyzerCollection> listWithResponse(String resourceGroupName, Context context);

    /**
     * Get the details of the specified Video Analyzer account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the specified Video Analyzer account.
     */
    VideoAnalyzer getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Get the details of the specified Video Analyzer account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the specified Video Analyzer account.
     */
    Response<VideoAnalyzer> getByResourceGroupWithResponse(
        String resourceGroupName, String accountName, Context context);

    /**
     * Delete the specified Video Analyzer account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Delete the specified Video Analyzer account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Synchronizes storage account keys for a storage account associated with the Video Analyzer account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void syncStorageKeys(String resourceGroupName, String accountName, SyncStorageKeysInput parameters);

    /**
     * Synchronizes storage account keys for a storage account associated with the Video Analyzer account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> syncStorageKeysWithResponse(
        String resourceGroupName, String accountName, SyncStorageKeysInput parameters, Context context);

    /**
     * Lists the Video Analyzer accounts in the specific subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of VideoAnalyzer items.
     */
    VideoAnalyzerCollection listBySubscription();

    /**
     * Lists the Video Analyzer accounts in the specific subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of VideoAnalyzer items.
     */
    Response<VideoAnalyzerCollection> listBySubscriptionWithResponse(Context context);

    /**
     * Get the details of the specified Video Analyzer account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the specified Video Analyzer account.
     */
    VideoAnalyzer getById(String id);

    /**
     * Get the details of the specified Video Analyzer account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the specified Video Analyzer account.
     */
    Response<VideoAnalyzer> getByIdWithResponse(String id, Context context);

    /**
     * Delete the specified Video Analyzer account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete the specified Video Analyzer account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VideoAnalyzer resource.
     *
     * @param name resource name.
     * @return the first stage of the new VideoAnalyzer definition.
     */
    VideoAnalyzer.DefinitionStages.Blank define(String name);
}
