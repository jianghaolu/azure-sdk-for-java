/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiIssues;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.IssueContract;

class ApiIssuesImpl extends WrapperImpl<ApiIssuesInner> implements ApiIssues {
    private final ApiManagementManager manager;

    ApiIssuesImpl(ApiManagementManager manager) {
        super(manager.inner().apiIssues());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public IssueContractImpl define(String name) {
        return wrapModel(name);
    }

    private IssueContractImpl wrapModel(IssueContractInner inner) {
        return  new IssueContractImpl(inner, manager());
    }

    private IssueContractImpl wrapModel(String name) {
        return new IssueContractImpl(name, this.manager());
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String apiId, String issueId) {
        ApiIssuesInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, apiId, issueId).toCompletable();
    }

    @Override
    public Observable<IssueContract> listByServiceAsync(final String resourceGroupName, final String serviceName, final String apiId) {
        ApiIssuesInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName, apiId)
        .flatMapIterable(new Func1<Page<IssueContractInner>, Iterable<IssueContractInner>>() {
            @Override
            public Iterable<IssueContractInner> call(Page<IssueContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IssueContractInner, IssueContract>() {
            @Override
            public IssueContract call(IssueContractInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<IssueContract> getAsync(String resourceGroupName, String serviceName, String apiId, String issueId) {
        ApiIssuesInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, apiId, issueId)
        .map(new Func1<IssueContractInner, IssueContract>() {
            @Override
            public IssueContract call(IssueContractInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String apiId, String issueId, String ifMatch) {
        ApiIssuesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, apiId, issueId, ifMatch).toCompletable();
    }

}
