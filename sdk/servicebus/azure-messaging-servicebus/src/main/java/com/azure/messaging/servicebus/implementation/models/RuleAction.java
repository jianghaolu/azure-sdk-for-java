// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The RuleAction model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = RuleAction.class)
@JsonTypeName("RuleAction")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SqlRuleAction", value = SqlRuleAction.class),
    @JsonSubTypes.Type(name = "EmptyRuleAction", value = EmptyRuleAction.class)
})
@JacksonXmlRootElement(
        localName = "Action",
        namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
@Immutable
public class RuleAction {}
