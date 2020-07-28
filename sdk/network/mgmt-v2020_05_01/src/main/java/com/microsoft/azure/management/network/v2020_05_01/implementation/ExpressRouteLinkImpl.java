/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.management.network.v2020_05_01.ExpressRouteLink;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_05_01.ExpressRouteLinkAdminState;
import com.microsoft.azure.management.network.v2020_05_01.ExpressRouteLinkConnectorType;
import com.microsoft.azure.management.network.v2020_05_01.ExpressRouteLinkMacSecConfig;
import com.microsoft.azure.management.network.v2020_05_01.ProvisioningState;

class ExpressRouteLinkImpl extends IndexableRefreshableWrapperImpl<ExpressRouteLink, ExpressRouteLinkInner> implements ExpressRouteLink {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String expressRoutePortName;
    private String linkName;

    ExpressRouteLinkImpl(ExpressRouteLinkInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.expressRoutePortName = IdParsingUtils.getValueFromIdByName(inner.id(), "ExpressRoutePorts");
        this.linkName = IdParsingUtils.getValueFromIdByName(inner.id(), "links");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ExpressRouteLinkInner> getInnerAsync() {
        ExpressRouteLinksInner client = this.manager().inner().expressRouteLinks();
        return client.getAsync(this.resourceGroupName, this.expressRoutePortName, this.linkName);
    }



    @Override
    public ExpressRouteLinkAdminState adminState() {
        return this.inner().adminState();
    }

    @Override
    public ExpressRouteLinkConnectorType connectorType() {
        return this.inner().connectorType();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String interfaceName() {
        return this.inner().interfaceName();
    }

    @Override
    public ExpressRouteLinkMacSecConfig macSecConfig() {
        return this.inner().macSecConfig();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String patchPanelId() {
        return this.inner().patchPanelId();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String rackId() {
        return this.inner().rackId();
    }

    @Override
    public String routerName() {
        return this.inner().routerName();
    }

}
