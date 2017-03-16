/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.microsoft.azure.management.appservice.AzureResourceType;
import com.microsoft.azure.management.appservice.CustomHostNameDnsRecordType;
import com.microsoft.azure.management.appservice.HostNameType;
import com.microsoft.azure.management.appservice.SslState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A hostname binding object.
 */
@JsonFlatten
public class HostNameBindingInner extends Resource {
    /**
     * Hostname.
     */
    @JsonProperty(value = "properties.name")
    private String hostNameBindingName;

    /**
     * App Service app name.
     */
    @JsonProperty(value = "properties.siteName")
    private String siteName;

    /**
     * Fully qualified ARM domain resource URI.
     */
    @JsonProperty(value = "properties.domainId")
    private String domainId;

    /**
     * Azure resource name.
     */
    @JsonProperty(value = "properties.azureResourceName")
    private String azureResourceName;

    /**
     * Azure resource type. Possible values include: 'Website',
     * 'TrafficManager'.
     */
    @JsonProperty(value = "properties.azureResourceType")
    private AzureResourceType azureResourceType;

    /**
     * Custom DNS record type. Possible values include: 'CName', 'A'.
     */
    @JsonProperty(value = "properties.customHostNameDnsRecordType")
    private CustomHostNameDnsRecordType customHostNameDnsRecordType;

    /**
     * Hostname type. Possible values include: 'Verified', 'Managed'.
     */
    @JsonProperty(value = "properties.hostNameType")
    private HostNameType hostNameType;

    /**
     * SSL type. Possible values include: 'Disabled', 'SniEnabled',
     * 'IpBasedEnabled'.
     */
    @JsonProperty(value = "properties.sslState")
    private SslState sslState;

    /**
     * SSL certificate thumbprint.
     */
    @JsonProperty(value = "properties.thumbprint")
    private String thumbprint;

    /**
     * Virtual IP address assigned to the hostname if IP based SSL is enabled.
     */
    @JsonProperty(value = "properties.virtualIP")
    private String virtualIP;

    /**
     * Get the hostNameBindingName value.
     *
     * @return the hostNameBindingName value
     */
    public String hostNameBindingName() {
        return this.hostNameBindingName;
    }

    /**
     * Set the hostNameBindingName value.
     *
     * @param hostNameBindingName the hostNameBindingName value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withHostNameBindingName(String hostNameBindingName) {
        this.hostNameBindingName = hostNameBindingName;
        return this;
    }

    /**
     * Get the siteName value.
     *
     * @return the siteName value
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Set the siteName value.
     *
     * @param siteName the siteName value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * Get the domainId value.
     *
     * @return the domainId value
     */
    public String domainId() {
        return this.domainId;
    }

    /**
     * Set the domainId value.
     *
     * @param domainId the domainId value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * Get the azureResourceName value.
     *
     * @return the azureResourceName value
     */
    public String azureResourceName() {
        return this.azureResourceName;
    }

    /**
     * Set the azureResourceName value.
     *
     * @param azureResourceName the azureResourceName value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withAzureResourceName(String azureResourceName) {
        this.azureResourceName = azureResourceName;
        return this;
    }

    /**
     * Get the azureResourceType value.
     *
     * @return the azureResourceType value
     */
    public AzureResourceType azureResourceType() {
        return this.azureResourceType;
    }

    /**
     * Set the azureResourceType value.
     *
     * @param azureResourceType the azureResourceType value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withAzureResourceType(AzureResourceType azureResourceType) {
        this.azureResourceType = azureResourceType;
        return this;
    }

    /**
     * Get the customHostNameDnsRecordType value.
     *
     * @return the customHostNameDnsRecordType value
     */
    public CustomHostNameDnsRecordType customHostNameDnsRecordType() {
        return this.customHostNameDnsRecordType;
    }

    /**
     * Set the customHostNameDnsRecordType value.
     *
     * @param customHostNameDnsRecordType the customHostNameDnsRecordType value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withCustomHostNameDnsRecordType(CustomHostNameDnsRecordType customHostNameDnsRecordType) {
        this.customHostNameDnsRecordType = customHostNameDnsRecordType;
        return this;
    }

    /**
     * Get the hostNameType value.
     *
     * @return the hostNameType value
     */
    public HostNameType hostNameType() {
        return this.hostNameType;
    }

    /**
     * Set the hostNameType value.
     *
     * @param hostNameType the hostNameType value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withHostNameType(HostNameType hostNameType) {
        this.hostNameType = hostNameType;
        return this;
    }

    /**
     * Get the sslState value.
     *
     * @return the sslState value
     */
    public SslState sslState() {
        return this.sslState;
    }

    /**
     * Set the sslState value.
     *
     * @param sslState the sslState value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withSslState(SslState sslState) {
        this.sslState = sslState;
        return this;
    }

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
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the virtualIP value.
     *
     * @return the virtualIP value
     */
    public String virtualIP() {
        return this.virtualIP;
    }

    /**
     * Set the virtualIP value.
     *
     * @param virtualIP the virtualIP value to set
     * @return the HostNameBindingInner object itself.
     */
    public HostNameBindingInner withVirtualIP(String virtualIP) {
        this.virtualIP = virtualIP;
        return this;
    }

}
