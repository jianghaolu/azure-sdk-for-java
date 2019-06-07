/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_04_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_04_01.implementation.DdosProtectionPlanInner;

/**
 * Type representing DdosProtectionPlan.
 */
public interface DdosProtectionPlan extends HasInner<DdosProtectionPlanInner>, Resource, GroupableResourceCore<NetworkManager, DdosProtectionPlanInner>, HasResourceGroup, Refreshable<DdosProtectionPlan>, Updatable<DdosProtectionPlan.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the virtualNetworks value.
     */
    List<SubResource> virtualNetworks();

    /**
     * The entirety of the DdosProtectionPlan definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DdosProtectionPlan definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DdosProtectionPlan definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the DdosProtectionPlan definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DdosProtectionPlan>, Resource.DefinitionWithTags<WithCreate> {
        }
    }
    /**
     * The template for a DdosProtectionPlan update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DdosProtectionPlan>, Resource.UpdateWithTags<Update> {
    }

    /**
     * Grouping of DdosProtectionPlan update stages.
     */
    interface UpdateStages {
    }
}
