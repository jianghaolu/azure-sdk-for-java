/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InMageAzureV2 provider specific settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageAzureV2")
public class InMageAzureV2ReplicationDetails extends ReplicationProviderSpecificSettings {
    /**
     * The infrastructure VM Id.
     */
    @JsonProperty(value = "infrastructureVmId")
    private String infrastructureVmId;

    /**
     * The vCenter infrastructure Id.
     */
    @JsonProperty(value = "vCenterInfrastructureId")
    private String vCenterInfrastructureId;

    /**
     * The protection stage.
     */
    @JsonProperty(value = "protectionStage")
    private String protectionStage;

    /**
     * The virtual machine Id.
     */
    @JsonProperty(value = "vmId")
    private String vmId;

    /**
     * The protection state for the vm.
     */
    @JsonProperty(value = "vmProtectionState")
    private String vmProtectionState;

    /**
     * The protection state description for the vm.
     */
    @JsonProperty(value = "vmProtectionStateDescription")
    private String vmProtectionStateDescription;

    /**
     * The resync progress percentage.
     */
    @JsonProperty(value = "resyncProgressPercentage")
    private Integer resyncProgressPercentage;

    /**
     * The RPO in seconds.
     */
    @JsonProperty(value = "rpoInSeconds")
    private Long rpoInSeconds;

    /**
     * The compressed data change rate in MB.
     */
    @JsonProperty(value = "compressedDataRateInMB")
    private Double compressedDataRateInMB;

    /**
     * The uncompressed data change rate in MB.
     */
    @JsonProperty(value = "uncompressedDataRateInMB")
    private Double uncompressedDataRateInMB;

    /**
     * The source IP address.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * The agent version.
     */
    @JsonProperty(value = "agentVersion")
    private String agentVersion;

    /**
     * Agent expiry date.
     */
    @JsonProperty(value = "agentExpiryDate")
    private DateTime agentExpiryDate;

    /**
     * A value indicating whether installed agent needs to be updated.
     */
    @JsonProperty(value = "isAgentUpdateRequired")
    private String isAgentUpdateRequired;

    /**
     * A value indicating whether the source server requires a restart after
     * update.
     */
    @JsonProperty(value = "isRebootAfterUpdateRequired")
    private String isRebootAfterUpdateRequired;

    /**
     * The last heartbeat received from the source server.
     */
    @JsonProperty(value = "lastHeartbeat")
    private DateTime lastHeartbeat;

    /**
     * The process server Id.
     */
    @JsonProperty(value = "processServerId")
    private String processServerId;

    /**
     * The multi vm group Id.
     */
    @JsonProperty(value = "multiVmGroupId")
    private String multiVmGroupId;

    /**
     * The multi vm group name.
     */
    @JsonProperty(value = "multiVmGroupName")
    private String multiVmGroupName;

    /**
     * A value indicating whether multi vm sync is enabled or disabled.
     */
    @JsonProperty(value = "multiVmSyncStatus")
    private String multiVmSyncStatus;

    /**
     * The list of protected disks.
     */
    @JsonProperty(value = "protectedDisks")
    private List<InMageAzureV2ProtectedDiskDetails> protectedDisks;

    /**
     * A value indicating whether any disk is resized for this VM.
     */
    @JsonProperty(value = "diskResized")
    private String diskResized;

    /**
     * The master target Id.
     */
    @JsonProperty(value = "masterTargetId")
    private String masterTargetId;

    /**
     * The CPU count of the VM on the primary side.
     */
    @JsonProperty(value = "sourceVmCpuCount")
    private Integer sourceVmCpuCount;

    /**
     * The RAM size of the VM on the primary side.
     */
    @JsonProperty(value = "sourceVmRamSizeInMB")
    private Integer sourceVmRamSizeInMB;

    /**
     * The type of the OS on the VM.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /**
     * The OS disk VHD name.
     */
    @JsonProperty(value = "vhdName")
    private String vhdName;

    /**
     * The id of the disk containing the OS.
     */
    @JsonProperty(value = "osDiskId")
    private String osDiskId;

