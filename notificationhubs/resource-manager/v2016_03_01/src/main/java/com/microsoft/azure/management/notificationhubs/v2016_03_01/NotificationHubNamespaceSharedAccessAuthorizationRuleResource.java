/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2016_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.implementation.SharedAccessAuthorizationRuleResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.implementation.NotificationHubsManager;
import java.util.Map;
import java.util.List;

/**
 * Type representing NotificationHubNamespaceSharedAccessAuthorizationRuleResource.
 */
public interface NotificationHubNamespaceSharedAccessAuthorizationRuleResource extends HasInner<SharedAccessAuthorizationRuleResourceInner>, Indexable, Refreshable<NotificationHubNamespaceSharedAccessAuthorizationRuleResource>, Updatable<NotificationHubNamespaceSharedAccessAuthorizationRuleResource.Update>, HasManager<NotificationHubsManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the rights value.
     */
    List<AccessRights> rights();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the NotificationHubNamespaceSharedAccessAuthorizationRuleResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNotificationHub, DefinitionStages.WithLocation, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NotificationHubNamespaceSharedAccessAuthorizationRuleResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NotificationHubNamespaceSharedAccessAuthorizationRuleResource definition.
         */
        interface Blank extends WithNotificationHub {
        }

        /**
         * The stage of the notificationhubnamespacesharedaccessauthorizationruleresource definition allowing to specify NotificationHub.
         */
        interface WithNotificationHub {
           /**
            * Specifies resourceGroupName, namespaceName, notificationHubName.
            * @param resourceGroupName The name of the resource group
            * @param namespaceName The namespace name
            * @param notificationHubName The notification hub name
            * @return the next definition stage
            */
            WithLocation withExistingNotificationHub(String resourceGroupName, String namespaceName, String notificationHubName);
        }

        /**
         * The stage of the notificationhubnamespacesharedaccessauthorizationruleresource definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithProperties withLocation(String location);
        }

        /**
         * The stage of the notificationhubnamespacesharedaccessauthorizationruleresource definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Properties of the Namespace AuthorizationRules
            * @return the next definition stage
            */
            WithCreate withProperties(SharedAccessAuthorizationRuleProperties properties);
        }

        /**
         * The stage of the notificationhubnamespacesharedaccessauthorizationruleresource definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The sku of the created namespace
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the notificationhubnamespacesharedaccessauthorizationruleresource definition allowing to specify Tags.
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
        interface WithCreate extends Creatable<NotificationHubNamespaceSharedAccessAuthorizationRuleResource>, DefinitionStages.WithSku, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a NotificationHubNamespaceSharedAccessAuthorizationRuleResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NotificationHubNamespaceSharedAccessAuthorizationRuleResource>, UpdateStages.WithSku, UpdateStages.WithTags {
    }

    /**
     * Grouping of NotificationHubNamespaceSharedAccessAuthorizationRuleResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the notificationhubnamespacesharedaccessauthorizationruleresource update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The sku of the created namespace
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the notificationhubnamespacesharedaccessauthorizationruleresource update allowing to specify Tags.
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
