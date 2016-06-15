/**
 * Code generated by Microsoft (R) AutoRest Code Generator 0.17.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.implementation.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KeyRestoreParameters model.
 */
public class KeyRestoreParameters {
    /**
     * the backup blob associated with a key bundle.
     */
    @JsonProperty(value = "value", required = true)
    private String keyBundleBackup;

    /**
     * Get the keyBundleBackup value.
     *
     * @return the keyBundleBackup value
     */
    public String keyBundleBackup() {
        return this.keyBundleBackup;
    }

    /**
     * Set the keyBundleBackup value.
     *
     * @param keyBundleBackup the keyBundleBackup value to set
     * @return the KeyRestoreParameters object itself.
     */
    public KeyRestoreParameters withKeyBundleBackup(String keyBundleBackup) {
        this.keyBundleBackup = keyBundleBackup;
        return this;
    }

}
