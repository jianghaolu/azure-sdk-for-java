/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.maintenance.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation.ConfigurationAssignmentInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation.MaintenanceManager;

/**
 * Type representing ConfigurationAssignment.
 */
public interface ConfigurationAssignment extends HasInner<ConfigurationAssignmentInner>, Indexable, Updatable<ConfigurationAssignment.Update>, HasManager<MaintenanceManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the maintenanceConfigurationId value.
     */
    String maintenanceConfigurationId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ConfigurationAssignment definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithProvider, DefinitionStages.WithResourceParentType, DefinitionStages.WithResourceParentName, DefinitionStages.WithResourceType, DefinitionStages.WithResourceName, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ConfigurationAssignment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ConfigurationAssignment definition.
         */
        interface Blank extends WithProvider {
        }

        /**
         * The stage of the configurationassignment definition allowing to specify Provider.
         */
        interface WithProvider {
           /**
            * Specifies resourceGroupName, providerName.
            * @param resourceGroupName Resource group name
            * @param providerName Resource provider name
            * @return the next definition stage
            */
            WithResourceParentType withExistingProvider(String resourceGroupName, String providerName);
        }

        /**
         * The stage of the configurationassignment definition allowing to specify ResourceParentType.
         */
        interface WithResourceParentType {
           /**
            * Specifies resourceParentType.
            * @param resourceParentType Resource parent type
            * @return the next definition stage
            */
            WithResourceParentName withResourceParentType(String resourceParentType);
        }

        /**
         * The stage of the configurationassignment definition allowing to specify ResourceParentName.
         */
        interface WithResourceParentName {
           /**
            * Specifies resourceParentName.
            * @param resourceParentName Resource parent identifier
            * @return the next definition stage
            */
            WithResourceType withResourceParentName(String resourceParentName);
        }

        /**
         * The stage of the configurationassignment definition allowing to specify ResourceType.
         */
        interface WithResourceType {
           /**
            * Specifies resourceType.
            * @param resourceType Resource type
            * @return the next definition stage
            */
            WithResourceName withResourceType(String resourceType);
        }

        /**
         * The stage of the configurationassignment definition allowing to specify ResourceName.
         */
        interface WithResourceName {
           /**
            * Specifies resourceName.
            * @param resourceName Resource identifier
            * @return the next definition stage
            */
            WithCreate withResourceName(String resourceName);
        }

        /**
         * The stage of the configurationassignment definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Location of the resource
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the configurationassignment definition allowing to specify MaintenanceConfigurationId.
         */
        interface WithMaintenanceConfigurationId {
            /**
             * Specifies maintenanceConfigurationId.
             * @param maintenanceConfigurationId The maintenance configuration Id
             * @return the next definition stage
             */
            WithCreate withMaintenanceConfigurationId(String maintenanceConfigurationId);
        }

        /**
         * The stage of the configurationassignment definition allowing to specify ResourceId.
         */
        interface WithResourceId {
            /**
             * Specifies resourceId.
             * @param resourceId The unique resourceId
             * @return the next definition stage
             */
            WithCreate withResourceId(String resourceId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ConfigurationAssignment>, DefinitionStages.WithLocation, DefinitionStages.WithMaintenanceConfigurationId, DefinitionStages.WithResourceId {
        }
    }
    /**
     * The template for a ConfigurationAssignment update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ConfigurationAssignment>, UpdateStages.WithLocation, UpdateStages.WithMaintenanceConfigurationId, UpdateStages.WithResourceId {
    }

    /**
     * Grouping of ConfigurationAssignment update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the configurationassignment update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Location of the resource
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the configurationassignment update allowing to specify MaintenanceConfigurationId.
         */
        interface WithMaintenanceConfigurationId {
            /**
             * Specifies maintenanceConfigurationId.
             * @param maintenanceConfigurationId The maintenance configuration Id
             * @return the next update stage
             */
            Update withMaintenanceConfigurationId(String maintenanceConfigurationId);
        }

        /**
         * The stage of the configurationassignment update allowing to specify ResourceId.
         */
        interface WithResourceId {
            /**
             * Specifies resourceId.
             * @param resourceId The unique resourceId
             * @return the next update stage
             */
            Update withResourceId(String resourceId);
        }

    }
}
