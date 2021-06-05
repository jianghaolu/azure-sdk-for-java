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
 * Initializes a new instance of the AttachmentsClient type.
 */
@ServiceClient(builder = FarmBeatsClientBuilder.class)
public final class AttachmentsClient {
    private final AttachmentsAsyncClient asyncClient;

    /**
     * Initializes an instance of AttachmentsClient client.
     * 
     * @param asyncClient The AttachmentsAsyncClient underneath.
     */
    AttachmentsClient(AttachmentsAsyncClient asyncClient) {
        this.asyncClient = asyncClient;
    }

    /**
     * Gets a specified attachment resource under a particular farmer.
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     farmerId: String
     *     resourceId: String
     *     resourceType: String
     *     originalFileName: String
     *     id: String
     *     status: String
     *     createdDateTime: OffsetDateTime
     *     modifiedDateTime: OffsetDateTime
     *     name: String
     *     description: String
     *     eTag: String
     * }
     * }</pre>
     * 
     * @param farmerId ID of the associated farmer.
     * @param attachmentId ID of the attachment.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String farmerId, String attachmentId, RequestOptions options) {
        return asyncClient.getWithResponse(farmerId, attachmentId, options).block();
    }

    /**
     * Creates or updates an attachment resource under a particular farmer.
     * <p><strong>Optional Header Parameters</strong></p>
     * <table border="1">
     *     <caption>Optional Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Description</th></tr>
     *     <tr><td>contentLength</td><td>Long</td><td>The contentLength parameter</td></tr>
     * </table>
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * Flux<ByteBuffer>
     * }</pre>
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     farmerId: String
     *     resourceId: String
     *     resourceType: String
     *     originalFileName: String
     *     id: String
     *     status: String
     *     createdDateTime: OffsetDateTime
     *     modifiedDateTime: OffsetDateTime
     *     name: String
     *     description: String
     *     eTag: String
     * }
     * }</pre>
     * 
     * @param farmerId ID of the associated farmer resource.
     * @param attachmentId ID of the attachment resource.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(String farmerId, String attachmentId, RequestOptions options) {
        return asyncClient.createOrUpdateWithResponse(farmerId, attachmentId, options).block();
    }

    /**
     * Deletes a specified attachment resource under a particular farmer.
     * 
     * @param farmerId ID of the farmer.
     * @param attachmentId ID of the attachment.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> deleteWithResponse(String farmerId, String attachmentId, RequestOptions options) {
        return asyncClient.deleteWithResponse(farmerId, attachmentId, options).block();
    }

    /**
     * Downloads and returns attachment as response for the given input filePath.
     * 
     * @param farmerId ID of the associated farmer.
     * @param attachmentId ID of attachment to be downloaded.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> downloadWithResponse(String farmerId, String attachmentId, RequestOptions options) {
        return asyncClient.downloadWithResponse(farmerId, attachmentId, options).block();
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
