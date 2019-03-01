/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Operations.
 */
public class OperationsInner {
    /** The Retrofit service to perform REST calls. */
    private OperationsService service;
    /** The service client containing this operation class. */
    private ManagedLabsClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, ManagedLabsClientImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.labservices.v2018_10_15.Operations get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.LabServices/locations/{locationName}/operations/{operationName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("locationName") String locationName, @Path("operationName") String operationName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get operation.
     *
     * @param locationName The name of the location.
     * @param operationName The name of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationResultInner object if successful.
     */
    public OperationResultInner get(String locationName, String operationName) {
        return getWithServiceResponseAsync(locationName, operationName).toBlocking().single().body();
    }

    /**
     * Get operation.
     *
     * @param locationName The name of the location.
     * @param operationName The name of the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationResultInner> getAsync(String locationName, String operationName, final ServiceCallback<OperationResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(locationName, operationName), serviceCallback);
    }

    /**
     * Get operation.
     *
     * @param locationName The name of the location.
     * @param operationName The name of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationResultInner object
     */
    public Observable<OperationResultInner> getAsync(String locationName, String operationName) {
        return getWithServiceResponseAsync(locationName, operationName).map(new Func1<ServiceResponse<OperationResultInner>, OperationResultInner>() {
            @Override
            public OperationResultInner call(ServiceResponse<OperationResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get operation.
     *
     * @param locationName The name of the location.
     * @param operationName The name of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationResultInner object
     */
    public Observable<ServiceResponse<OperationResultInner>> getWithServiceResponseAsync(String locationName, String operationName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (locationName == null) {
            throw new IllegalArgumentException("Parameter locationName is required and cannot be null.");
        }
        if (operationName == null) {
            throw new IllegalArgumentException("Parameter operationName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), locationName, operationName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationResultInner>>>() {
                @Override
                public Observable<ServiceResponse<OperationResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationResultInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationResultInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