    /**
     * Azure VM Disk details.
     */
    @JsonProperty(value = "azureVMDiskDetails")
    private List<AzureVmDiskDetails> azureVMDiskDetails;

    /**
     * Recovery Azure given name.
     */
    @JsonProperty(value = "recoveryAzureVMName")
    private String recoveryAzureVMName;

    /**
     * The Recovery Azure VM size.
     */
    @JsonProperty(value = "recoveryAzureVMSize")
    private String recoveryAzureVMSize;

    /**
     * The recovery Azure storage account.
     */
    @JsonProperty(value = "recoveryAzureStorageAccount")
    private String recoveryAzureStorageAccount;

    /**
     * The ARM id of the log storage account used for replication. This will be
     * set to null if no log storage account was provided during enable
     * protection.
     */
    @JsonProperty(value = "recoveryAzureLogStorageAccountId")
    private String recoveryAzureLogStorageAccountId;

    /**
     * The PE Network details.
     */
    @JsonProperty(value = "vmNics")
    private List<VMNicDetails> vmNics;

    /**
     * The selected recovery azure network Id.
     */
    @JsonProperty(value = "selectedRecoveryAzureNetworkId")
    private String selectedRecoveryAzureNetworkId;

    /**
     * The selected source nic Id which will be used as the primary nic during
     * failover.
     */
    @JsonProperty(value = "selectedSourceNicId")
    private String selectedSourceNicId;

    /**
     * A value indicating the discovery type of the machine. Value can be
     * vCenter or physical.
     */
    @JsonProperty(value = "discoveryType")
    private String discoveryType;

    /**
     * The selected option to enable RDP\SSH on target vm after failover.
     * String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     */
    @JsonProperty(value = "enableRdpOnTargetOption")
    private String enableRdpOnTargetOption;

    /**
     * The data stores of the on-premise machine. Value can be list of strings
     * that contain data store names.
     */
    @JsonProperty(value = "datastores")
    private List<String> datastores;

    /**
     * The ARM Id of the target Azure VM. This value will be null until the VM
     * is failed over. Only after failure it will be populated with the ARM Id
     * of the Azure VM.
     */
    @JsonProperty(value = "targetVmId")
    private String targetVmId;

    /**
     * The target resource group Id.
     */
    @JsonProperty(value = "recoveryAzureResourceGroupId")
    private String recoveryAzureResourceGroupId;

    /**
     * The recovery availability set Id.
     */
    @JsonProperty(value = "recoveryAvailabilitySetId")
    private String recoveryAvailabilitySetId;

    /**
     * A value indicating whether managed disks should be used during failover.
     */
    @JsonProperty(value = "useManagedDisks")
    private String useManagedDisks;

    /**
     * License Type of the VM to be used.
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /**
     * The validation errors of the on-premise machine Value can be list of
     * validation errors.
     */
    @JsonProperty(value = "validationErrors")
    private List<HealthError> validationErrors;

    /**
     * The last RPO calculated time.
     */
    @JsonProperty(value = "lastRpoCalculatedTime")
    private DateTime lastRpoCalculatedTime;

    /**
     * The last update time received from on-prem components.
     */
    @JsonProperty(value = "lastUpdateReceivedTime")
    private DateTime lastUpdateReceivedTime;

    /**
     * The replica id of the protected item.
     */
    @JsonProperty(value = "replicaId")
    private String replicaId;

    /**
     * The OS Version of the protected item.
     */
    @JsonProperty(value = "osVersion")
    private String osVersion;

    /**
     * Get the infrastructure VM Id.
     *
     * @return the infrastructureVmId value
     */
    public String infrastructureVmId() {
        return this.infrastructureVmId;
    }

    /**
     * Set the infrastructure VM Id.
     *
     * @param infrastructureVmId the infrastructureVmId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withInfrastructureVmId(String infrastructureVmId) {
        this.infrastructureVmId = infrastructureVmId;
        return this;
    }

    /**
     * Get the vCenter infrastructure Id.
     *
     * @return the vCenterInfrastructureId value
     */
    public String vCenterInfrastructureId() {
        return this.vCenterInfrastructureId;
    }

