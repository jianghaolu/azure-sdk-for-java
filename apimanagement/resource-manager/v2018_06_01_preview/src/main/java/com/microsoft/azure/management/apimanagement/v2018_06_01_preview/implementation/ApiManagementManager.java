/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Apis;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiRevisions;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiReleases;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiOperations;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiOperationPolicys;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Tags;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiProducts;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiPolicys;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiSchemas;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiDiagnostics;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiIssues;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiIssueComments;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiIssueAttachments;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.TagDescriptions;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Operations;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.AuthorizationServers;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Backends;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Caches;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Certificates;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiManagementOperations;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiManagementServiceSkus;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiManagementServices;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Diagnostics;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.EmailTemplates;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Groups;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.GroupUsers;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.IdentityProviders;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Issues;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Loggers;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Notifications;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.NotificationRecipientUsers;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.NotificationRecipientEmails;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.NetworkStatus;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.OpenIdConnectProviders;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Policys;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.PolicySnippets;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.SignInSettings;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.SignUpSettings;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.DelegationSettings;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Products;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ProductApis;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ProductGroups;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ProductSubscriptions;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ProductPolicys;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Propertys;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.QuotaByCounterKeys;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.QuotaByPeriodKeys;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Regions;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Reports;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Subscriptions;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.TagResources;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.TenantAccess;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.TenantAccessGits;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.TenantConfigurations;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Users;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.UserGroups;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.UserSubscriptions;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.UserIdentities;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.UserConfirmationPasswords;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiVersionSets;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiExports;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure ApiManagement resource management.
 */
