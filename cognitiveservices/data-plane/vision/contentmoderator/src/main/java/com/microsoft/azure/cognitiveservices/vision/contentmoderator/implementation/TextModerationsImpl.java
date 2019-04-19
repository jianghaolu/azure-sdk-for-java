/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.implementation;

import com.azure.common.annotations.BodyParam;
import com.azure.common.annotations.ExpectedResponses;
import com.azure.common.annotations.HeaderParam;
import com.azure.common.annotations.Host;
import com.azure.common.annotations.HostParam;
import com.azure.common.annotations.POST;
import com.azure.common.annotations.QueryParam;
import com.azure.common.annotations.UnexpectedResponseExceptionType;
import com.azure.common.http.rest.SimpleResponse;
import com.azure.common.implementation.RestProxy;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.TextModerations;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.DetectedLanguage;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Screen;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * TextModerations.
 */
public final class TextModerationsImpl implements TextModerations {
    /**
     * The proxy service used to perform REST calls.
     */
    private TextModerationsService service;

    /**
     * The service client containing this operation class.
     */
    private ContentModeratorClientImpl client;

    /**
     * Initializes an instance of TextModerationsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public TextModerationsImpl(ContentModeratorClientImpl client) {
        this.service = RestProxy.create(TextModerationsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for TextModerations to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{Endpoint}")
    private interface TextModerationsService {
        @POST("contentmoderator/moderate/v1.0/ProcessText/Screen/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<Screen>> screenText(@HostParam("Endpoint") String endpoint, @QueryParam("language") String language, @QueryParam("autocorrect") Boolean autocorrect, @QueryParam("PII") Boolean pII, @QueryParam("listId") String listId, @QueryParam("classify") Boolean classify, @HeaderParam("Content-Type") String textContentType, @HeaderParam("Content-Length") long contentLength, @BodyParam("text/plain") Flux<ByteBuffer> textContent);

        @POST("contentmoderator/moderate/v1.0/ProcessText/DetectLanguage")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<DetectedLanguage>> detectLanguage(@HostParam("Endpoint") String endpoint, @HeaderParam("Content-Type") String textContentType, @HeaderParam("Content-Length") long contentLength, @BodyParam("text/plain") Flux<ByteBuffer> textContent);
    }

    /**
     * Detect profanity and match against custom and shared blacklists
     * Detects profanity in more than 100 languages and match against custom and shared blacklists.
     *
     * @param textContentType The content type. Possible values include: 'text/plain', 'text/html', 'text/xml', 'text/markdown'.
     * @param contentLength The content length.
     * @param textContent Content to screen.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Screen object if successful.
     */
    public Screen screenText(@NonNull String textContentType, @NonNull long contentLength, @NonNull Flux<ByteBuffer> textContent) {
        return screenTextAsync(textContentType, contentLength, textContent).block();
    }

    /**
     * Detect profanity and match against custom and shared blacklists
     * Detects profanity in more than 100 languages and match against custom and shared blacklists.
     *
     * @param textContentType The content type. Possible values include: 'text/plain', 'text/html', 'text/xml', 'text/markdown'.
     * @param contentLength The content length.
     * @param textContent Content to screen.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<Screen>> screenTextWithRestResponseAsync(@NonNull String textContentType, @NonNull long contentLength, @NonNull Flux<ByteBuffer> textContent) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (textContentType == null) {
            throw new IllegalArgumentException("Parameter textContentType is required and cannot be null.");
        }
        if (textContent == null) {
            throw new IllegalArgumentException("Parameter textContent is required and cannot be null.");
        }
        final String language = null;
        final Boolean autocorrect = false;
        final Boolean pII = false;
        final String listId = null;
        final Boolean classify = false;
        return service.screenText(this.client.endpoint(), language, autocorrect, pII, listId, classify, textContentType, contentLength, textContent);
    }

    /**
     * Detect profanity and match against custom and shared blacklists
     * Detects profanity in more than 100 languages and match against custom and shared blacklists.
     *
     * @param textContentType The content type. Possible values include: 'text/plain', 'text/html', 'text/xml', 'text/markdown'.
     * @param contentLength The content length.
     * @param textContent Content to screen.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Screen> screenTextAsync(@NonNull String textContentType, @NonNull long contentLength, @NonNull Flux<ByteBuffer> textContent) {
        return screenTextWithRestResponseAsync(textContentType, contentLength, textContent)
            .flatMap((SimpleResponse<Screen> res) -> Mono.just(res.value()));
    }

    /**
     * Detect profanity and match against custom and shared blacklists
     * Detects profanity in more than 100 languages and match against custom and shared blacklists.
     *
     * @param textContentType The content type. Possible values include: 'text/plain', 'text/html', 'text/xml', 'text/markdown'.
     * @param contentLength The content length.
     * @param textContent Content to screen.
     * @param language Language of the text.
     * @param autocorrect Autocorrect text.
     * @param pII Detect personal identifiable information.
     * @param listId The list Id.
     * @param classify Classify input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Screen object if successful.
     */
    public Screen screenText(@NonNull String textContentType, @NonNull long contentLength, @NonNull Flux<ByteBuffer> textContent, String language, Boolean autocorrect, Boolean pII, String listId, Boolean classify) {
        return screenTextAsync(textContentType, contentLength, textContent, language, autocorrect, pII, listId, classify).block();
    }

