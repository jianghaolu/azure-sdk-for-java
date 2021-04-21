// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.streamanalytics.fluent.models.PrivateEndpointInner;
import com.azure.resourcemanager.streamanalytics.models.PrivateEndpoint;
import com.azure.resourcemanager.streamanalytics.models.PrivateEndpointProperties;

public final class PrivateEndpointImpl implements PrivateEndpoint, PrivateEndpoint.Definition, PrivateEndpoint.Update {
    private PrivateEndpointInner innerObject;

    private final com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PrivateEndpointProperties properties() {
        return this.innerModel().properties();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public PrivateEndpointInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String privateEndpointName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    private String updateIfNoneMatch;

    public PrivateEndpointImpl withExistingCluster(String resourceGroupName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    public PrivateEndpoint create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpoints()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    clusterName,
                    privateEndpointName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpoint create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpoints()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    clusterName,
                    privateEndpointName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    context)
                .getValue();
        return this;
    }

    PrivateEndpointImpl(String name, com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerObject = new PrivateEndpointInner();
        this.serviceManager = serviceManager;
        this.privateEndpointName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public PrivateEndpointImpl update() {
        this.updateIfMatch = null;
        this.updateIfNoneMatch = null;
        return this;
    }

    public PrivateEndpoint apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpoints()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    clusterName,
                    privateEndpointName,
                    this.innerModel(),
                    updateIfMatch,
                    updateIfNoneMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpoint apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpoints()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    clusterName,
                    privateEndpointName,
                    this.innerModel(),
                    updateIfMatch,
                    updateIfNoneMatch,
                    context)
                .getValue();
        return this;
    }

    PrivateEndpointImpl(
        PrivateEndpointInner innerObject,
        com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
        this.privateEndpointName = Utils.getValueFromIdByName(innerObject.id(), "privateEndpoints");
    }

    public PrivateEndpoint refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpoints()
                .getWithResponse(resourceGroupName, clusterName, privateEndpointName, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpoint refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpoints()
                .getWithResponse(resourceGroupName, clusterName, privateEndpointName, context)
                .getValue();
        return this;
    }

    public PrivateEndpointImpl withProperties(PrivateEndpointProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public PrivateEndpointImpl withIfMatch(String ifMatch) {
        this.createIfMatch = ifMatch;
        return this;
    }

    public PrivateEndpointImpl withIfNoneMatch(String ifNoneMatch) {
        this.createIfNoneMatch = ifNoneMatch;
        return this;
    }

    public PrivateEndpointImpl ifMatch(String ifMatch) {
        this.updateIfMatch = ifMatch;
        return this;
    }

    public PrivateEndpointImpl ifNoneMatch(String ifNoneMatch) {
        this.updateIfNoneMatch = ifNoneMatch;
        return this;
    }
}
