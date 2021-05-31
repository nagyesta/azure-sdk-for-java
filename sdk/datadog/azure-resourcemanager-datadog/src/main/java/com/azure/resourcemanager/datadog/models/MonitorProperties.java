// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties specific to the monitor resource. */
@Fluent
public final class MonitorProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MonitorProperties.class);

    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Flag specifying if the resource monitoring is enabled or disabled.
     */
    @JsonProperty(value = "monitoringStatus")
    private MonitoringStatus monitoringStatus;

    /*
     * Flag specifying the Marketplace Subscription Status of the resource. If
     * payment is not made in time, the resource will go in Suspended state.
     */
    @JsonProperty(value = "marketplaceSubscriptionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private MarketplaceSubscriptionStatus marketplaceSubscriptionStatus;

    /*
     * Datadog organization properties
     */
    @JsonProperty(value = "datadogOrganizationProperties")
    private DatadogOrganizationProperties datadogOrganizationProperties;

    /*
     * User info
     */
    @JsonProperty(value = "userInfo")
    private UserInfo userInfo;

    /*
     * The liftrResourceCategory property.
     */
    @JsonProperty(value = "liftrResourceCategory", access = JsonProperty.Access.WRITE_ONLY)
    private LiftrResourceCategories liftrResourceCategory;

    /*
     * The priority of the resource.
     */
    @JsonProperty(value = "liftrResourcePreference", access = JsonProperty.Access.WRITE_ONLY)
    private Integer liftrResourcePreference;

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the monitoringStatus property: Flag specifying if the resource monitoring is enabled or disabled.
     *
     * @return the monitoringStatus value.
     */
    public MonitoringStatus monitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * Set the monitoringStatus property: Flag specifying if the resource monitoring is enabled or disabled.
     *
     * @param monitoringStatus the monitoringStatus value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.monitoringStatus = monitoringStatus;
        return this;
    }

    /**
     * Get the marketplaceSubscriptionStatus property: Flag specifying the Marketplace Subscription Status of the
     * resource. If payment is not made in time, the resource will go in Suspended state.
     *
     * @return the marketplaceSubscriptionStatus value.
     */
    public MarketplaceSubscriptionStatus marketplaceSubscriptionStatus() {
        return this.marketplaceSubscriptionStatus;
    }

    /**
     * Get the datadogOrganizationProperties property: Datadog organization properties.
     *
     * @return the datadogOrganizationProperties value.
     */
    public DatadogOrganizationProperties datadogOrganizationProperties() {
        return this.datadogOrganizationProperties;
    }

    /**
     * Set the datadogOrganizationProperties property: Datadog organization properties.
     *
     * @param datadogOrganizationProperties the datadogOrganizationProperties value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withDatadogOrganizationProperties(
        DatadogOrganizationProperties datadogOrganizationProperties) {
        this.datadogOrganizationProperties = datadogOrganizationProperties;
        return this;
    }

    /**
     * Get the userInfo property: User info.
     *
     * @return the userInfo value.
     */
    public UserInfo userInfo() {
        return this.userInfo;
    }

    /**
     * Set the userInfo property: User info.
     *
     * @param userInfo the userInfo value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    /**
     * Get the liftrResourceCategory property: The liftrResourceCategory property.
     *
     * @return the liftrResourceCategory value.
     */
    public LiftrResourceCategories liftrResourceCategory() {
        return this.liftrResourceCategory;
    }

    /**
     * Get the liftrResourcePreference property: The priority of the resource.
     *
     * @return the liftrResourcePreference value.
     */
    public Integer liftrResourcePreference() {
        return this.liftrResourcePreference;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (datadogOrganizationProperties() != null) {
            datadogOrganizationProperties().validate();
        }
        if (userInfo() != null) {
            userInfo().validate();
        }
    }
}
