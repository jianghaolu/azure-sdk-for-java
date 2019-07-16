/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.CosmosDBManager;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.ThroughputInner;
import java.util.Map;

/**
 * Type representing Throughput.
 */
public interface Throughput extends HasInner<ThroughputInner>, HasManager<CosmosDBManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the throughput value.
     */
    int throughput();

    /**
     * @return the type value.
     */
    String type();

}
