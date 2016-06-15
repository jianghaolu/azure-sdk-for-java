/**
 * Code generated by Microsoft (R) AutoRest Code Generator 0.17.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.implementation.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IssuerAttributes model.
 */
public class IssuerAttributes {
    /**
     * Determines whether the issuer is enabled.
     */
    private Boolean enabled;

    /**
     * Creation time in UTC.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long created;

    /**
     * Last updated time in UTC.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long updated;

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the IssuerAttributes object itself.
     */
    public IssuerAttributes withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public Long created() {
        return this.created;
    }

    /**
     * Get the updated value.
     *
     * @return the updated value
     */
    public Long updated() {
        return this.updated;
    }

}
