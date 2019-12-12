/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01.implementation;

import java.util.List;
import com.microsoft.azure.management.compute.v2019_03_01.SubResourceReadOnly;
import com.microsoft.azure.management.compute.v2019_03_01.DedicatedHostLicenseTypes;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2019_03_01.DedicatedHostInstanceView;
import com.microsoft.azure.management.compute.v2019_03_01.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Specifies information about the Dedicated host.
 */
@JsonFlatten
public class DedicatedHostInner extends Resource {
    /**
     * Fault domain of the dedicated host within a dedicated host group.
     */
    @JsonProperty(value = "properties.platformFaultDomain")
    private Integer platformFaultDomain;

    /**
     * Specifies whether the dedicated host should be replaced automatically in
     * case of a failure. The value is defaulted to 'true' when not provided.
     */
    @JsonProperty(value = "properties.autoReplaceOnFailure")
    private Boolean autoReplaceOnFailure;

    /**
     * A unique id generated and assigned to the dedicated host by the
     * platform. &lt;br&gt;&lt;br&gt; Does not change throughout the lifetime
     * of the host.
     */
    @JsonProperty(value = "properties.hostId", access = JsonProperty.Access.WRITE_ONLY)
    private String hostId;

    /**
     * A list of references to all virtual machines in the Dedicated Host.
     */
    @JsonProperty(value = "properties.virtualMachines", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceReadOnly> virtualMachines;

    /**
     * Specifies the software license type that will be applied to the VMs
     * deployed on the dedicated host. &lt;br&gt;&lt;br&gt; Possible values
     * are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt;
     * **Windows_Server_Hybrid** &lt;br&gt;&lt;br&gt;
     * **Windows_Server_Perpetual** &lt;br&gt;&lt;br&gt; Default: **None**.
     * Possible values include: 'None', 'Windows_Server_Hybrid',
     * 'Windows_Server_Perpetual'.
     */
    @JsonProperty(value = "properties.licenseType")
    private DedicatedHostLicenseTypes licenseType;

    /**
     * The date when the host was first provisioned.
     */
    @JsonProperty(value = "properties.provisioningTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime provisioningTime;

    /**
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The dedicated host instance view.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private DedicatedHostInstanceView instanceView;

    /**
     * SKU of the dedicated host for Hardware Generation and VM family. Only
     * name is required to be set. List Microsoft.Compute SKUs for a list of
     * possible values.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /**
     * Get fault domain of the dedicated host within a dedicated host group.
     *
     * @return the platformFaultDomain value
     */
    public Integer platformFaultDomain() {
        return this.platformFaultDomain;
    }

    /**
     * Set fault domain of the dedicated host within a dedicated host group.
     *
     * @param platformFaultDomain the platformFaultDomain value to set
     * @return the DedicatedHostInner object itself.
     */
    public DedicatedHostInner withPlatformFaultDomain(Integer platformFaultDomain) {
        this.platformFaultDomain = platformFaultDomain;
        return this;
    }

    /**
     * Get specifies whether the dedicated host should be replaced automatically in case of a failure. The value is defaulted to 'true' when not provided.
     *
     * @return the autoReplaceOnFailure value
     */
    public Boolean autoReplaceOnFailure() {
        return this.autoReplaceOnFailure;
    }

    /**
     * Set specifies whether the dedicated host should be replaced automatically in case of a failure. The value is defaulted to 'true' when not provided.
     *
     * @param autoReplaceOnFailure the autoReplaceOnFailure value to set
     * @return the DedicatedHostInner object itself.
     */
    public DedicatedHostInner withAutoReplaceOnFailure(Boolean autoReplaceOnFailure) {
        this.autoReplaceOnFailure = autoReplaceOnFailure;
        return this;
    }

    /**
     * Get a unique id generated and assigned to the dedicated host by the platform. &lt;br&gt;&lt;br&gt; Does not change throughout the lifetime of the host.
     *
     * @return the hostId value
     */
    public String hostId() {
        return this.hostId;
    }

    /**
     * Get a list of references to all virtual machines in the Dedicated Host.
     *
     * @return the virtualMachines value
     */
    public List<SubResourceReadOnly> virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * Get specifies the software license type that will be applied to the VMs deployed on the dedicated host. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **Windows_Server_Hybrid** &lt;br&gt;&lt;br&gt; **Windows_Server_Perpetual** &lt;br&gt;&lt;br&gt; Default: **None**. Possible values include: 'None', 'Windows_Server_Hybrid', 'Windows_Server_Perpetual'.
     *
     * @return the licenseType value
     */
    public DedicatedHostLicenseTypes licenseType() {
        return this.licenseType;
    }

    /**
     * Set specifies the software license type that will be applied to the VMs deployed on the dedicated host. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **Windows_Server_Hybrid** &lt;br&gt;&lt;br&gt; **Windows_Server_Perpetual** &lt;br&gt;&lt;br&gt; Default: **None**. Possible values include: 'None', 'Windows_Server_Hybrid', 'Windows_Server_Perpetual'.
     *
     * @param licenseType the licenseType value to set
     * @return the DedicatedHostInner object itself.
     */
    public DedicatedHostInner withLicenseType(DedicatedHostLicenseTypes licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the date when the host was first provisioned.
     *
     * @return the provisioningTime value
     */
    public DateTime provisioningTime() {
        return this.provisioningTime;
    }

    /**
     * Get the provisioning state, which only appears in the response.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the dedicated host instance view.
     *
     * @return the instanceView value
     */
    public DedicatedHostInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Get sKU of the dedicated host for Hardware Generation and VM family. Only name is required to be set. List Microsoft.Compute SKUs for a list of possible values.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set sKU of the dedicated host for Hardware Generation and VM family. Only name is required to be set. List Microsoft.Compute SKUs for a list of possible values.
     *
     * @param sku the sku value to set
     * @return the DedicatedHostInner object itself.
     */
    public DedicatedHostInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}
