/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_08_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that define an exchange peering location.
 */
public class PeeringLocationPropertiesExchange {
    /**
     * The list of exchange peering facilities at the peering location.
     */
    @JsonProperty(value = "peeringFacilities")
    private List<ExchangePeeringFacility> peeringFacilities;

    /**
     * Get the list of exchange peering facilities at the peering location.
     *
     * @return the peeringFacilities value
     */
    public List<ExchangePeeringFacility> peeringFacilities() {
        return this.peeringFacilities;
    }

    /**
     * Set the list of exchange peering facilities at the peering location.
     *
     * @param peeringFacilities the peeringFacilities value to set
     * @return the PeeringLocationPropertiesExchange object itself.
     */
    public PeeringLocationPropertiesExchange withPeeringFacilities(List<ExchangePeeringFacility> peeringFacilities) {
        this.peeringFacilities = peeringFacilities;
        return this;
    }

}