    /**
     * Set the vCenter infrastructure Id.
     *
     * @param vCenterInfrastructureId the vCenterInfrastructureId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withVCenterInfrastructureId(String vCenterInfrastructureId) {
        this.vCenterInfrastructureId = vCenterInfrastructureId;
        return this;
    }

    /**
     * Get the protection stage.
     *
     * @return the protectionStage value
     */
    public String protectionStage() {
        return this.protectionStage;
    }

    /**
     * Set the protection stage.
     *
     * @param protectionStage the protectionStage value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withProtectionStage(String protectionStage) {
        this.protectionStage = protectionStage;
        return this;
    }

    /**
     * Get the virtual machine Id.
     *
     * @return the vmId value
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Set the virtual machine Id.
     *
     * @param vmId the vmId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * Get the protection state for the vm.
     *
     * @return the vmProtectionState value
     */
    public String vmProtectionState() {
        return this.vmProtectionState;
    }

    /**
     * Set the protection state for the vm.
     *
     * @param vmProtectionState the vmProtectionState value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withVmProtectionState(String vmProtectionState) {
        this.vmProtectionState = vmProtectionState;
        return this;
    }

    /**
     * Get the protection state description for the vm.
     *
     * @return the vmProtectionStateDescription value
     */
    public String vmProtectionStateDescription() {
        return this.vmProtectionStateDescription;
    }

    /**
     * Set the protection state description for the vm.
     *
     * @param vmProtectionStateDescription the vmProtectionStateDescription value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withVmProtectionStateDescription(String vmProtectionStateDescription) {
        this.vmProtectionStateDescription = vmProtectionStateDescription;
        return this;
    }

    /**
     * Get the resync progress percentage.
     *
     * @return the resyncProgressPercentage value
     */
    public Integer resyncProgressPercentage() {
        return this.resyncProgressPercentage;
    }

    /**
     * Set the resync progress percentage.
     *
     * @param resyncProgressPercentage the resyncProgressPercentage value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withResyncProgressPercentage(Integer resyncProgressPercentage) {
        this.resyncProgressPercentage = resyncProgressPercentage;
        return this;
    }

    /**
     * Get the RPO in seconds.
     *
     * @return the rpoInSeconds value
     */
    public Long rpoInSeconds() {
        return this.rpoInSeconds;
    }

    /**
     * Set the RPO in seconds.
     *
     * @param rpoInSeconds the rpoInSeconds value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withRpoInSeconds(Long rpoInSeconds) {
        this.rpoInSeconds = rpoInSeconds;
        return this;
    }

    /**
     * Get the compressed data change rate in MB.
     *
     * @return the compressedDataRateInMB value
     */
    public Double compressedDataRateInMB() {
        return this.compressedDataRateInMB;
    }

    /**
     * Set the compressed data change rate in MB.
     *
     * @param compressedDataRateInMB the compressedDataRateInMB value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withCompressedDataRateInMB(Double compressedDataRateInMB) {
        this.compressedDataRateInMB = compressedDataRateInMB;
        return this;
    }

    /**
     * Get the uncompressed data change rate in MB.
     *
     * @return the uncompressedDataRateInMB value
     */
    public Double uncompressedDataRateInMB() {
        return this.uncompressedDataRateInMB;
    }

    /**
     * Set the uncompressed data change rate in MB.
     *
     * @param uncompressedDataRateInMB the uncompressedDataRateInMB value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withUncompressedDataRateInMB(Double uncompressedDataRateInMB) {
        this.uncompressedDataRateInMB = uncompressedDataRateInMB;
        return this;
    }

    /**
     * Get the source IP address.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the source IP address.
     *
     * @param ipAddress the ipAddress value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the agent version.
     *
     * @return the agentVersion value
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set the agent version.
     *
     * @param agentVersion the agentVersion value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get agent expiry date.
     *
     * @return the agentExpiryDate value
     */
    public DateTime agentExpiryDate() {
        return this.agentExpiryDate;
    }

