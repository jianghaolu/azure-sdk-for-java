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

/** Initializes a new instance of the SystemScanRulesetsClient type. */
@ServiceClient(builder = MicrosoftScanningClientBuilder.class)
public final class SystemScanRulesetsClient {
    private final String accountName;

    private final String apiVersion;

    private final HttpPipeline pipeline;

    private final ObjectSerializer objectSerializer;

    /**
     * Initializes an instance of SystemScanRulesetsClient client.
     *
     * @param accountName The name of your purview account.
     * @param apiVersion Api Version.
     * @param pipeline The HTTP pipeline to send requests through.
     * @param objectSerializer The serializer to serialize an object into a string.
     */
    SystemScanRulesetsClient(
            String accountName, String apiVersion, HttpPipeline pipeline, ObjectSerializer objectSerializer) {
        this.accountName = accountName;
        this.apiVersion = apiVersion;
        this.pipeline = pipeline;
        this.objectSerializer = objectSerializer;
    }

    /**
     * List all system scan rulesets for an account.
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
     *             scanRulesetType: String(Custom/System)
     *             status: String(Enabled/Disabled)
     *             version: Integer
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
    public DynamicRequest listAll() {
        return new DynamicRequest(objectSerializer, pipeline)
                .setUrl("https://{accountName}.scan.purview.azure.com/systemScanRulesets")
                .setPathParam("accountName", accountName)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Get a system scan ruleset for a data source.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     scanRulesetType: String(Custom/System)
     *     status: String(Enabled/Disabled)
     *     version: Integer
     * }
     * }</pre>
     *
     * @param dataSourceType The dataSourceType parameter.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest get(String dataSourceType) {
        return new DynamicRequest(objectSerializer, pipeline)
                .setUrl("https://{accountName}.scan.purview.azure.com/systemScanRulesets/datasources/{dataSourceType}")
                .setPathParam("accountName", accountName)
                .setPathParam("dataSourceType", dataSourceType)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Get a scan ruleset by version.
     *
     * <p><strong>Optional Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Optional Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Description</th></tr>
     *     <tr><td>dataSourceType</td><td>Enum12</td><td>The dataSourceType parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     scanRulesetType: String(Custom/System)
     *     status: String(Enabled/Disabled)
     *     version: Integer
     * }
     * }</pre>
     *
     * @param version The version parameter.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest getByVersion(int version) {
        return new DynamicRequest(objectSerializer, pipeline)
                .setUrl("https://{accountName}.scan.purview.azure.com/systemScanRulesets/versions/{version}")
                .setPathParam("accountName", accountName)
                .setPathParam("version", String.valueOf(version))
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Get the latest version of a system scan ruleset.
     *
     * <p><strong>Optional Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Optional Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Description</th></tr>
     *     <tr><td>dataSourceType</td><td>Enum13</td><td>The dataSourceType parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     scanRulesetType: String(Custom/System)
     *     status: String(Enabled/Disabled)
     *     version: Integer
     * }
     * }</pre>
     *
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest getLatest() {
        return new DynamicRequest(objectSerializer, pipeline)
                .setUrl("https://{accountName}.scan.purview.azure.com/systemScanRulesets/versions/latest")
                .setPathParam("accountName", accountName)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * List system scan ruleset versions in Data catalog.
     *
     * <p><strong>Optional Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Optional Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Description</th></tr>
     *     <tr><td>dataSourceType</td><td>Enum14</td><td>The dataSourceType parameter</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>The skipToken parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             scanRulesetType: String(Custom/System)
     *             status: String(Enabled/Disabled)
     *             version: Integer
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
    public DynamicRequest listVersionsByDataSource() {
        return new DynamicRequest(objectSerializer, pipeline)
                .setUrl("https://{accountName}.scan.purview.azure.com/systemScanRulesets/versions")
                .setPathParam("accountName", accountName)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }
}
