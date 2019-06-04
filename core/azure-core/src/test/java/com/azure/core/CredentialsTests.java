// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core;

import com.azure.core.credentials.BasicAuthenticationCredential;
import com.azure.core.credentials.TokenCredential;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.MockHttpClient;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import org.junit.Assert;
import org.junit.Test;
import reactor.core.publisher.Mono;

import java.net.URL;

public class CredentialsTests {

    @Test
    public void basicCredentialsTest() throws Exception {
        BasicAuthenticationCredential credentials = new BasicAuthenticationCredential("user", "pass");

        HttpPipelinePolicy auditorPolicy =  (context, next) -> {
            String headerValue = context.httpRequest().headers().value("Authorization");
            Assert.assertEquals("Basic dXNlcjpwYXNz", headerValue);
            return next.process();
        };
        //
        final HttpPipeline pipeline = HttpPipeline.builder()
            .httpClient(new MockHttpClient())
            .policies((context, next) -> credentials.getToken("scope./default")
                .flatMap(token -> {
                    context.httpRequest().headers().put("Authorization", "Basic " + token);
                    return next.process();
                }), auditorPolicy)
            .build();

        HttpRequest request = new HttpRequest(HttpMethod.GET, new URL("http://localhost"));
        pipeline.send(request).block();
    }

    @Test
    public void tokenCredentialTest() throws Exception {
        TokenCredential credentials = new TokenCredential() {
            @Override
            public Mono<String> getToken(String... scopes) {
                return Mono.just("this_is_a_token");
            }
        };

        HttpPipelinePolicy auditorPolicy =  (context, next) -> {
            String headerValue = context.httpRequest().headers().value("Authorization");
            Assert.assertEquals("Bearer this_is_a_token", headerValue);
            return next.process();
        };

        final HttpPipeline pipeline = HttpPipeline.builder()
            .httpClient(new MockHttpClient())
            .policies(new BearerTokenAuthenticationPolicy(credentials, "scope./default"), auditorPolicy)
            .build();

        HttpRequest request = new HttpRequest(HttpMethod.GET, new URL("http://localhost"));
        pipeline.send(request).block();
    }
}
