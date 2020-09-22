// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.sms.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;

/** Initializes a new instance of the AzureCommunicationSMSService type. */
public final class AzureCommunicationSMSServiceImpl {
    /** The endpoint of the Azure Communication resource. */
    private final String endpoint;

    /**
     * Gets The endpoint of the Azure Communication resource.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The SmsImpl object to access its operations. */
    private final SmsImpl sms;

    /**
     * Gets the SmsImpl object to access its operations.
     *
     * @return the SmsImpl object.
     */
    public SmsImpl getSms() {
        return this.sms;
    }

    /** Initializes an instance of AzureCommunicationSMSService client. */
    AzureCommunicationSMSServiceImpl(String endpoint) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                endpoint);
    }

    /**
     * Initializes an instance of AzureCommunicationSMSService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    AzureCommunicationSMSServiceImpl(HttpPipeline httpPipeline, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.endpoint = endpoint;
        this.apiVersion = "2020-07-20-preview1";
        this.sms = new SmsImpl(this);
    }
}
