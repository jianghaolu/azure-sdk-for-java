/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the SqlManagementClientImpl class.
 */
public class SqlManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription ID that identifies an Azure subscription. */
    private String subscriptionId;

    /**
     * Gets The subscription ID that identifies an Azure subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription ID that identifies an Azure subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The API version to use for the request. */
    private String apiVersion;

    /**
     * Gets The API version to use for the request.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ExtendedDatabaseBlobAuditingPoliciesInner object to access its operations.
     */
    private ExtendedDatabaseBlobAuditingPoliciesInner extendedDatabaseBlobAuditingPolicies;

    /**
     * Gets the ExtendedDatabaseBlobAuditingPoliciesInner object to access its operations.
     * @return the ExtendedDatabaseBlobAuditingPoliciesInner object.
     */
    public ExtendedDatabaseBlobAuditingPoliciesInner extendedDatabaseBlobAuditingPolicies() {
        return this.extendedDatabaseBlobAuditingPolicies;
    }

    /**
     * The ExtendedServerBlobAuditingPoliciesInner object to access its operations.
     */
    private ExtendedServerBlobAuditingPoliciesInner extendedServerBlobAuditingPolicies;

    /**
     * Gets the ExtendedServerBlobAuditingPoliciesInner object to access its operations.
     * @return the ExtendedServerBlobAuditingPoliciesInner object.
     */
    public ExtendedServerBlobAuditingPoliciesInner extendedServerBlobAuditingPolicies() {
        return this.extendedServerBlobAuditingPolicies;
    }

    /**
     * The ServerBlobAuditingPoliciesInner object to access its operations.
     */
    private ServerBlobAuditingPoliciesInner serverBlobAuditingPolicies;

    /**
     * Gets the ServerBlobAuditingPoliciesInner object to access its operations.
     * @return the ServerBlobAuditingPoliciesInner object.
     */
    public ServerBlobAuditingPoliciesInner serverBlobAuditingPolicies() {
        return this.serverBlobAuditingPolicies;
    }

    /**
     * The DatabaseBlobAuditingPoliciesInner object to access its operations.
     */
    private DatabaseBlobAuditingPoliciesInner databaseBlobAuditingPolicies;

    /**
     * Gets the DatabaseBlobAuditingPoliciesInner object to access its operations.
     * @return the DatabaseBlobAuditingPoliciesInner object.
     */
    public DatabaseBlobAuditingPoliciesInner databaseBlobAuditingPolicies() {
        return this.databaseBlobAuditingPolicies;
    }

    /**
     * The DatabaseOperationsInner object to access its operations.
     */
    private DatabaseOperationsInner databaseOperations;

    /**
     * Gets the DatabaseOperationsInner object to access its operations.
     * @return the DatabaseOperationsInner object.
     */
    public DatabaseOperationsInner databaseOperations() {
        return this.databaseOperations;
    }

    /**
     * The DatabasesInner object to access its operations.
     */
    private DatabasesInner databases;

    /**
     * Gets the DatabasesInner object to access its operations.
     * @return the DatabasesInner object.
     */
    public DatabasesInner databases() {
        return this.databases;
    }

    /**
     * The DatabaseVulnerabilityAssessmentRuleBaselinesInner object to access its operations.
     */
    private DatabaseVulnerabilityAssessmentRuleBaselinesInner databaseVulnerabilityAssessmentRuleBaselines;

    /**
     * Gets the DatabaseVulnerabilityAssessmentRuleBaselinesInner object to access its operations.
     * @return the DatabaseVulnerabilityAssessmentRuleBaselinesInner object.
     */
    public DatabaseVulnerabilityAssessmentRuleBaselinesInner databaseVulnerabilityAssessmentRuleBaselines() {
        return this.databaseVulnerabilityAssessmentRuleBaselines;
    }

    /**
     * The DatabaseVulnerabilityAssessmentsInner object to access its operations.
     */
    private DatabaseVulnerabilityAssessmentsInner databaseVulnerabilityAssessments;

    /**
     * Gets the DatabaseVulnerabilityAssessmentsInner object to access its operations.
     * @return the DatabaseVulnerabilityAssessmentsInner object.
     */
    public DatabaseVulnerabilityAssessmentsInner databaseVulnerabilityAssessments() {
        return this.databaseVulnerabilityAssessments;
    }

    /**
     * The DataWarehouseUserActivitiesInner object to access its operations.
     */
    private DataWarehouseUserActivitiesInner dataWarehouseUserActivities;

    /**
     * Gets the DataWarehouseUserActivitiesInner object to access its operations.
     * @return the DataWarehouseUserActivitiesInner object.
     */
    public DataWarehouseUserActivitiesInner dataWarehouseUserActivities() {
        return this.dataWarehouseUserActivities;
    }

    /**
     * The JobAgentsInner object to access its operations.
     */
    private JobAgentsInner jobAgents;

    /**
     * Gets the JobAgentsInner object to access its operations.
     * @return the JobAgentsInner object.
     */
    public JobAgentsInner jobAgents() {
        return this.jobAgents;
    }

    /**
     * The JobCredentialsInner object to access its operations.
     */
    private JobCredentialsInner jobCredentials;

    /**
     * Gets the JobCredentialsInner object to access its operations.
     * @return the JobCredentialsInner object.
     */
    public JobCredentialsInner jobCredentials() {
        return this.jobCredentials;
    }

    /**
     * The JobExecutionsInner object to access its operations.
     */
    private JobExecutionsInner jobExecutions;

    /**
     * Gets the JobExecutionsInner object to access its operations.
     * @return the JobExecutionsInner object.
     */
    public JobExecutionsInner jobExecutions() {
        return this.jobExecutions;
    }

    /**
     * The JobsInner object to access its operations.
     */
    private JobsInner jobs;

    /**
     * Gets the JobsInner object to access its operations.
     * @return the JobsInner object.
     */
    public JobsInner jobs() {
        return this.jobs;
    }

    /**
     * The JobStepExecutionsInner object to access its operations.
     */
    private JobStepExecutionsInner jobStepExecutions;

    /**
     * Gets the JobStepExecutionsInner object to access its operations.
     * @return the JobStepExecutionsInner object.
     */
    public JobStepExecutionsInner jobStepExecutions() {
        return this.jobStepExecutions;
    }

    /**
     * The JobStepsInner object to access its operations.
     */
    private JobStepsInner jobSteps;

    /**
     * Gets the JobStepsInner object to access its operations.
     * @return the JobStepsInner object.
     */
    public JobStepsInner jobSteps() {
        return this.jobSteps;
    }

    /**
     * The JobTargetExecutionsInner object to access its operations.
     */
    private JobTargetExecutionsInner jobTargetExecutions;

    /**
     * Gets the JobTargetExecutionsInner object to access its operations.
     * @return the JobTargetExecutionsInner object.
     */
    public JobTargetExecutionsInner jobTargetExecutions() {
        return this.jobTargetExecutions;
    }

    /**
     * The JobTargetGroupsInner object to access its operations.
     */
    private JobTargetGroupsInner jobTargetGroups;

    /**
     * Gets the JobTargetGroupsInner object to access its operations.
     * @return the JobTargetGroupsInner object.
     */
    public JobTargetGroupsInner jobTargetGroups() {
        return this.jobTargetGroups;
    }

    /**
     * The JobVersionsInner object to access its operations.
     */
    private JobVersionsInner jobVersions;

    /**
     * Gets the JobVersionsInner object to access its operations.
     * @return the JobVersionsInner object.
     */
    public JobVersionsInner jobVersions() {
        return this.jobVersions;
    }

    /**
     * The LongTermRetentionBackupsInner object to access its operations.
     */
    private LongTermRetentionBackupsInner longTermRetentionBackups;

    /**
     * Gets the LongTermRetentionBackupsInner object to access its operations.
     * @return the LongTermRetentionBackupsInner object.
     */
    public LongTermRetentionBackupsInner longTermRetentionBackups() {
        return this.longTermRetentionBackups;
    }

    /**
     * The BackupLongTermRetentionPoliciesInner object to access its operations.
     */
    private BackupLongTermRetentionPoliciesInner backupLongTermRetentionPolicies;

    /**
     * Gets the BackupLongTermRetentionPoliciesInner object to access its operations.
     * @return the BackupLongTermRetentionPoliciesInner object.
     */
    public BackupLongTermRetentionPoliciesInner backupLongTermRetentionPolicies() {
        return this.backupLongTermRetentionPolicies;
    }

    /**
     * The ManagedBackupShortTermRetentionPoliciesInner object to access its operations.
     */
    private ManagedBackupShortTermRetentionPoliciesInner managedBackupShortTermRetentionPolicies;

    /**
     * Gets the ManagedBackupShortTermRetentionPoliciesInner object to access its operations.
     * @return the ManagedBackupShortTermRetentionPoliciesInner object.
     */
    public ManagedBackupShortTermRetentionPoliciesInner managedBackupShortTermRetentionPolicies() {
        return this.managedBackupShortTermRetentionPolicies;
    }

    /**
     * The ManagedDatabasesInner object to access its operations.
     */
    private ManagedDatabasesInner managedDatabases;

    /**
     * Gets the ManagedDatabasesInner object to access its operations.
     * @return the ManagedDatabasesInner object.
     */
    public ManagedDatabasesInner managedDatabases() {
        return this.managedDatabases;
    }

    /**
     * The RestorePointsInner object to access its operations.
     */
    private RestorePointsInner restorePoints;

    /**
     * Gets the RestorePointsInner object to access its operations.
     * @return the RestorePointsInner object.
     */
    public RestorePointsInner restorePoints() {
        return this.restorePoints;
    }

    /**
     * The ServerAutomaticTuningsInner object to access its operations.
     */
    private ServerAutomaticTuningsInner serverAutomaticTunings;

    /**
     * Gets the ServerAutomaticTuningsInner object to access its operations.
     * @return the ServerAutomaticTuningsInner object.
     */
    public ServerAutomaticTuningsInner serverAutomaticTunings() {
        return this.serverAutomaticTunings;
    }

    /**
     * The ServerDnsAliasesInner object to access its operations.
     */
    private ServerDnsAliasesInner serverDnsAliases;

    /**
     * Gets the ServerDnsAliasesInner object to access its operations.
     * @return the ServerDnsAliasesInner object.
     */
    public ServerDnsAliasesInner serverDnsAliases() {
        return this.serverDnsAliases;
    }

    /**
     * The ServerSecurityAlertPoliciesInner object to access its operations.
     */
    private ServerSecurityAlertPoliciesInner serverSecurityAlertPolicies;

    /**
     * Gets the ServerSecurityAlertPoliciesInner object to access its operations.
     * @return the ServerSecurityAlertPoliciesInner object.
     */
    public ServerSecurityAlertPoliciesInner serverSecurityAlertPolicies() {
        return this.serverSecurityAlertPolicies;
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public SqlManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public SqlManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public SqlManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2017-03-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.extendedDatabaseBlobAuditingPolicies = new ExtendedDatabaseBlobAuditingPoliciesInner(restClient().retrofit(), this);
        this.extendedServerBlobAuditingPolicies = new ExtendedServerBlobAuditingPoliciesInner(restClient().retrofit(), this);
        this.serverBlobAuditingPolicies = new ServerBlobAuditingPoliciesInner(restClient().retrofit(), this);
        this.databaseBlobAuditingPolicies = new DatabaseBlobAuditingPoliciesInner(restClient().retrofit(), this);
        this.databaseOperations = new DatabaseOperationsInner(restClient().retrofit(), this);
        this.databases = new DatabasesInner(restClient().retrofit(), this);
        this.databaseVulnerabilityAssessmentRuleBaselines = new DatabaseVulnerabilityAssessmentRuleBaselinesInner(restClient().retrofit(), this);
        this.databaseVulnerabilityAssessments = new DatabaseVulnerabilityAssessmentsInner(restClient().retrofit(), this);
        this.dataWarehouseUserActivities = new DataWarehouseUserActivitiesInner(restClient().retrofit(), this);
        this.jobAgents = new JobAgentsInner(restClient().retrofit(), this);
        this.jobCredentials = new JobCredentialsInner(restClient().retrofit(), this);
        this.jobExecutions = new JobExecutionsInner(restClient().retrofit(), this);
        this.jobs = new JobsInner(restClient().retrofit(), this);
        this.jobStepExecutions = new JobStepExecutionsInner(restClient().retrofit(), this);
        this.jobSteps = new JobStepsInner(restClient().retrofit(), this);
        this.jobTargetExecutions = new JobTargetExecutionsInner(restClient().retrofit(), this);
        this.jobTargetGroups = new JobTargetGroupsInner(restClient().retrofit(), this);
        this.jobVersions = new JobVersionsInner(restClient().retrofit(), this);
        this.longTermRetentionBackups = new LongTermRetentionBackupsInner(restClient().retrofit(), this);
        this.backupLongTermRetentionPolicies = new BackupLongTermRetentionPoliciesInner(restClient().retrofit(), this);
        this.managedBackupShortTermRetentionPolicies = new ManagedBackupShortTermRetentionPoliciesInner(restClient().retrofit(), this);
        this.managedDatabases = new ManagedDatabasesInner(restClient().retrofit(), this);
        this.restorePoints = new RestorePointsInner(restClient().retrofit(), this);
        this.serverAutomaticTunings = new ServerAutomaticTuningsInner(restClient().retrofit(), this);
        this.serverDnsAliases = new ServerDnsAliasesInner(restClient().retrofit(), this);
        this.serverSecurityAlertPolicies = new ServerSecurityAlertPoliciesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "SqlManagementClient", "2017-03-01-preview");
    }
}
