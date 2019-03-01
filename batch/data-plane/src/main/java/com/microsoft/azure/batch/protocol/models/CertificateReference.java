// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A reference to a certificate to be installed on compute nodes in a pool.
 */
public class CertificateReference {
    /**
     * The thumbprint of the certificate.
     */
    @JsonProperty(value = "thumbprint", required = true)
    private String thumbprint;

    /**
     * The algorithm with which the thumbprint is associated. This must be
     * sha1.
     */
    @JsonProperty(value = "thumbprintAlgorithm", required = true)
    private String thumbprintAlgorithm;

    /**
     * The location of the certificate store on the compute node into which to
     * install the certificate.
     * The default value is currentuser. This property is applicable only for
     * pools configured with Windows nodes (that is, created with
     * cloudServiceConfiguration, or with virtualMachineConfiguration using a
     * Windows image reference). For Linux compute nodes, the certificates are
     * stored in a directory inside the task working directory and an
     * environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task
     * to query for this location. For certificates with visibility of
     * 'remoteUser', a 'certs' directory is created in the user's home
     * directory (e.g., /home/{user-name}/certs) and certificates are placed in
     * that directory. Possible values include: 'currentUser', 'localMachine'.
     */
    @JsonProperty(value = "storeLocation")
    private CertificateStoreLocation storeLocation;

    /**
     * The name of the certificate store on the compute node into which to
     * install the certificate.
     * This property is applicable only for pools configured with Windows nodes
     * (that is, created with cloudServiceConfiguration, or with
     * virtualMachineConfiguration using a Windows image reference). Common
     * store names include: My, Root, CA, Trust, Disallowed, TrustedPeople,
     * TrustedPublisher, AuthRoot, AddressBook, but any custom store name can
     * also be used. The default value is My.
     */
    @JsonProperty(value = "storeName")
    private String storeName;

    /**
     * Which user accounts on the compute node should have access to the
     * private data of the certificate.
     * You can specify more than one visibility in this collection. The default
     * is all accounts.
     */
    @JsonProperty(value = "visibility")
    private List<CertificateVisibility> visibility;

    /**
     * Get the thumbprint value.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint value.
     *
     * @param thumbprint the thumbprint value to set
     * @return the CertificateReference object itself.
     */
    public CertificateReference withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the thumbprintAlgorithm value.
     *
     * @return the thumbprintAlgorithm value
     */
    public String thumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }

    /**
     * Set the thumbprintAlgorithm value.
     *
     * @param thumbprintAlgorithm the thumbprintAlgorithm value to set
     * @return the CertificateReference object itself.
     */
    public CertificateReference withThumbprintAlgorithm(String thumbprintAlgorithm) {
        this.thumbprintAlgorithm = thumbprintAlgorithm;
        return this;
    }

    /**
     * Get the default value is currentuser. This property is applicable only for pools configured with Windows nodes (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory. Possible values include: 'currentUser', 'localMachine'.
     *
     * @return the storeLocation value
     */
    public CertificateStoreLocation storeLocation() {
        return this.storeLocation;
    }

    /**
     * Set the default value is currentuser. This property is applicable only for pools configured with Windows nodes (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory. Possible values include: 'currentUser', 'localMachine'.
     *
     * @param storeLocation the storeLocation value to set
     * @return the CertificateReference object itself.
     */
    public CertificateReference withStoreLocation(CertificateStoreLocation storeLocation) {
        this.storeLocation = storeLocation;
        return this;
    }

    /**
     * Get this property is applicable only for pools configured with Windows nodes (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). Common store names include: My, Root, CA, Trust, Disallowed, TrustedPeople, TrustedPublisher, AuthRoot, AddressBook, but any custom store name can also be used. The default value is My.
     *
     * @return the storeName value
     */
    public String storeName() {
        return this.storeName;
    }

    /**
     * Set this property is applicable only for pools configured with Windows nodes (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). Common store names include: My, Root, CA, Trust, Disallowed, TrustedPeople, TrustedPublisher, AuthRoot, AddressBook, but any custom store name can also be used. The default value is My.
     *
     * @param storeName the storeName value to set
     * @return the CertificateReference object itself.
     */
    public CertificateReference withStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * Get you can specify more than one visibility in this collection. The default is all accounts.
     *
     * @return the visibility value
     */
    public List<CertificateVisibility> visibility() {
        return this.visibility;
    }

    /**
     * Set you can specify more than one visibility in this collection. The default is all accounts.
     *
     * @param visibility the visibility value to set
     * @return the CertificateReference object itself.
     */
    public CertificateReference withVisibility(List<CertificateVisibility> visibility) {
        this.visibility = visibility;
        return this;
    }

}
