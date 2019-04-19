/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.implementation;

import com.azure.common.annotations.DELETE;
import com.azure.common.annotations.ExpectedResponses;
import com.azure.common.annotations.GET;
import com.azure.common.annotations.Host;
import com.azure.common.annotations.HostParam;
import com.azure.common.annotations.PathParam;
import com.azure.common.annotations.POST;
import com.azure.common.annotations.QueryParam;
import com.azure.common.annotations.UnexpectedResponseExceptionType;
import com.azure.common.http.rest.SimpleResponse;
import com.azure.common.implementation.RestProxy;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementTerms;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Terms;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * ListManagementTerms.
 */
public final class ListManagementTermsImpl implements ListManagementTerms {
    /**
     * The proxy service used to perform REST calls.
     */
    private ListManagementTermsService service;

    /**
     * The service client containing this operation class.
     */
    private ContentModeratorClientImpl client;

    /**
     * Initializes an instance of ListManagementTermsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ListManagementTermsImpl(ContentModeratorClientImpl client) {
        this.service = RestProxy.create(ListManagementTermsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for ListManagementTerms to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{Endpoint}")
    private interface ListManagementTermsService {
        @POST("contentmoderator/lists/v1.0/termlists/{listId}/terms/{term}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<Object>> addTerm(@PathParam("listId") String listId, @PathParam("term") String term, @HostParam("Endpoint") String endpoint, @QueryParam("language") String language);

        @DELETE("contentmoderator/lists/v1.0/termlists/{listId}/terms/{term}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<String>> deleteTerm(@PathParam("listId") String listId, @PathParam("term") String term, @HostParam("Endpoint") String endpoint, @QueryParam("language") String language);

        @GET("contentmoderator/lists/v1.0/termlists/{listId}/terms")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<Terms>> getAllTerms(@PathParam("listId") String listId, @HostParam("Endpoint") String endpoint, @QueryParam("language") String language, @QueryParam("offset") Integer offset, @QueryParam("limit") Integer limit);

        @DELETE("contentmoderator/lists/v1.0/termlists/{listId}/terms")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<String>> deleteAllTerms(@PathParam("listId") String listId, @HostParam("Endpoint") String endpoint, @QueryParam("language") String language);
    }

    /**
     * Add a term to the term list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param term Term to be deleted.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Object object if successful.
     */
    public Object addTerm(@NonNull String listId, @NonNull String term, @NonNull String language) {
        return addTermAsync(listId, term, language).block();
    }

    /**
     * Add a term to the term list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param term Term to be deleted.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<Object>> addTermWithRestResponseAsync(@NonNull String listId, @NonNull String term, @NonNull String language) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        if (term == null) {
            throw new IllegalArgumentException("Parameter term is required and cannot be null.");
        }
        if (language == null) {
            throw new IllegalArgumentException("Parameter language is required and cannot be null.");
        }
        return service.addTerm(listId, term, this.client.endpoint(), language);
    }

    /**
     * Add a term to the term list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param term Term to be deleted.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Object> addTermAsync(@NonNull String listId, @NonNull String term, @NonNull String language) {
        return addTermWithRestResponseAsync(listId, term, language)
            .flatMap((SimpleResponse<Object> res) -> Mono.just(res.value()));
    }

    /**
     * Deletes a term from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param term Term to be deleted.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String deleteTerm(@NonNull String listId, @NonNull String term, @NonNull String language) {
        return deleteTermAsync(listId, term, language).block();
    }

    /**
     * Deletes a term from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param term Term to be deleted.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<String>> deleteTermWithRestResponseAsync(@NonNull String listId, @NonNull String term, @NonNull String language) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        if (term == null) {
            throw new IllegalArgumentException("Parameter term is required and cannot be null.");
        }
        if (language == null) {
            throw new IllegalArgumentException("Parameter language is required and cannot be null.");
        }
        return service.deleteTerm(listId, term, this.client.endpoint(), language);
    }

    /**
     * Deletes a term from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param term Term to be deleted.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<String> deleteTermAsync(@NonNull String listId, @NonNull String term, @NonNull String language) {
        return deleteTermWithRestResponseAsync(listId, term, language)
            .flatMap((SimpleResponse<String> res) -> Mono.just(res.value()));
    }

    /**
     * Gets all terms from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Terms object if successful.
     */
    public Terms getAllTerms(@NonNull String listId, @NonNull String language) {
        return getAllTermsAsync(listId, language).block();
    }

    /**
     * Gets all terms from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<Terms>> getAllTermsWithRestResponseAsync(@NonNull String listId, @NonNull String language) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        if (language == null) {
            throw new IllegalArgumentException("Parameter language is required and cannot be null.");
        }
        final Integer offset = null;
        final Integer limit = null;
        return service.getAllTerms(listId, this.client.endpoint(), language, offset, limit);
    }

    /**
     * Gets all terms from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Terms> getAllTermsAsync(@NonNull String listId, @NonNull String language) {
        return getAllTermsWithRestResponseAsync(listId, language)
            .flatMap((SimpleResponse<Terms> res) -> Mono.just(res.value()));
    }

    /**
     * Gets all terms from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @param offset The pagination start index.
     * @param limit The max limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Terms object if successful.
     */
    public Terms getAllTerms(@NonNull String listId, @NonNull String language, Integer offset, Integer limit) {
        return getAllTermsAsync(listId, language, offset, limit).block();
    }

    /**
     * Gets all terms from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @param offset The pagination start index.
     * @param limit The max limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<Terms>> getAllTermsWithRestResponseAsync(@NonNull String listId, @NonNull String language, Integer offset, Integer limit) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        if (language == null) {
            throw new IllegalArgumentException("Parameter language is required and cannot be null.");
        }
        return service.getAllTerms(listId, this.client.endpoint(), language, offset, limit);
    }

    /**
     * Gets all terms from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @param offset The pagination start index.
     * @param limit The max limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Terms> getAllTermsAsync(@NonNull String listId, @NonNull String language, Integer offset, Integer limit) {
        return getAllTermsWithRestResponseAsync(listId, language, offset, limit)
            .flatMap((SimpleResponse<Terms> res) -> Mono.just(res.value()));
    }

    /**
     * Deletes all terms from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String deleteAllTerms(@NonNull String listId, @NonNull String language) {
        return deleteAllTermsAsync(listId, language).block();
    }

    /**
     * Deletes all terms from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<String>> deleteAllTermsWithRestResponseAsync(@NonNull String listId, @NonNull String language) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        if (language == null) {
            throw new IllegalArgumentException("Parameter language is required and cannot be null.");
        }
        return service.deleteAllTerms(listId, this.client.endpoint(), language);
    }

    /**
     * Deletes all terms from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<String> deleteAllTermsAsync(@NonNull String listId, @NonNull String language) {
        return deleteAllTermsWithRestResponseAsync(listId, language)
            .flatMap((SimpleResponse<String> res) -> Mono.just(res.value()));
    }
}
