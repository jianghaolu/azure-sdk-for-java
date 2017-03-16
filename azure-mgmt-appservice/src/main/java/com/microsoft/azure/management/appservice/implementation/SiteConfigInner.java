/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.NameValuePair;
import com.microsoft.azure.management.appservice.ConnStringInfo;
import com.microsoft.azure.management.appservice.SiteMachineKey;
import com.microsoft.azure.management.appservice.HandlerMapping;
import com.microsoft.azure.management.appservice.ScmType;
import com.microsoft.azure.management.appservice.ManagedPipelineMode;
import com.microsoft.azure.management.appservice.VirtualApplication;
import com.microsoft.azure.management.appservice.SiteLoadBalancing;
import com.microsoft.azure.management.appservice.Experiments;
import com.microsoft.azure.management.appservice.SiteLimits;
import com.microsoft.azure.management.appservice.AutoHealRules;
import com.microsoft.azure.management.appservice.CorsSettings;
import com.microsoft.azure.management.appservice.ApiDefinitionInfo;
import com.microsoft.azure.management.appservice.IpSecurityRestriction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Configuration of an App Service app.
 */
@JsonFlatten
public class SiteConfigInner extends Resource {
    /**
     * Number of workers.
     */
    @JsonProperty(value = "properties.numberOfWorkers")
    private Integer numberOfWorkers;

    /**
     * Default documents.
     */
    @JsonProperty(value = "properties.defaultDocuments")
    private List<String> defaultDocuments;

    /**
     * .NET Framework version.
     */
    @JsonProperty(value = "properties.netFrameworkVersion")
    private String netFrameworkVersion;

    /**
     * Version of PHP.
     */
    @JsonProperty(value = "properties.phpVersion")
    private String phpVersion;

    /**
     * Version of Python.
     */
    @JsonProperty(value = "properties.pythonVersion")
    private String pythonVersion;

    /**
     * Version of Node.js.
     */
    @JsonProperty(value = "properties.nodeVersion")
    private String nodeVersion;

    /**
     * Linux App Framework and version.
     */
    @JsonProperty(value = "properties.linuxFxVersion")
    private String linuxFxVersion;

    /**
     * &lt;code&gt;true&lt;/code&gt; if request tracing is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.requestTracingEnabled")
    private Boolean requestTracingEnabled;

    /**
     * Request tracing expiration time.
     */
    @JsonProperty(value = "properties.requestTracingExpirationTime")
    private DateTime requestTracingExpirationTime;

    /**
     * &lt;code&gt;true&lt;/code&gt; if remote debugging is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.remoteDebuggingEnabled")
    private Boolean remoteDebuggingEnabled;

    /**
     * Remote debugging version.
     */
    @JsonProperty(value = "properties.remoteDebuggingVersion")
    private String remoteDebuggingVersion;

    /**
     * &lt;code&gt;true&lt;/code&gt; if HTTP logging is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.httpLoggingEnabled")
    private Boolean httpLoggingEnabled;

    /**
     * HTTP logs directory size limit.
     */
    @JsonProperty(value = "properties.logsDirectorySizeLimit")
    private Integer logsDirectorySizeLimit;

    /**
     * &lt;code&gt;true&lt;/code&gt; if detailed error logging is enabled;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.detailedErrorLoggingEnabled")
    private Boolean detailedErrorLoggingEnabled;

    /**
     * Publishing user name.
     */
    @JsonProperty(value = "properties.publishingUsername")
    private String publishingUsername;

    /**
     * Application settings.
     */
    @JsonProperty(value = "properties.appSettings")
    private List<NameValuePair> appSettings;

    /**
     * Connection strings.
     */
    @JsonProperty(value = "properties.connectionStrings")
    private List<ConnStringInfo> connectionStrings;

    /**
     * Site MachineKey.
     */
    @JsonProperty(value = "properties.machineKey", access = JsonProperty.Access.WRITE_ONLY)
    private SiteMachineKey machineKey;

    /**
     * Handler mappings.
     */
    @JsonProperty(value = "properties.handlerMappings")
    private List<HandlerMapping> handlerMappings;

    /**
     * Document root.
     */
    @JsonProperty(value = "properties.documentRoot")
    private String documentRoot;

