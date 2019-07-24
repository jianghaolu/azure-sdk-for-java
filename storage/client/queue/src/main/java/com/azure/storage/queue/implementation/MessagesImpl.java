// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.implementation;

import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.annotation.BodyParam;
import com.azure.core.implementation.annotation.Delete;
import com.azure.core.implementation.annotation.ExpectedResponses;
import com.azure.core.implementation.annotation.Get;
import com.azure.core.implementation.annotation.HeaderParam;
import com.azure.core.implementation.annotation.Host;
import com.azure.core.implementation.annotation.HostParam;
import com.azure.core.implementation.annotation.Post;
import com.azure.core.implementation.annotation.QueryParam;
import com.azure.core.implementation.annotation.ReturnType;
import com.azure.core.implementation.annotation.ServiceInterface;
import com.azure.core.implementation.annotation.ServiceMethod;
import com.azure.core.implementation.annotation.UnexpectedResponseExceptionType;
import com.azure.core.util.Context;
import com.azure.storage.queue.models.MessagesClearResponse;
import com.azure.storage.queue.models.MessagesDequeueResponse;
import com.azure.storage.queue.models.MessagesEnqueueResponse;
import com.azure.storage.queue.models.MessagesPeekResponse;
import com.azure.storage.queue.models.QueueMessage;
import com.azure.storage.queue.models.StorageErrorException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Messages.
 */
