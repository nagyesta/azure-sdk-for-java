// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.newrelicobservability.models.AccountCreationSource;
import com.azure.resourcemanager.newrelicobservability.models.LiftrResourceCategories;
import com.azure.resourcemanager.newrelicobservability.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.newrelicobservability.models.MonitoringStatus;
import com.azure.resourcemanager.newrelicobservability.models.NewRelicAccountProperties;
import com.azure.resourcemanager.newrelicobservability.models.OrgCreationSource;
import com.azure.resourcemanager.newrelicobservability.models.PlanData;
import com.azure.resourcemanager.newrelicobservability.models.ProvisioningState;
import com.azure.resourcemanager.newrelicobservability.models.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties specific to the NewRelic Monitor resource. */
@Fluent
public final class MonitorProperties {
    /*
     * Provisioning State of the resource
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * MonitoringStatus of the resource
     */
    @JsonProperty(value = "monitoringStatus", access = JsonProperty.Access.WRITE_ONLY)
    private MonitoringStatus monitoringStatus;

    /*
     * NewRelic Organization properties of the resource
     */
    @JsonProperty(value = "marketplaceSubscriptionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private MarketplaceSubscriptionStatus marketplaceSubscriptionStatus;

    /*
     * Marketplace Subscription Id
     */
    @JsonProperty(value = "marketplaceSubscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String marketplaceSubscriptionId;

    /*
     * MarketplaceSubscriptionStatus of the resource
     */
    @JsonProperty(value = "newRelicAccountProperties")
    private NewRelicAccountProperties newRelicAccountProperties;

    /*
     * User Info
     */
    @JsonProperty(value = "userInfo")
    private UserInfo userInfo;

    /*
     * Plan details
     */
    @JsonProperty(value = "planData")
    private PlanData planData;

    /*
     * Liftr resource category
     */
    @JsonProperty(value = "liftrResourceCategory", access = JsonProperty.Access.WRITE_ONLY)
    private LiftrResourceCategories liftrResourceCategory;

    /*
     * Liftr resource preference. The priority of the resource.
     */
    @JsonProperty(value = "liftrResourcePreference", access = JsonProperty.Access.WRITE_ONLY)
    private Integer liftrResourcePreference;

    /*
     * Source of org creation
     */
    @JsonProperty(value = "orgCreationSource")
    private OrgCreationSource orgCreationSource;

    /*
     * Source of account creation
     */
    @JsonProperty(value = "accountCreationSource")
    private AccountCreationSource accountCreationSource;

    /** Creates an instance of MonitorProperties class. */
    public MonitorProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning State of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the monitoringStatus property: MonitoringStatus of the resource.
     *
     * @return the monitoringStatus value.
     */
    public MonitoringStatus monitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * Get the marketplaceSubscriptionStatus property: NewRelic Organization properties of the resource.
     *
     * @return the marketplaceSubscriptionStatus value.
     */
    public MarketplaceSubscriptionStatus marketplaceSubscriptionStatus() {
        return this.marketplaceSubscriptionStatus;
    }

    /**
     * Get the marketplaceSubscriptionId property: Marketplace Subscription Id.
     *
     * @return the marketplaceSubscriptionId value.
     */
    public String marketplaceSubscriptionId() {
        return this.marketplaceSubscriptionId;
    }

    /**
     * Get the newRelicAccountProperties property: MarketplaceSubscriptionStatus of the resource.
     *
     * @return the newRelicAccountProperties value.
     */
    public NewRelicAccountProperties newRelicAccountProperties() {
        return this.newRelicAccountProperties;
    }

    /**
     * Set the newRelicAccountProperties property: MarketplaceSubscriptionStatus of the resource.
     *
     * @param newRelicAccountProperties the newRelicAccountProperties value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withNewRelicAccountProperties(NewRelicAccountProperties newRelicAccountProperties) {
        this.newRelicAccountProperties = newRelicAccountProperties;
        return this;
    }

    /**
     * Get the userInfo property: User Info.
     *
     * @return the userInfo value.
     */
    public UserInfo userInfo() {
        return this.userInfo;
    }

    /**
     * Set the userInfo property: User Info.
     *
     * @param userInfo the userInfo value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    /**
     * Get the planData property: Plan details.
     *
     * @return the planData value.
     */
    public PlanData planData() {
        return this.planData;
    }

    /**
     * Set the planData property: Plan details.
     *
     * @param planData the planData value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withPlanData(PlanData planData) {
        this.planData = planData;
        return this;
    }

    /**
     * Get the liftrResourceCategory property: Liftr resource category.
     *
     * @return the liftrResourceCategory value.
     */
    public LiftrResourceCategories liftrResourceCategory() {
        return this.liftrResourceCategory;
    }

    /**
     * Get the liftrResourcePreference property: Liftr resource preference. The priority of the resource.
     *
     * @return the liftrResourcePreference value.
     */
    public Integer liftrResourcePreference() {
        return this.liftrResourcePreference;
    }

    /**
     * Get the orgCreationSource property: Source of org creation.
     *
     * @return the orgCreationSource value.
     */
    public OrgCreationSource orgCreationSource() {
        return this.orgCreationSource;
    }

    /**
     * Set the orgCreationSource property: Source of org creation.
     *
     * @param orgCreationSource the orgCreationSource value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withOrgCreationSource(OrgCreationSource orgCreationSource) {
        this.orgCreationSource = orgCreationSource;
        return this;
    }

    /**
     * Get the accountCreationSource property: Source of account creation.
     *
     * @return the accountCreationSource value.
     */
    public AccountCreationSource accountCreationSource() {
        return this.accountCreationSource;
    }

    /**
     * Set the accountCreationSource property: Source of account creation.
     *
     * @param accountCreationSource the accountCreationSource value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withAccountCreationSource(AccountCreationSource accountCreationSource) {
        this.accountCreationSource = accountCreationSource;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (newRelicAccountProperties() != null) {
            newRelicAccountProperties().validate();
        }
        if (userInfo() != null) {
            userInfo().validate();
        }
        if (planData() != null) {
            planData().validate();
        }
    }
}
