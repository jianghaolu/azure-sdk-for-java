/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.management.logic.v2018_07_01_preview.AssemblyDefinition;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.logic.v2018_07_01_preview.AssemblyProperties;

class AssemblyDefinitionImpl extends CreatableUpdatableImpl<AssemblyDefinition, AssemblyDefinitionInner, AssemblyDefinitionImpl> implements AssemblyDefinition, AssemblyDefinition.Definition, AssemblyDefinition.Update {
    private final LogicManager manager;
    private String resourceGroupName;
    private String integrationAccountName;
    private String assemblyArtifactName;

    AssemblyDefinitionImpl(String name, LogicManager manager) {
        super(name, new AssemblyDefinitionInner());
        this.manager = manager;
        // Set resource name
        this.assemblyArtifactName = name;
        //
    }

    AssemblyDefinitionImpl(AssemblyDefinitionInner inner, LogicManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.assemblyArtifactName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.integrationAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "integrationAccounts");
        this.assemblyArtifactName = IdParsingUtils.getValueFromIdByName(inner.id(), "assemblies");
        //
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AssemblyDefinition> createResourceAsync() {
        IntegrationAccountAssembliesInner client = this.manager().inner().integrationAccountAssemblies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.integrationAccountName, this.assemblyArtifactName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AssemblyDefinition> updateResourceAsync() {
        IntegrationAccountAssembliesInner client = this.manager().inner().integrationAccountAssemblies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.integrationAccountName, this.assemblyArtifactName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AssemblyDefinitionInner> getInnerAsync() {
        IntegrationAccountAssembliesInner client = this.manager().inner().integrationAccountAssemblies();
        return client.getAsync(this.resourceGroupName, this.integrationAccountName, this.assemblyArtifactName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
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
    public AssemblyProperties properties() {
        return this.inner().properties();
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
    public AssemblyDefinitionImpl withExistingIntegrationAccount(String resourceGroupName, String integrationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.integrationAccountName = integrationAccountName;
        return this;
    }

    @Override
    public AssemblyDefinitionImpl withProperties(AssemblyProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

    @Override
    public AssemblyDefinitionImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public AssemblyDefinitionImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
