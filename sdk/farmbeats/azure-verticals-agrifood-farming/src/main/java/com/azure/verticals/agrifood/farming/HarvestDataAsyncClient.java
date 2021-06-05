// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.llc.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.BinaryData;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the HarvestDataAsyncClient type.
 */
@ServiceClient(builder = FarmBeatsClientBuilder.class)
public final class HarvestDataAsyncClient {
    private final String endpoint;

    private final String apiVersion;

    private final HttpPipeline httpPipeline;

    /**
     * Initializes an instance of HarvestDataAsyncClient client.
     * 
     * @param endpoint The endpoint of your FarmBeats resource (protocol and hostname, for example: https://{resourceName}.farmbeats.azure.net).
     * @param apiVersion Api Version.
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    HarvestDataAsyncClient(String endpoint, String apiVersion, HttpPipeline httpPipeline) {
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.httpPipeline = httpPipeline;
    }

    /**
     * Get a specified harvest data resource under a particular farmer.
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     totalYield: {
     *         unit: String
     *         value: Double
     *     }
     *     avgYield: (recursive schema, see avgYield above)
     *     totalWetMass: (recursive schema, see totalWetMass above)
     *     avgWetMass: (recursive schema, see avgWetMass above)
     *     avgMoisture: (recursive schema, see avgMoisture above)
     *     avgSpeed: (recursive schema, see avgSpeed above)
     *     harvestProductDetails: [
     *         {
     *             productName: String
     *             area: (recursive schema, see area above)
     *             totalYield: (recursive schema, see totalYield above)
     *             avgYield: (recursive schema, see avgYield above)
     *             avgMoisture: (recursive schema, see avgMoisture above)
     *             totalWetMass: (recursive schema, see totalWetMass above)
     *             avgWetMass: (recursive schema, see avgWetMass above)
     *         }
     *     ]
     *     area: (recursive schema, see area above)
     *     source: String
     *     operationModifiedDateTime: OffsetDateTime
     *     operationStartDateTime: OffsetDateTime
     *     operationEndDateTime: OffsetDateTime
     *     attachmentsLink: String
     *     associatedBoundaryId: String
     *     operationBoundaryId: String
     *     farmerId: String
     *     id: String
     *     eTag: String
     *     status: String
     *     createdDateTime: OffsetDateTime
     *     modifiedDateTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     * 
     * @param farmerId ID of the associated farmer resource.
     * @param harvestDataId ID of the harvest data resource.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(String farmerId, String harvestDataId, RequestOptions options) {
        String url = "{Endpoint}/farmers/{farmerId}/harvest-data/{harvestDataId}";
        url = url.replace("{Endpoint}", endpoint);
        url = url.replace("{farmerId}", farmerId);
        url = url.replace("{harvestDataId}", harvestDataId);
        url = url + (url.contains("?") ? "&" : "?") + "api-version=" + apiVersion;
        HttpRequest request = new HttpRequest(HttpMethod.GET, url);
        request.getHeaders().set("Accept", "application/json");
        request.getHeaders().set("Content-Type", "application/json");
        if (options != null) {
            options.getRequestCallback().accept(request);
        }
        return httpPipeline.send(request)
            .flatMap(httpResponse -> BinaryData.fromFlux(httpResponse.getBody())
            .map(binaryData -> new SimpleResponse<>(httpResponse.getRequest(), httpResponse.getStatusCode(), httpResponse.getHeaders(), binaryData)));
    }

    /**
     * Creates or updates harvest data resource under a particular farmer.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     totalYield: {
     *         unit: String
     *         value: Double
     *     }
     *     avgYield: (recursive schema, see avgYield above)
     *     totalWetMass: (recursive schema, see totalWetMass above)
     *     avgWetMass: (recursive schema, see avgWetMass above)
     *     avgMoisture: (recursive schema, see avgMoisture above)
     *     avgSpeed: (recursive schema, see avgSpeed above)
     *     harvestProductDetails: [
     *         {
     *             productName: String
     *             area: (recursive schema, see area above)
     *             totalYield: (recursive schema, see totalYield above)
     *             avgYield: (recursive schema, see avgYield above)
     *             avgMoisture: (recursive schema, see avgMoisture above)
     *             totalWetMass: (recursive schema, see totalWetMass above)
     *             avgWetMass: (recursive schema, see avgWetMass above)
     *         }
     *     ]
     *     area: (recursive schema, see area above)
     *     source: String
     *     operationModifiedDateTime: OffsetDateTime
     *     operationStartDateTime: OffsetDateTime
     *     operationEndDateTime: OffsetDateTime
     *     attachmentsLink: String
     *     associatedBoundaryId: String
     *     operationBoundaryId: String
     *     farmerId: String
     *     id: String
     *     eTag: String
     *     status: String
     *     createdDateTime: OffsetDateTime
     *     modifiedDateTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * (recursive schema, see above)
     * }</pre>
     * 
     * @param farmerId ID of the farmer.
     * @param harvestDataId ID of the harvest data resource.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(String farmerId, String harvestDataId, RequestOptions options) {
        String url = "{Endpoint}/farmers/{farmerId}/harvest-data/{harvestDataId}";
        url = url.replace("{Endpoint}", endpoint);
        url = url.replace("{farmerId}", farmerId);
        url = url.replace("{harvestDataId}", harvestDataId);
        url = url + (url.contains("?") ? "&" : "?") + "api-version=" + apiVersion;
        HttpRequest request = new HttpRequest(HttpMethod.PATCH, url);
        request.getHeaders().set("Accept", "application/json");
        request.getHeaders().set("Content-Type", "application/merge-patch+json");
        if (options != null) {
            options.getRequestCallback().accept(request);
        }
        return httpPipeline.send(request)
            .flatMap(httpResponse -> BinaryData.fromFlux(httpResponse.getBody())
            .map(binaryData -> new SimpleResponse<>(httpResponse.getRequest(), httpResponse.getStatusCode(), httpResponse.getHeaders(), binaryData)));
    }

    /**
     * Deletes a specified harvest data resource under a particular farmer.
     * 
     * @param farmerId ID of the associated farmer resource.
     * @param harvestDataId ID of the harvest data.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> deleteWithResponse(String farmerId, String harvestDataId, RequestOptions options) {
        String url = "{Endpoint}/farmers/{farmerId}/harvest-data/{harvestDataId}";
        url = url.replace("{Endpoint}", endpoint);
        url = url.replace("{farmerId}", farmerId);
        url = url.replace("{harvestDataId}", harvestDataId);
        url = url + (url.contains("?") ? "&" : "?") + "api-version=" + apiVersion;
        HttpRequest request = new HttpRequest(HttpMethod.DELETE, url);
        request.getHeaders().set("Accept", "application/json");
        request.getHeaders().set("Content-Type", "application/json");
        if (options != null) {
            options.getRequestCallback().accept(request);
        }
        return httpPipeline.send(request)
            .flatMap(httpResponse -> BinaryData.fromFlux(httpResponse.getBody())
            .map(binaryData -> new SimpleResponse<>(httpResponse.getRequest(), httpResponse.getStatusCode(), httpResponse.getHeaders(), binaryData)));
    }

    /**
     * Create an empty DynamicRequest with the serializer and pipeline initialized for this client.
     * 
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> invoke(String url, HttpMethod httpMethod, BinaryData body, RequestOptions options) {
        HttpRequest request = new HttpRequest(httpMethod, url);
        request.setBody(body.toBytes());
        if (options != null) {
            options.getRequestCallback().accept(request);
        }
        return httpPipeline.send(request)
            .flatMap(httpResponse -> BinaryData.fromFlux(httpResponse.getBody())
            .map(binaryData -> new SimpleResponse<>(
                httpResponse.getRequest(),
                httpResponse.getStatusCode(),
                httpResponse.getHeaders(),
                binaryData)));
    }
}
