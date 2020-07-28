/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation.DataSourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation.LogAnalyticsManager;
import java.util.Map;

/**
 * Type representing DataSource.
 */
public interface DataSource extends HasInner<DataSourceInner>, Indexable, Refreshable<DataSource>, Updatable<DataSource.Update>, HasManager<LogAnalyticsManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    DataSourceKind kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    Object properties();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the DataSource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithWorkspace, DefinitionStages.WithKind, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DataSource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DataSource definition.
         */
        interface Blank extends WithWorkspace {
        }

        /**
         * The stage of the datasource definition allowing to specify Workspace.
         */
        interface WithWorkspace {
           /**
            * Specifies resourceGroupName, workspaceName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param workspaceName The name of the workspace
            * @return the next definition stage
            */
            WithKind withExistingWorkspace(String resourceGroupName, String workspaceName);
        }

        /**
         * The stage of the datasource definition allowing to specify Kind.
         */
        interface WithKind {
           /**
            * Specifies kind.
            * @param kind Possible values include: 'WindowsEvent', 'WindowsPerformanceCounter', 'IISLogs', 'LinuxSyslog', 'LinuxSyslogCollection', 'LinuxPerformanceObject', 'LinuxPerformanceCollection', 'CustomLog', 'CustomLogCollection', 'AzureAuditLog', 'AzureActivityLog', 'GenericDataSource', 'ChangeTrackingCustomPath', 'ChangeTrackingPath', 'ChangeTrackingServices', 'ChangeTrackingDataTypeConfiguration', 'ChangeTrackingDefaultRegistry', 'ChangeTrackingRegistry', 'ChangeTrackingLinuxPath', 'LinuxChangeTrackingPath', 'ChangeTrackingContentLocation', 'WindowsTelemetry', 'Office365', 'SecurityWindowsBaselineConfiguration', 'SecurityCenterSecurityWindowsBaselineConfiguration', 'SecurityEventCollectionConfiguration', 'SecurityInsightsSecurityEventCollectionConfiguration', 'ImportComputerGroup', 'NetworkMonitoring', 'Itsm', 'DnsAnalytics', 'ApplicationInsights', 'SqlDataClassification'
            * @return the next definition stage
            */
            WithProperties withKind(DataSourceKind kind);
        }

        /**
         * The stage of the datasource definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties The data source properties in raw json format, each kind of data source have it's own schema
            * @return the next definition stage
            */
            WithCreate withProperties(Object properties);
        }

        /**
         * The stage of the datasource definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag The ETag of the data source
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the datasource definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DataSource>, DefinitionStages.WithEtag, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a DataSource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DataSource>, UpdateStages.WithEtag, UpdateStages.WithTags {
    }

    /**
     * Grouping of DataSource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the datasource update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag The ETag of the data source
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the datasource update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