    /**
     * Set agent expiry date.
     *
     * @param agentExpiryDate the agentExpiryDate value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withAgentExpiryDate(DateTime agentExpiryDate) {
        this.agentExpiryDate = agentExpiryDate;
        return this;
    }

    /**
     * Get a value indicating whether installed agent needs to be updated.
     *
     * @return the isAgentUpdateRequired value
     */
    public String isAgentUpdateRequired() {
        return this.isAgentUpdateRequired;
    }

    /**
     * Set a value indicating whether installed agent needs to be updated.
     *
     * @param isAgentUpdateRequired the isAgentUpdateRequired value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withIsAgentUpdateRequired(String isAgentUpdateRequired) {
        this.isAgentUpdateRequired = isAgentUpdateRequired;
        return this;
    }

    /**
     * Get a value indicating whether the source server requires a restart after update.
     *
     * @return the isRebootAfterUpdateRequired value
     */
    public String isRebootAfterUpdateRequired() {
        return this.isRebootAfterUpdateRequired;
    }

    /**
     * Set a value indicating whether the source server requires a restart after update.
     *
     * @param isRebootAfterUpdateRequired the isRebootAfterUpdateRequired value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withIsRebootAfterUpdateRequired(String isRebootAfterUpdateRequired) {
        this.isRebootAfterUpdateRequired = isRebootAfterUpdateRequired;
        return this;
    }

    /**
     * Get the last heartbeat received from the source server.
     *
     * @return the lastHeartbeat value
     */
    public DateTime lastHeartbeat() {
        return this.lastHeartbeat;
    }

    /**
     * Set the last heartbeat received from the source server.
     *
     * @param lastHeartbeat the lastHeartbeat value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withLastHeartbeat(DateTime lastHeartbeat) {
        this.lastHeartbeat = lastHeartbeat;
        return this;
    }

    /**
     * Get the process server Id.
     *
     * @return the processServerId value
     */
    public String processServerId() {
        return this.processServerId;
    }

    /**
     * Set the process server Id.
     *
     * @param processServerId the processServerId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withProcessServerId(String processServerId) {
        this.processServerId = processServerId;
        return this;
    }

    /**
     * Get the multi vm group Id.
     *
     * @return the multiVmGroupId value
     */
    public String multiVmGroupId() {
        return this.multiVmGroupId;
    }

    /**
     * Set the multi vm group Id.
     *
     * @param multiVmGroupId the multiVmGroupId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withMultiVmGroupId(String multiVmGroupId) {
        this.multiVmGroupId = multiVmGroupId;
        return this;
    }

    /**
     * Get the multi vm group name.
     *
     * @return the multiVmGroupName value
     */
    public String multiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * Set the multi vm group name.
     *
     * @param multiVmGroupName the multiVmGroupName value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withMultiVmGroupName(String multiVmGroupName) {
        this.multiVmGroupName = multiVmGroupName;
        return this;
    }

    /**
     * Get a value indicating whether multi vm sync is enabled or disabled.
     *
     * @return the multiVmSyncStatus value
     */
    public String multiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * Set a value indicating whether multi vm sync is enabled or disabled.
     *
     * @param multiVmSyncStatus the multiVmSyncStatus value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withMultiVmSyncStatus(String multiVmSyncStatus) {
        this.multiVmSyncStatus = multiVmSyncStatus;
        return this;
    }

    /**
     * Get the list of protected disks.
     *
     * @return the protectedDisks value
     */
    public List<InMageAzureV2ProtectedDiskDetails> protectedDisks() {
        return this.protectedDisks;
    }

    /**
     * Set the list of protected disks.
     *
     * @param protectedDisks the protectedDisks value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withProtectedDisks(List<InMageAzureV2ProtectedDiskDetails> protectedDisks) {
        this.protectedDisks = protectedDisks;
        return this;
    }

    /**
     * Get a value indicating whether any disk is resized for this VM.
     *
     * @return the diskResized value
     */
    public String diskResized() {
        return this.diskResized;
    }

