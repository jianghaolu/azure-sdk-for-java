/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.TableResources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.TableGetResults;
import java.util.List;
import rx.Completable;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ThroughputSettingsGetResults;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ThroughputSettingsUpdateParameters;

class TableResourcesImpl extends WrapperImpl<TableResourcesInner> implements TableResources {
    private final CosmosDBManager manager;

    TableResourcesImpl(CosmosDBManager manager) {
        super(manager.inner().tableResources());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public TableGetResultsImpl defineTable(String name) {
        return wrapTableModel(name);
    }

    private TableGetResultsImpl wrapTableModel(String name) {
        return new TableGetResultsImpl(name, this.manager());
    }

    private TableGetResultsImpl wrapTableGetResultsModel(TableGetResultsInner inner) {
        return  new TableGetResultsImpl(inner, manager());
    }

    private Observable<TableGetResultsInner> getTableGetResultsInnerUsingTableResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String tableName = IdParsingUtils.getValueFromIdByName(id, "tables");
        TableResourcesInner client = this.inner();
        return client.getTableAsync(resourceGroupName, accountName, tableName);
    }

    @Override
    public Observable<TableGetResults> getTableAsync(String resourceGroupName, String accountName, String tableName) {
        TableResourcesInner client = this.inner();
        return client.getTableAsync(resourceGroupName, accountName, tableName)
        .flatMap(new Func1<TableGetResultsInner, Observable<TableGetResults>>() {
            @Override
            public Observable<TableGetResults> call(TableGetResultsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((TableGetResults)wrapTableGetResultsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<TableGetResults> listTablesAsync(String resourceGroupName, String accountName) {
        TableResourcesInner client = this.inner();
        return client.listTablesAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<TableGetResultsInner>, Observable<TableGetResultsInner>>() {
            @Override
            public Observable<TableGetResultsInner> call(List<TableGetResultsInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<TableGetResultsInner, TableGetResults>() {
            @Override
            public TableGetResults call(TableGetResultsInner inner) {
                return wrapTableGetResultsModel(inner);
            }
        });
    }

    @Override
    public Completable deleteTableAsync(String resourceGroupName, String accountName, String tableName) {
        TableResourcesInner client = this.inner();
        return client.deleteTableAsync(resourceGroupName, accountName, tableName).toCompletable();
    }

    @Override
    public Observable<ThroughputSettingsGetResults> getTableThroughputAsync(String resourceGroupName, String accountName, String tableName) {
        TableResourcesInner client = this.inner();
        return client.getTableThroughputAsync(resourceGroupName, accountName, tableName)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> updateTableThroughputAsync(String resourceGroupName, String accountName, String tableName, ThroughputSettingsUpdateParameters updateThroughputParameters) {
        TableResourcesInner client = this.inner();
        return client.updateTableThroughputAsync(resourceGroupName, accountName, tableName, updateThroughputParameters)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

}
