/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview.implementation;

import com.microsoft.azure.management.datamigration.v2017_11_15_preview.ProjectTaskProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * A task resource.
 */
public class ProjectTaskInner extends ProxyResource {
    /**
     * HTTP strong entity tag value. This is ignored if submitted.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Custom task properties.
     */
    @JsonProperty(value = "properties")
    private ProjectTaskProperties properties;

    /**
     * Get hTTP strong entity tag value. This is ignored if submitted.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set hTTP strong entity tag value. This is ignored if submitted.
     *
     * @param etag the etag value to set
     * @return the ProjectTaskInner object itself.
     */
    public ProjectTaskInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get custom task properties.
     *
     * @return the properties value
     */
    public ProjectTaskProperties properties() {
        return this.properties;
    }

    /**
     * Set custom task properties.
     *
     * @param properties the properties value to set
     * @return the ProjectTaskInner object itself.
     */
    public ProjectTaskInner withProperties(ProjectTaskProperties properties) {
        this.properties = properties;
        return this;
    }

}
