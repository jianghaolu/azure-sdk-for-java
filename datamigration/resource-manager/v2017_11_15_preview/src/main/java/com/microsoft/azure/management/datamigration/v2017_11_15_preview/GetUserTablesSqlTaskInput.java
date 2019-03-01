/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for the task that collects user tables for the given list of
 * databases.
 */
public class GetUserTablesSqlTaskInput {
    /**
     * Connection information for SQL Server.
     */
    @JsonProperty(value = "connectionInfo", required = true)
    private SqlConnectionInfo connectionInfo;

    /**
     * List of database names to collect tables for.
     */
    @JsonProperty(value = "selectedDatabases", required = true)
    private List<String> selectedDatabases;

    /**
     * Get connection information for SQL Server.
     *
     * @return the connectionInfo value
     */
    public SqlConnectionInfo connectionInfo() {
        return this.connectionInfo;
    }

    /**
     * Set connection information for SQL Server.
     *
     * @param connectionInfo the connectionInfo value to set
     * @return the GetUserTablesSqlTaskInput object itself.
     */
    public GetUserTablesSqlTaskInput withConnectionInfo(SqlConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    /**
     * Get list of database names to collect tables for.
     *
     * @return the selectedDatabases value
     */
    public List<String> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Set list of database names to collect tables for.
     *
     * @param selectedDatabases the selectedDatabases value to set
     * @return the GetUserTablesSqlTaskInput object itself.
     */
    public GetUserTablesSqlTaskInput withSelectedDatabases(List<String> selectedDatabases) {
        this.selectedDatabases = selectedDatabases;
        return this;
    }

}
