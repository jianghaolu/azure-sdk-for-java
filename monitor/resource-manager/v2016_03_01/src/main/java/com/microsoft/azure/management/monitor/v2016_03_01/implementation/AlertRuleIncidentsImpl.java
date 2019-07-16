/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.monitor.v2016_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2016_03_01.AlertRuleIncidents;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.monitor.v2016_03_01.Incident;

class AlertRuleIncidentsImpl extends WrapperImpl<AlertRuleIncidentsInner> implements AlertRuleIncidents {
    private final MonitorManager manager;

    AlertRuleIncidentsImpl(MonitorManager manager) {
        super(manager.inner().alertRuleIncidents());
        this.manager = manager;
    }

    public MonitorManager manager() {
        return this.manager;
    }

    private IncidentImpl wrapModel(IncidentInner inner) {
        return  new IncidentImpl(inner, manager());
    }

    @Override
    public Observable<Incident> listByAlertRuleAsync(String resourceGroupName, String ruleName) {
        AlertRuleIncidentsInner client = this.inner();
        return client.listByAlertRuleAsync(resourceGroupName, ruleName)
        .flatMap(new Func1<List<IncidentInner>, Observable<IncidentInner>>() {
            @Override
            public Observable<IncidentInner> call(List<IncidentInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<IncidentInner, Incident>() {
            @Override
            public Incident call(IncidentInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Incident> getAsync(String resourceGroupName, String ruleName, String incidentName) {
        AlertRuleIncidentsInner client = this.inner();
        return client.getAsync(resourceGroupName, ruleName, incidentName)
        .map(new Func1<IncidentInner, Incident>() {
            @Override
            public Incident call(IncidentInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
