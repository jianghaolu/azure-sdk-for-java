// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.llc.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/**
 * Initializes a new instance of the SeasonsClient type.
 */
@ServiceClient(builder = FarmBeatsClientBuilder.class)
public final class SeasonsClient {
    private final SeasonsAsyncClient asyncClient;

    /**
     * Initializes an instance of SeasonsClient client.
     * 
     * @param asyncClient The SeasonsAsyncClient underneath.
     */
    SeasonsClient(SeasonsAsyncClient asyncClient) {
        this.asyncClient = asyncClient;
    }

    /**
     * Gets a specified season resource.
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     startDateTime: OffsetDateTime
     *     endDateTime: OffsetDateTime
     *     year: Integer
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
     * @param seasonId ID of the season.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String seasonId, RequestOptions options) {
        return asyncClient.getWithResponse(seasonId, options).block();
    }

    /**
     * Creates or updates a season resource.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     startDateTime: OffsetDateTime
     *     endDateTime: OffsetDateTime
     *     year: Integer
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
     * @param seasonId ID of the season resource.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(String seasonId, RequestOptions options) {
        return asyncClient.createOrUpdateWithResponse(seasonId, options).block();
    }

    /**
     * Deletes a specified season resource.
     * 
     * @param seasonId ID of the season.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> deleteWithResponse(String seasonId, RequestOptions options) {
        return asyncClient.deleteWithResponse(seasonId, options).block();
    }

    /**
     * Create an empty DynamicRequest with the serializer and pipeline initialized for this client.
     * 
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> invoke(String url, HttpMethod httpMethod, BinaryData body, RequestOptions options) {
        return asyncClient.invoke(url, httpMethod, body, options).block();
    }
}
