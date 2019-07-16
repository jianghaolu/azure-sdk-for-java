/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * ServiceAssociationLink resource.
 */
@JsonFlatten
public class ServiceAssociationLinkInner extends SubResource {
    /**
     * Resource type of the linked resource.
     */
    @JsonProperty(value = "properties.linkedResourceType")
    private String linkedResourceType;

    /**
     * Link to the external resource.
     */
    @JsonProperty(value = "properties.link")
    private String link;

    /**
     * Provisioning state of the ServiceAssociationLink resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * If true, the resource can be deleted.
     */
    @JsonProperty(value = "properties.allowDelete")
    private Boolean allowDelete;

    /**
     * A list of locations.
     */
    @JsonProperty(value = "properties.locations")
    private List<String> locations;

    /**
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get resource type of the linked resource.
     *
     * @return the linkedResourceType value
     */
    public String linkedResourceType() {
        return this.linkedResourceType;
    }

    /**
     * Set resource type of the linked resource.
     *
     * @param linkedResourceType the linkedResourceType value to set
     * @return the ServiceAssociationLinkInner object itself.
     */
    public ServiceAssociationLinkInner withLinkedResourceType(String linkedResourceType) {
        this.linkedResourceType = linkedResourceType;
        return this;
    }

    /**
     * Get link to the external resource.
     *
     * @return the link value
     */
    public String link() {
        return this.link;
    }

    /**
     * Set link to the external resource.
     *
     * @param link the link value to set
     * @return the ServiceAssociationLinkInner object itself.
     */
    public ServiceAssociationLinkInner withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * Get provisioning state of the ServiceAssociationLink resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get if true, the resource can be deleted.
     *
     * @return the allowDelete value
     */
    public Boolean allowDelete() {
        return this.allowDelete;
    }

    /**
     * Set if true, the resource can be deleted.
     *
     * @param allowDelete the allowDelete value to set
     * @return the ServiceAssociationLinkInner object itself.
     */
    public ServiceAssociationLinkInner withAllowDelete(Boolean allowDelete) {
        this.allowDelete = allowDelete;
        return this;
    }

    /**
     * Get a list of locations.
     *
     * @return the locations value
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set a list of locations.
     *
     * @param locations the locations value to set
     * @return the ServiceAssociationLinkInner object itself.
     */
    public ServiceAssociationLinkInner withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the ServiceAssociationLinkInner object itself.
     */
    public ServiceAssociationLinkInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set resource type.
     *
     * @param type the type value to set
     * @return the ServiceAssociationLinkInner object itself.
     */
    public ServiceAssociationLinkInner withType(String type) {
        this.type = type;
        return this;
    }

}
