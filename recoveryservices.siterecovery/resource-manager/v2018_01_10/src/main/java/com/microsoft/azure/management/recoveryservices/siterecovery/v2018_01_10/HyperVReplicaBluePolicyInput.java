/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * HyperV Replica Blue policy input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplica2012R2")
public class HyperVReplicaBluePolicyInput extends PolicyProviderSpecificInput {
    /**
     * A value indicating the replication interval.
     */
    @JsonProperty(value = "replicationFrequencyInSeconds")
    private Integer replicationFrequencyInSeconds;

    /**
     * A value indicating the number of recovery points.
     */
    @JsonProperty(value = "recoveryPoints")
    private Integer recoveryPoints;

    /**
     * A value indicating the application consistent frequency.
     */
    @JsonProperty(value = "applicationConsistentSnapshotFrequencyInHours")
    private Integer applicationConsistentSnapshotFrequencyInHours;

    /**
     * A value indicating whether compression has to be enabled.
     */
    @JsonProperty(value = "compression")
    private String compression;

    /**
     * A value indicating whether IR is online.
     */
    @JsonProperty(value = "initialReplicationMethod")
    private String initialReplicationMethod;

    /**
     * A value indicating the online IR start time.
     */
    @JsonProperty(value = "onlineReplicationStartTime")
    private String onlineReplicationStartTime;

    /**
     * A value indicating the offline IR import path.
     */
    @JsonProperty(value = "offlineReplicationImportPath")
    private String offlineReplicationImportPath;

    /**
     * A value indicating the offline IR export path.
     */
    @JsonProperty(value = "offlineReplicationExportPath")
    private String offlineReplicationExportPath;

    /**
     * A value indicating the recovery HTTPS port.
     */
    @JsonProperty(value = "replicationPort")
    private Integer replicationPort;

    /**
     * A value indicating the authentication type.
     */
    @JsonProperty(value = "allowedAuthenticationType")
    private Integer allowedAuthenticationType;

    /**
     * A value indicating whether the VM has to be auto deleted.
     */
    @JsonProperty(value = "replicaDeletion")
    private String replicaDeletion;

    /**
     * Get a value indicating the replication interval.
     *
     * @return the replicationFrequencyInSeconds value
     */
    public Integer replicationFrequencyInSeconds() {
        return this.replicationFrequencyInSeconds;
    }

    /**
     * Set a value indicating the replication interval.
     *
     * @param replicationFrequencyInSeconds the replicationFrequencyInSeconds value to set
     * @return the HyperVReplicaBluePolicyInput object itself.
     */
    public HyperVReplicaBluePolicyInput withReplicationFrequencyInSeconds(Integer replicationFrequencyInSeconds) {
        this.replicationFrequencyInSeconds = replicationFrequencyInSeconds;
        return this;
    }

    /**
     * Get a value indicating the number of recovery points.
     *
     * @return the recoveryPoints value
     */
    public Integer recoveryPoints() {
        return this.recoveryPoints;
    }

    /**
     * Set a value indicating the number of recovery points.
     *
     * @param recoveryPoints the recoveryPoints value to set
     * @return the HyperVReplicaBluePolicyInput object itself.
     */
    public HyperVReplicaBluePolicyInput withRecoveryPoints(Integer recoveryPoints) {
        this.recoveryPoints = recoveryPoints;
        return this;
    }

    /**
     * Get a value indicating the application consistent frequency.
     *
     * @return the applicationConsistentSnapshotFrequencyInHours value
     */
    public Integer applicationConsistentSnapshotFrequencyInHours() {
        return this.applicationConsistentSnapshotFrequencyInHours;
    }

    /**
     * Set a value indicating the application consistent frequency.
     *
     * @param applicationConsistentSnapshotFrequencyInHours the applicationConsistentSnapshotFrequencyInHours value to set
     * @return the HyperVReplicaBluePolicyInput object itself.
     */
    public HyperVReplicaBluePolicyInput withApplicationConsistentSnapshotFrequencyInHours(Integer applicationConsistentSnapshotFrequencyInHours) {
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        return this;
    }

    /**
     * Get a value indicating whether compression has to be enabled.
     *
     * @return the compression value
     */
    public String compression() {
        return this.compression;
    }

