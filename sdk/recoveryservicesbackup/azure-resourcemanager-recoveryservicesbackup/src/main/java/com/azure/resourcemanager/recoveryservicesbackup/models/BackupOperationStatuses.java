// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of BackupOperationStatuses. */
public interface BackupOperationStatuses {
    /**
     * Fetches the status of an operation such as triggering a backup, restore. The status can be in progress, completed
     * or failed. You can refer to the OperationStatus enum for all the possible states of an operation. Some operations
     * create jobs. This method returns the list of jobs when the operation is complete.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status.
     */
    OperationStatus get(String vaultName, String resourceGroupName, String operationId);

    /**
     * Fetches the status of an operation such as triggering a backup, restore. The status can be in progress, completed
     * or failed. You can refer to the OperationStatus enum for all the possible states of an operation. Some operations
     * create jobs. This method returns the list of jobs when the operation is complete.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status.
     */
    Response<OperationStatus> getWithResponse(
        String vaultName, String resourceGroupName, String operationId, Context context);
}
