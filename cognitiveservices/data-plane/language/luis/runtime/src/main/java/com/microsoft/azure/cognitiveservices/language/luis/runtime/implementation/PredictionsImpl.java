/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.runtime.implementation;

import com.azure.common.annotations.BodyParam;
import com.azure.common.annotations.ExpectedResponses;
import com.azure.common.annotations.HeaderParam;
import com.azure.common.annotations.Host;
import com.azure.common.annotations.HostParam;
import com.azure.common.annotations.PathParam;
import com.azure.common.annotations.POST;
import com.azure.common.annotations.QueryParam;
import com.azure.common.annotations.UnexpectedResponseExceptionType;
import com.azure.common.http.rest.SimpleResponse;
import com.microsoft.azure.cognitiveservices.language.luis.runtime.Predictions;
import com.microsoft.azure.cognitiveservices.language.luis.runtime.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.language.luis.runtime.models.LuisResult;
import com.microsoft.azure.v3.AzureProxy;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * Predictions.
 */
public final class PredictionsImpl implements Predictions {
    /**
     * The proxy service used to perform REST calls.
     */
    private PredictionsService service;

    /**
     * The service client containing this operation class.
     */
    private LuisRuntimeAPIImpl client;

    /**
     * Initializes an instance of PredictionsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public PredictionsImpl(LuisRuntimeAPIImpl client) {
        this.service = AzureProxy.create(PredictionsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Predictions to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{Endpoint}/luis/v2.0")
    private interface PredictionsService {
        @POST("apps/{appId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<LuisResult>> resolve(@PathParam("appId") String appId, @HostParam("Endpoint") String endpoint, @BodyParam("application/json; charset=utf-8") String query, @QueryParam("timezoneOffset") Double timezoneOffset, @QueryParam("verbose") Boolean verbose, @QueryParam("staging") Boolean staging, @QueryParam("spellCheck") Boolean spellCheck, @QueryParam("bing-spell-check-subscription-key") String bingSpellCheckSubscriptionKey, @QueryParam("log") Boolean log, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Gets predictions for a given utterance, in the form of intents and entities. The current maximum query size is 500 characters.
     *
     * @param appId The LUIS application ID (Guid).
     * @param query The utterance to predict.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LuisResult object if successful.
     */
    public LuisResult resolve(@NonNull String appId, @NonNull String query) {
        return resolveAsync(appId, query).block();
    }

    /**
     * Gets predictions for a given utterance, in the form of intents and entities. The current maximum query size is 500 characters.
     *
     * @param appId The LUIS application ID (Guid).
     * @param query The utterance to predict.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<LuisResult>> resolveWithRestResponseAsync(@NonNull String appId, @NonNull String query) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        if (query == null) {
            throw new IllegalArgumentException("Parameter query is required and cannot be null.");
        }
        final Double timezoneOffset = null;
        final Boolean verbose = null;
        final Boolean staging = null;
        final Boolean spellCheck = null;
        final String bingSpellCheckSubscriptionKey = null;
        final Boolean log = null;
        return service.resolve(appId, this.client.endpoint(), query, timezoneOffset, verbose, staging, spellCheck, bingSpellCheckSubscriptionKey, log, this.client.acceptLanguage());
    }

    /**
     * Gets predictions for a given utterance, in the form of intents and entities. The current maximum query size is 500 characters.
     *
     * @param appId The LUIS application ID (Guid).
     * @param query The utterance to predict.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<LuisResult> resolveAsync(@NonNull String appId, @NonNull String query) {
        return resolveWithRestResponseAsync(appId, query)
            .flatMap((SimpleResponse<LuisResult> res) -> Mono.just(res.value()));
    }

    /**
     * Gets predictions for a given utterance, in the form of intents and entities. The current maximum query size is 500 characters.
     *
     * @param appId The LUIS application ID (Guid).
     * @param query The utterance to predict.
     * @param timezoneOffset The timezone offset for the location of the request.
     * @param verbose If true, return all intents instead of just the top scoring intent.
     * @param staging Use the staging endpoint slot.
     * @param spellCheck Enable spell checking.
     * @param bingSpellCheckSubscriptionKey The subscription key to use when enabling bing spell check.
     * @param log Log query (default is true).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LuisResult object if successful.
     */
    public LuisResult resolve(@NonNull String appId, @NonNull String query, Double timezoneOffset, Boolean verbose, Boolean staging, Boolean spellCheck, String bingSpellCheckSubscriptionKey, Boolean log) {
        return resolveAsync(appId, query, timezoneOffset, verbose, staging, spellCheck, bingSpellCheckSubscriptionKey, log).block();
    }

    /**
     * Gets predictions for a given utterance, in the form of intents and entities. The current maximum query size is 500 characters.
     *
     * @param appId The LUIS application ID (Guid).
     * @param query The utterance to predict.
     * @param timezoneOffset The timezone offset for the location of the request.
     * @param verbose If true, return all intents instead of just the top scoring intent.
     * @param staging Use the staging endpoint slot.
     * @param spellCheck Enable spell checking.
     * @param bingSpellCheckSubscriptionKey The subscription key to use when enabling bing spell check.
     * @param log Log query (default is true).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<LuisResult>> resolveWithRestResponseAsync(@NonNull String appId, @NonNull String query, Double timezoneOffset, Boolean verbose, Boolean staging, Boolean spellCheck, String bingSpellCheckSubscriptionKey, Boolean log) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        if (query == null) {
            throw new IllegalArgumentException("Parameter query is required and cannot be null.");
        }
        return service.resolve(appId, this.client.endpoint(), query, timezoneOffset, verbose, staging, spellCheck, bingSpellCheckSubscriptionKey, log, this.client.acceptLanguage());
    }

    /**
     * Gets predictions for a given utterance, in the form of intents and entities. The current maximum query size is 500 characters.
     *
     * @param appId The LUIS application ID (Guid).
     * @param query The utterance to predict.
     * @param timezoneOffset The timezone offset for the location of the request.
     * @param verbose If true, return all intents instead of just the top scoring intent.
     * @param staging Use the staging endpoint slot.
     * @param spellCheck Enable spell checking.
     * @param bingSpellCheckSubscriptionKey The subscription key to use when enabling bing spell check.
     * @param log Log query (default is true).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<LuisResult> resolveAsync(@NonNull String appId, @NonNull String query, Double timezoneOffset, Boolean verbose, Boolean staging, Boolean spellCheck, String bingSpellCheckSubscriptionKey, Boolean log) {
        return resolveWithRestResponseAsync(appId, query, timezoneOffset, verbose, staging, spellCheck, bingSpellCheckSubscriptionKey, log)
            .flatMap((SimpleResponse<LuisResult> res) -> Mono.just(res.value()));
    }
}
