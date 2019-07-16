/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2015_08_01.implementation;

import com.microsoft.azure.management.eventhubs.v2015_08_01.ConsumerGroupResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.eventhubs.v2015_08_01.ConsumerGroupCreateOrUpdateParameters;
import org.joda.time.DateTime;
import rx.functions.Func1;

class ConsumerGroupResourceImpl extends CreatableUpdatableImpl<ConsumerGroupResource, ConsumerGroupResourceInner, ConsumerGroupResourceImpl> implements ConsumerGroupResource, ConsumerGroupResource.Definition, ConsumerGroupResource.Update {
    private final EventHubsManager manager;
    private String resourceGroupName;
    private String namespaceName;
    private String eventHubName;
    private String consumerGroupName;
    private ConsumerGroupCreateOrUpdateParameters createOrUpdateParameter;

    ConsumerGroupResourceImpl(String name, EventHubsManager manager) {
        super(name, new ConsumerGroupResourceInner());
        this.manager = manager;
        // Set resource name
        this.consumerGroupName = name;
        //
        this.createOrUpdateParameter = new ConsumerGroupCreateOrUpdateParameters();
    }

    ConsumerGroupResourceImpl(ConsumerGroupResourceInner inner, EventHubsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.consumerGroupName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "namespaces");
        this.eventHubName = IdParsingUtils.getValueFromIdByName(inner.id(), "eventhubs");
        this.consumerGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "consumergroups");
        //
        this.createOrUpdateParameter = new ConsumerGroupCreateOrUpdateParameters();
    }

    @Override
    public EventHubsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ConsumerGroupResource> createResourceAsync() {
        ConsumerGroupsInner client = this.manager().inner().consumerGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.eventHubName, this.consumerGroupName, this.createOrUpdateParameter)
            .map(new Func1<ConsumerGroupResourceInner, ConsumerGroupResourceInner>() {
               @Override
               public ConsumerGroupResourceInner call(ConsumerGroupResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ConsumerGroupResource> updateResourceAsync() {
        ConsumerGroupsInner client = this.manager().inner().consumerGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.eventHubName, this.consumerGroupName, this.createOrUpdateParameter)
            .map(new Func1<ConsumerGroupResourceInner, ConsumerGroupResourceInner>() {
               @Override
               public ConsumerGroupResourceInner call(ConsumerGroupResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ConsumerGroupResourceInner> getInnerAsync() {
        ConsumerGroupsInner client = this.manager().inner().consumerGroups();
        return client.getAsync(this.resourceGroupName, this.namespaceName, this.eventHubName, this.consumerGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new ConsumerGroupCreateOrUpdateParameters();
    }

    @Override
    public DateTime createdAt() {
        return this.inner().createdAt();
    }

    @Override
    public String eventHubPath() {
        return this.inner().eventHubPath();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DateTime updatedAt() {
        return this.inner().updatedAt();
    }

    @Override
    public String userMetadata() {
        return this.inner().userMetadata();
    }

    @Override
    public ConsumerGroupResourceImpl withExistingEventhub(String resourceGroupName, String namespaceName, String eventHubName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        this.eventHubName = eventHubName;
        return this;
    }

    @Override
    public ConsumerGroupResourceImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public ConsumerGroupResourceImpl withName(String name) {
        this.createOrUpdateParameter.withName(name);
        return this;
    }

    @Override
    public ConsumerGroupResourceImpl withType(String type) {
        this.createOrUpdateParameter.withType(type);
        return this;
    }

    @Override
    public ConsumerGroupResourceImpl withUserMetadata(String userMetadata) {
        this.createOrUpdateParameter.withUserMetadata(userMetadata);
        return this;
    }

}
