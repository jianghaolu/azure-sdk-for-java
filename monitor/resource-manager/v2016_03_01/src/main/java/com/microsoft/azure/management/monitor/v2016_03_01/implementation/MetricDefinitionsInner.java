/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2016_03_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.monitor.v2016_03_01.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in MetricDefinitions.
 */
public class MetricDefinitionsInner {
    /** The Retrofit service to perform REST calls. */
    private MetricDefinitionsService service;
    /** The service client containing this operation class. */
    private MonitorManagementClientImpl client;

    /**
     * Initializes an instance of MetricDefinitionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MetricDefinitionsInner(Retrofit retrofit, MonitorManagementClientImpl client) {
        this.service = retrofit.create(MetricDefinitionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MetricDefinitions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MetricDefinitionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.v2016_03_01.MetricDefinitions list" })
        @GET("{resourceUri}/providers/microsoft.insights/metricDefinitions")
        Observable<Response<ResponseBody>> list(@Path(value = "resourceUri", encoded = true) String resourceUri, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;MetricDefinitionInner&gt; object if successful.
     */
    public List<MetricDefinitionInner> list(String resourceUri) {
        return listWithServiceResponseAsync(resourceUri).toBlocking().single().body();
    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<MetricDefinitionInner>> listAsync(String resourceUri, final ServiceCallback<List<MetricDefinitionInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceUri), serviceCallback);
    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MetricDefinitionInner&gt; object
     */
    public Observable<List<MetricDefinitionInner>> listAsync(String resourceUri) {
        return listWithServiceResponseAsync(resourceUri).map(new Func1<ServiceResponse<List<MetricDefinitionInner>>, List<MetricDefinitionInner>>() {
            @Override
            public List<MetricDefinitionInner> call(ServiceResponse<List<MetricDefinitionInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MetricDefinitionInner&gt; object
     */
    public Observable<ServiceResponse<List<MetricDefinitionInner>>> listWithServiceResponseAsync(String resourceUri) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        return service.list(resourceUri, this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<MetricDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<MetricDefinitionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<MetricDefinitionInner>> result = listDelegate(response);
                        List<MetricDefinitionInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<MetricDefinitionInner>> clientResponse = new ServiceResponse<List<MetricDefinitionInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param filter Reduces the set of data collected by retrieving particular metric definitions from all the definitions available for the resource.&lt;br&gt;For example, to get just the definition for the 'CPU percentage' counter: $filter=name.value eq '\Processor(_Total)\% Processor Time'.&lt;br&gt;Multiple metrics can be retrieved by joining together *'name eq &lt;value&gt;'* clauses separated by *or* logical operators.&lt;br&gt;**NOTE**: No other syntax is allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;MetricDefinitionInner&gt; object if successful.
     */
    public List<MetricDefinitionInner> list(String resourceUri, String filter) {
        return listWithServiceResponseAsync(resourceUri, filter).toBlocking().single().body();
    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param filter Reduces the set of data collected by retrieving particular metric definitions from all the definitions available for the resource.&lt;br&gt;For example, to get just the definition for the 'CPU percentage' counter: $filter=name.value eq '\Processor(_Total)\% Processor Time'.&lt;br&gt;Multiple metrics can be retrieved by joining together *'name eq &lt;value&gt;'* clauses separated by *or* logical operators.&lt;br&gt;**NOTE**: No other syntax is allowed.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<MetricDefinitionInner>> listAsync(String resourceUri, String filter, final ServiceCallback<List<MetricDefinitionInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceUri, filter), serviceCallback);
    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param filter Reduces the set of data collected by retrieving particular metric definitions from all the definitions available for the resource.&lt;br&gt;For example, to get just the definition for the 'CPU percentage' counter: $filter=name.value eq '\Processor(_Total)\% Processor Time'.&lt;br&gt;Multiple metrics can be retrieved by joining together *'name eq &lt;value&gt;'* clauses separated by *or* logical operators.&lt;br&gt;**NOTE**: No other syntax is allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MetricDefinitionInner&gt; object
     */
    public Observable<List<MetricDefinitionInner>> listAsync(String resourceUri, String filter) {
        return listWithServiceResponseAsync(resourceUri, filter).map(new Func1<ServiceResponse<List<MetricDefinitionInner>>, List<MetricDefinitionInner>>() {
            @Override
            public List<MetricDefinitionInner> call(ServiceResponse<List<MetricDefinitionInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param filter Reduces the set of data collected by retrieving particular metric definitions from all the definitions available for the resource.&lt;br&gt;For example, to get just the definition for the 'CPU percentage' counter: $filter=name.value eq '\Processor(_Total)\% Processor Time'.&lt;br&gt;Multiple metrics can be retrieved by joining together *'name eq &lt;value&gt;'* clauses separated by *or* logical operators.&lt;br&gt;**NOTE**: No other syntax is allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MetricDefinitionInner&gt; object
     */
    public Observable<ServiceResponse<List<MetricDefinitionInner>>> listWithServiceResponseAsync(String resourceUri, String filter) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(resourceUri, this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<MetricDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<MetricDefinitionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<MetricDefinitionInner>> result = listDelegate(response);
                        List<MetricDefinitionInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<MetricDefinitionInner>> clientResponse = new ServiceResponse<List<MetricDefinitionInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<MetricDefinitionInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<MetricDefinitionInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<MetricDefinitionInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
