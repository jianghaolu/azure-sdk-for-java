/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * An update to a private cloud resource.
 */
@JsonFlatten
public class PrivateCloudUpdate {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The default cluster used for management.
     */
    @JsonProperty(value = "properties.managementCluster")
    private ManagementCluster managementCluster;

    /**
     * Connectivity to internet is enabled or disabled. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.internet")
    private InternetEnum internet;

    /**
     * vCenter Single Sign On Identity Sources.
     */
    @JsonProperty(value = "properties.identitySources")
    private List<IdentitySource> identitySources;

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the PrivateCloudUpdate object itself.
     */
    public PrivateCloudUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the default cluster used for management.
     *
     * @return the managementCluster value
     */
    public ManagementCluster managementCluster() {
        return this.managementCluster;
    }

    /**
     * Set the default cluster used for management.
     *
     * @param managementCluster the managementCluster value to set
     * @return the PrivateCloudUpdate object itself.
     */
    public PrivateCloudUpdate withManagementCluster(ManagementCluster managementCluster) {
        this.managementCluster = managementCluster;
        return this;
    }

    /**
     * Get connectivity to internet is enabled or disabled. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the internet value
     */
    public InternetEnum internet() {
        return this.internet;
    }

    /**
     * Set connectivity to internet is enabled or disabled. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param internet the internet value to set
     * @return the PrivateCloudUpdate object itself.
     */
    public PrivateCloudUpdate withInternet(InternetEnum internet) {
        this.internet = internet;
        return this;
    }

    /**
     * Get vCenter Single Sign On Identity Sources.
     *
     * @return the identitySources value
     */
    public List<IdentitySource> identitySources() {
        return this.identitySources;
    }

    /**
     * Set vCenter Single Sign On Identity Sources.
     *
     * @param identitySources the identitySources value to set
     * @return the PrivateCloudUpdate object itself.
     */
    public PrivateCloudUpdate withIdentitySources(List<IdentitySource> identitySources) {
        this.identitySources = identitySources;
        return this;
    }

}
