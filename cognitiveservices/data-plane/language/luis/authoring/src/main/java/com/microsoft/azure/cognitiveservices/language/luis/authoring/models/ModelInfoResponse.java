/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/**
 * An application model info.
 */
public final class ModelInfoResponse {
    /**
     * The ID of the Entity Model.
     */
    @JsonProperty(value = "id", required = true)
    private UUID id;

    /**
     * Name of the Entity Model.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The type ID of the Entity Model.
     */
    @JsonProperty(value = "typeId")
    private Integer typeId;

    /**
     * Possible values include: 'Entity Extractor', 'Hierarchical Entity
     * Extractor', 'Hierarchical Child Entity Extractor', 'Composite Entity
     * Extractor', 'List Entity Extractor', 'Prebuilt Entity Extractor',
     * 'Intent Classifier', 'Pattern.Any Entity Extractor', 'Regular Expression
     * Entity Extractor'.
     */
    @JsonProperty(value = "readableType", required = true)
    private String readableType;

    /**
     * The roles property.
     */
    @JsonProperty(value = "roles")
    private List<EntityRole> roles;

    /**
     * List of child entities.
     */
    @JsonProperty(value = "children")
    private List<ChildEntity> children;

    /**
     * List of sublists.
     */
    @JsonProperty(value = "subLists")
    private List<SubClosedListResponse> subLists;

    /**
     * The domain name.
     */
    @JsonProperty(value = "customPrebuiltDomainName")
    private String customPrebuiltDomainName;

    /**
     * The intent name or entity name.
     */
    @JsonProperty(value = "customPrebuiltModelName")
    private String customPrebuiltModelName;

    /**
     * The Regular Expression entity pattern.
     */
    @JsonProperty(value = "regexPattern")
    private String regexPattern;

    /**
     * The explicitList property.
     */
    @JsonProperty(value = "explicitList")
    private List<ExplicitListItem> explicitList;

    /**
     * Get the id value.
     *
     * @return the id value.
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set.
     * @return the ModelInfoResponse object itself.
     */
    public ModelInfoResponse withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set.
     * @return the ModelInfoResponse object itself.
     */
    public ModelInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the typeId value.
     *
     * @return the typeId value.
     */
    public Integer typeId() {
        return this.typeId;
    }

    /**
     * Set the typeId value.
     *
     * @param typeId the typeId value to set.
     * @return the ModelInfoResponse object itself.
     */
    public ModelInfoResponse withTypeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * Get the readableType value.
     *
     * @return the readableType value.
     */
    public String readableType() {
        return this.readableType;
    }

    /**
     * Set the readableType value.
     *
     * @param readableType the readableType value to set.
     * @return the ModelInfoResponse object itself.
     */
    public ModelInfoResponse withReadableType(String readableType) {
        this.readableType = readableType;
        return this;
    }

    /**
     * Get the roles value.
     *
     * @return the roles value.
     */
    public List<EntityRole> roles() {
        return this.roles;
    }

    /**
     * Set the roles value.
     *
     * @param roles the roles value to set.
     * @return the ModelInfoResponse object itself.
     */
    public ModelInfoResponse withRoles(List<EntityRole> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Get the children value.
     *
     * @return the children value.
     */
    public List<ChildEntity> children() {
        return this.children;
    }

    /**
     * Set the children value.
     *
     * @param children the children value to set.
     * @return the ModelInfoResponse object itself.
     */
    public ModelInfoResponse withChildren(List<ChildEntity> children) {
        this.children = children;
        return this;
    }

    /**
     * Get the subLists value.
     *
     * @return the subLists value.
     */
    public List<SubClosedListResponse> subLists() {
        return this.subLists;
    }

    /**
     * Set the subLists value.
     *
     * @param subLists the subLists value to set.
     * @return the ModelInfoResponse object itself.
     */
    public ModelInfoResponse withSubLists(List<SubClosedListResponse> subLists) {
        this.subLists = subLists;
        return this;
    }

    /**
     * Get the customPrebuiltDomainName value.
     *
     * @return the customPrebuiltDomainName value.
     */
    public String customPrebuiltDomainName() {
        return this.customPrebuiltDomainName;
    }

    /**
     * Set the customPrebuiltDomainName value.
     *
     * @param customPrebuiltDomainName the customPrebuiltDomainName value to
     * set.
     * @return the ModelInfoResponse object itself.
     */
    public ModelInfoResponse withCustomPrebuiltDomainName(String customPrebuiltDomainName) {
        this.customPrebuiltDomainName = customPrebuiltDomainName;
        return this;
    }

    /**
     * Get the customPrebuiltModelName value.
     *
     * @return the customPrebuiltModelName value.
     */
    public String customPrebuiltModelName() {
        return this.customPrebuiltModelName;
    }

    /**
     * Set the customPrebuiltModelName value.
     *
     * @param customPrebuiltModelName the customPrebuiltModelName value to set.
     * @return the ModelInfoResponse object itself.
     */
    public ModelInfoResponse withCustomPrebuiltModelName(String customPrebuiltModelName) {
        this.customPrebuiltModelName = customPrebuiltModelName;
        return this;
    }

    /**
     * Get the regexPattern value.
     *
     * @return the regexPattern value.
     */
    public String regexPattern() {
        return this.regexPattern;
    }

    /**
     * Set the regexPattern value.
     *
     * @param regexPattern the regexPattern value to set.
     * @return the ModelInfoResponse object itself.
     */
    public ModelInfoResponse withRegexPattern(String regexPattern) {
        this.regexPattern = regexPattern;
        return this;
    }

    /**
     * Get the explicitList value.
     *
     * @return the explicitList value.
     */
    public List<ExplicitListItem> explicitList() {
        return this.explicitList;
    }

    /**
     * Set the explicitList value.
     *
     * @param explicitList the explicitList value to set.
     * @return the ModelInfoResponse object itself.
     */
    public ModelInfoResponse withExplicitList(List<ExplicitListItem> explicitList) {
        this.explicitList = explicitList;
        return this;
    }
}
