/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ProductContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ApiManagementManager;

/**
 * Type representing ProductContract.
 */
public interface ProductContract extends HasInner<ProductContractInner>, Indexable, Updatable<ProductContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the approvalRequired value.
     */
    Boolean approvalRequired();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the state value.
     */
    ProductState state();

    /**
     * @return the subscriptionRequired value.
     */
    Boolean subscriptionRequired();

    /**
     * @return the subscriptionsLimit value.
     */
    Integer subscriptionsLimit();

    /**
     * @return the terms value.
     */
    String terms();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ProductContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceGroupName, DefinitionStages.WithServiceName, DefinitionStages.WithIfMatch, DefinitionStages.WithDisplayName, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ProductContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ProductContract definition.
         */
        interface Blank extends WithResourceGroupName {
        }

        /**
         * The stage of the productcontract definition allowing to specify ResourceGroupName.
         */
        interface WithResourceGroupName {
           /**
            * Specifies resourceGroupName.
            * @param resourceGroupName The name of the resource group
            * @return the next definition stage
            */
            WithServiceName withResourceGroupName(String resourceGroupName);
        }

        /**
         * The stage of the productcontract definition allowing to specify ServiceName.
         */
        interface WithServiceName {
           /**
            * Specifies serviceName.
            * @param serviceName The name of the API Management service
            * @return the next definition stage
            */
            WithIfMatch withServiceName(String serviceName);
        }

        /**
         * The stage of the productcontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithDisplayName withIfMatch(String ifMatch);
        }

        /**
         * The stage of the productcontract definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
           /**
            * Specifies displayName.
            * @param displayName Product name
            * @return the next definition stage
            */
            WithCreate withDisplayName(String displayName);
        }

        /**
         * The stage of the productcontract definition allowing to specify ApprovalRequired.
         */
        interface WithApprovalRequired {
            /**
             * Specifies approvalRequired.
             * @param approvalRequired whether subscription approval is required. If false, new subscriptions will be approved automatically enabling developers to call the product’s APIs immediately after subscribing. If true, administrators must manually approve the subscription before the developer can any of the product’s APIs. Can be present only if subscriptionRequired property is present and has a value of false
             * @return the next definition stage
             */
            WithCreate withApprovalRequired(Boolean approvalRequired);
        }

        /**
         * The stage of the productcontract definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Product description. May include HTML formatting tags
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the productcontract definition allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             * @param state whether product is published or not. Published products are discoverable by users of developer portal. Non published products are visible only to administrators. Default state of Product is notPublished. Possible values include: 'notPublished', 'published'
             * @return the next definition stage
             */
            WithCreate withState(ProductState state);
        }

        /**
         * The stage of the productcontract definition allowing to specify SubscriptionRequired.
         */
        interface WithSubscriptionRequired {
            /**
             * Specifies subscriptionRequired.
             * @param subscriptionRequired Whether a product subscription is required for accessing APIs included in this product. If true, the product is referred to as "protected" and a valid subscription key is required for a request to an API included in the product to succeed. If false, the product is referred to as "open" and requests to an API included in the product can be made without a subscription key. If property is omitted when creating a new product it's value is assumed to be true
             * @return the next definition stage
             */
            WithCreate withSubscriptionRequired(Boolean subscriptionRequired);
        }

        /**
         * The stage of the productcontract definition allowing to specify SubscriptionsLimit.
         */
        interface WithSubscriptionsLimit {
            /**
             * Specifies subscriptionsLimit.
             * @param subscriptionsLimit Whether the number of subscriptions a user can have to this product at the same time. Set to null or omit to allow unlimited per user subscriptions. Can be present only if subscriptionRequired property is present and has a value of false
             * @return the next definition stage
             */
            WithCreate withSubscriptionsLimit(Integer subscriptionsLimit);
        }

        /**
         * The stage of the productcontract definition allowing to specify Terms.
         */
        interface WithTerms {
            /**
             * Specifies terms.
             * @param terms Product terms of use. Developers trying to subscribe to the product will be presented and required to accept these terms before they can complete the subscription process
             * @return the next definition stage
             */
            WithCreate withTerms(String terms);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ProductContract>, DefinitionStages.WithApprovalRequired, DefinitionStages.WithDescription, DefinitionStages.WithState, DefinitionStages.WithSubscriptionRequired, DefinitionStages.WithSubscriptionsLimit, DefinitionStages.WithTerms {
        }
    }
    /**
     * The template for a ProductContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ProductContract>, UpdateStages.WithIfMatch, UpdateStages.WithApprovalRequired, UpdateStages.WithDescription, UpdateStages.WithState, UpdateStages.WithSubscriptionRequired, UpdateStages.WithSubscriptionsLimit, UpdateStages.WithTerms {
    }

    /**
     * Grouping of ProductContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the productcontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the productcontract update allowing to specify ApprovalRequired.
         */
        interface WithApprovalRequired {
            /**
             * Specifies approvalRequired.
             * @param approvalRequired whether subscription approval is required. If false, new subscriptions will be approved automatically enabling developers to call the product’s APIs immediately after subscribing. If true, administrators must manually approve the subscription before the developer can any of the product’s APIs. Can be present only if subscriptionRequired property is present and has a value of false
             * @return the next update stage
             */
            Update withApprovalRequired(Boolean approvalRequired);
        }

        /**
         * The stage of the productcontract update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Product description. May include HTML formatting tags
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the productcontract update allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             * @param state whether product is published or not. Published products are discoverable by users of developer portal. Non published products are visible only to administrators. Default state of Product is notPublished. Possible values include: 'notPublished', 'published'
             * @return the next update stage
             */
            Update withState(ProductState state);
        }

        /**
         * The stage of the productcontract update allowing to specify SubscriptionRequired.
         */
        interface WithSubscriptionRequired {
            /**
             * Specifies subscriptionRequired.
             * @param subscriptionRequired Whether a product subscription is required for accessing APIs included in this product. If true, the product is referred to as "protected" and a valid subscription key is required for a request to an API included in the product to succeed. If false, the product is referred to as "open" and requests to an API included in the product can be made without a subscription key. If property is omitted when creating a new product it's value is assumed to be true
             * @return the next update stage
             */
            Update withSubscriptionRequired(Boolean subscriptionRequired);
        }

        /**
         * The stage of the productcontract update allowing to specify SubscriptionsLimit.
         */
        interface WithSubscriptionsLimit {
            /**
             * Specifies subscriptionsLimit.
             * @param subscriptionsLimit Whether the number of subscriptions a user can have to this product at the same time. Set to null or omit to allow unlimited per user subscriptions. Can be present only if subscriptionRequired property is present and has a value of false
             * @return the next update stage
             */
            Update withSubscriptionsLimit(Integer subscriptionsLimit);
        }

        /**
         * The stage of the productcontract update allowing to specify Terms.
         */
        interface WithTerms {
            /**
             * Specifies terms.
             * @param terms Product terms of use. Developers trying to subscribe to the product will be presented and required to accept these terms before they can complete the subscription process
             * @return the next update stage
             */
            Update withTerms(String terms);
        }

    }
}
