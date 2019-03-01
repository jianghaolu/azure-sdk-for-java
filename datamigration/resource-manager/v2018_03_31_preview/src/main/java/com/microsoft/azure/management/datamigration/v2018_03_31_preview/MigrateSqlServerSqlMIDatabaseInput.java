/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database specific information for SQL to Azure SQL DB Managed Instance
 * migration task inputs.
 */
public class MigrateSqlServerSqlMIDatabaseInput {
    /**
     * Name of the database.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Name of the database at destination.
     */
    @JsonProperty(value = "restoreDatabaseName", required = true)
    private String restoreDatabaseName;

    /**
     * Backup file share information for backing up this database.
     */
    @JsonProperty(value = "backupFileShare")
    private FileShare backupFileShare;

    /**
     * Get name of the database.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the database.
     *
     * @param name the name value to set
     * @return the MigrateSqlServerSqlMIDatabaseInput object itself.
     */
    public MigrateSqlServerSqlMIDatabaseInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name of the database at destination.
     *
     * @return the restoreDatabaseName value
     */
    public String restoreDatabaseName() {
        return this.restoreDatabaseName;
    }

    /**
     * Set name of the database at destination.
     *
     * @param restoreDatabaseName the restoreDatabaseName value to set
     * @return the MigrateSqlServerSqlMIDatabaseInput object itself.
     */
    public MigrateSqlServerSqlMIDatabaseInput withRestoreDatabaseName(String restoreDatabaseName) {
        this.restoreDatabaseName = restoreDatabaseName;
        return this;
    }

    /**
     * Get backup file share information for backing up this database.
     *
     * @return the backupFileShare value
     */
    public FileShare backupFileShare() {
        return this.backupFileShare;
    }

    /**
     * Set backup file share information for backing up this database.
     *
     * @param backupFileShare the backupFileShare value to set
     * @return the MigrateSqlServerSqlMIDatabaseInput object itself.
     */
    public MigrateSqlServerSqlMIDatabaseInput withBackupFileShare(FileShare backupFileShare) {
        this.backupFileShare = backupFileShare;
        return this;
    }

}
