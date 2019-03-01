/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for task that migrates SQL Server databases to Azure SQL Database
 * Managed Instance.
 */
public class MigrateSqlServerSqlMITaskInput extends SqlMigrationTaskInput {
    /**
     * Databases to migrate.
     */
    @JsonProperty(value = "selectedDatabases", required = true)
    private List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases;

    /**
     * Logins to migrate.
     */
    @JsonProperty(value = "selectedLogins")
    private List<String> selectedLogins;

    /**
     * Agent Jobs to migrate.
     */
    @JsonProperty(value = "selectedAgentJobs")
    private List<String> selectedAgentJobs;

    /**
     * Backup file share information for all selected databases.
     */
    @JsonProperty(value = "backupFileShare")
    private FileShare backupFileShare;

    /**
     * SAS URI of Azure Storage Account Container to be used for storing backup
     * files.
     */
    @JsonProperty(value = "backupBlobShare", required = true)
    private BlobShare backupBlobShare;

    /**
     * Backup Mode to specify whether to use existing backup or create new
     * backup. If using existing backups, backup file paths are required to be
     * provided in selectedDatabases. Possible values include: 'CreateBackup',
     * 'ExistingBackup'.
     */
    @JsonProperty(value = "backupMode")
    private BackupMode backupMode;

    /**
     * Get databases to migrate.
     *
     * @return the selectedDatabases value
     */
    public List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Set databases to migrate.
     *
     * @param selectedDatabases the selectedDatabases value to set
     * @return the MigrateSqlServerSqlMITaskInput object itself.
     */
    public MigrateSqlServerSqlMITaskInput withSelectedDatabases(List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases) {
        this.selectedDatabases = selectedDatabases;
        return this;
    }

    /**
     * Get logins to migrate.
     *
     * @return the selectedLogins value
     */
    public List<String> selectedLogins() {
        return this.selectedLogins;
    }

    /**
     * Set logins to migrate.
     *
     * @param selectedLogins the selectedLogins value to set
     * @return the MigrateSqlServerSqlMITaskInput object itself.
     */
    public MigrateSqlServerSqlMITaskInput withSelectedLogins(List<String> selectedLogins) {
        this.selectedLogins = selectedLogins;
        return this;
    }

    /**
     * Get agent Jobs to migrate.
     *
     * @return the selectedAgentJobs value
     */
    public List<String> selectedAgentJobs() {
        return this.selectedAgentJobs;
    }

    /**
     * Set agent Jobs to migrate.
     *
     * @param selectedAgentJobs the selectedAgentJobs value to set
     * @return the MigrateSqlServerSqlMITaskInput object itself.
     */
    public MigrateSqlServerSqlMITaskInput withSelectedAgentJobs(List<String> selectedAgentJobs) {
        this.selectedAgentJobs = selectedAgentJobs;
        return this;
    }

    /**
     * Get backup file share information for all selected databases.
     *
     * @return the backupFileShare value
     */
    public FileShare backupFileShare() {
        return this.backupFileShare;
    }

    /**
     * Set backup file share information for all selected databases.
     *
     * @param backupFileShare the backupFileShare value to set
     * @return the MigrateSqlServerSqlMITaskInput object itself.
     */
    public MigrateSqlServerSqlMITaskInput withBackupFileShare(FileShare backupFileShare) {
        this.backupFileShare = backupFileShare;
        return this;
    }

    /**
     * Get sAS URI of Azure Storage Account Container to be used for storing backup files.
     *
     * @return the backupBlobShare value
     */
    public BlobShare backupBlobShare() {
        return this.backupBlobShare;
    }

    /**
     * Set sAS URI of Azure Storage Account Container to be used for storing backup files.
     *
     * @param backupBlobShare the backupBlobShare value to set
     * @return the MigrateSqlServerSqlMITaskInput object itself.
     */
    public MigrateSqlServerSqlMITaskInput withBackupBlobShare(BlobShare backupBlobShare) {
        this.backupBlobShare = backupBlobShare;
        return this;
    }

    /**
     * Get backup Mode to specify whether to use existing backup or create new backup. If using existing backups, backup file paths are required to be provided in selectedDatabases. Possible values include: 'CreateBackup', 'ExistingBackup'.
     *
     * @return the backupMode value
     */
    public BackupMode backupMode() {
        return this.backupMode;
    }

    /**
     * Set backup Mode to specify whether to use existing backup or create new backup. If using existing backups, backup file paths are required to be provided in selectedDatabases. Possible values include: 'CreateBackup', 'ExistingBackup'.
     *
     * @param backupMode the backupMode value to set
     * @return the MigrateSqlServerSqlMITaskInput object itself.
     */
    public MigrateSqlServerSqlMITaskInput withBackupMode(BackupMode backupMode) {
        this.backupMode = backupMode;
        return this;
    }

}
