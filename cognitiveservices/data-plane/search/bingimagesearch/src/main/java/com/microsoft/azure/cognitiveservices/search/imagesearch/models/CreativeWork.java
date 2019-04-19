/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.imagesearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * The most generic kind of creative work, including books, movies,
 * photographs, software programs, etc.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = CreativeWork.class)
@JsonTypeName("CreativeWork")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "MediaObject", value = MediaObject.class),
    @JsonSubTypes.Type(name = "WebPage", value = WebPage.class),
    @JsonSubTypes.Type(name = "Recipe", value = Recipe.class)
})
public class CreativeWork extends Thing {
    /**
     * The URL to a thumbnail of the item.
     */
    @JsonProperty(value = "thumbnailUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbnailUrl;

    /**
     * The source of the creative work.
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private List<Thing> provider;

    /**
     * The date on which the CreativeWork was published.
     */
    @JsonProperty(value = "datePublished", access = JsonProperty.Access.WRITE_ONLY)
    private String datePublished;

    /**
     * Text content of this creative work.
     */
    @JsonProperty(value = "text", access = JsonProperty.Access.WRITE_ONLY)
    private String text;

    /**
     * Get the thumbnailUrl value.
     *
     * @return the thumbnailUrl value.
     */
    public String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    /**
     * Get the provider value.
     *
     * @return the provider value.
     */
    public List<Thing> provider() {
        return this.provider;
    }

    /**
     * Get the datePublished value.
     *
     * @return the datePublished value.
     */
    public String datePublished() {
        return this.datePublished;
    }

    /**
     * Get the text value.
     *
     * @return the text value.
     */
    public String text() {
        return this.text;
    }
}