public final class ApiManagementManager extends ManagerCore<ApiManagementManager, ApiManagementClientImpl> {
    private Apis apis;
    private ApiRevisions apiRevisions;
    private ApiReleases apiReleases;
    private ApiOperations apiOperations;
    private ApiOperationPolicys apiOperationPolicys;
    private Tags tags;
    private ApiProducts apiProducts;
    private ApiPolicys apiPolicys;
    private ApiSchemas apiSchemas;
    private ApiDiagnostics apiDiagnostics;
    private ApiIssues apiIssues;
    private ApiIssueComments apiIssueComments;
    private ApiIssueAttachments apiIssueAttachments;
    private TagDescriptions tagDescriptions;
    private Operations operations;
    private AuthorizationServers authorizationServers;
    private Backends backends;
    private Caches caches;
    private Certificates certificates;
    private ApiManagementOperations apiManagementOperations;
    private ApiManagementServiceSkus apiManagementServiceSkus;
    private ApiManagementServices apiManagementServices;
    private Diagnostics diagnostics;
    private EmailTemplates emailTemplates;
    private Groups groups;
    private GroupUsers groupUsers;
    private IdentityProviders identityProviders;
    private Issues issues;
    private Loggers loggers;
    private Notifications notifications;
    private NotificationRecipientUsers notificationRecipientUsers;
    private NotificationRecipientEmails notificationRecipientEmails;
    private NetworkStatus networkStatus;
    private OpenIdConnectProviders openIdConnectProviders;
    private Policys policys;
    private PolicySnippets policySnippets;
    private SignInSettings signInSettings;
    private SignUpSettings signUpSettings;
    private DelegationSettings delegationSettings;
    private Products products;
    private ProductApis productApis;
    private ProductGroups productGroups;
    private ProductSubscriptions productSubscriptions;
    private ProductPolicys productPolicys;
    private Propertys propertys;
    private QuotaByCounterKeys quotaByCounterKeys;
    private QuotaByPeriodKeys quotaByPeriodKeys;
    private Regions regions;
    private Reports reports;
    private Subscriptions subscriptions;
    private TagResources tagResources;
    private TenantAccess tenantAccess;
    private TenantAccessGits tenantAccessGits;
    private TenantConfigurations tenantConfigurations;
    private Users users;
    private UserGroups userGroups;
    private UserSubscriptions userSubscriptions;
    private UserIdentities userIdentities;
    private UserConfirmationPasswords userConfirmationPasswords;
    private ApiVersionSets apiVersionSets;
    private ApiExports apiExports;
    /**
    * Get a Configurable instance that can be used to create ApiManagementManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new ApiManagementManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of ApiManagementManager that exposes ApiManagement resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the ApiManagementManager
    */
    public static ApiManagementManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new ApiManagementManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of ApiManagementManager that exposes ApiManagement resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the ApiManagementManager
    */
    public static ApiManagementManager authenticate(RestClient restClient, String subscriptionId) {
        return new ApiManagementManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of ApiManagementManager that exposes ApiManagement management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing ApiManagement management API entry points that work across subscriptions
        */
        ApiManagementManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Apis.
     */
    public Apis apis() {
        if (this.apis == null) {
            this.apis = new ApisImpl(this);
        }
        return this.apis;
    }

    /**
     * @return Entry point to manage ApiRevisions.
     */
    public ApiRevisions apiRevisions() {
        if (this.apiRevisions == null) {
            this.apiRevisions = new ApiRevisionsImpl(this);
        }
        return this.apiRevisions;
    }

    /**
     * @return Entry point to manage ApiReleases.
     */
    public ApiReleases apiReleases() {
        if (this.apiReleases == null) {
            this.apiReleases = new ApiReleasesImpl(this);
        }
        return this.apiReleases;
    }

    /**
     * @return Entry point to manage ApiOperations.
     */
    public ApiOperations apiOperations() {
        if (this.apiOperations == null) {
            this.apiOperations = new ApiOperationsImpl(this);
        }
        return this.apiOperations;
    }

    /**
     * @return Entry point to manage ApiOperationPolicys.
     */
    public ApiOperationPolicys apiOperationPolicys() {
        if (this.apiOperationPolicys == null) {
            this.apiOperationPolicys = new ApiOperationPolicysImpl(this);
        }
        return this.apiOperationPolicys;
    }

    /**
     * @return Entry point to manage Tags.
     */
    public Tags tags() {
        if (this.tags == null) {
            this.tags = new TagsImpl(this);
        }
        return this.tags;
    }

    /**
     * @return Entry point to manage ApiProducts.
     */
    public ApiProducts apiProducts() {
        if (this.apiProducts == null) {
            this.apiProducts = new ApiProductsImpl(this);
        }
        return this.apiProducts;
    }

    /**
     * @return Entry point to manage ApiPolicys.
     */
    public ApiPolicys apiPolicys() {
        if (this.apiPolicys == null) {
            this.apiPolicys = new ApiPolicysImpl(this);
        }
        return this.apiPolicys;
    }

    /**
     * @return Entry point to manage ApiSchemas.
     */
    public ApiSchemas apiSchemas() {
        if (this.apiSchemas == null) {
            this.apiSchemas = new ApiSchemasImpl(this);
        }
        return this.apiSchemas;
    }

    /**
     * @return Entry point to manage ApiDiagnostics.
     */
    public ApiDiagnostics apiDiagnostics() {
        if (this.apiDiagnostics == null) {
            this.apiDiagnostics = new ApiDiagnosticsImpl(this);
        }
        return this.apiDiagnostics;
    }

    /**
     * @return Entry point to manage ApiIssues.
     */
    public ApiIssues apiIssues() {
        if (this.apiIssues == null) {
            this.apiIssues = new ApiIssuesImpl(this);
        }
        return this.apiIssues;
    }

    /**
     * @return Entry point to manage ApiIssueComments.
     */
    public ApiIssueComments apiIssueComments() {
        if (this.apiIssueComments == null) {
            this.apiIssueComments = new ApiIssueCommentsImpl(this);
        }
        return this.apiIssueComments;
    }

    /**
     * @return Entry point to manage ApiIssueAttachments.
     */
    public ApiIssueAttachments apiIssueAttachments() {
        if (this.apiIssueAttachments == null) {
            this.apiIssueAttachments = new ApiIssueAttachmentsImpl(this);
        }
        return this.apiIssueAttachments;
    }

    /**
     * @return Entry point to manage TagDescriptions.
     */
    public TagDescriptions tagDescriptions() {
        if (this.tagDescriptions == null) {
            this.tagDescriptions = new TagDescriptionsImpl(this);
        }
        return this.tagDescriptions;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage AuthorizationServers.
     */
    public AuthorizationServers authorizationServers() {
        if (this.authorizationServers == null) {
            this.authorizationServers = new AuthorizationServersImpl(this);
        }
        return this.authorizationServers;
    }

    /**
     * @return Entry point to manage Backends.
     */
    public Backends backends() {
        if (this.backends == null) {
            this.backends = new BackendsImpl(this);
        }
        return this.backends;
    }

    /**
     * @return Entry point to manage Caches.
     */
    public Caches caches() {
        if (this.caches == null) {
            this.caches = new CachesImpl(this);
        }
        return this.caches;
    }

    /**
     * @return Entry point to manage Certificates.
     */
    public Certificates certificates() {
        if (this.certificates == null) {
            this.certificates = new CertificatesImpl(this);
        }
        return this.certificates;
    }

    /**
     * @return Entry point to manage ApiManagementOperations.
     */
    public ApiManagementOperations apiManagementOperations() {
        if (this.apiManagementOperations == null) {
            this.apiManagementOperations = new ApiManagementOperationsImpl(this);
        }
        return this.apiManagementOperations;
    }

    /**
     * @return Entry point to manage ApiManagementServiceSkus.
     */
    public ApiManagementServiceSkus apiManagementServiceSkus() {
        if (this.apiManagementServiceSkus == null) {
            this.apiManagementServiceSkus = new ApiManagementServiceSkusImpl(this);
        }
        return this.apiManagementServiceSkus;
    }

    /**
     * @return Entry point to manage ApiManagementServices.
     */
    public ApiManagementServices apiManagementServices() {
        if (this.apiManagementServices == null) {
            this.apiManagementServices = new ApiManagementServicesImpl(this);
        }
        return this.apiManagementServices;
    }

    /**
     * @return Entry point to manage Diagnostics.
     */
    public Diagnostics diagnostics() {
        if (this.diagnostics == null) {
            this.diagnostics = new DiagnosticsImpl(this);
        }
        return this.diagnostics;
    }

    /**
     * @return Entry point to manage EmailTemplates.
     */
    public EmailTemplates emailTemplates() {
        if (this.emailTemplates == null) {
            this.emailTemplates = new EmailTemplatesImpl(this);
        }
        return this.emailTemplates;
    }

    /**
     * @return Entry point to manage Groups.
     */
    public Groups groups() {
        if (this.groups == null) {
            this.groups = new GroupsImpl(this);
        }
        return this.groups;
    }

    /**
     * @return Entry point to manage GroupUsers.
     */
    public GroupUsers groupUsers() {
        if (this.groupUsers == null) {
            this.groupUsers = new GroupUsersImpl(this);
        }
        return this.groupUsers;
    }

    /**
     * @return Entry point to manage IdentityProviders.
     */
    public IdentityProviders identityProviders() {
        if (this.identityProviders == null) {
            this.identityProviders = new IdentityProvidersImpl(this);
        }
        return this.identityProviders;
    }

    /**
     * @return Entry point to manage Issues.
     */
    public Issues issues() {
        if (this.issues == null) {
            this.issues = new IssuesImpl(this);
        }
        return this.issues;
    }

    /**
     * @return Entry point to manage Loggers.
     */
    public Loggers loggers() {
        if (this.loggers == null) {
            this.loggers = new LoggersImpl(this);
        }
        return this.loggers;
    }

    /**
     * @return Entry point to manage Notifications.
     */
    public Notifications notifications() {
        if (this.notifications == null) {
            this.notifications = new NotificationsImpl(this);
        }
        return this.notifications;
    }

    /**
     * @return Entry point to manage NotificationRecipientUsers.
     */
    public NotificationRecipientUsers notificationRecipientUsers() {
        if (this.notificationRecipientUsers == null) {
            this.notificationRecipientUsers = new NotificationRecipientUsersImpl(this);
        }
        return this.notificationRecipientUsers;
    }

    /**
     * @return Entry point to manage NotificationRecipientEmails.
     */
    public NotificationRecipientEmails notificationRecipientEmails() {
        if (this.notificationRecipientEmails == null) {
            this.notificationRecipientEmails = new NotificationRecipientEmailsImpl(this);
        }
        return this.notificationRecipientEmails;
    }

    /**
     * @return Entry point to manage NetworkStatus.
     */
    public NetworkStatus networkStatus() {
        if (this.networkStatus == null) {
            this.networkStatus = new NetworkStatusImpl(this);
        }
        return this.networkStatus;
    }

    /**
     * @return Entry point to manage OpenIdConnectProviders.
     */
    public OpenIdConnectProviders openIdConnectProviders() {
        if (this.openIdConnectProviders == null) {
            this.openIdConnectProviders = new OpenIdConnectProvidersImpl(this);
        }
        return this.openIdConnectProviders;
    }

    /**
     * @return Entry point to manage Policys.
     */
    public Policys policys() {
        if (this.policys == null) {
            this.policys = new PolicysImpl(this);
        }
        return this.policys;
    }

    /**
     * @return Entry point to manage PolicySnippets.
     */
    public PolicySnippets policySnippets() {
        if (this.policySnippets == null) {
            this.policySnippets = new PolicySnippetsImpl(this);
        }
        return this.policySnippets;
    }

    /**
     * @return Entry point to manage SignInSettings.
     */
    public SignInSettings signInSettings() {
        if (this.signInSettings == null) {
            this.signInSettings = new SignInSettingsImpl(this);
        }
        return this.signInSettings;
    }

    /**
     * @return Entry point to manage SignUpSettings.
     */
    public SignUpSettings signUpSettings() {
        if (this.signUpSettings == null) {
            this.signUpSettings = new SignUpSettingsImpl(this);
        }
        return this.signUpSettings;
    }

    /**
     * @return Entry point to manage DelegationSettings.
     */
    public DelegationSettings delegationSettings() {
        if (this.delegationSettings == null) {
            this.delegationSettings = new DelegationSettingsImpl(this);
        }
        return this.delegationSettings;
    }

    /**
     * @return Entry point to manage Products.
     */
    public Products products() {
        if (this.products == null) {
            this.products = new ProductsImpl(this);
        }
        return this.products;
    }

    /**
     * @return Entry point to manage ProductApis.
     */
    public ProductApis productApis() {
        if (this.productApis == null) {
            this.productApis = new ProductApisImpl(this);
        }
        return this.productApis;
    }

    /**
     * @return Entry point to manage ProductGroups.
     */
    public ProductGroups productGroups() {
        if (this.productGroups == null) {
            this.productGroups = new ProductGroupsImpl(this);
        }
        return this.productGroups;
    }

    /**
     * @return Entry point to manage ProductSubscriptions.
     */
    public ProductSubscriptions productSubscriptions() {
        if (this.productSubscriptions == null) {
            this.productSubscriptions = new ProductSubscriptionsImpl(this);
        }
        return this.productSubscriptions;
    }

    /**
     * @return Entry point to manage ProductPolicys.
     */
    public ProductPolicys productPolicys() {
        if (this.productPolicys == null) {
            this.productPolicys = new ProductPolicysImpl(this);
        }
        return this.productPolicys;
    }

    /**
     * @return Entry point to manage Propertys.
     */
    public Propertys propertys() {
        if (this.propertys == null) {
            this.propertys = new PropertysImpl(this);
        }
        return this.propertys;
    }

    /**
     * @return Entry point to manage QuotaByCounterKeys.
     */
    public QuotaByCounterKeys quotaByCounterKeys() {
        if (this.quotaByCounterKeys == null) {
            this.quotaByCounterKeys = new QuotaByCounterKeysImpl(this);
        }
        return this.quotaByCounterKeys;
    }

    /**
     * @return Entry point to manage QuotaByPeriodKeys.
     */
    public QuotaByPeriodKeys quotaByPeriodKeys() {
        if (this.quotaByPeriodKeys == null) {
            this.quotaByPeriodKeys = new QuotaByPeriodKeysImpl(this);
        }
        return this.quotaByPeriodKeys;
    }

    /**
     * @return Entry point to manage Regions.
     */
    public Regions regions() {
        if (this.regions == null) {
            this.regions = new RegionsImpl(this);
        }
        return this.regions;
    }

    /**
     * @return Entry point to manage Reports.
     */
    public Reports reports() {
        if (this.reports == null) {
            this.reports = new ReportsImpl(this);
        }
        return this.reports;
    }

    /**
     * @return Entry point to manage Subscriptions.
     */
    public Subscriptions subscriptions() {
        if (this.subscriptions == null) {
            this.subscriptions = new SubscriptionsImpl(this);
        }
        return this.subscriptions;
    }

    /**
     * @return Entry point to manage TagResources.
     */
    public TagResources tagResources() {
        if (this.tagResources == null) {
            this.tagResources = new TagResourcesImpl(this);
        }
        return this.tagResources;
    }

    /**
     * @return Entry point to manage TenantAccess.
     */
    public TenantAccess tenantAccess() {
        if (this.tenantAccess == null) {
            this.tenantAccess = new TenantAccessImpl(this);
        }
        return this.tenantAccess;
    }

    /**
     * @return Entry point to manage TenantAccessGits.
     */
    public TenantAccessGits tenantAccessGits() {
        if (this.tenantAccessGits == null) {
            this.tenantAccessGits = new TenantAccessGitsImpl(this);
        }
        return this.tenantAccessGits;
    }

    /**
     * @return Entry point to manage TenantConfigurations.
     */
    public TenantConfigurations tenantConfigurations() {
        if (this.tenantConfigurations == null) {
            this.tenantConfigurations = new TenantConfigurationsImpl(this);
        }
        return this.tenantConfigurations;
    }

    /**
     * @return Entry point to manage Users.
     */
    public Users users() {
        if (this.users == null) {
            this.users = new UsersImpl(this);
        }
        return this.users;
    }

    /**
     * @return Entry point to manage UserGroups.
     */
    public UserGroups userGroups() {
        if (this.userGroups == null) {
            this.userGroups = new UserGroupsImpl(this);
        }
        return this.userGroups;
    }

    /**
     * @return Entry point to manage UserSubscriptions.
     */
    public UserSubscriptions userSubscriptions() {
        if (this.userSubscriptions == null) {
            this.userSubscriptions = new UserSubscriptionsImpl(this);
        }
        return this.userSubscriptions;
    }

    /**
     * @return Entry point to manage UserIdentities.
     */
    public UserIdentities userIdentities() {
        if (this.userIdentities == null) {
            this.userIdentities = new UserIdentitiesImpl(this);
        }
        return this.userIdentities;
    }

    /**
     * @return Entry point to manage UserConfirmationPasswords.
     */
    public UserConfirmationPasswords userConfirmationPasswords() {
        if (this.userConfirmationPasswords == null) {
            this.userConfirmationPasswords = new UserConfirmationPasswordsImpl(this);
        }
        return this.userConfirmationPasswords;
    }

    /**
     * @return Entry point to manage ApiVersionSets.
     */
    public ApiVersionSets apiVersionSets() {
        if (this.apiVersionSets == null) {
            this.apiVersionSets = new ApiVersionSetsImpl(this);
        }
        return this.apiVersionSets;
    }

    /**
     * @return Entry point to manage ApiExports.
     */
    public ApiExports apiExports() {
        if (this.apiExports == null) {
            this.apiExports = new ApiExportsImpl(this);
        }
        return this.apiExports;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public ApiManagementManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return ApiManagementManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private ApiManagementManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new ApiManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
