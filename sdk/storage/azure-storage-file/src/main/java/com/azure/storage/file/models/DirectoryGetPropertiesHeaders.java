// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.azure.core.implementation.DateTimeRfc1123;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.HeaderCollection;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Defines headers for GetProperties operation.
 */
@JacksonXmlRootElement(localName = "Directory-GetProperties-Headers")
@Fluent
public final class DirectoryGetPropertiesHeaders {
    /*
     * The metadata property.
     */
    @HeaderCollection("x-ms-meta-")
    private Map<String, String> metadata;

    /*
     * The ETag contains a value that you can use to perform operations
     * conditionally, in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * Returns the date and time the Directory was last modified. Operations on
     * files within the directory do not affect the last modified time of the
     * directory.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * Indicates the version of the File service used to execute the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * The value of this header is set to true if the directory metadata is
     * completely encrypted using the specified algorithm. Otherwise, the value
     * is set to false.
     */
    @JsonProperty(value = "x-ms-server-encrypted")
    private Boolean isServerEncrypted;

    /*
     * Attributes set for the directory.
     */
    @JsonProperty(value = "x-ms-file-attributes")
    private String fileAttributes;

    /*
     * Creation time for the directory.
     */
    @JsonProperty(value = "x-ms-file-creation-time")
    private OffsetDateTime fileCreationTime;

    /*
     * Last write time for the directory.
     */
    @JsonProperty(value = "x-ms-file-last-write-time")
    private OffsetDateTime fileLastWriteTime;

    /*
     * Change time for the directory.
     */
    @JsonProperty(value = "x-ms-file-change-time")
    private OffsetDateTime fileChangeTime;

    /*
     * Key of the permission set for the directory.
     */
    @JsonProperty(value = "x-ms-file-permission-key")
    private String filePermissionKey;

    /*
     * The fileId of the directory.
     */
    @JsonProperty(value = "x-ms-file-id")
    private String fileId;

    /*
     * The parent fileId of the directory.
     */
    @JsonProperty(value = "x-ms-file-parent-id")
    private String fileParentId;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the metadata property: The metadata property.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally, in quotes.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally, in quotes.
     *
     * @param eTag the eTag value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: Returns the date and time the Directory
     * was last modified. Operations on files within the directory do not
     * affect the last modified time of the directory.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: Returns the date and time the Directory
     * was last modified. Operations on files within the directory do not
     * affect the last modified time of the directory.
     *
     * @param lastModified the lastModified value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @param version the version value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the isServerEncrypted property: The value of this header is set to
     * true if the directory metadata is completely encrypted using the
     * specified algorithm. Otherwise, the value is set to false.
     *
     * @return the isServerEncrypted value.
     */
    public Boolean isServerEncrypted() {
        return this.isServerEncrypted;
    }

    /**
     * Set the isServerEncrypted property: The value of this header is set to
     * true if the directory metadata is completely encrypted using the
     * specified algorithm. Otherwise, the value is set to false.
     *
     * @param isServerEncrypted the isServerEncrypted value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setIsServerEncrypted(Boolean isServerEncrypted) {
        this.isServerEncrypted = isServerEncrypted;
        return this;
    }

    /**
     * Get the fileAttributes property: Attributes set for the directory.
     *
     * @return the fileAttributes value.
     */
    public String getFileAttributes() {
        return this.fileAttributes;
    }

    /**
     * Set the fileAttributes property: Attributes set for the directory.
     *
     * @param fileAttributes the fileAttributes value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setFileAttributes(String fileAttributes) {
        this.fileAttributes = fileAttributes;
        return this;
    }

    /**
     * Get the fileCreationTime property: Creation time for the directory.
     *
     * @return the fileCreationTime value.
     */
    public OffsetDateTime getFileCreationTime() {
        return this.fileCreationTime;
    }

    /**
     * Set the fileCreationTime property: Creation time for the directory.
     *
     * @param fileCreationTime the fileCreationTime value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setFileCreationTime(OffsetDateTime fileCreationTime) {
        this.fileCreationTime = fileCreationTime;
        return this;
    }

    /**
     * Get the fileLastWriteTime property: Last write time for the directory.
     *
     * @return the fileLastWriteTime value.
     */
    public OffsetDateTime getFileLastWriteTime() {
        return this.fileLastWriteTime;
    }

    /**
     * Set the fileLastWriteTime property: Last write time for the directory.
     *
     * @param fileLastWriteTime the fileLastWriteTime value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setFileLastWriteTime(OffsetDateTime fileLastWriteTime) {
        this.fileLastWriteTime = fileLastWriteTime;
        return this;
    }

    /**
     * Get the fileChangeTime property: Change time for the directory.
     *
     * @return the fileChangeTime value.
     */
    public OffsetDateTime getFileChangeTime() {
        return this.fileChangeTime;
    }

    /**
     * Set the fileChangeTime property: Change time for the directory.
     *
     * @param fileChangeTime the fileChangeTime value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setFileChangeTime(OffsetDateTime fileChangeTime) {
        this.fileChangeTime = fileChangeTime;
        return this;
    }

    /**
     * Get the filePermissionKey property: Key of the permission set for the
     * directory.
     *
     * @return the filePermissionKey value.
     */
    public String getFilePermissionKey() {
        return this.filePermissionKey;
    }

    /**
     * Set the filePermissionKey property: Key of the permission set for the
     * directory.
     *
     * @param filePermissionKey the filePermissionKey value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setFilePermissionKey(String filePermissionKey) {
        this.filePermissionKey = filePermissionKey;
        return this;
    }

    /**
     * Get the fileId property: The fileId of the directory.
     *
     * @return the fileId value.
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * Set the fileId property: The fileId of the directory.
     *
     * @param fileId the fileId value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Get the fileParentId property: The parent fileId of the directory.
     *
     * @return the fileParentId value.
     */
    public String getFileParentId() {
        return this.fileParentId;
    }

    /**
     * Set the fileParentId property: The parent fileId of the directory.
     *
     * @param fileParentId the fileParentId value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setFileParentId(String fileParentId) {
        this.fileParentId = fileParentId;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the DirectoryGetPropertiesHeaders object itself.
     */
    public DirectoryGetPropertiesHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
