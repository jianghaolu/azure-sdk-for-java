/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_01_01.QuotaCounterCollection;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class QuotaCounterCollectionImpl extends WrapperImpl<QuotaCounterCollectionInner> implements QuotaCounterCollection {
    private final ApiManagementManager manager;
    QuotaCounterCollectionImpl(QuotaCounterCollectionInner inner, ApiManagementManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Long count() {
        return this.inner().count();
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<QuotaCounterContractInner> value() {
        return this.inner().value();
    }

}
