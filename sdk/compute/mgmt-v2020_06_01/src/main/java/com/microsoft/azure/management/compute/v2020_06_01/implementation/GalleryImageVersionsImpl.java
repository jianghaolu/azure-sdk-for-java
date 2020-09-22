/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_06_01.GalleryImageVersions;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2020_06_01.GalleryImageVersion;

class GalleryImageVersionsImpl extends WrapperImpl<GalleryImageVersionsInner> implements GalleryImageVersions {
    private final ComputeManager manager;

    GalleryImageVersionsImpl(ComputeManager manager) {
        super(manager.inner().galleryImageVersions());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public GalleryImageVersionImpl define(String name) {
        return wrapModel(name);
    }

    private GalleryImageVersionImpl wrapModel(GalleryImageVersionInner inner) {
        return  new GalleryImageVersionImpl(inner, manager());
    }

    private GalleryImageVersionImpl wrapModel(String name) {
        return new GalleryImageVersionImpl(name, this.manager());
    }

    @Override
    public Observable<GalleryImageVersion> listByGalleryImageAsync(final String resourceGroupName, final String galleryName, final String galleryImageName) {
        GalleryImageVersionsInner client = this.inner();
        return client.listByGalleryImageAsync(resourceGroupName, galleryName, galleryImageName)
        .flatMapIterable(new Func1<Page<GalleryImageVersionInner>, Iterable<GalleryImageVersionInner>>() {
            @Override
            public Iterable<GalleryImageVersionInner> call(Page<GalleryImageVersionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<GalleryImageVersionInner, GalleryImageVersion>() {
            @Override
            public GalleryImageVersion call(GalleryImageVersionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<GalleryImageVersion> getAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName) {
        GalleryImageVersionsInner client = this.inner();
        return client.getAsync(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName)
        .flatMap(new Func1<GalleryImageVersionInner, Observable<GalleryImageVersion>>() {
            @Override
            public Observable<GalleryImageVersion> call(GalleryImageVersionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((GalleryImageVersion)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName) {
        GalleryImageVersionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName).toCompletable();
    }

}
