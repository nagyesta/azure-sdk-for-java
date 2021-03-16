// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.LoggerType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Logger details. */
@JsonFlatten
@Fluent
public class LoggerContractInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoggerContractInner.class);

    /*
     * Logger type.
     */
    @JsonProperty(value = "properties.loggerType")
    private LoggerType loggerType;

    /*
     * Logger description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The name and SendRule connection string of the event hub for
     * azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     */
    @JsonProperty(value = "properties.credentials")
    private Map<String, String> credentials;

    /*
     * Whether records are buffered in the logger before publishing. Default is
     * assumed to be true.
     */
    @JsonProperty(value = "properties.isBuffered")
    private Boolean isBuffered;

    /*
     * Azure Resource Id of a log target (either Azure Event Hub resource or
     * Azure Application Insights resource).
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /**
     * Get the loggerType property: Logger type.
     *
     * @return the loggerType value.
     */
    public LoggerType loggerType() {
        return this.loggerType;
    }

    /**
     * Set the loggerType property: Logger type.
     *
     * @param loggerType the loggerType value to set.
     * @return the LoggerContractInner object itself.
     */
    public LoggerContractInner withLoggerType(LoggerType loggerType) {
        this.loggerType = loggerType;
        return this;
    }

    /**
     * Get the description property: Logger description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Logger description.
     *
     * @param description the description value to set.
     * @return the LoggerContractInner object itself.
     */
    public LoggerContractInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the credentials property: The name and SendRule connection string of the event hub for azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     *
     * @return the credentials value.
     */
    public Map<String, String> credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The name and SendRule connection string of the event hub for azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     *
     * @param credentials the credentials value to set.
     * @return the LoggerContractInner object itself.
     */
    public LoggerContractInner withCredentials(Map<String, String> credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the isBuffered property: Whether records are buffered in the logger before publishing. Default is assumed to
     * be true.
     *
     * @return the isBuffered value.
     */
    public Boolean isBuffered() {
        return this.isBuffered;
    }

    /**
     * Set the isBuffered property: Whether records are buffered in the logger before publishing. Default is assumed to
     * be true.
     *
     * @param isBuffered the isBuffered value to set.
     * @return the LoggerContractInner object itself.
     */
    public LoggerContractInner withIsBuffered(Boolean isBuffered) {
        this.isBuffered = isBuffered;
        return this;
    }

    /**
     * Get the resourceId property: Azure Resource Id of a log target (either Azure Event Hub resource or Azure
     * Application Insights resource).
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Azure Resource Id of a log target (either Azure Event Hub resource or Azure
     * Application Insights resource).
     *
     * @param resourceId the resourceId value to set.
     * @return the LoggerContractInner object itself.
     */
    public LoggerContractInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
