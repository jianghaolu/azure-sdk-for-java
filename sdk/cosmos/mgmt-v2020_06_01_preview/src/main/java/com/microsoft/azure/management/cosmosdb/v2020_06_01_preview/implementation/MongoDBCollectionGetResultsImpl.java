/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.MongoDBCollectionGetResults;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.MongoDBCollectionCreateUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.MongoDBCollectionGetPropertiesOptions;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.MongoDBCollectionGetPropertiesResource;
import java.util.Map;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ManagedServiceIdentity;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.CreateUpdateOptions;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.MongoDBCollectionResource;
import rx.functions.Func1;

class MongoDBCollectionGetResultsImpl extends CreatableUpdatableImpl<MongoDBCollectionGetResults, MongoDBCollectionGetResultsInner, MongoDBCollectionGetResultsImpl> implements MongoDBCollectionGetResults, MongoDBCollectionGetResults.Definition, MongoDBCollectionGetResults.Update {
    private final CosmosDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String databaseName;
    private String collectionName;
    private MongoDBCollectionCreateUpdateParameters createOrUpdateParameter;

    MongoDBCollectionGetResultsImpl(String name, CosmosDBManager manager) {
        super(name, new MongoDBCollectionGetResultsInner());
        this.manager = manager;
        // Set resource name
        this.collectionName = name;
        //
        this.createOrUpdateParameter = new MongoDBCollectionCreateUpdateParameters();
    }

    MongoDBCollectionGetResultsImpl(MongoDBCollectionGetResultsInner inner, CosmosDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.collectionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "mongodbDatabases");
        this.collectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "collections");
        //
        this.createOrUpdateParameter = new MongoDBCollectionCreateUpdateParameters();
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<MongoDBCollectionGetResults> createResourceAsync() {
        MongoDBResourcesInner client = this.manager().inner().mongoDBResources();
        return client.createUpdateMongoDBCollectionAsync(this.resourceGroupName, this.accountName, this.databaseName, this.collectionName, this.createOrUpdateParameter)
            .map(new Func1<MongoDBCollectionGetResultsInner, MongoDBCollectionGetResultsInner>() {
               @Override
               public MongoDBCollectionGetResultsInner call(MongoDBCollectionGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<MongoDBCollectionGetResults> updateResourceAsync() {
        MongoDBResourcesInner client = this.manager().inner().mongoDBResources();
        return client.createUpdateMongoDBCollectionAsync(this.resourceGroupName, this.accountName, this.databaseName, this.collectionName, this.createOrUpdateParameter)
            .map(new Func1<MongoDBCollectionGetResultsInner, MongoDBCollectionGetResultsInner>() {
               @Override
               public MongoDBCollectionGetResultsInner call(MongoDBCollectionGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<MongoDBCollectionGetResultsInner> getInnerAsync() {
        MongoDBResourcesInner client = this.manager().inner().mongoDBResources();
        return client.getMongoDBCollectionAsync(this.resourceGroupName, this.accountName, this.databaseName, this.collectionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new MongoDBCollectionCreateUpdateParameters();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ManagedServiceIdentity identity() {
        return this.inner().identity();
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
    public MongoDBCollectionGetPropertiesOptions options() {
        return this.inner().options();
    }

    @Override
    public MongoDBCollectionGetPropertiesResource resource() {
        return this.inner().resource();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public MongoDBCollectionGetResultsImpl withExistingMongodbDatabasis(String resourceGroupName, String accountName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.databaseName = databaseName;
        return this;
    }

    @Override
    public MongoDBCollectionGetResultsImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public MongoDBCollectionGetResultsImpl withOptions(CreateUpdateOptions options) {
        this.createOrUpdateParameter.withOptions(options);
        return this;
    }

    @Override
    public MongoDBCollectionGetResultsImpl withResource(MongoDBCollectionResource resource) {
        this.createOrUpdateParameter.withResource(resource);
        return this;
    }

    @Override
    public MongoDBCollectionGetResultsImpl withIdentity(ManagedServiceIdentity identity) {
        this.createOrUpdateParameter.withIdentity(identity);
        return this;
    }

    @Override
    public MongoDBCollectionGetResultsImpl withTags(Map<String, String> tags) {
        this.createOrUpdateParameter.withTags(tags);
        return this;
    }

}
