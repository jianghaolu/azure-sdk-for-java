/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.SqlDatabaseGetPropertiesResource;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.SqlDatabaseGetPropertiesOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ARMResourceProperties;

/**
 * An Azure Cosmos DB SQL database.
 */
@JsonFlatten
public class SqlDatabaseGetResultsInner extends ARMResourceProperties {
    /**
     * The resource property.
     */
    @JsonProperty(value = "properties.resource")
    private SqlDatabaseGetPropertiesResource resource;

    /**
     * The options property.
     */
    @JsonProperty(value = "properties.options")
    private SqlDatabaseGetPropertiesOptions options;

    /**
     * Get the resource value.
     *
     * @return the resource value
     */
    public SqlDatabaseGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource value.
     *
     * @param resource the resource value to set
     * @return the SqlDatabaseGetResultsInner object itself.
     */
    public SqlDatabaseGetResultsInner withResource(SqlDatabaseGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options value.
     *
     * @return the options value
     */
    public SqlDatabaseGetPropertiesOptions options() {
        return this.options;
    }

    /**
     * Set the options value.
     *
     * @param options the options value to set
     * @return the SqlDatabaseGetResultsInner object itself.
     */
    public SqlDatabaseGetResultsInner withOptions(SqlDatabaseGetPropertiesOptions options) {
        this.options = options;
        return this;
    }

}
