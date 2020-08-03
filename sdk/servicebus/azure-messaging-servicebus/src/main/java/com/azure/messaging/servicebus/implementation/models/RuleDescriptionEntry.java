// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The RuleDescriptionEntry model. */
@JacksonXmlRootElement(localName = "entry", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class RuleDescriptionEntry {
    /*
     * The URL of the GET request
     */
    @JacksonXmlProperty(localName = "id", namespace = "http://www.w3.org/2005/Atom")
    private String id;

    /*
     * The name of the rule
     */
    @JsonProperty(value = "title")
    private Object title;

    /*
     * The timestamp for when this rule was published
     */
    @JacksonXmlProperty(localName = "published", namespace = "http://www.w3.org/2005/Atom")
    private OffsetDateTime published;

    /*
     * The timestamp for when this rule was last updated
     */
    @JacksonXmlProperty(localName = "updated", namespace = "http://www.w3.org/2005/Atom")
    private OffsetDateTime updated;

    /*
     * The URL for the HTTP request
     */
    @JacksonXmlProperty(localName = "link", namespace = "http://www.w3.org/2005/Atom")
    private ResponseLink link;

    /*
     * The RuleDescription
     */
    @JacksonXmlProperty(localName = "content", namespace = "http://www.w3.org/2005/Atom")
    private RuleDescriptionEntryContent content;

    /**
     * Get the id property: The URL of the GET request.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The URL of the GET request.
     *
     * @param id the id value to set.
     * @return the RuleDescriptionEntry object itself.
     */
    public RuleDescriptionEntry setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the title property: The name of the rule.
     *
     * @return the title value.
     */
    public Object getTitle() {
        return this.title;
    }

    /**
     * Set the title property: The name of the rule.
     *
     * @param title the title value to set.
     * @return the RuleDescriptionEntry object itself.
     */
    public RuleDescriptionEntry setTitle(Object title) {
        this.title = title;
        return this;
    }

    /**
     * Get the published property: The timestamp for when this rule was published.
     *
     * @return the published value.
     */
    public OffsetDateTime getPublished() {
        return this.published;
    }

    /**
     * Set the published property: The timestamp for when this rule was published.
     *
     * @param published the published value to set.
     * @return the RuleDescriptionEntry object itself.
     */
    public RuleDescriptionEntry setPublished(OffsetDateTime published) {
        this.published = published;
        return this;
    }

    /**
     * Get the updated property: The timestamp for when this rule was last updated.
     *
     * @return the updated value.
     */
    public OffsetDateTime getUpdated() {
        return this.updated;
    }

    /**
     * Set the updated property: The timestamp for when this rule was last updated.
     *
     * @param updated the updated value to set.
     * @return the RuleDescriptionEntry object itself.
     */
    public RuleDescriptionEntry setUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    /**
     * Get the link property: The URL for the HTTP request.
     *
     * @return the link value.
     */
    public ResponseLink getLink() {
        return this.link;
    }

    /**
     * Set the link property: The URL for the HTTP request.
     *
     * @param link the link value to set.
     * @return the RuleDescriptionEntry object itself.
     */
    public RuleDescriptionEntry setLink(ResponseLink link) {
        this.link = link;
        return this;
    }

    /**
     * Get the content property: The RuleDescription.
     *
     * @return the content value.
     */
    public RuleDescriptionEntryContent getContent() {
        return this.content;
    }

    /**
     * Set the content property: The RuleDescription.
     *
     * @param content the content value to set.
     * @return the RuleDescriptionEntry object itself.
     */
    public RuleDescriptionEntry setContent(RuleDescriptionEntryContent content) {
        this.content = content;
        return this;
    }
}