    /**
     * SCM type. Possible values include: 'None', 'Dropbox', 'Tfs', 'LocalGit',
     * 'GitHub', 'CodePlexGit', 'CodePlexHg', 'BitbucketGit', 'BitbucketHg',
     * 'ExternalGit', 'ExternalHg', 'OneDrive', 'VSO'.
     */
    @JsonProperty(value = "properties.scmType")
    private ScmType scmType;

    /**
     * &lt;code&gt;true&lt;/code&gt; to use 32-bit worker process; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.use32BitWorkerProcess")
    private Boolean use32BitWorkerProcess;

    /**
     * &lt;code&gt;true&lt;/code&gt; if WebSocket is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.webSocketsEnabled")
    private Boolean webSocketsEnabled;

    /**
     * &lt;code&gt;true&lt;/code&gt; if Always On is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.alwaysOn")
    private Boolean alwaysOn;

    /**
     * Java version.
     */
    @JsonProperty(value = "properties.javaVersion")
    private String javaVersion;

    /**
     * Java container.
     */
    @JsonProperty(value = "properties.javaContainer")
    private String javaContainer;

    /**
     * Java container version.
     */
    @JsonProperty(value = "properties.javaContainerVersion")
    private String javaContainerVersion;

    /**
     * App command line to launch.
     */
    @JsonProperty(value = "properties.appCommandLine")
    private String appCommandLine;

    /**
     * Managed pipeline mode. Possible values include: 'Integrated', 'Classic'.
     */
    @JsonProperty(value = "properties.managedPipelineMode")
    private ManagedPipelineMode managedPipelineMode;

    /**
     * Virtual applications.
     */
    @JsonProperty(value = "properties.virtualApplications")
    private List<VirtualApplication> virtualApplications;

    /**
     * Site load balancing. Possible values include: 'WeightedRoundRobin',
     * 'LeastRequests', 'LeastResponseTime', 'WeightedTotalTraffic',
     * 'RequestHash'.
     */
    @JsonProperty(value = "properties.loadBalancing")
    private SiteLoadBalancing loadBalancing;

    /**
     * This is work around for polymophic types.
     */
    @JsonProperty(value = "properties.experiments")
    private Experiments experiments;

    /**
     * Site limits.
     */
    @JsonProperty(value = "properties.limits")
    private SiteLimits limits;

    /**
     * &lt;code&gt;true&lt;/code&gt; if Auto Heal is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.autoHealEnabled")
    private Boolean autoHealEnabled;

    /**
     * Auto Heal rules.
     */
    @JsonProperty(value = "properties.autoHealRules")
    private AutoHealRules autoHealRules;

    /**
     * Tracing options.
     */
    @JsonProperty(value = "properties.tracingOptions")
    private String tracingOptions;

    /**
     * Virtual Network name.
     */
    @JsonProperty(value = "properties.vnetName")
    private String vnetName;

    /**
     * Cross-Origin Resource Sharing (CORS) settings.
     */
    @JsonProperty(value = "properties.cors")
    private CorsSettings cors;

    /**
     * Push endpoint settings.
     */
    @JsonProperty(value = "properties.push")
    private PushSettingsInner push;

    /**
     * Information about the formal API definition for the app.
     */
    @JsonProperty(value = "properties.apiDefinition")
    private ApiDefinitionInfo apiDefinition;

    /**
     * Auto-swap slot name.
     */
    @JsonProperty(value = "properties.autoSwapSlotName")
    private String autoSwapSlotName;

    /**
     * &lt;code&gt;true&lt;/code&gt; to enable local MySQL; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.localMySqlEnabled")
    private Boolean localMySqlEnabled;

    /**
     * IP security restrictions.
     */
    @JsonProperty(value = "properties.ipSecurityRestrictions")
    private List<IpSecurityRestriction> ipSecurityRestrictions;

