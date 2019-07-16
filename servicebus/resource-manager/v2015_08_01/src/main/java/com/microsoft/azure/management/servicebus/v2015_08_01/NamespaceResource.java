/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2015_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.servicebus.v2015_08_01.implementation.ServiceBusManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.servicebus.v2015_08_01.implementation.NamespaceResourceInner;

/**
 * Type representing NamespaceResource.
 */
public interface NamespaceResource extends HasInner<NamespaceResourceInner>, Resource, GroupableResourceCore<ServiceBusManager, NamespaceResourceInner>, HasResourceGroup, Refreshable<NamespaceResource>, Updatable<NamespaceResource.Update>, HasManager<ServiceBusManager> {
    /**
     * @return the createACSNamespace value.
     */
    Boolean createACSNamespace();

    /**
     * @return the createdAt value.
     */
    DateTime createdAt();

    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the serviceBusEndpoint value.
     */
    String serviceBusEndpoint();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the status value.
     */
    NamespaceState status();

    /**
     * @return the updatedAt value.
     */
    DateTime updatedAt();

    /**
     * The entirety of the NamespaceResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NamespaceResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NamespaceResource definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the NamespaceResource definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the namespaceresource definition allowing to specify CreateACSNamespace.
         */
        interface WithCreateACSNamespace {
            /**
             * Specifies createACSNamespace.
             * @param createACSNamespace Indicates whether to create an ACS namespace
             * @return the next definition stage
             */
            WithCreate withCreateACSNamespace(Boolean createACSNamespace);
        }

        /**
         * The stage of the namespaceresource definition allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             * @param enabled Specifies whether this instance is enabled
             * @return the next definition stage
             */
            WithCreate withEnabled(Boolean enabled);
        }

        /**
         * The stage of the namespaceresource definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku the sku parameter value
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the namespaceresource definition allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status State of the namespace. Possible values include: 'Unknown', 'Creating', 'Created', 'Activating', 'Enabling', 'Active', 'Disabling', 'Disabled', 'SoftDeleting', 'SoftDeleted', 'Removing', 'Removed', 'Failed'
             * @return the next definition stage
             */
            WithCreate withStatus(NamespaceState status);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NamespaceResource>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithCreateACSNamespace, DefinitionStages.WithEnabled, DefinitionStages.WithSku, DefinitionStages.WithStatus {
        }
    }
    /**
     * The template for a NamespaceResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NamespaceResource>, Resource.UpdateWithTags<Update>, UpdateStages.WithSku {
    }

    /**
     * Grouping of NamespaceResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the namespaceresource update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The sku of the created namespace
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

    }
}
