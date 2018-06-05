/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
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
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ClassicAdministrators.
 */
public class ClassicAdministratorsInner {
    /** The Retrofit service to perform REST calls. */
    private ClassicAdministratorsService service;
    /** The service client containing this operation class. */
    private AuthorizationManagementClientImpl client;

    /**
     * Initializes an instance of ClassicAdministratorsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ClassicAdministratorsInner(Retrofit retrofit, AuthorizationManagementClientImpl client) {
        this.service = retrofit.create(ClassicAdministratorsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ClassicAdministrators to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ClassicAdministratorsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.authorization.v2015_07_01.ClassicAdministrators list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Authorization/classicAdministrators")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.authorization.v2015_07_01.ClassicAdministrators listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @param apiVersion The API version to use for this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ClassicAdministratorInner&gt; object if successful.
     */
    public PagedList<ClassicAdministratorInner> list(final String apiVersion) {
        ServiceResponse<Page<ClassicAdministratorInner>> response = listSinglePageAsync(apiVersion).toBlocking().single();
        return new PagedList<ClassicAdministratorInner>(response.body()) {
            @Override
            public Page<ClassicAdministratorInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @param apiVersion The API version to use for this operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ClassicAdministratorInner>> listAsync(final String apiVersion, final ListOperationCallback<ClassicAdministratorInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(apiVersion),
            new Func1<String, Observable<ServiceResponse<Page<ClassicAdministratorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClassicAdministratorInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @param apiVersion The API version to use for this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ClassicAdministratorInner&gt; object
     */
    public Observable<Page<ClassicAdministratorInner>> listAsync(final String apiVersion) {
        return listWithServiceResponseAsync(apiVersion)
            .map(new Func1<ServiceResponse<Page<ClassicAdministratorInner>>, Page<ClassicAdministratorInner>>() {
                @Override
                public Page<ClassicAdministratorInner> call(ServiceResponse<Page<ClassicAdministratorInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @param apiVersion The API version to use for this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ClassicAdministratorInner&gt; object
     */
    public Observable<ServiceResponse<Page<ClassicAdministratorInner>>> listWithServiceResponseAsync(final String apiVersion) {
        return listSinglePageAsync(apiVersion)
            .concatMap(new Func1<ServiceResponse<Page<ClassicAdministratorInner>>, Observable<ServiceResponse<Page<ClassicAdministratorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClassicAdministratorInner>>> call(ServiceResponse<Page<ClassicAdministratorInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
    ServiceResponse<PageImpl<ClassicAdministratorInner>> * @param apiVersion The API version to use for this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ClassicAdministratorInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ClassicAdministratorInner>>> listSinglePageAsync(final String apiVersion) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (apiVersion == null) {
            throw new IllegalArgumentException("Parameter apiVersion is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ClassicAdministratorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClassicAdministratorInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ClassicAdministratorInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ClassicAdministratorInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ClassicAdministratorInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ClassicAdministratorInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ClassicAdministratorInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ClassicAdministratorInner&gt; object if successful.
     */
    public PagedList<ClassicAdministratorInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ClassicAdministratorInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ClassicAdministratorInner>(response.body()) {
            @Override
            public Page<ClassicAdministratorInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ClassicAdministratorInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ClassicAdministratorInner>> serviceFuture, final ListOperationCallback<ClassicAdministratorInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ClassicAdministratorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClassicAdministratorInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ClassicAdministratorInner&gt; object
     */
    public Observable<Page<ClassicAdministratorInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ClassicAdministratorInner>>, Page<ClassicAdministratorInner>>() {
                @Override
                public Page<ClassicAdministratorInner> call(ServiceResponse<Page<ClassicAdministratorInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ClassicAdministratorInner&gt; object
     */
    public Observable<ServiceResponse<Page<ClassicAdministratorInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ClassicAdministratorInner>>, Observable<ServiceResponse<Page<ClassicAdministratorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClassicAdministratorInner>>> call(ServiceResponse<Page<ClassicAdministratorInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
    ServiceResponse<PageImpl<ClassicAdministratorInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ClassicAdministratorInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ClassicAdministratorInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ClassicAdministratorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClassicAdministratorInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ClassicAdministratorInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ClassicAdministratorInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ClassicAdministratorInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ClassicAdministratorInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ClassicAdministratorInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