    /**
     * Detect profanity and match against custom and shared blacklists
     * Detects profanity in more than 100 languages and match against custom and shared blacklists.
     *
     * @param textContentType The content type. Possible values include: 'text/plain', 'text/html', 'text/xml', 'text/markdown'.
     * @param contentLength The content length.
     * @param textContent Content to screen.
     * @param language Language of the text.
     * @param autocorrect Autocorrect text.
     * @param pII Detect personal identifiable information.
     * @param listId The list Id.
     * @param classify Classify input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<Screen>> screenTextWithRestResponseAsync(@NonNull String textContentType, @NonNull long contentLength, @NonNull Flux<ByteBuffer> textContent, String language, Boolean autocorrect, Boolean pII, String listId, Boolean classify) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (textContentType == null) {
            throw new IllegalArgumentException("Parameter textContentType is required and cannot be null.");
        }
        if (textContent == null) {
            throw new IllegalArgumentException("Parameter textContent is required and cannot be null.");
        }
        return service.screenText(this.client.endpoint(), language, autocorrect, pII, listId, classify, textContentType, contentLength, textContent);
    }

    /**
     * Detect profanity and match against custom and shared blacklists
     * Detects profanity in more than 100 languages and match against custom and shared blacklists.
     *
     * @param textContentType The content type. Possible values include: 'text/plain', 'text/html', 'text/xml', 'text/markdown'.
     * @param contentLength The content length.
     * @param textContent Content to screen.
     * @param language Language of the text.
     * @param autocorrect Autocorrect text.
     * @param pII Detect personal identifiable information.
     * @param listId The list Id.
     * @param classify Classify input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Screen> screenTextAsync(@NonNull String textContentType, @NonNull long contentLength, @NonNull Flux<ByteBuffer> textContent, String language, Boolean autocorrect, Boolean pII, String listId, Boolean classify) {
        return screenTextWithRestResponseAsync(textContentType, contentLength, textContent, language, autocorrect, pII, listId, classify)
            .flatMap((SimpleResponse<Screen> res) -> Mono.just(res.value()));
    }

    /**
     * This operation will detect the language of given input content. Returns the &lt;a href="http://www-01.sil.org/iso639-3/codes.asp"&gt;ISO 639-3 code&lt;/a&gt; for the predominant language comprising the submitted text. Over 110 languages supported.
     *
     * @param textContentType The content type. Possible values include: 'text/plain', 'text/html', 'text/xml', 'text/markdown'.
     * @param contentLength The content length.
     * @param textContent Content to screen.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DetectedLanguage object if successful.
     */
    public DetectedLanguage detectLanguage(@NonNull String textContentType, @NonNull long contentLength, @NonNull Flux<ByteBuffer> textContent) {
        return detectLanguageAsync(textContentType, contentLength, textContent).block();
    }

    /**
     * This operation will detect the language of given input content. Returns the &lt;a href="http://www-01.sil.org/iso639-3/codes.asp"&gt;ISO 639-3 code&lt;/a&gt; for the predominant language comprising the submitted text. Over 110 languages supported.
     *
     * @param textContentType The content type. Possible values include: 'text/plain', 'text/html', 'text/xml', 'text/markdown'.
     * @param contentLength The content length.
     * @param textContent Content to screen.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<DetectedLanguage>> detectLanguageWithRestResponseAsync(@NonNull String textContentType, @NonNull long contentLength, @NonNull Flux<ByteBuffer> textContent) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (textContentType == null) {
            throw new IllegalArgumentException("Parameter textContentType is required and cannot be null.");
        }
        if (textContent == null) {
            throw new IllegalArgumentException("Parameter textContent is required and cannot be null.");
        }
        return service.detectLanguage(this.client.endpoint(), textContentType, contentLength, textContent);
    }

    /**
     * This operation will detect the language of given input content. Returns the &lt;a href="http://www-01.sil.org/iso639-3/codes.asp"&gt;ISO 639-3 code&lt;/a&gt; for the predominant language comprising the submitted text. Over 110 languages supported.
     *
     * @param textContentType The content type. Possible values include: 'text/plain', 'text/html', 'text/xml', 'text/markdown'.
     * @param contentLength The content length.
     * @param textContent Content to screen.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<DetectedLanguage> detectLanguageAsync(@NonNull String textContentType, @NonNull long contentLength, @NonNull Flux<ByteBuffer> textContent) {
        return detectLanguageWithRestResponseAsync(textContentType, contentLength, textContent)
            .flatMap((SimpleResponse<DetectedLanguage> res) -> Mono.just(res.value()));
    }
}
