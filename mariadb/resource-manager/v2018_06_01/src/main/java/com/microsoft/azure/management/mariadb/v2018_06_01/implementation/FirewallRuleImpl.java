/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01.implementation;

import com.microsoft.azure.management.mariadb.v2018_06_01.FirewallRule;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class FirewallRuleImpl extends CreatableUpdatableImpl<FirewallRule, FirewallRuleInner, FirewallRuleImpl> implements FirewallRule, FirewallRule.Definition, FirewallRule.Update {
    private final MariaDBManager manager;
    private String resourceGroupName;
    private String serverName;
    private String firewallRuleName;

    FirewallRuleImpl(String name, MariaDBManager manager) {
        super(name, new FirewallRuleInner());
        this.manager = manager;
        // Set resource name
        this.firewallRuleName = name;
        //
    }

    FirewallRuleImpl(FirewallRuleInner inner, MariaDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.firewallRuleName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.firewallRuleName = IdParsingUtils.getValueFromIdByName(inner.id(), "firewallRules");
        //
    }

    @Override
    public MariaDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<FirewallRule> createResourceAsync() {
        FirewallRulesInner client = this.manager().inner().firewallRules();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.firewallRuleName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<FirewallRule> updateResourceAsync() {
        FirewallRulesInner client = this.manager().inner().firewallRules();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.firewallRuleName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<FirewallRuleInner> getInnerAsync() {
        FirewallRulesInner client = this.manager().inner().firewallRules();
        return client.getAsync(this.resourceGroupName, this.serverName, this.firewallRuleName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String endIpAddress() {
        return this.inner().endIpAddress();
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
    public String startIpAddress() {
        return this.inner().startIpAddress();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public FirewallRuleImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    @Override
    public FirewallRuleImpl withEndIpAddress(String endIpAddress) {
        this.inner().withEndIpAddress(endIpAddress);
        return this;
    }

    @Override
    public FirewallRuleImpl withStartIpAddress(String startIpAddress) {
        this.inner().withStartIpAddress(startIpAddress);
        return this;
    }

}
