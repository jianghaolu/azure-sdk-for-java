/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2016_03_01.implementation;

import com.microsoft.azure.management.notificationhubs.v2016_03_01.PnsCredentialsResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.AdmCredential;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.ApnsCredential;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.BaiduCredential;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.GcmCredential;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.MpnsCredential;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.Sku;
import java.util.Map;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.WnsCredential;

class PnsCredentialsResourceImpl extends WrapperImpl<PnsCredentialsResourceInner> implements PnsCredentialsResource {
    private final NotificationHubsManager manager;
    PnsCredentialsResourceImpl(PnsCredentialsResourceInner inner, NotificationHubsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NotificationHubsManager manager() {
        return this.manager;
    }

    @Override
    public AdmCredential admCredential() {
        return this.inner().admCredential();
    }

    @Override
    public ApnsCredential apnsCredential() {
        return this.inner().apnsCredential();
    }

    @Override
    public BaiduCredential baiduCredential() {
        return this.inner().baiduCredential();
    }

    @Override
    public GcmCredential gcmCredential() {
        return this.inner().gcmCredential();
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
    public MpnsCredential mpnsCredential() {
        return this.inner().mpnsCredential();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
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
    public WnsCredential wnsCredential() {
        return this.inner().wnsCredential();
    }

}