    /**
     * Set a value indicating whether compression has to be enabled.
     *
     * @param compression the compression value to set
     * @return the HyperVReplicaBluePolicyInput object itself.
     */
    public HyperVReplicaBluePolicyInput withCompression(String compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Get a value indicating whether IR is online.
     *
     * @return the initialReplicationMethod value
     */
    public String initialReplicationMethod() {
        return this.initialReplicationMethod;
    }

    /**
     * Set a value indicating whether IR is online.
     *
     * @param initialReplicationMethod the initialReplicationMethod value to set
     * @return the HyperVReplicaBluePolicyInput object itself.
     */
    public HyperVReplicaBluePolicyInput withInitialReplicationMethod(String initialReplicationMethod) {
        this.initialReplicationMethod = initialReplicationMethod;
        return this;
    }

    /**
     * Get a value indicating the online IR start time.
     *
     * @return the onlineReplicationStartTime value
     */
    public String onlineReplicationStartTime() {
        return this.onlineReplicationStartTime;
    }

    /**
     * Set a value indicating the online IR start time.
     *
     * @param onlineReplicationStartTime the onlineReplicationStartTime value to set
     * @return the HyperVReplicaBluePolicyInput object itself.
     */
    public HyperVReplicaBluePolicyInput withOnlineReplicationStartTime(String onlineReplicationStartTime) {
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        return this;
    }

    /**
     * Get a value indicating the offline IR import path.
     *
     * @return the offlineReplicationImportPath value
     */
    public String offlineReplicationImportPath() {
        return this.offlineReplicationImportPath;
    }

    /**
     * Set a value indicating the offline IR import path.
     *
     * @param offlineReplicationImportPath the offlineReplicationImportPath value to set
     * @return the HyperVReplicaBluePolicyInput object itself.
     */
    public HyperVReplicaBluePolicyInput withOfflineReplicationImportPath(String offlineReplicationImportPath) {
        this.offlineReplicationImportPath = offlineReplicationImportPath;
        return this;
    }

    /**
     * Get a value indicating the offline IR export path.
     *
     * @return the offlineReplicationExportPath value
     */
    public String offlineReplicationExportPath() {
        return this.offlineReplicationExportPath;
    }

    /**
     * Set a value indicating the offline IR export path.
     *
     * @param offlineReplicationExportPath the offlineReplicationExportPath value to set
     * @return the HyperVReplicaBluePolicyInput object itself.
     */
    public HyperVReplicaBluePolicyInput withOfflineReplicationExportPath(String offlineReplicationExportPath) {
        this.offlineReplicationExportPath = offlineReplicationExportPath;
        return this;
    }

    /**
     * Get a value indicating the recovery HTTPS port.
     *
     * @return the replicationPort value
     */
    public Integer replicationPort() {
        return this.replicationPort;
    }

    /**
     * Set a value indicating the recovery HTTPS port.
     *
     * @param replicationPort the replicationPort value to set
     * @return the HyperVReplicaBluePolicyInput object itself.
     */
    public HyperVReplicaBluePolicyInput withReplicationPort(Integer replicationPort) {
        this.replicationPort = replicationPort;
        return this;
    }

    /**
     * Get a value indicating the authentication type.
     *
     * @return the allowedAuthenticationType value
     */
    public Integer allowedAuthenticationType() {
        return this.allowedAuthenticationType;
    }

    /**
     * Set a value indicating the authentication type.
     *
     * @param allowedAuthenticationType the allowedAuthenticationType value to set
     * @return the HyperVReplicaBluePolicyInput object itself.
     */
    public HyperVReplicaBluePolicyInput withAllowedAuthenticationType(Integer allowedAuthenticationType) {
        this.allowedAuthenticationType = allowedAuthenticationType;
        return this;
    }

    /**
     * Get a value indicating whether the VM has to be auto deleted.
     *
     * @return the replicaDeletion value
     */
    public String replicaDeletion() {
        return this.replicaDeletion;
    }

    /**
     * Set a value indicating whether the VM has to be auto deleted.
     *
     * @param replicaDeletion the replicaDeletion value to set
     * @return the HyperVReplicaBluePolicyInput object itself.
     */
    public HyperVReplicaBluePolicyInput withReplicaDeletion(String replicaDeletion) {
        this.replicaDeletion = replicaDeletion;
        return this;
    }

}