public final class MessagesImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private MessagesService service;

    /**
     * The service client containing this operation class.
     */
    private AzureQueueStorageImpl client;

    /**
     * Initializes an instance of MessagesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public MessagesImpl(AzureQueueStorageImpl client) {
        this.service = RestProxy.create(MessagesService.class, client.httpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureQueueStorageMessages to
     * be used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureQueueStorageMessages")
    private interface MessagesService {
        @Get("{queueName}/messages")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<MessagesDequeueResponse> dequeue(@HostParam("url") String url, @QueryParam("numofmessages") Integer numberOfMessages, @QueryParam("visibilitytimeout") Integer visibilitytimeout, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, Context context);

        @Delete("{queueName}/messages")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<MessagesClearResponse> clear(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, Context context);

        @Post("{queueName}/messages")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<MessagesEnqueueResponse> enqueue(@HostParam("url") String url, @BodyParam("application/xml; charset=utf-8") QueueMessage queueMessage, @QueryParam("visibilitytimeout") Integer visibilitytimeout, @QueryParam("messagettl") Integer messageTimeToLive, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, Context context);

        @Get("{queueName}/messages")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<MessagesPeekResponse> peek(@HostParam("url") String url, @QueryParam("numofmessages") Integer numberOfMessages, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("peekonly") String peekonly, Context context);
    }

    /**
     * The Dequeue operation retrieves one or more messages from the front of the queue.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MessagesDequeueResponse> dequeueWithRestResponseAsync(Context context) {
        final Integer numberOfMessages = null;
        final Integer visibilitytimeout = null;
        final Integer timeout = null;
        final String requestId = null;
        return service.dequeue(this.client.url(), numberOfMessages, visibilitytimeout, timeout, this.client.version(), requestId, context);
    }

    /**
     * The Dequeue operation retrieves one or more messages from the front of the queue.
     *
     * @param numberOfMessages Optional. A nonzero integer value that specifies the number of messages to retrieve from the queue, up to a maximum of 32. If fewer are visible, the visible messages are returned. By default, a single message is retrieved from the queue with this operation.
     * @param visibilitytimeout Optional. Specifies the new visibility timeout value, in seconds, relative to server time. The default value is 30 seconds. A specified value must be larger than or equal to 1 second, and cannot be larger than 7 days, or larger than 2 hours on REST protocol versions prior to version 2011-08-18. The visibility timeout of a message can be set to a value later than the expiry time.
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MessagesDequeueResponse> dequeueWithRestResponseAsync(Integer numberOfMessages, Integer visibilitytimeout, Integer timeout, String requestId, Context context) {
        return service.dequeue(this.client.url(), numberOfMessages, visibilitytimeout, timeout, this.client.version(), requestId, context);
    }

    /**
     * The Clear operation deletes all messages from the specified queue.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MessagesClearResponse> clearWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final String requestId = null;
        return service.clear(this.client.url(), timeout, this.client.version(), requestId, context);
    }

    /**
     * The Clear operation deletes all messages from the specified queue.
     *
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MessagesClearResponse> clearWithRestResponseAsync(Integer timeout, String requestId, Context context) {
        return service.clear(this.client.url(), timeout, this.client.version(), requestId, context);
    }

    /**
     * The Enqueue operation adds a new message to the back of the message queue. A visibility timeout can also be specified to make the message invisible until the visibility timeout expires. A message must be in a format that can be included in an XML request with UTF-8 encoding. The encoded message can be up to 64 KB in size for versions 2011-08-18 and newer, or 8 KB in size for previous versions.
     *
     * @param queueMessage A Message object which can be stored in a Queue.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MessagesEnqueueResponse> enqueueWithRestResponseAsync(QueueMessage queueMessage, Context context) {
        final Integer visibilitytimeout = null;
        final Integer messageTimeToLive = null;
        final Integer timeout = null;
        final String requestId = null;
        return service.enqueue(this.client.url(), queueMessage, visibilitytimeout, messageTimeToLive, timeout, this.client.version(), requestId, context);
    }

    /**
     * The Enqueue operation adds a new message to the back of the message queue. A visibility timeout can also be specified to make the message invisible until the visibility timeout expires. A message must be in a format that can be included in an XML request with UTF-8 encoding. The encoded message can be up to 64 KB in size for versions 2011-08-18 and newer, or 8 KB in size for previous versions.
     *
     * @param queueMessage A Message object which can be stored in a Queue.
     * @param visibilitytimeout Optional. Specifies the new visibility timeout value, in seconds, relative to server time. The default value is 30 seconds. A specified value must be larger than or equal to 1 second, and cannot be larger than 7 days, or larger than 2 hours on REST protocol versions prior to version 2011-08-18. The visibility timeout of a message can be set to a value later than the expiry time.
     * @param messageTimeToLive Optional. Specifies the time-to-live interval for the message, in seconds. Prior to version 2017-07-29, the maximum time-to-live allowed is 7 days. For version 2017-07-29 or later, the maximum time-to-live can be any positive number, as well as -1 indicating that the message does not expire. If this parameter is omitted, the default time-to-live is 7 days.
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MessagesEnqueueResponse> enqueueWithRestResponseAsync(QueueMessage queueMessage, Integer visibilitytimeout, Integer messageTimeToLive, Integer timeout, String requestId, Context context) {
        return service.enqueue(this.client.url(), queueMessage, visibilitytimeout, messageTimeToLive, timeout, this.client.version(), requestId, context);
    }

    /**
     * The Peek operation retrieves one or more messages from the front of the queue, but does not alter the visibility of the message.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MessagesPeekResponse> peekWithRestResponseAsync(Context context) {
        final Integer numberOfMessages = null;
        final Integer timeout = null;
        final String requestId = null;
        final String peekonly = "true";
        return service.peek(this.client.url(), numberOfMessages, timeout, this.client.version(), requestId, peekonly, context);
    }

    /**
     * The Peek operation retrieves one or more messages from the front of the queue, but does not alter the visibility of the message.
     *
     * @param numberOfMessages Optional. A nonzero integer value that specifies the number of messages to retrieve from the queue, up to a maximum of 32. If fewer are visible, the visible messages are returned. By default, a single message is retrieved from the queue with this operation.
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MessagesPeekResponse> peekWithRestResponseAsync(Integer numberOfMessages, Integer timeout, String requestId, Context context) {
        final String peekonly = "true";
        return service.peek(this.client.url(), numberOfMessages, timeout, this.client.version(), requestId, peekonly, context);
    }
}
