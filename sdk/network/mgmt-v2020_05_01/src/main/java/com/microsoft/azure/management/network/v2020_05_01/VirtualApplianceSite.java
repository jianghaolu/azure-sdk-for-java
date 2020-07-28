/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_05_01.implementation.VirtualApplianceSiteInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_05_01.implementation.NetworkManager;

/**
 * Type representing VirtualApplianceSite.
 */
public interface VirtualApplianceSite extends HasInner<VirtualApplianceSiteInner>, Indexable, Refreshable<VirtualApplianceSite>, Updatable<VirtualApplianceSite.Update>, HasManager<NetworkManager> {
    /**
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the o365Policy value.
     */
    Office365PolicyProperties o365Policy();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the VirtualApplianceSite definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNetworkVirtualAppliance, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualApplianceSite definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualApplianceSite definition.
         */
        interface Blank extends WithNetworkVirtualAppliance {
        }

        /**
         * The stage of the virtualappliancesite definition allowing to specify NetworkVirtualAppliance.
         */
        interface WithNetworkVirtualAppliance {
           /**
            * Specifies resourceGroupName, networkVirtualApplianceName.
            * @param resourceGroupName The name of the resource group
            * @param networkVirtualApplianceName The name of the Network Virtual Appliance
            * @return the next definition stage
            */
            WithCreate withExistingNetworkVirtualAppliance(String resourceGroupName, String networkVirtualApplianceName);
        }

        /**
         * The stage of the virtualappliancesite definition allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             * @param addressPrefix Address Prefix
             * @return the next definition stage
             */
            WithCreate withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the virtualappliancesite definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the virtualappliancesite definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Name of the virtual appliance site
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the virtualappliancesite definition allowing to specify O365Policy.
         */
        interface WithO365Policy {
            /**
             * Specifies o365Policy.
             * @param o365Policy Office 365 Policy
             * @return the next definition stage
             */
            WithCreate withO365Policy(Office365PolicyProperties o365Policy);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualApplianceSite>, DefinitionStages.WithAddressPrefix, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithO365Policy {
        }
    }
    /**
     * The template for a VirtualApplianceSite update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualApplianceSite>, UpdateStages.WithAddressPrefix, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithO365Policy {
    }

    /**
     * Grouping of VirtualApplianceSite update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualappliancesite update allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             * @param addressPrefix Address Prefix
             * @return the next update stage
             */
            Update withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the virtualappliancesite update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the virtualappliancesite update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Name of the virtual appliance site
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the virtualappliancesite update allowing to specify O365Policy.
         */
        interface WithO365Policy {
            /**
             * Specifies o365Policy.
             * @param o365Policy Office 365 Policy
             * @return the next update stage
             */
            Update withO365Policy(Office365PolicyProperties o365Policy);
        }

    }
}