    /**
     * Set a value indicating whether any disk is resized for this VM.
     *
     * @param diskResized the diskResized value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withDiskResized(String diskResized) {
        this.diskResized = diskResized;
        return this;
    }

    /**
     * Get the master target Id.
     *
     * @return the masterTargetId value
     */
    public String masterTargetId() {
        return this.masterTargetId;
    }

    /**
     * Set the master target Id.
     *
     * @param masterTargetId the masterTargetId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withMasterTargetId(String masterTargetId) {
        this.masterTargetId = masterTargetId;
        return this;
    }

    /**
     * Get the CPU count of the VM on the primary side.
     *
     * @return the sourceVmCpuCount value
     */
    public Integer sourceVmCpuCount() {
        return this.sourceVmCpuCount;
    }

    /**
     * Set the CPU count of the VM on the primary side.
     *
     * @param sourceVmCpuCount the sourceVmCpuCount value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withSourceVmCpuCount(Integer sourceVmCpuCount) {
        this.sourceVmCpuCount = sourceVmCpuCount;
        return this;
    }

    /**
     * Get the RAM size of the VM on the primary side.
     *
     * @return the sourceVmRamSizeInMB value
     */
    public Integer sourceVmRamSizeInMB() {
        return this.sourceVmRamSizeInMB;
    }

    /**
     * Set the RAM size of the VM on the primary side.
     *
     * @param sourceVmRamSizeInMB the sourceVmRamSizeInMB value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withSourceVmRamSizeInMB(Integer sourceVmRamSizeInMB) {
        this.sourceVmRamSizeInMB = sourceVmRamSizeInMB;
        return this;
    }

    /**
     * Get the type of the OS on the VM.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the type of the OS on the VM.
     *
     * @param osType the osType value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the OS disk VHD name.
     *
     * @return the vhdName value
     */
    public String vhdName() {
        return this.vhdName;
    }

    /**
     * Set the OS disk VHD name.
     *
     * @param vhdName the vhdName value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withVhdName(String vhdName) {
        this.vhdName = vhdName;
        return this;
    }

    /**
     * Get the id of the disk containing the OS.
     *
     * @return the osDiskId value
     */
    public String osDiskId() {
        return this.osDiskId;
    }

    /**
     * Set the id of the disk containing the OS.
     *
     * @param osDiskId the osDiskId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withOsDiskId(String osDiskId) {
        this.osDiskId = osDiskId;
        return this;
    }

    /**
     * Get azure VM Disk details.
     *
     * @return the azureVMDiskDetails value
     */
    public List<AzureVmDiskDetails> azureVMDiskDetails() {
        return this.azureVMDiskDetails;
    }

    /**
     * Set azure VM Disk details.
     *
     * @param azureVMDiskDetails the azureVMDiskDetails value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withAzureVMDiskDetails(List<AzureVmDiskDetails> azureVMDiskDetails) {
        this.azureVMDiskDetails = azureVMDiskDetails;
        return this;
    }

    /**
     * Get recovery Azure given name.
     *
     * @return the recoveryAzureVMName value
     */
    public String recoveryAzureVMName() {
        return this.recoveryAzureVMName;
    }

    /**
     * Set recovery Azure given name.
     *
     * @param recoveryAzureVMName the recoveryAzureVMName value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withRecoveryAzureVMName(String recoveryAzureVMName) {
        this.recoveryAzureVMName = recoveryAzureVMName;
        return this;
    }

    /**
     * Get the Recovery Azure VM size.
     *
     * @return the recoveryAzureVMSize value
     */
    public String recoveryAzureVMSize() {
        return this.recoveryAzureVMSize;
    }

    /**
     * Set the Recovery Azure VM size.
     *
     * @param recoveryAzureVMSize the recoveryAzureVMSize value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withRecoveryAzureVMSize(String recoveryAzureVMSize) {
        this.recoveryAzureVMSize = recoveryAzureVMSize;
        return this;
    }

    /**
     * Get the recovery Azure storage account.
     *
     * @return the recoveryAzureStorageAccount value
     */
    public String recoveryAzureStorageAccount() {
        return this.recoveryAzureStorageAccount;
    }

