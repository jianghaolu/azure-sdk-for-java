/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_06_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Snapshot of a Volume.
 */
@JsonFlatten
public class SnapshotInner extends Resource {
    /**
     * snapshotId.
     * UUID v4 used to identify the Snapshot.
     */
    @JsonProperty(value = "properties.snapshotId", access = JsonProperty.Access.WRITE_ONLY)
    private String snapshotId;

    /**
     * fileSystemId.
     * UUID v4 used to identify the FileSystem.
     */
    @JsonProperty(value = "properties.fileSystemId")
    private String fileSystemId;

    /**
     * name.
     * The creation date of the snapshot.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * Azure lifecycle management.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get uUID v4 used to identify the Snapshot.
     *
     * @return the snapshotId value
     */
    public String snapshotId() {
        return this.snapshotId;
    }

    /**
     * Get uUID v4 used to identify the FileSystem.
     *
     * @return the fileSystemId value
     */
    public String fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * Set uUID v4 used to identify the FileSystem.
     *
     * @param fileSystemId the fileSystemId value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * Get the creation date of the snapshot.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get azure lifecycle management.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}
