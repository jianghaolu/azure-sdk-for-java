/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Products;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiProductContract;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.TagResourceContract;

class ProductsImpl extends WrapperImpl<ProductsInner> implements Products {
    private final ApiManagementManager manager;

    ProductsImpl(ApiManagementManager manager) {
        super(manager.inner().products());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public ProductContractImpl define(String name) {
        return wrapModel(name);
    }

    private ProductContractImpl wrapModel(ProductContractInner inner) {
        return  new ProductContractImpl(inner, manager());
    }

    private ProductContractImpl wrapModel(String name) {
        return new ProductContractImpl(name, this.manager());
    }

    @Override
    public Observable<ApiProductContract> listByServiceAsync(final String resourceGroupName, final String serviceName) {
        ProductsInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<ProductContractInner>, Iterable<ProductContractInner>>() {
            @Override
            public Iterable<ProductContractInner> call(Page<ProductContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProductContractInner, ApiProductContract>() {
            @Override
            public ApiProductContract call(ProductContractInner inner) {
                return new ApiProductContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String productId) {
        ProductsInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, productId).toCompletable();
    }

    @Override
    public Observable<ApiProductContract> getAsync(String resourceGroupName, String serviceName, String productId) {
        ProductsInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, productId)
        .map(new Func1<ProductContractInner, ApiProductContract>() {
            @Override
            public ApiProductContract call(ProductContractInner inner) {
                return new ApiProductContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String productId, String ifMatch) {
        ProductsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, productId, ifMatch).toCompletable();
    }

    @Override
    public Observable<TagResourceContract> listByTagsAsync(final String resourceGroupName, final String serviceName) {
        ProductsInner client = this.inner();
        return client.listByTagsAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<TagResourceContractInner>, Iterable<TagResourceContractInner>>() {
            @Override
            public Iterable<TagResourceContractInner> call(Page<TagResourceContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TagResourceContractInner, TagResourceContract>() {
            @Override
            public TagResourceContract call(TagResourceContractInner inner) {
                return new TagResourceContractImpl(inner, manager());
            }
        });
    }

}