    /**
     * Set the recovery Azure storage account.
     *
     * @param recoveryAzureStorageAccount the recoveryAzureStorageAccount value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withRecoveryAzureStorageAccount(String recoveryAzureStorageAccount) {
        this.recoveryAzureStorageAccount = recoveryAzureStorageAccount;
        return this;
    }

    /**
     * Get the ARM id of the log storage account used for replication. This will be set to null if no log storage account was provided during enable protection.
     *
     * @return the recoveryAzureLogStorageAccountId value
     */
    public String recoveryAzureLogStorageAccountId() {
        return this.recoveryAzureLogStorageAccountId;
    }

    /**
     * Set the ARM id of the log storage account used for replication. This will be set to null if no log storage account was provided during enable protection.
     *
     * @param recoveryAzureLogStorageAccountId the recoveryAzureLogStorageAccountId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withRecoveryAzureLogStorageAccountId(String recoveryAzureLogStorageAccountId) {
        this.recoveryAzureLogStorageAccountId = recoveryAzureLogStorageAccountId;
        return this;
    }

    /**
     * Get the PE Network details.
     *
     * @return the vmNics value
     */
    public List<VMNicDetails> vmNics() {
        return this.vmNics;
    }

    /**
     * Set the PE Network details.
     *
     * @param vmNics the vmNics value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withVmNics(List<VMNicDetails> vmNics) {
        this.vmNics = vmNics;
        return this;
    }

    /**
     * Get the selected recovery azure network Id.
     *
     * @return the selectedRecoveryAzureNetworkId value
     */
    public String selectedRecoveryAzureNetworkId() {
        return this.selectedRecoveryAzureNetworkId;
    }

    /**
     * Set the selected recovery azure network Id.
     *
     * @param selectedRecoveryAzureNetworkId the selectedRecoveryAzureNetworkId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withSelectedRecoveryAzureNetworkId(String selectedRecoveryAzureNetworkId) {
        this.selectedRecoveryAzureNetworkId = selectedRecoveryAzureNetworkId;
        return this;
    }

    /**
     * Get the selected source nic Id which will be used as the primary nic during failover.
     *
     * @return the selectedSourceNicId value
     */
    public String selectedSourceNicId() {
        return this.selectedSourceNicId;
    }

    /**
     * Set the selected source nic Id which will be used as the primary nic during failover.
     *
     * @param selectedSourceNicId the selectedSourceNicId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withSelectedSourceNicId(String selectedSourceNicId) {
        this.selectedSourceNicId = selectedSourceNicId;
        return this;
    }

    /**
     * Get a value indicating the discovery type of the machine. Value can be vCenter or physical.
     *
     * @return the discoveryType value
     */
    public String discoveryType() {
        return this.discoveryType;
    }

    /**
     * Set a value indicating the discovery type of the machine. Value can be vCenter or physical.
     *
     * @param discoveryType the discoveryType value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withDiscoveryType(String discoveryType) {
        this.discoveryType = discoveryType;
        return this;
    }

    /**
     * Get the selected option to enable RDP\SSH on target vm after failover. String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     *
     * @return the enableRdpOnTargetOption value
     */
    public String enableRdpOnTargetOption() {
        return this.enableRdpOnTargetOption;
    }

    /**
     * Set the selected option to enable RDP\SSH on target vm after failover. String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     *
     * @param enableRdpOnTargetOption the enableRdpOnTargetOption value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withEnableRdpOnTargetOption(String enableRdpOnTargetOption) {
        this.enableRdpOnTargetOption = enableRdpOnTargetOption;
        return this;
    }

    /**
     * Get the data stores of the on-premise machine. Value can be list of strings that contain data store names.
     *
     * @return the datastores value
     */
    public List<String> datastores() {
        return this.datastores;
    }

    /**
     * Set the data stores of the on-premise machine. Value can be list of strings that contain data store names.
     *
     * @param datastores the datastores value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withDatastores(List<String> datastores) {
        this.datastores = datastores;
        return this;
    }

    /**
     * Get the ARM Id of the target Azure VM. This value will be null until the VM is failed over. Only after failure it will be populated with the ARM Id of the Azure VM.
     *
     * @return the targetVmId value
     */
    public String targetVmId() {
        return this.targetVmId;
    }

