// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.AzureVMResourceFeatureSupportResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.FeatureSupportRequest;

/** An instance of this class provides access to all the operations defined in FeatureSupportsClient. */
public interface FeatureSupportsClient {
    /**
     * It will validate if given feature with resource properties is supported in service.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Feature support request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for feature support requests for Azure IaasVm.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureVMResourceFeatureSupportResponseInner validate(String azureRegion, FeatureSupportRequest parameters);

    /**
     * It will validate if given feature with resource properties is supported in service.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Feature support request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for feature support requests for Azure IaasVm.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureVMResourceFeatureSupportResponseInner> validateWithResponse(
        String azureRegion, FeatureSupportRequest parameters, Context context);
}
