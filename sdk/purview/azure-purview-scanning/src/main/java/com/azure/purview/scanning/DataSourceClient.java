// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.scanning;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.experimental.http.DynamicRequest;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.util.serializer.ObjectSerializer;

/** Initializes a new instance of the DataSourceClient type. */
@ServiceClient(builder = MicrosoftScanningClientBuilder.class)
public final class DataSourceClient {
    private final String accountName;

    private final String apiVersion;

    private final HttpPipeline pipeline;

    private final ObjectSerializer objectSerializer;

    /**
     * Initializes an instance of DataSourceClient client.
     *
     * @param accountName The name of your purview account.
     * @param apiVersion Api Version.
     * @param pipeline The HTTP pipeline to send requests through.
     * @param objectSerializer The serializer to serialize an object into a string.
     */
    DataSourceClient(String accountName, String apiVersion, HttpPipeline pipeline, ObjectSerializer objectSerializer) {
        this.accountName = accountName;
        this.apiVersion = apiVersion;
        this.pipeline = pipeline;
        this.objectSerializer = objectSerializer;
    }

    /**
     * Lists the data sources in the account that do not belong to any collection.
     *
     * <p><strong>Optional Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Optional Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Description</th></tr>
     *     <tr><td>skipToken</td><td>String</td><td>The skipToken parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             scans: [
     *                 {
     *                     scanResults: [
     *                         {
     *                             parentId: String
     *                             id: String
     *                             resourceId: String
     *                             status: String
     *                             assetsDiscovered: Long
     *                             assetsClassified: Long
     *                             diagnostics: {
     *                             }
     *                             startTime: OffsetDateTime
     *                             queuedTime: OffsetDateTime
     *                             pipelineStartTime: OffsetDateTime
     *                             endTime: OffsetDateTime
     *                             scanRulesetType: String(Custom/System)
     *                             errorMessage: String
     *                             error: {
     *                             }
     *                             runType: String
     *                         }
     *                     ]
     *                 }
     *             ]
     *         }
     *     ]
     *     nextLink: String
     *     count: Long
     * }
     * }</pre>
     *
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest listUnparentedDataSourcesByAccount() {
        return new DynamicRequest(objectSerializer, pipeline)
                .setUrl("https://{accountName}.scan.purview.azure.com/listUnparentedDataSources")
                .setPathParam("accountName", accountName)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }
}