    /**
     * Set the ARM Id of the target Azure VM. This value will be null until the VM is failed over. Only after failure it will be populated with the ARM Id of the Azure VM.
     *
     * @param targetVmId the targetVmId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withTargetVmId(String targetVmId) {
        this.targetVmId = targetVmId;
        return this;
    }

    /**
     * Get the target resource group Id.
     *
     * @return the recoveryAzureResourceGroupId value
     */
    public String recoveryAzureResourceGroupId() {
        return this.recoveryAzureResourceGroupId;
    }

    /**
     * Set the target resource group Id.
     *
     * @param recoveryAzureResourceGroupId the recoveryAzureResourceGroupId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withRecoveryAzureResourceGroupId(String recoveryAzureResourceGroupId) {
        this.recoveryAzureResourceGroupId = recoveryAzureResourceGroupId;
        return this;
    }

    /**
     * Get the recovery availability set Id.
     *
     * @return the recoveryAvailabilitySetId value
     */
    public String recoveryAvailabilitySetId() {
        return this.recoveryAvailabilitySetId;
    }

    /**
     * Set the recovery availability set Id.
     *
     * @param recoveryAvailabilitySetId the recoveryAvailabilitySetId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withRecoveryAvailabilitySetId(String recoveryAvailabilitySetId) {
        this.recoveryAvailabilitySetId = recoveryAvailabilitySetId;
        return this;
    }

    /**
     * Get a value indicating whether managed disks should be used during failover.
     *
     * @return the useManagedDisks value
     */
    public String useManagedDisks() {
        return this.useManagedDisks;
    }

    /**
     * Set a value indicating whether managed disks should be used during failover.
     *
     * @param useManagedDisks the useManagedDisks value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withUseManagedDisks(String useManagedDisks) {
        this.useManagedDisks = useManagedDisks;
        return this;
    }

    /**
     * Get license Type of the VM to be used.
     *
     * @return the licenseType value
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set license Type of the VM to be used.
     *
     * @param licenseType the licenseType value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the validation errors of the on-premise machine Value can be list of validation errors.
     *
     * @return the validationErrors value
     */
    public List<HealthError> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Set the validation errors of the on-premise machine Value can be list of validation errors.
     *
     * @param validationErrors the validationErrors value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withValidationErrors(List<HealthError> validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }

    /**
     * Get the last RPO calculated time.
     *
     * @return the lastRpoCalculatedTime value
     */
    public DateTime lastRpoCalculatedTime() {
        return this.lastRpoCalculatedTime;
    }

    /**
     * Set the last RPO calculated time.
     *
     * @param lastRpoCalculatedTime the lastRpoCalculatedTime value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withLastRpoCalculatedTime(DateTime lastRpoCalculatedTime) {
        this.lastRpoCalculatedTime = lastRpoCalculatedTime;
        return this;
    }

    /**
     * Get the last update time received from on-prem components.
     *
     * @return the lastUpdateReceivedTime value
     */
    public DateTime lastUpdateReceivedTime() {
        return this.lastUpdateReceivedTime;
    }

    /**
     * Set the last update time received from on-prem components.
     *
     * @param lastUpdateReceivedTime the lastUpdateReceivedTime value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withLastUpdateReceivedTime(DateTime lastUpdateReceivedTime) {
        this.lastUpdateReceivedTime = lastUpdateReceivedTime;
        return this;
    }

    /**
     * Get the replica id of the protected item.
     *
     * @return the replicaId value
     */
    public String replicaId() {
        return this.replicaId;
    }

    /**
     * Set the replica id of the protected item.
     *
     * @param replicaId the replicaId value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withReplicaId(String replicaId) {
        this.replicaId = replicaId;
        return this;
    }

    /**
     * Get the OS Version of the protected item.
     *
     * @return the osVersion value
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set the OS Version of the protected item.
     *
     * @param osVersion the osVersion value to set
     * @return the InMageAzureV2ReplicationDetails object itself.
     */
    public InMageAzureV2ReplicationDetails withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

}
