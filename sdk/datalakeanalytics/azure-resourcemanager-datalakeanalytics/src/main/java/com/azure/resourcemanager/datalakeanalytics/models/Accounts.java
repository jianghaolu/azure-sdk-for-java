// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Accounts. */
public interface Accounts {
    /**
     * Gets the first page of Data Lake Analytics accounts, if any, within the current subscription. This includes a
     * link to the next page, if any.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the first page of Data Lake Analytics accounts, if any, within the current subscription.
     */
    PagedIterable<DataLakeAnalyticsAccountBasic> list();

    /**
     * Gets the first page of Data Lake Analytics accounts, if any, within the current subscription. This includes a
     * link to the next page, if any.
     *
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     *     Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or
     *     "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc.
     *     Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the
     *     resources in the response, e.g. Categories?$count=true. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the first page of Data Lake Analytics accounts, if any, within the current subscription.
     */
    PagedIterable<DataLakeAnalyticsAccountBasic> list(
        String filter, Integer top, Integer skip, String select, String orderby, Boolean count, Context context);

    /**
     * Gets the first page of Data Lake Analytics accounts, if any, within a specific resource group. This includes a
     * link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the first page of Data Lake Analytics accounts, if any, within a specific resource group.
     */
    PagedIterable<DataLakeAnalyticsAccountBasic> listByResourceGroup(String resourceGroupName);

    /**
     * Gets the first page of Data Lake Analytics accounts, if any, within a specific resource group. This includes a
     * link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     *     Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or
     *     "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc.
     *     Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the
     *     resources in the response, e.g. Categories?$count=true. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the first page of Data Lake Analytics accounts, if any, within a specific resource group.
     */
    PagedIterable<DataLakeAnalyticsAccountBasic> listByResourceGroup(
        String resourceGroupName,
        String filter,
        Integer top,
        Integer skip,
        String select,
        String orderby,
        Boolean count,
        Context context);

    /**
     * Gets details of the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified Data Lake Analytics account.
     */
    DataLakeAnalyticsAccount getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Gets details of the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified Data Lake Analytics account.
     */
    Response<DataLakeAnalyticsAccount> getByResourceGroupWithResponse(
        String resourceGroupName, String accountName, Context context);

    /**
     * Begins the delete process for the Data Lake Analytics account object specified by the account name.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Begins the delete process for the Data Lake Analytics account object specified by the account name.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, Context context);

    /**
     * Checks whether the specified account name is available or taken.
     *
     * @param location The resource location without whitespace.
     * @param parameters Parameters supplied to check the Data Lake Analytics account name availability.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Lake Analytics account name availability result information.
     */
    NameAvailabilityInformation checkNameAvailability(String location, CheckNameAvailabilityParameters parameters);

    /**
     * Checks whether the specified account name is available or taken.
     *
     * @param location The resource location without whitespace.
     * @param parameters Parameters supplied to check the Data Lake Analytics account name availability.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Lake Analytics account name availability result information.
     */
    Response<NameAvailabilityInformation> checkNameAvailabilityWithResponse(
        String location, CheckNameAvailabilityParameters parameters, Context context);

    /**
     * Gets details of the specified Data Lake Analytics account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified Data Lake Analytics account.
     */
    DataLakeAnalyticsAccount getById(String id);

    /**
     * Gets details of the specified Data Lake Analytics account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified Data Lake Analytics account.
     */
    Response<DataLakeAnalyticsAccount> getByIdWithResponse(String id, Context context);

    /**
     * Begins the delete process for the Data Lake Analytics account object specified by the account name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Begins the delete process for the Data Lake Analytics account object specified by the account name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DataLakeAnalyticsAccount resource.
     *
     * @param name resource name.
     * @return the first stage of the new DataLakeAnalyticsAccount definition.
     */
    DataLakeAnalyticsAccount.DefinitionStages.Blank define(String name);
}
