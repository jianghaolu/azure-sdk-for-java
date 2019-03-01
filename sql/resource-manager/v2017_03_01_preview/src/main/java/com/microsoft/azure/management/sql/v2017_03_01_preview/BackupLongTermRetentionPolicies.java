/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.BackupLongTermRetentionPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BackupLongTermRetentionPolicies.
 */
public interface BackupLongTermRetentionPolicies extends SupportsCreating<BackupLongTermRetentionPolicy.DefinitionStages.Blank>, HasInner<BackupLongTermRetentionPoliciesInner> {
    /**
     * Gets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BackupLongTermRetentionPolicy> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BackupLongTermRetentionPolicy> getAsync(String resourceGroupName, String serverName, String databaseName);

}
