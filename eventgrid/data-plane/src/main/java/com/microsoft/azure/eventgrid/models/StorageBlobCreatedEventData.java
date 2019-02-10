/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for an
 * Microsoft.Storage.BlobCreated event.
 */
public class StorageBlobCreatedEventData {
    /**
     * The name of the API/operation that triggered this event.
     */
    @JsonProperty(value = "api")
    private String api;

    /**
     * A request id provided by the client of the storage API operation that
     * triggered this event.
     */
    @JsonProperty(value = "clientRequestId")
    private String clientRequestId;

    /**
     * The request id generated by the Storage service for the storage API
     * operation that triggered this event.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * The etag of the object at the time this event was triggered.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * The content type of the blob. This is the same as what would be returned
     * in the Content-Type header from the blob.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /**
     * The size of the blob in bytes. This is the same as what would be
     * returned in the Content-Length header from the blob.
     */
    @JsonProperty(value = "contentLength")
    private Long contentLength;

    /**
     * The type of blob.
     */
    @JsonProperty(value = "blobType")
    private String blobType;

    /**
     * The path to the blob.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * An opaque string value representing the logical sequence of events for
     * any particular blob name. Users can use standard string comparison to
     * understand the relative sequence of two events on the same blob name.
     */
    @JsonProperty(value = "sequencer")
    private String sequencer;

    /**
     * For service use only. Diagnostic data occasionally included by the Azure
     * Storage service. This property should be ignored by event consumers.
     */
    @JsonProperty(value = "storageDiagnostics")
    private Object storageDiagnostics;

    /**
     * Get the name of the API/operation that triggered this event.
     *
     * @return the api value
     */
    public String api() {
        return this.api;
    }

    /**
     * Set the name of the API/operation that triggered this event.
     *
     * @param api the api value to set
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData withApi(String api) {
        this.api = api;
        return this;
    }

    /**
     * Get a request id provided by the client of the storage API operation that triggered this event.
     *
     * @return the clientRequestId value
     */
    public String clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set a request id provided by the client of the storage API operation that triggered this event.
     *
     * @param clientRequestId the clientRequestId value to set
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the request id generated by the Storage service for the storage API operation that triggered this event.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the request id generated by the Storage service for the storage API operation that triggered this event.
     *
     * @param requestId the requestId value to set
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the etag of the object at the time this event was triggered.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the etag of the object at the time this event was triggered.
     *
     * @param eTag the eTag value to set
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the content type of the blob. This is the same as what would be returned in the Content-Type header from the blob.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the content type of the blob. This is the same as what would be returned in the Content-Type header from the blob.
     *
     * @param contentType the contentType value to set
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the size of the blob in bytes. This is the same as what would be returned in the Content-Length header from the blob.
     *
     * @return the contentLength value
     */
    public Long contentLength() {
        return this.contentLength;
    }

    /**
     * Set the size of the blob in bytes. This is the same as what would be returned in the Content-Length header from the blob.
     *
     * @param contentLength the contentLength value to set
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData withContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the type of blob.
     *
     * @return the blobType value
     */
    public String blobType() {
        return this.blobType;
    }

    /**
     * Set the type of blob.
     *
     * @param blobType the blobType value to set
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData withBlobType(String blobType) {
        this.blobType = blobType;
        return this;
    }

    /**
     * Get the path to the blob.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the path to the blob.
     *
     * @param url the url value to set
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get an opaque string value representing the logical sequence of events for any particular blob name. Users can use standard string comparison to understand the relative sequence of two events on the same blob name.
     *
     * @return the sequencer value
     */
    public String sequencer() {
        return this.sequencer;
    }

    /**
     * Set an opaque string value representing the logical sequence of events for any particular blob name. Users can use standard string comparison to understand the relative sequence of two events on the same blob name.
     *
     * @param sequencer the sequencer value to set
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData withSequencer(String sequencer) {
        this.sequencer = sequencer;
        return this;
    }

    /**
     * Get for service use only. Diagnostic data occasionally included by the Azure Storage service. This property should be ignored by event consumers.
     *
     * @return the storageDiagnostics value
     */
    public Object storageDiagnostics() {
        return this.storageDiagnostics;
    }

    /**
     * Set for service use only. Diagnostic data occasionally included by the Azure Storage service. This property should be ignored by event consumers.
     *
     * @param storageDiagnostics the storageDiagnostics value to set
     * @return the StorageBlobCreatedEventData object itself.
     */
    public StorageBlobCreatedEventData withStorageDiagnostics(Object storageDiagnostics) {
        this.storageDiagnostics = storageDiagnostics;
        return this;
    }

}