    /**
     * Get the numberOfWorkers value.
     *
     * @return the numberOfWorkers value
     */
    public Integer numberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * Set the numberOfWorkers value.
     *
     * @param numberOfWorkers the numberOfWorkers value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
        return this;
    }

    /**
     * Get the defaultDocuments value.
     *
     * @return the defaultDocuments value
     */
    public List<String> defaultDocuments() {
        return this.defaultDocuments;
    }

    /**
     * Set the defaultDocuments value.
     *
     * @param defaultDocuments the defaultDocuments value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withDefaultDocuments(List<String> defaultDocuments) {
        this.defaultDocuments = defaultDocuments;
        return this;
    }

    /**
     * Get the netFrameworkVersion value.
     *
     * @return the netFrameworkVersion value
     */
    public String netFrameworkVersion() {
        return this.netFrameworkVersion;
    }

    /**
     * Set the netFrameworkVersion value.
     *
     * @param netFrameworkVersion the netFrameworkVersion value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withNetFrameworkVersion(String netFrameworkVersion) {
        this.netFrameworkVersion = netFrameworkVersion;
        return this;
    }

    /**
     * Get the phpVersion value.
     *
     * @return the phpVersion value
     */
    public String phpVersion() {
        return this.phpVersion;
    }

    /**
     * Set the phpVersion value.
     *
     * @param phpVersion the phpVersion value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withPhpVersion(String phpVersion) {
        this.phpVersion = phpVersion;
        return this;
    }

    /**
     * Get the pythonVersion value.
     *
     * @return the pythonVersion value
     */
    public String pythonVersion() {
        return this.pythonVersion;
    }

    /**
     * Set the pythonVersion value.
     *
     * @param pythonVersion the pythonVersion value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withPythonVersion(String pythonVersion) {
        this.pythonVersion = pythonVersion;
        return this;
    }

    /**
     * Get the nodeVersion value.
     *
     * @return the nodeVersion value
     */
    public String nodeVersion() {
        return this.nodeVersion;
    }

    /**
     * Set the nodeVersion value.
     *
     * @param nodeVersion the nodeVersion value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withNodeVersion(String nodeVersion) {
        this.nodeVersion = nodeVersion;
        return this;
    }

    /**
     * Get the linuxFxVersion value.
     *
     * @return the linuxFxVersion value
     */
    public String linuxFxVersion() {
        return this.linuxFxVersion;
    }

    /**
     * Set the linuxFxVersion value.
     *
     * @param linuxFxVersion the linuxFxVersion value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withLinuxFxVersion(String linuxFxVersion) {
        this.linuxFxVersion = linuxFxVersion;
        return this;
    }

    /**
     * Get the requestTracingEnabled value.
     *
     * @return the requestTracingEnabled value
     */
    public Boolean requestTracingEnabled() {
        return this.requestTracingEnabled;
    }

    /**
     * Set the requestTracingEnabled value.
     *
     * @param requestTracingEnabled the requestTracingEnabled value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withRequestTracingEnabled(Boolean requestTracingEnabled) {
        this.requestTracingEnabled = requestTracingEnabled;
        return this;
    }

    /**
     * Get the requestTracingExpirationTime value.
     *
     * @return the requestTracingExpirationTime value
     */
    public DateTime requestTracingExpirationTime() {
        return this.requestTracingExpirationTime;
    }

    /**
     * Set the requestTracingExpirationTime value.
     *
     * @param requestTracingExpirationTime the requestTracingExpirationTime value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withRequestTracingExpirationTime(DateTime requestTracingExpirationTime) {
        this.requestTracingExpirationTime = requestTracingExpirationTime;
        return this;
    }

    /**
     * Get the remoteDebuggingEnabled value.
     *
     * @return the remoteDebuggingEnabled value
     */
    public Boolean remoteDebuggingEnabled() {
        return this.remoteDebuggingEnabled;
    }

    /**
     * Set the remoteDebuggingEnabled value.
     *
     * @param remoteDebuggingEnabled the remoteDebuggingEnabled value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withRemoteDebuggingEnabled(Boolean remoteDebuggingEnabled) {
        this.remoteDebuggingEnabled = remoteDebuggingEnabled;
        return this;
    }

    /**
     * Get the remoteDebuggingVersion value.
     *
     * @return the remoteDebuggingVersion value
     */
    public String remoteDebuggingVersion() {
        return this.remoteDebuggingVersion;
    }

    /**
     * Set the remoteDebuggingVersion value.
     *
     * @param remoteDebuggingVersion the remoteDebuggingVersion value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withRemoteDebuggingVersion(String remoteDebuggingVersion) {
        this.remoteDebuggingVersion = remoteDebuggingVersion;
        return this;
    }

    /**
     * Get the httpLoggingEnabled value.
     *
     * @return the httpLoggingEnabled value
     */
    public Boolean httpLoggingEnabled() {
        return this.httpLoggingEnabled;
    }

    /**
     * Set the httpLoggingEnabled value.
     *
     * @param httpLoggingEnabled the httpLoggingEnabled value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withHttpLoggingEnabled(Boolean httpLoggingEnabled) {
        this.httpLoggingEnabled = httpLoggingEnabled;
        return this;
    }

    /**
     * Get the logsDirectorySizeLimit value.
     *
     * @return the logsDirectorySizeLimit value
     */
    public Integer logsDirectorySizeLimit() {
        return this.logsDirectorySizeLimit;
    }

    /**
     * Set the logsDirectorySizeLimit value.
     *
     * @param logsDirectorySizeLimit the logsDirectorySizeLimit value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withLogsDirectorySizeLimit(Integer logsDirectorySizeLimit) {
        this.logsDirectorySizeLimit = logsDirectorySizeLimit;
        return this;
    }

    /**
     * Get the detailedErrorLoggingEnabled value.
     *
     * @return the detailedErrorLoggingEnabled value
     */
    public Boolean detailedErrorLoggingEnabled() {
        return this.detailedErrorLoggingEnabled;
    }

    /**
     * Set the detailedErrorLoggingEnabled value.
     *
     * @param detailedErrorLoggingEnabled the detailedErrorLoggingEnabled value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withDetailedErrorLoggingEnabled(Boolean detailedErrorLoggingEnabled) {
        this.detailedErrorLoggingEnabled = detailedErrorLoggingEnabled;
        return this;
    }

    /**
     * Get the publishingUsername value.
     *
     * @return the publishingUsername value
     */
    public String publishingUsername() {
        return this.publishingUsername;
    }

    /**
     * Set the publishingUsername value.
     *
     * @param publishingUsername the publishingUsername value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withPublishingUsername(String publishingUsername) {
        this.publishingUsername = publishingUsername;
        return this;
    }

    /**
     * Get the appSettings value.
     *
     * @return the appSettings value
     */
    public List<NameValuePair> appSettings() {
        return this.appSettings;
    }

    /**
     * Set the appSettings value.
     *
     * @param appSettings the appSettings value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withAppSettings(List<NameValuePair> appSettings) {
        this.appSettings = appSettings;
        return this;
    }

    /**
     * Get the connectionStrings value.
     *
     * @return the connectionStrings value
     */
    public List<ConnStringInfo> connectionStrings() {
        return this.connectionStrings;
    }

    /**
     * Set the connectionStrings value.
     *
     * @param connectionStrings the connectionStrings value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withConnectionStrings(List<ConnStringInfo> connectionStrings) {
        this.connectionStrings = connectionStrings;
        return this;
    }

    /**
     * Get the machineKey value.
     *
     * @return the machineKey value
     */
    public SiteMachineKey machineKey() {
        return this.machineKey;
    }

    /**
     * Get the handlerMappings value.
     *
     * @return the handlerMappings value
     */
    public List<HandlerMapping> handlerMappings() {
        return this.handlerMappings;
    }

    /**
     * Set the handlerMappings value.
     *
     * @param handlerMappings the handlerMappings value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withHandlerMappings(List<HandlerMapping> handlerMappings) {
        this.handlerMappings = handlerMappings;
        return this;
    }

    /**
     * Get the documentRoot value.
     *
     * @return the documentRoot value
     */
    public String documentRoot() {
        return this.documentRoot;
    }

    /**
     * Set the documentRoot value.
     *
     * @param documentRoot the documentRoot value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withDocumentRoot(String documentRoot) {
        this.documentRoot = documentRoot;
        return this;
    }

    /**
     * Get the scmType value.
     *
     * @return the scmType value
     */
    public ScmType scmType() {
        return this.scmType;
    }

    /**
     * Set the scmType value.
     *
     * @param scmType the scmType value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withScmType(ScmType scmType) {
        this.scmType = scmType;
        return this;
    }

    /**
     * Get the use32BitWorkerProcess value.
     *
     * @return the use32BitWorkerProcess value
     */
    public Boolean use32BitWorkerProcess() {
        return this.use32BitWorkerProcess;
    }

    /**
     * Set the use32BitWorkerProcess value.
     *
     * @param use32BitWorkerProcess the use32BitWorkerProcess value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withUse32BitWorkerProcess(Boolean use32BitWorkerProcess) {
        this.use32BitWorkerProcess = use32BitWorkerProcess;
        return this;
    }

    /**
     * Get the webSocketsEnabled value.
     *
     * @return the webSocketsEnabled value
     */
    public Boolean webSocketsEnabled() {
        return this.webSocketsEnabled;
    }

    /**
     * Set the webSocketsEnabled value.
     *
     * @param webSocketsEnabled the webSocketsEnabled value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withWebSocketsEnabled(Boolean webSocketsEnabled) {
        this.webSocketsEnabled = webSocketsEnabled;
        return this;
    }

    /**
     * Get the alwaysOn value.
     *
     * @return the alwaysOn value
     */
    public Boolean alwaysOn() {
        return this.alwaysOn;
    }

    /**
     * Set the alwaysOn value.
     *
     * @param alwaysOn the alwaysOn value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withAlwaysOn(Boolean alwaysOn) {
        this.alwaysOn = alwaysOn;
        return this;
    }

    /**
     * Get the javaVersion value.
     *
     * @return the javaVersion value
     */
    public String javaVersion() {
        return this.javaVersion;
    }

    /**
     * Set the javaVersion value.
     *
     * @param javaVersion the javaVersion value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
        return this;
    }

    /**
     * Get the javaContainer value.
     *
     * @return the javaContainer value
     */
    public String javaContainer() {
        return this.javaContainer;
    }

    /**
     * Set the javaContainer value.
     *
     * @param javaContainer the javaContainer value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withJavaContainer(String javaContainer) {
        this.javaContainer = javaContainer;
        return this;
    }

    /**
     * Get the javaContainerVersion value.
     *
     * @return the javaContainerVersion value
     */
    public String javaContainerVersion() {
        return this.javaContainerVersion;
    }

    /**
     * Set the javaContainerVersion value.
     *
     * @param javaContainerVersion the javaContainerVersion value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withJavaContainerVersion(String javaContainerVersion) {
        this.javaContainerVersion = javaContainerVersion;
        return this;
    }

    /**
     * Get the appCommandLine value.
     *
     * @return the appCommandLine value
     */
    public String appCommandLine() {
        return this.appCommandLine;
    }

    /**
     * Set the appCommandLine value.
     *
     * @param appCommandLine the appCommandLine value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withAppCommandLine(String appCommandLine) {
        this.appCommandLine = appCommandLine;
        return this;
    }

    /**
     * Get the managedPipelineMode value.
     *
     * @return the managedPipelineMode value
     */
    public ManagedPipelineMode managedPipelineMode() {
        return this.managedPipelineMode;
    }

    /**
     * Set the managedPipelineMode value.
     *
     * @param managedPipelineMode the managedPipelineMode value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withManagedPipelineMode(ManagedPipelineMode managedPipelineMode) {
        this.managedPipelineMode = managedPipelineMode;
        return this;
    }

    /**
     * Get the virtualApplications value.
     *
     * @return the virtualApplications value
     */
    public List<VirtualApplication> virtualApplications() {
        return this.virtualApplications;
    }

    /**
     * Set the virtualApplications value.
     *
     * @param virtualApplications the virtualApplications value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withVirtualApplications(List<VirtualApplication> virtualApplications) {
        this.virtualApplications = virtualApplications;
        return this;
    }

    /**
     * Get the loadBalancing value.
     *
     * @return the loadBalancing value
     */
    public SiteLoadBalancing loadBalancing() {
        return this.loadBalancing;
    }

    /**
     * Set the loadBalancing value.
     *
     * @param loadBalancing the loadBalancing value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withLoadBalancing(SiteLoadBalancing loadBalancing) {
        this.loadBalancing = loadBalancing;
        return this;
    }

    /**
     * Get the experiments value.
     *
     * @return the experiments value
     */
    public Experiments experiments() {
        return this.experiments;
    }

    /**
     * Set the experiments value.
     *
     * @param experiments the experiments value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withExperiments(Experiments experiments) {
        this.experiments = experiments;
        return this;
    }

    /**
     * Get the limits value.
     *
     * @return the limits value
     */
    public SiteLimits limits() {
        return this.limits;
    }

    /**
     * Set the limits value.
     *
     * @param limits the limits value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withLimits(SiteLimits limits) {
        this.limits = limits;
        return this;
    }

    /**
     * Get the autoHealEnabled value.
     *
     * @return the autoHealEnabled value
     */
    public Boolean autoHealEnabled() {
        return this.autoHealEnabled;
    }

    /**
     * Set the autoHealEnabled value.
     *
     * @param autoHealEnabled the autoHealEnabled value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withAutoHealEnabled(Boolean autoHealEnabled) {
        this.autoHealEnabled = autoHealEnabled;
        return this;
    }

    /**
     * Get the autoHealRules value.
     *
     * @return the autoHealRules value
     */
    public AutoHealRules autoHealRules() {
        return this.autoHealRules;
    }

    /**
     * Set the autoHealRules value.
     *
     * @param autoHealRules the autoHealRules value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withAutoHealRules(AutoHealRules autoHealRules) {
        this.autoHealRules = autoHealRules;
        return this;
    }

    /**
     * Get the tracingOptions value.
     *
     * @return the tracingOptions value
     */
    public String tracingOptions() {
        return this.tracingOptions;
    }

    /**
     * Set the tracingOptions value.
     *
     * @param tracingOptions the tracingOptions value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withTracingOptions(String tracingOptions) {
        this.tracingOptions = tracingOptions;
        return this;
    }

    /**
     * Get the vnetName value.
     *
     * @return the vnetName value
     */
    public String vnetName() {
        return this.vnetName;
    }

    /**
     * Set the vnetName value.
     *
     * @param vnetName the vnetName value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withVnetName(String vnetName) {
        this.vnetName = vnetName;
        return this;
    }

    /**
     * Get the cors value.
     *
     * @return the cors value
     */
    public CorsSettings cors() {
        return this.cors;
    }

    /**
     * Set the cors value.
     *
     * @param cors the cors value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withCors(CorsSettings cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the push value.
     *
     * @return the push value
     */
    public PushSettingsInner push() {
        return this.push;
    }

    /**
     * Set the push value.
     *
     * @param push the push value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withPush(PushSettingsInner push) {
        this.push = push;
        return this;
    }

    /**
     * Get the apiDefinition value.
     *
     * @return the apiDefinition value
     */
    public ApiDefinitionInfo apiDefinition() {
        return this.apiDefinition;
    }

    /**
     * Set the apiDefinition value.
     *
     * @param apiDefinition the apiDefinition value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withApiDefinition(ApiDefinitionInfo apiDefinition) {
        this.apiDefinition = apiDefinition;
        return this;
    }

    /**
     * Get the autoSwapSlotName value.
     *
     * @return the autoSwapSlotName value
     */
    public String autoSwapSlotName() {
        return this.autoSwapSlotName;
    }

    /**
     * Set the autoSwapSlotName value.
     *
     * @param autoSwapSlotName the autoSwapSlotName value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withAutoSwapSlotName(String autoSwapSlotName) {
        this.autoSwapSlotName = autoSwapSlotName;
        return this;
    }

    /**
     * Get the localMySqlEnabled value.
     *
     * @return the localMySqlEnabled value
     */
    public Boolean localMySqlEnabled() {
        return this.localMySqlEnabled;
    }

    /**
     * Set the localMySqlEnabled value.
     *
     * @param localMySqlEnabled the localMySqlEnabled value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withLocalMySqlEnabled(Boolean localMySqlEnabled) {
        this.localMySqlEnabled = localMySqlEnabled;
        return this;
    }

    /**
     * Get the ipSecurityRestrictions value.
     *
     * @return the ipSecurityRestrictions value
     */
    public List<IpSecurityRestriction> ipSecurityRestrictions() {
        return this.ipSecurityRestrictions;
    }

    /**
     * Set the ipSecurityRestrictions value.
     *
     * @param ipSecurityRestrictions the ipSecurityRestrictions value to set
     * @return the SiteConfigInner object itself.
     */
    public SiteConfigInner withIpSecurityRestrictions(List<IpSecurityRestriction> ipSecurityRestrictions) {
        this.ipSecurityRestrictions = ipSecurityRestrictions;
        return this;
    }

}
