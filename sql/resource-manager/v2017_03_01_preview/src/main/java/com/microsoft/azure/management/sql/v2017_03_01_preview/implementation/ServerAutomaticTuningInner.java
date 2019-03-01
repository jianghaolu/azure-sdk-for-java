/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.AutomaticTuningServerMode;
import java.util.Map;
import com.microsoft.azure.management.sql.v2017_03_01_preview.AutomaticTuningServerOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Server-level Automatic Tuning.
 */
@JsonFlatten
public class ServerAutomaticTuningInner extends ProxyResource {
    /**
     * Automatic tuning desired state. Possible values include: 'Custom',
     * 'Auto', 'Unspecified'.
     */
    @JsonProperty(value = "properties.desiredState")
    private AutomaticTuningServerMode desiredState;

    /**
     * Automatic tuning actual state. Possible values include: 'Custom',
     * 'Auto', 'Unspecified'.
     */
    @JsonProperty(value = "properties.actualState", access = JsonProperty.Access.WRITE_ONLY)
    private AutomaticTuningServerMode actualState;

    /**
     * Automatic tuning options definition.
     */
    @JsonProperty(value = "properties.options")
    private Map<String, AutomaticTuningServerOptions> options;

    /**
     * Get automatic tuning desired state. Possible values include: 'Custom', 'Auto', 'Unspecified'.
     *
     * @return the desiredState value
     */
    public AutomaticTuningServerMode desiredState() {
        return this.desiredState;
    }

    /**
     * Set automatic tuning desired state. Possible values include: 'Custom', 'Auto', 'Unspecified'.
     *
     * @param desiredState the desiredState value to set
     * @return the ServerAutomaticTuningInner object itself.
     */
    public ServerAutomaticTuningInner withDesiredState(AutomaticTuningServerMode desiredState) {
        this.desiredState = desiredState;
        return this;
    }

    /**
     * Get automatic tuning actual state. Possible values include: 'Custom', 'Auto', 'Unspecified'.
     *
     * @return the actualState value
     */
    public AutomaticTuningServerMode actualState() {
        return this.actualState;
    }

    /**
     * Get automatic tuning options definition.
     *
     * @return the options value
     */
    public Map<String, AutomaticTuningServerOptions> options() {
        return this.options;
    }

    /**
     * Set automatic tuning options definition.
     *
     * @param options the options value to set
     * @return the ServerAutomaticTuningInner object itself.
     */
    public ServerAutomaticTuningInner withOptions(Map<String, AutomaticTuningServerOptions> options) {
        this.options = options;
        return this;
    }

}
