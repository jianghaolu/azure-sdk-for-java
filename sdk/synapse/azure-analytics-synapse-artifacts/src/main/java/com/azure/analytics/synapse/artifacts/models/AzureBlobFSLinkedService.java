// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure Data Lake Storage Gen2 linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBlobFS")
@JsonFlatten
@Fluent
public class AzureBlobFSLinkedService extends LinkedService {
    /*
     * Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /*
     * Account key for the Azure Data Lake Storage Gen2 service. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.accountKey")
    private Object accountKey;

    /*
     * The ID of the application used to authenticate against the Azure Data
     * Lake Storage Gen2 account. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The Key of the application used to authenticate against the Azure Data
     * Lake Storage Gen2 account.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tenant")
    private Object tenant;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the url property: Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with
     * resultType string).
     *
     * @return the url value.
     */
    public Object getUrl() {
        return this.url;
    }

    /**
     * Set the url property: Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with
     * resultType string).
     *
     * @param url the url value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService setUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the accountKey property: Account key for the Azure Data Lake Storage Gen2 service. Type: string (or
     * Expression with resultType string).
     *
     * @return the accountKey value.
     */
    public Object getAccountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: Account key for the Azure Data Lake Storage Gen2 service. Type: string (or
     * Expression with resultType string).
     *
     * @param accountKey the accountKey value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService setAccountKey(Object accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Storage Gen2 account. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Storage Gen2 account. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Storage Gen2 account.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Storage Gen2 account.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @return the tenant value.
     */
    public Object getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService setTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
