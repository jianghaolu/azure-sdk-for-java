/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_02_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.kusto.v2020_02_15.implementation.FollowerDatabaseDefinitionInner;
import com.microsoft.azure.management.kusto.v2020_02_15.implementation.ClustersInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.kusto.v2020_02_15.AzureResourceSku;

/**
 * Type representing Clusters.
 */
public interface Clusters extends SupportsCreating<Cluster.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Cluster>, SupportsListingByResourceGroup<Cluster>, SupportsListing<Cluster>, HasInner<ClustersInner> {
    /**
     * Stops a Kusto cluster.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable stopAsync(String resourceGroupName, String clusterName);

    /**
     * Starts a Kusto cluster.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable startAsync(String resourceGroupName, String clusterName);

    /**
     * Returns a list of databases that are owned by this cluster and were followed by another cluster.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FollowerDatabaseDefinition> listFollowerDatabasesAsync(String resourceGroupName, String clusterName);

    /**
     * Detaches all followers of a database owned by this cluster.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param followerDatabaseToRemove The follower databases properties to remove.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable detachFollowerDatabasesAsync(String resourceGroupName, String clusterName, FollowerDatabaseDefinitionInner followerDatabaseToRemove);

    /**
     * Diagnoses network connectivity status for external resources on which the service is dependent on.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnoseVirtualNetworkResult> diagnoseVirtualNetworkAsync(String resourceGroupName, String clusterName);

    /**
     * Returns a list of language extensions that can run within KQL queries.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LanguageExtension> listLanguageExtensionsAsync(String resourceGroupName, String clusterName);

    /**
     * Add a list of language extensions that can run within KQL queries.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable addLanguageExtensionsAsync(String resourceGroupName, String clusterName);

    /**
     * Remove a list of language extensions that can run within KQL queries.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable removeLanguageExtensionsAsync(String resourceGroupName, String clusterName);

    /**
     * Checks that the cluster name is valid and is not already in use.
     *
     * @param location Azure location.
     * @param name Cluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckNameResult> checkNameAvailabilityAsync(String location, String name);

    /**
     * Returns the SKUs available for the provided resource.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AzureResourceSku> listSkusByResourceAsync(String resourceGroupName, String clusterName);

    /**
     * Lists eligible SKUs for Kusto resource provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SkuDescription> listSkusAsync();

}
