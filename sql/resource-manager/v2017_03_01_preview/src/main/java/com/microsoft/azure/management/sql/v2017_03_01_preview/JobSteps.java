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
import rx.Completable;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.JobStepsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing JobSteps.
 */
public interface JobSteps extends SupportsCreating<JobStep.DefinitionStages.Blank>, HasInner<JobStepsInner> {
    /**
     * Gets all job steps for a job's current version.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<JobStep> listByJobAsync(final String resourceGroupName, final String serverName, final String jobAgentName, final String jobName);

    /**
     * Gets a job step in a job's current version.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param stepName The name of the job step.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<JobStep> getAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, String stepName);

    /**
     * Deletes a job step. This will implicitly create a new job version.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param stepName The name of the job step to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, String stepName);

    /**
     * Gets the specified version of a job step.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param jobVersion The version of the job to get.
     * @param stepName The name of the job step.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<JobStep> getByVersionAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, int jobVersion, String stepName);

    /**
     * Gets all job steps in the specified job version.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobVersion The version of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<JobStep> listByVersionAsync(final String resourceGroupName, final String serverName, final String jobAgentName, final String jobName, final int jobVersion);

}
