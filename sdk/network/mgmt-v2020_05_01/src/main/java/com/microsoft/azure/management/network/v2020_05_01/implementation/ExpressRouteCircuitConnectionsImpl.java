/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_05_01.ExpressRouteCircuitConnections;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2020_05_01.ExpressRouteCircuitConnection;

class ExpressRouteCircuitConnectionsImpl extends WrapperImpl<ExpressRouteCircuitConnectionsInner> implements ExpressRouteCircuitConnections {
    private final NetworkManager manager;

    ExpressRouteCircuitConnectionsImpl(NetworkManager manager) {
        super(manager.inner().expressRouteCircuitConnections());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public ExpressRouteCircuitConnectionImpl define(String name) {
        return wrapModel(name);
    }

    private ExpressRouteCircuitConnectionImpl wrapModel(ExpressRouteCircuitConnectionInner inner) {
        return  new ExpressRouteCircuitConnectionImpl(inner, manager());
    }

    private ExpressRouteCircuitConnectionImpl wrapModel(String name) {
        return new ExpressRouteCircuitConnectionImpl(name, this.manager());
    }

    @Override
    public Observable<ExpressRouteCircuitConnection> listAsync(final String resourceGroupName, final String circuitName, final String peeringName) {
        ExpressRouteCircuitConnectionsInner client = this.inner();
        return client.listAsync(resourceGroupName, circuitName, peeringName)
        .flatMapIterable(new Func1<Page<ExpressRouteCircuitConnectionInner>, Iterable<ExpressRouteCircuitConnectionInner>>() {
            @Override
            public Iterable<ExpressRouteCircuitConnectionInner> call(Page<ExpressRouteCircuitConnectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExpressRouteCircuitConnectionInner, ExpressRouteCircuitConnection>() {
            @Override
            public ExpressRouteCircuitConnection call(ExpressRouteCircuitConnectionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ExpressRouteCircuitConnection> getAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        ExpressRouteCircuitConnectionsInner client = this.inner();
        return client.getAsync(resourceGroupName, circuitName, peeringName, connectionName)
        .flatMap(new Func1<ExpressRouteCircuitConnectionInner, Observable<ExpressRouteCircuitConnection>>() {
            @Override
            public Observable<ExpressRouteCircuitConnection> call(ExpressRouteCircuitConnectionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ExpressRouteCircuitConnection)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        ExpressRouteCircuitConnectionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, circuitName, peeringName, connectionName).toCompletable();
    }

}
