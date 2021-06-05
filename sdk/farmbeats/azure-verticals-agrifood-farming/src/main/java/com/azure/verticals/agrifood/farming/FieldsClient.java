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
 * Initializes a new instance of the FieldsClient type.
 */
@ServiceClient(builder = FarmBeatsClientBuilder.class)
public final class FieldsClient {
    private final FieldsAsyncClient asyncClient;

    /**
     * Initializes an instance of FieldsClient client.
     * 
     * @param asyncClient The FieldsAsyncClient underneath.
     */
    FieldsClient(FieldsAsyncClient asyncClient) {
        this.asyncClient = asyncClient;
    }

    /**
     * Gets a specified field resource under a particular farmer.
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     farmId: String
     *     farmerId: String
     *     primaryBoundaryId: String
     *     boundaryIds: [
     *         String
     *     ]
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
     * @param farmerId ID of the associated farmer.
     * @param fieldId ID of the field.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String farmerId, String fieldId, RequestOptions options) {
        return asyncClient.getWithResponse(farmerId, fieldId, options).block();
    }

    /**
     * Creates or Updates a field resource under a particular farmer.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     farmId: String
     *     farmerId: String
     *     primaryBoundaryId: String
     *     boundaryIds: [
     *         String
     *     ]
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
     * @param farmerId ID of the associated farmer resource.
     * @param fieldId ID of the field resource.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(String farmerId, String fieldId, RequestOptions options) {
        return asyncClient.createOrUpdateWithResponse(farmerId, fieldId, options).block();
    }

    /**
     * Deletes a specified field resource under a particular farmer.
     * 
     * @param farmerId ID of the farmer.
     * @param fieldId ID of the field.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> deleteWithResponse(String farmerId, String fieldId, RequestOptions options) {
        return asyncClient.deleteWithResponse(farmerId, fieldId, options).block();
    }

    /**
     * Get a cascade delete job for specified field.
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     farmerId: String
     *     resourceId: String
     *     resourceType: String
     *     id: String
     *     status: String
     *     durationInSeconds: Double
     *     message: String
     *     createdDateTime: OffsetDateTime
     *     lastActionDateTime: OffsetDateTime
     *     startTime: OffsetDateTime
     *     endTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     * 
     * @param jobId ID of the job.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getCascadeDeleteJobDetailsWithResponse(String jobId, RequestOptions options) {
        return asyncClient.getCascadeDeleteJobDetailsWithResponse(jobId, options).block();
    }

    /**
     * Create a cascade delete job for specified field.
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     farmerId: String
     *     resourceId: String
     *     resourceType: String
     *     id: String
     *     status: String
     *     durationInSeconds: Double
     *     message: String
     *     createdDateTime: OffsetDateTime
     *     lastActionDateTime: OffsetDateTime
     *     startTime: OffsetDateTime
     *     endTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     * 
     * @param jobId Job ID supplied by end user.
     * @param farmerId ID of the associated farmer.
     * @param fieldId ID of the field to be deleted.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createCascadeDeleteJobWithResponse(String jobId, String farmerId, String fieldId, RequestOptions options) {
        return asyncClient.createCascadeDeleteJobWithResponse(jobId, farmerId, fieldId, options).block();
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
