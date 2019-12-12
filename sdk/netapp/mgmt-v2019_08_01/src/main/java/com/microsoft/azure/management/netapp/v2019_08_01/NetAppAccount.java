/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.netapp.v2019_08_01.implementation.NetAppManager;
import java.util.List;
import com.microsoft.azure.management.netapp.v2019_08_01.implementation.NetAppAccountInner;

/**
 * Type representing NetAppAccount.
 */
public interface NetAppAccount extends HasInner<NetAppAccountInner>, Resource, GroupableResourceCore<NetAppManager, NetAppAccountInner>, HasResourceGroup, Refreshable<NetAppAccount>, Updatable<NetAppAccount.Update>, HasManager<NetAppManager> {
    /**
     * @return the activeDirectories value.
     */
    List<ActiveDirectory> activeDirectories();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * The entirety of the NetAppAccount definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NetAppAccount definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NetAppAccount definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the NetAppAccount definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the netappaccount definition allowing to specify ActiveDirectories.
         */
        interface WithActiveDirectories {
            /**
             * Specifies activeDirectories.
             * @param activeDirectories Active Directories
             * @return the next definition stage
             */
            WithCreate withActiveDirectories(List<ActiveDirectory> activeDirectories);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NetAppAccount>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithActiveDirectories {
        }
    }
    /**
     * The template for a NetAppAccount update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NetAppAccount>, Resource.UpdateWithTags<Update>, UpdateStages.WithActiveDirectories {
    }

    /**
     * Grouping of NetAppAccount update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the netappaccount update allowing to specify ActiveDirectories.
         */
        interface WithActiveDirectories {
            /**
             * Specifies activeDirectories.
             * @param activeDirectories Active Directories
             * @return the next update stage
             */
            Update withActiveDirectories(List<ActiveDirectory> activeDirectories);
        }

    }
}
