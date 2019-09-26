// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity.credential;

import com.azure.core.util.logging.ClientLogger;
import com.azure.identity.AuthorizationCodeProvider;
import com.azure.identity.implementation.util.ValidationUtil;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;

/**
 * Fluent credential builder for instantiating a {@link AuthorizationCodeCredential}.
 *
 * @see AuthorizationCodeCredential
 */
public class AuthorizationCodeCredentialBuilder extends AadCredentialBuilderBase<AuthorizationCodeCredentialBuilder> {
    private static final ClientLogger LOGGER = new ClientLogger(AuthorizationCodeCredentialBuilder.class);

    private AuthorizationCodeProvider authorizationCodeProvider;
    private String redirectUri;

    /**
     * Sets the authorization code on the builder. This is required for building an
     * {@link AuthorizationCodeCredential}, but is not required for constructing the
     * login URL.
     *
     * @param authorizationCodeProvider the authorization code acquired from user login
     * @return the AuthorizationCodeCredentialBuilder itself
     */
    public AuthorizationCodeCredentialBuilder authorizationCodeProvider(AuthorizationCodeProvider authorizationCodeProvider) {
        this.authorizationCodeProvider = authorizationCodeProvider;
        return this;
    }

    /**
     * Sets redirect URL for the Oauth 2.0 login request, which must be
     * registered as a valid reply URL on the application. the authorization code
     * will be sent to this URL so it must be listening on this server and is able
     * to complete the {@link AuthorizationCodeCredential} construction from there.
     *
     * @param redirectUri the redirect URI to send the authorization code
     * @return the AuthorizationCodeCredentialBuilder itself
     */
    public AuthorizationCodeCredentialBuilder redirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    /**
     * @return a {@link AuthorizationCodeCredential} with the current configurations.
     */
    public AuthorizationCodeCredential build() {
        ValidationUtil.validate(getClass().getSimpleName(), new HashMap<String, Object>() {{
                put("clientId", clientId);
                put("authorizationCodeProvider", authorizationCodeProvider);
                put("redirectUri", redirectUri);
            }});
        try {
            return new AuthorizationCodeCredential(clientId, tenantId, authorizationCodeProvider, new URI(redirectUri), identityClientOptions);
        } catch (URISyntaxException e) {
            throw LOGGER.logExceptionAsError(new RuntimeException(e));
        }
    }
}
