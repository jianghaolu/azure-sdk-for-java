// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Copy activity sources of tabular type. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = TabularSource.class)
@JsonTypeName("TabularSource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureTableSource", value = AzureTableSource.class),
    @JsonSubTypes.Type(name = "InformixSource", value = InformixSource.class),
    @JsonSubTypes.Type(name = "Db2Source", value = Db2Source.class),
    @JsonSubTypes.Type(name = "OdbcSource", value = OdbcSource.class),
    @JsonSubTypes.Type(name = "MySqlSource", value = MySqlSource.class),
    @JsonSubTypes.Type(name = "PostgreSqlSource", value = PostgreSqlSource.class),
    @JsonSubTypes.Type(name = "SybaseSource", value = SybaseSource.class),
    @JsonSubTypes.Type(name = "SapBwSource", value = SapBwSource.class),
    @JsonSubTypes.Type(name = "SalesforceSource", value = SalesforceSource.class),
    @JsonSubTypes.Type(name = "SapCloudForCustomerSource", value = SapCloudForCustomerSource.class),
    @JsonSubTypes.Type(name = "SapEccSource", value = SapEccSource.class),
    @JsonSubTypes.Type(name = "SapHanaSource", value = SapHanaSource.class),
    @JsonSubTypes.Type(name = "SapOpenHubSource", value = SapOpenHubSource.class),
    @JsonSubTypes.Type(name = "SapTableSource", value = SapTableSource.class),
    @JsonSubTypes.Type(name = "SqlSource", value = SqlSource.class),
    @JsonSubTypes.Type(name = "SqlServerSource", value = SqlServerSource.class),
    @JsonSubTypes.Type(name = "AzureSqlSource", value = AzureSqlSource.class),
    @JsonSubTypes.Type(name = "SqlMISource", value = SqlMISource.class),
    @JsonSubTypes.Type(name = "SqlDWSource", value = SqlDWSource.class),
    @JsonSubTypes.Type(name = "AzureMySqlSource", value = AzureMySqlSource.class),
    @JsonSubTypes.Type(name = "TeradataSource", value = TeradataSource.class),
    @JsonSubTypes.Type(name = "CassandraSource", value = CassandraSource.class),
    @JsonSubTypes.Type(name = "AmazonMWSSource", value = AmazonMwsSource.class),
    @JsonSubTypes.Type(name = "AzurePostgreSqlSource", value = AzurePostgreSqlSource.class),
    @JsonSubTypes.Type(name = "ConcurSource", value = ConcurSource.class),
    @JsonSubTypes.Type(name = "CouchbaseSource", value = CouchbaseSource.class),
    @JsonSubTypes.Type(name = "DrillSource", value = DrillSource.class),
    @JsonSubTypes.Type(name = "EloquaSource", value = EloquaSource.class),
    @JsonSubTypes.Type(name = "GoogleBigQuerySource", value = GoogleBigQuerySource.class),
    @JsonSubTypes.Type(name = "GreenplumSource", value = GreenplumSource.class),
    @JsonSubTypes.Type(name = "HBaseSource", value = HBaseSource.class),
    @JsonSubTypes.Type(name = "HiveSource", value = HiveSource.class),
    @JsonSubTypes.Type(name = "HubspotSource", value = HubspotSource.class),
    @JsonSubTypes.Type(name = "ImpalaSource", value = ImpalaSource.class),
    @JsonSubTypes.Type(name = "JiraSource", value = JiraSource.class),
    @JsonSubTypes.Type(name = "MagentoSource", value = MagentoSource.class),
    @JsonSubTypes.Type(name = "MariaDBSource", value = MariaDBSource.class),
    @JsonSubTypes.Type(name = "AzureMariaDBSource", value = AzureMariaDBSource.class),
    @JsonSubTypes.Type(name = "MarketoSource", value = MarketoSource.class),
    @JsonSubTypes.Type(name = "PaypalSource", value = PaypalSource.class),
    @JsonSubTypes.Type(name = "PhoenixSource", value = PhoenixSource.class),
    @JsonSubTypes.Type(name = "PrestoSource", value = PrestoSource.class),
    @JsonSubTypes.Type(name = "QuickBooksSource", value = QuickBooksSource.class),
    @JsonSubTypes.Type(name = "ServiceNowSource", value = ServiceNowSource.class),
    @JsonSubTypes.Type(name = "ShopifySource", value = ShopifySource.class),
    @JsonSubTypes.Type(name = "SparkSource", value = SparkSource.class),
    @JsonSubTypes.Type(name = "SquareSource", value = SquareSource.class),
    @JsonSubTypes.Type(name = "XeroSource", value = XeroSource.class),
    @JsonSubTypes.Type(name = "ZohoSource", value = ZohoSource.class),
    @JsonSubTypes.Type(name = "NetezzaSource", value = NetezzaSource.class),
    @JsonSubTypes.Type(name = "VerticaSource", value = VerticaSource.class),
    @JsonSubTypes.Type(name = "SalesforceMarketingCloudSource", value = SalesforceMarketingCloudSource.class),
    @JsonSubTypes.Type(name = "ResponsysSource", value = ResponsysSource.class),
    @JsonSubTypes.Type(name = "DynamicsAXSource", value = DynamicsAXSource.class),
    @JsonSubTypes.Type(name = "OracleServiceCloudSource", value = OracleServiceCloudSource.class),
    @JsonSubTypes.Type(name = "GoogleAdWordsSource", value = GoogleAdWordsSource.class),
    @JsonSubTypes.Type(name = "AmazonRedshiftSource", value = AmazonRedshiftSource.class)
})
@Fluent
public class TabularSource extends CopySource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TabularSource.class);

    /*
     * Query timeout. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "queryTimeout")
    private Object queryTimeout;

    /*
     * Specifies the additional columns to be added to source data. Type: array
     * of objects (or Expression with resultType array of objects).
     */
    @JsonProperty(value = "additionalColumns")
    private List<AdditionalColumns> additionalColumns;

    /**
     * Get the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the queryTimeout value.
     */
    public Object queryTimeout() {
        return this.queryTimeout;
    }

    /**
     * Set the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param queryTimeout the queryTimeout value to set.
     * @return the TabularSource object itself.
     */
    public TabularSource withQueryTimeout(Object queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects (or Expression with resultType array of objects).
     *
     * @return the additionalColumns value.
     */
    public List<AdditionalColumns> additionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects (or Expression with resultType array of objects).
     *
     * @param additionalColumns the additionalColumns value to set.
     * @return the TabularSource object itself.
     */
    public TabularSource withAdditionalColumns(List<AdditionalColumns> additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TabularSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TabularSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TabularSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TabularSource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (additionalColumns() != null) {
            additionalColumns().forEach(e -> e.validate());
        }
    }
}
