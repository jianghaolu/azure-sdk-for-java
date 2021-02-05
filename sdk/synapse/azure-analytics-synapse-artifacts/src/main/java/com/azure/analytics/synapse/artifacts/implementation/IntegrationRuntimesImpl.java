// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.implementation;

import com.azure.analytics.synapse.artifacts.models.ErrorContractException;
import com.azure.analytics.synapse.artifacts.models.IntegrationRuntimeListResponse;
import com.azure.analytics.synapse.artifacts.models.IntegrationRuntimeResource;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in IntegrationRuntimes. */
public final class IntegrationRuntimesImpl {
    /** The proxy service used to perform REST calls. */
    private final IntegrationRuntimesService service;

    /** The service client containing this operation class. */
    private final ArtifactsClientImpl client;

    /**
     * Initializes an instance of IntegrationRuntimesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    IntegrationRuntimesImpl(ArtifactsClientImpl client) {
        this.service =
                RestProxy.create(
                        IntegrationRuntimesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ArtifactsClientIntegrationRuntimes to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ArtifactsClientInteg")
    private interface IntegrationRuntimesService {
        @Get("/integrationRuntimes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorContractException.class)
        Mono<Response<IntegrationRuntimeListResponse>> list(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/integrationRuntimes/{integrationRuntimeName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorContractException.class)
        Mono<Response<IntegrationRuntimeResource>> get(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @PathParam("integrationRuntimeName") String integrationRuntimeName,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * List Integration Runtimes.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IntegrationRuntimeListResponse>> listWithResponseAsync() {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context));
    }

    /**
     * List Integration Runtimes.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IntegrationRuntimeListResponse>> listWithResponseAsync(Context context) {
        final String accept = "application/json";
        return service.list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context);
    }

    /**
     * List Integration Runtimes.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IntegrationRuntimeListResponse> listAsync() {
        return listWithResponseAsync()
                .flatMap(
                        (Response<IntegrationRuntimeListResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * List Integration Runtimes.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IntegrationRuntimeListResponse> listAsync(Context context) {
        return listWithResponseAsync(context)
                .flatMap(
                        (Response<IntegrationRuntimeListResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * List Integration Runtimes.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IntegrationRuntimeListResponse list() {
        return listAsync().block();
    }

    /**
     * List Integration Runtimes.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<IntegrationRuntimeListResponse> listWithResponse(Context context) {
        return listWithResponseAsync(context).block();
    }

    /**
     * Get Integration Runtime.
     *
     * @param integrationRuntimeName The Integration Runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration Runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IntegrationRuntimeResource>> getWithResponseAsync(String integrationRuntimeName) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.get(
                                this.client.getEndpoint(),
                                this.client.getApiVersion(),
                                integrationRuntimeName,
                                accept,
                                context));
    }

    /**
     * Get Integration Runtime.
     *
     * @param integrationRuntimeName The Integration Runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration Runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IntegrationRuntimeResource>> getWithResponseAsync(
            String integrationRuntimeName, Context context) {
        final String accept = "application/json";
        return service.get(
                this.client.getEndpoint(), this.client.getApiVersion(), integrationRuntimeName, accept, context);
    }

    /**
     * Get Integration Runtime.
     *
     * @param integrationRuntimeName The Integration Runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration Runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IntegrationRuntimeResource> getAsync(String integrationRuntimeName) {
        return getWithResponseAsync(integrationRuntimeName)
                .flatMap(
                        (Response<IntegrationRuntimeResource> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get Integration Runtime.
     *
     * @param integrationRuntimeName The Integration Runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration Runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IntegrationRuntimeResource> getAsync(String integrationRuntimeName, Context context) {
        return getWithResponseAsync(integrationRuntimeName, context)
                .flatMap(
                        (Response<IntegrationRuntimeResource> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get Integration Runtime.
     *
     * @param integrationRuntimeName The Integration Runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration Runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IntegrationRuntimeResource get(String integrationRuntimeName) {
        return getAsync(integrationRuntimeName).block();
    }

    /**
     * Get Integration Runtime.
     *
     * @param integrationRuntimeName The Integration Runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration Runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<IntegrationRuntimeResource> getWithResponse(String integrationRuntimeName, Context context) {
        return getWithResponseAsync(integrationRuntimeName, context).block();
    }
}
