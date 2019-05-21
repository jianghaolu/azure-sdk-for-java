/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Parameters to create and update Cosmos DB database accounts.
 */
@JsonFlatten
@SkipParentValidation
public class DatabaseAccountCreateUpdateParameters extends Resource {
    /**
     * Indicates the type of database account. This can only be set at database
     * account creation. Possible values include: 'GlobalDocumentDB',
     * 'MongoDB', 'Parse'.
     */
    @JsonProperty(value = "kind")
    private DatabaseAccountKind kind;

    /**
     * The consistency policy for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.consistencyPolicy")
    private ConsistencyPolicy consistencyPolicy;

    /**
     * An array that contains the georeplication locations enabled for the
     * Cosmos DB account.
     */
    @JsonProperty(value = "properties.locations", required = true)
    private List<Location> locations;

    /**
     * The offer type for the database.
     */
    @JsonProperty(value = "properties.databaseAccountOfferType", required = true)
    private String databaseAccountOfferType;

    /**
     * Cosmos DB Firewall Support: This value specifies the set of IP addresses
     * or IP address ranges in CIDR form to be included as the allowed list of
     * client IPs for a given database account. IP addresses/ranges must be
     * comma separated and must not contain any spaces.
     */
    @JsonProperty(value = "properties.ipRangeFilter")
    private String ipRangeFilter;

    /**
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     */
    @JsonProperty(value = "properties.isVirtualNetworkFilterEnabled")
    private Boolean isVirtualNetworkFilterEnabled;

    /**
     * Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will
     * result in a new write region for the account and is chosen based on the
     * failover priorities configured for the account.
     */
    @JsonProperty(value = "properties.enableAutomaticFailover")
    private Boolean enableAutomaticFailover;

    /**
     * List of Cosmos DB capabilities for the account.
     */
    @JsonProperty(value = "properties.capabilities")
    private List<Capability> capabilities;

    /**
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /**
     * Enables the account to write in multiple locations.
     */
    @JsonProperty(value = "properties.enableMultipleWriteLocations")
    private Boolean enableMultipleWriteLocations;

    /**
     * Creates an instance of DatabaseAccountCreateUpdateParameters class.
     * @param locations an array that contains the georeplication locations enabled for the Cosmos DB account.
     */
    public DatabaseAccountCreateUpdateParameters() {
        databaseAccountOfferType = "Standard";
    }

    /**
     * Get indicates the type of database account. This can only be set at database account creation. Possible values include: 'GlobalDocumentDB', 'MongoDB', 'Parse'.
     *
     * @return the kind value
     */
    public DatabaseAccountKind kind() {
        return this.kind;
    }

    /**
     * Set indicates the type of database account. This can only be set at database account creation. Possible values include: 'GlobalDocumentDB', 'MongoDB', 'Parse'.
     *
     * @param kind the kind value to set
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withKind(DatabaseAccountKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the consistency policy for the Cosmos DB account.
     *
     * @return the consistencyPolicy value
     */
    public ConsistencyPolicy consistencyPolicy() {
        return this.consistencyPolicy;
    }

    /**
     * Set the consistency policy for the Cosmos DB account.
     *
     * @param consistencyPolicy the consistencyPolicy value to set
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        this.consistencyPolicy = consistencyPolicy;
        return this;
    }

    /**
     * Get an array that contains the georeplication locations enabled for the Cosmos DB account.
     *
     * @return the locations value
     */
    public List<Location> locations() {
        return this.locations;
    }

    /**
     * Set an array that contains the georeplication locations enabled for the Cosmos DB account.
     *
     * @param locations the locations value to set
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the offer type for the database.
     *
     * @return the databaseAccountOfferType value
     */
    public String databaseAccountOfferType() {
        return this.databaseAccountOfferType;
    }

    /**
     * Set the offer type for the database.
     *
     * @param databaseAccountOfferType the databaseAccountOfferType value to set
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withDatabaseAccountOfferType(String databaseAccountOfferType) {
        this.databaseAccountOfferType = databaseAccountOfferType;
        return this;
    }

    /**
     * Get cosmos DB Firewall Support: This value specifies the set of IP addresses or IP address ranges in CIDR form to be included as the allowed list of client IPs for a given database account. IP addresses/ranges must be comma separated and must not contain any spaces.
     *
     * @return the ipRangeFilter value
     */
    public String ipRangeFilter() {
        return this.ipRangeFilter;
    }

    /**
     * Set cosmos DB Firewall Support: This value specifies the set of IP addresses or IP address ranges in CIDR form to be included as the allowed list of client IPs for a given database account. IP addresses/ranges must be comma separated and must not contain any spaces.
     *
     * @param ipRangeFilter the ipRangeFilter value to set
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withIpRangeFilter(String ipRangeFilter) {
        this.ipRangeFilter = ipRangeFilter;
        return this;
    }

    /**
     * Get flag to indicate whether to enable/disable Virtual Network ACL rules.
     *
     * @return the isVirtualNetworkFilterEnabled value
     */
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled;
    }

    /**
     * Set flag to indicate whether to enable/disable Virtual Network ACL rules.
     *
     * @param isVirtualNetworkFilterEnabled the isVirtualNetworkFilterEnabled value to set
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled) {
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        return this;
    }

    /**
     * Get enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     *
     * @return the enableAutomaticFailover value
     */
    public Boolean enableAutomaticFailover() {
        return this.enableAutomaticFailover;
    }

    /**
     * Set enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     *
     * @param enableAutomaticFailover the enableAutomaticFailover value to set
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        this.enableAutomaticFailover = enableAutomaticFailover;
        return this;
    }

    /**
     * Get list of Cosmos DB capabilities for the account.
     *
     * @return the capabilities value
     */
    public List<Capability> capabilities() {
        return this.capabilities;
    }

    /**
     * Set list of Cosmos DB capabilities for the account.
     *
     * @param capabilities the capabilities value to set
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withCapabilities(List<Capability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get list of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @return the virtualNetworkRules value
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set list of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get enables the account to write in multiple locations.
     *
     * @return the enableMultipleWriteLocations value
     */
    public Boolean enableMultipleWriteLocations() {
        return this.enableMultipleWriteLocations;
    }

    /**
     * Set enables the account to write in multiple locations.
     *
     * @param enableMultipleWriteLocations the enableMultipleWriteLocations value to set
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations) {
        this.enableMultipleWriteLocations = enableMultipleWriteLocations;
        return this;
    }

}
