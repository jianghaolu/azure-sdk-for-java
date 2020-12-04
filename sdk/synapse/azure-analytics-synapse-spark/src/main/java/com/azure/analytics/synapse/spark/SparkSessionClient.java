// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.spark;

import com.azure.analytics.synapse.spark.implementation.SparkSessionsImpl;
import com.azure.analytics.synapse.spark.models.SparkSession;
import com.azure.analytics.synapse.spark.models.SparkSessionOptions;
import com.azure.analytics.synapse.spark.models.SparkStatement;
import com.azure.analytics.synapse.spark.models.SparkStatementCancellationResult;
import com.azure.analytics.synapse.spark.models.SparkStatementOptions;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous SparkClient type. */
@ServiceClient(builder = SparkClientBuilder.class)
public final class SparkSessionClient {
    private final SparkSessionsImpl serviceClient;

    /**
     * Initializes an instance of SparkSessions client.
     *
     * @param serviceClient the service client implementation.
     */
    SparkSessionClient(SparkSessionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List all spark sessions which are running under a particular spark pool.
     *
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list. By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SparkSession> listSparkSessions(Integer from, Integer size, Boolean detailed) {
        return this.serviceClient.listSparkSessions(from, size, detailed);
    }

    /**
     * List all spark sessions which are running under a particular spark pool.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SparkSession> listSparkSessions() {
        return this.serviceClient.listSparkSessions();
    }

    /**
     * List all spark sessions which are running under a particular spark pool.
     *
     * @param from Optional param specifying which index the list should begin from.
     * @param size Optional param specifying the size of the returned list. By default it is 20 and that is the maximum.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SparkSession> listSparkSessions(
            Integer from, Integer size, Boolean detailed, Context context) {
        return this.serviceClient.listSparkSessions(from, size, detailed, context);
    }

    /**
     * Create new spark session.
     *
     * @param sparkSessionOptions Livy compatible batch job request payload.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkSession createSparkSession(SparkSessionOptions sparkSessionOptions, Boolean detailed) {
        return this.serviceClient.createSparkSession(sparkSessionOptions, detailed);
    }

    /**
     * Create new spark session.
     *
     * @param sparkSessionOptions Livy compatible batch job request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkSession createSparkSession(SparkSessionOptions sparkSessionOptions) {
        return this.serviceClient.createSparkSession(sparkSessionOptions);
    }

    /**
     * Create new spark session.
     *
     * @param sparkSessionOptions Livy compatible batch job request payload.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SparkSession> createSparkSessionWithResponse(
            SparkSessionOptions sparkSessionOptions, Boolean detailed, Context context) {
        return this.serviceClient.createSparkSessionWithResponse(sparkSessionOptions, detailed, context);
    }

    /**
     * Gets a single spark session.
     *
     * @param sessionId Identifier for the session.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkSession getSparkSession(int sessionId, Boolean detailed) {
        return this.serviceClient.getSparkSession(sessionId, detailed);
    }

    /**
     * Gets a single spark session.
     *
     * @param sessionId Identifier for the session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkSession getSparkSession(int sessionId) {
        return this.serviceClient.getSparkSession(sessionId);
    }

    /**
     * Gets a single spark session.
     *
     * @param sessionId Identifier for the session.
     * @param detailed Optional query param specifying whether detailed response is returned beyond plain livy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SparkSession> getSparkSessionWithResponse(int sessionId, Boolean detailed, Context context) {
        return this.serviceClient.getSparkSessionWithResponse(sessionId, detailed, context);
    }

    /**
     * Cancels a running spark session.
     *
     * @param sessionId Identifier for the session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancelSparkSession(int sessionId) {
        this.serviceClient.cancelSparkSession(sessionId);
    }

    /**
     * Cancels a running spark session.
     *
     * @param sessionId Identifier for the session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> cancelSparkSessionWithResponse(int sessionId, Context context) {
        return this.serviceClient.cancelSparkSessionWithResponse(sessionId, context);
    }

    /**
     * Sends a keep alive call to the current session to reset the session timeout.
     *
     * @param sessionId Identifier for the session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void resetSparkSessionTimeout(int sessionId) {
        this.serviceClient.resetSparkSessionTimeout(sessionId);
    }

    /**
     * Sends a keep alive call to the current session to reset the session timeout.
     *
     * @param sessionId Identifier for the session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> resetSparkSessionTimeoutWithResponse(int sessionId, Context context) {
        return this.serviceClient.resetSparkSessionTimeoutWithResponse(sessionId, context);
    }

    /**
     * Gets a list of statements within a spark session.
     *
     * @param sessionId Identifier for the session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of statements within a spark session.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SparkStatement> listSparkStatements(int sessionId) {
        return this.serviceClient.listSparkStatements(sessionId);
    }

    /**
     * Gets a list of statements within a spark session.
     *
     * @param sessionId Identifier for the session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of statements within a spark session.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SparkStatement> listSparkStatements(int sessionId, Context context) {
        return this.serviceClient.listSparkStatements(sessionId, context);
    }

    /**
     * Create statement within a spark session.
     *
     * @param sessionId Identifier for the session.
     * @param sparkStatementOptions Livy compatible batch job request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkStatement createSparkStatement(int sessionId, SparkStatementOptions sparkStatementOptions) {
        return this.serviceClient.createSparkStatement(sessionId, sparkStatementOptions);
    }

    /**
     * Create statement within a spark session.
     *
     * @param sessionId Identifier for the session.
     * @param sparkStatementOptions Livy compatible batch job request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SparkStatement> createSparkStatementWithResponse(
            int sessionId, SparkStatementOptions sparkStatementOptions, Context context) {
        return this.serviceClient.createSparkStatementWithResponse(sessionId, sparkStatementOptions, context);
    }

    /**
     * Gets a single statement within a spark session.
     *
     * @param sessionId Identifier for the session.
     * @param statementId Identifier for the statement.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single statement within a spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkStatement getSparkStatement(int sessionId, int statementId) {
        return this.serviceClient.getSparkStatement(sessionId, statementId);
    }

    /**
     * Gets a single statement within a spark session.
     *
     * @param sessionId Identifier for the session.
     * @param statementId Identifier for the statement.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single statement within a spark session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SparkStatement> getSparkStatementWithResponse(int sessionId, int statementId, Context context) {
        return this.serviceClient.getSparkStatementWithResponse(sessionId, statementId, context);
    }

    /**
     * Kill a statement within a session.
     *
     * @param sessionId Identifier for the session.
     * @param statementId Identifier for the statement.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkStatementCancellationResult cancelSparkStatement(int sessionId, int statementId) {
        return this.serviceClient.cancelSparkStatement(sessionId, statementId);
    }

    /**
     * Kill a statement within a session.
     *
     * @param sessionId Identifier for the session.
     * @param statementId Identifier for the statement.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SparkStatementCancellationResult> cancelSparkStatementWithResponse(
            int sessionId, int statementId, Context context) {
        return this.serviceClient.cancelSparkStatementWithResponse(sessionId, statementId, context);
    }
}
