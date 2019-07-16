/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AS2 agreement protocol settings.
 */
public class AS2ProtocolSettings {
    /**
     * The message connection settings.
     */
    @JsonProperty(value = "messageConnectionSettings", required = true)
    private AS2MessageConnectionSettings messageConnectionSettings;

    /**
     * The acknowledgement connection settings.
     */
    @JsonProperty(value = "acknowledgementConnectionSettings", required = true)
    private AS2AcknowledgementConnectionSettings acknowledgementConnectionSettings;

    /**
     * The MDN settings.
     */
    @JsonProperty(value = "mdnSettings", required = true)
    private AS2MdnSettings mdnSettings;

    /**
     * The security settings.
     */
    @JsonProperty(value = "securitySettings", required = true)
    private AS2SecuritySettings securitySettings;

    /**
     * The validation settings.
     */
    @JsonProperty(value = "validationSettings", required = true)
    private AS2ValidationSettings validationSettings;

    /**
     * The envelope settings.
     */
    @JsonProperty(value = "envelopeSettings", required = true)
    private AS2EnvelopeSettings envelopeSettings;

    /**
     * The error settings.
     */
    @JsonProperty(value = "errorSettings", required = true)
    private AS2ErrorSettings errorSettings;

    /**
     * Get the message connection settings.
     *
     * @return the messageConnectionSettings value
     */
    public AS2MessageConnectionSettings messageConnectionSettings() {
        return this.messageConnectionSettings;
    }

    /**
     * Set the message connection settings.
     *
     * @param messageConnectionSettings the messageConnectionSettings value to set
     * @return the AS2ProtocolSettings object itself.
     */
    public AS2ProtocolSettings withMessageConnectionSettings(AS2MessageConnectionSettings messageConnectionSettings) {
        this.messageConnectionSettings = messageConnectionSettings;
        return this;
    }

    /**
     * Get the acknowledgement connection settings.
     *
     * @return the acknowledgementConnectionSettings value
     */
    public AS2AcknowledgementConnectionSettings acknowledgementConnectionSettings() {
        return this.acknowledgementConnectionSettings;
    }

    /**
     * Set the acknowledgement connection settings.
     *
     * @param acknowledgementConnectionSettings the acknowledgementConnectionSettings value to set
     * @return the AS2ProtocolSettings object itself.
     */
    public AS2ProtocolSettings withAcknowledgementConnectionSettings(AS2AcknowledgementConnectionSettings acknowledgementConnectionSettings) {
        this.acknowledgementConnectionSettings = acknowledgementConnectionSettings;
        return this;
    }

    /**
     * Get the MDN settings.
     *
     * @return the mdnSettings value
     */
    public AS2MdnSettings mdnSettings() {
        return this.mdnSettings;
    }

    /**
     * Set the MDN settings.
     *
     * @param mdnSettings the mdnSettings value to set
     * @return the AS2ProtocolSettings object itself.
     */
    public AS2ProtocolSettings withMdnSettings(AS2MdnSettings mdnSettings) {
        this.mdnSettings = mdnSettings;
        return this;
    }

    /**
     * Get the security settings.
     *
     * @return the securitySettings value
     */
    public AS2SecuritySettings securitySettings() {
        return this.securitySettings;
    }

    /**
     * Set the security settings.
     *
     * @param securitySettings the securitySettings value to set
     * @return the AS2ProtocolSettings object itself.
     */
    public AS2ProtocolSettings withSecuritySettings(AS2SecuritySettings securitySettings) {
        this.securitySettings = securitySettings;
        return this;
    }

    /**
     * Get the validation settings.
     *
     * @return the validationSettings value
     */
    public AS2ValidationSettings validationSettings() {
        return this.validationSettings;
    }

    /**
     * Set the validation settings.
     *
     * @param validationSettings the validationSettings value to set
     * @return the AS2ProtocolSettings object itself.
     */
    public AS2ProtocolSettings withValidationSettings(AS2ValidationSettings validationSettings) {
        this.validationSettings = validationSettings;
        return this;
    }

    /**
     * Get the envelope settings.
     *
     * @return the envelopeSettings value
     */
    public AS2EnvelopeSettings envelopeSettings() {
        return this.envelopeSettings;
    }

    /**
     * Set the envelope settings.
     *
     * @param envelopeSettings the envelopeSettings value to set
     * @return the AS2ProtocolSettings object itself.
     */
    public AS2ProtocolSettings withEnvelopeSettings(AS2EnvelopeSettings envelopeSettings) {
        this.envelopeSettings = envelopeSettings;
        return this;
    }

    /**
     * Get the error settings.
     *
     * @return the errorSettings value
     */
    public AS2ErrorSettings errorSettings() {
        return this.errorSettings;
    }

    /**
     * Set the error settings.
     *
     * @param errorSettings the errorSettings value to set
     * @return the AS2ProtocolSettings object itself.
     */
    public AS2ProtocolSettings withErrorSettings(AS2ErrorSettings errorSettings) {
        this.errorSettings = errorSettings;
        return this;
    }

}
