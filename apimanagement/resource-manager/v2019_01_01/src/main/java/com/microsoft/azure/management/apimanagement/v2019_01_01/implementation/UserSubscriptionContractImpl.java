/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_01_01.UserSubscriptionContract;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.apimanagement.v2019_01_01.SubscriptionState;

class UserSubscriptionContractImpl extends WrapperImpl<SubscriptionContractInner> implements UserSubscriptionContract {
    private final ApiManagementManager manager;

    UserSubscriptionContractImpl(SubscriptionContractInner inner,  ApiManagementManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }



    @Override
    public Boolean allowTracing() {
        return this.inner().allowTracing();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public DateTime endDate() {
        return this.inner().endDate();
    }

    @Override
    public DateTime expirationDate() {
        return this.inner().expirationDate();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public DateTime notificationDate() {
        return this.inner().notificationDate();
    }

    @Override
    public String ownerId() {
        return this.inner().ownerId();
    }

    @Override
    public String primaryKey() {
        return this.inner().primaryKey();
    }

    @Override
    public String scope() {
        return this.inner().scope();
    }

    @Override
    public String secondaryKey() {
        return this.inner().secondaryKey();
    }

    @Override
    public DateTime startDate() {
        return this.inner().startDate();
    }

    @Override
    public SubscriptionState state() {
        return this.inner().state();
    }

    @Override
    public String stateComment() {
        return this.inner().stateComment();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
