// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Quota properties for the specified resource. */
@Fluent
public final class QuotaProperties {
    /*
     * Resource quota limit properties.
     */
    @JsonProperty(value = "limit")
    private LimitJsonObject limit;

    /*
     * The quota units, such as Count and Bytes. When requesting quota, use the **unit** value returned in the GET
     * response in the request body of your PUT operation.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * Resource name provided by the resource provider. Use this property name when requesting quota.
     */
    @JsonProperty(value = "name")
    private ResourceName name;

    /*
     * The name of the resource type. Optional field.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * The time period over which the quota usage values are summarized. For example:
     * *P1D (per one day)
     * *PT1M (per one minute)
     * *PT1S (per one second).
     * This parameter is optional because, for some resources like compute, the period is irrelevant.
     */
    @JsonProperty(value = "quotaPeriod", access = JsonProperty.Access.WRITE_ONLY)
    private String quotaPeriod;

    /*
     * States if quota can be requested for this resource.
     */
    @JsonProperty(value = "isQuotaApplicable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isQuotaApplicable;

    /*
     * Additional properties for the specific resource provider.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /** Creates an instance of QuotaProperties class. */
    public QuotaProperties() {
    }

    /**
     * Get the limit property: Resource quota limit properties.
     *
     * @return the limit value.
     */
    public LimitJsonObject limit() {
        return this.limit;
    }

    /**
     * Set the limit property: Resource quota limit properties.
     *
     * @param limit the limit value to set.
     * @return the QuotaProperties object itself.
     */
    public QuotaProperties withLimit(LimitJsonObject limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the unit property: The quota units, such as Count and Bytes. When requesting quota, use the **unit** value
     * returned in the GET response in the request body of your PUT operation.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the name property: Resource name provided by the resource provider. Use this property name when requesting
     * quota.
     *
     * @return the name value.
     */
    public ResourceName name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name provided by the resource provider. Use this property name when requesting
     * quota.
     *
     * @param name the name value to set.
     * @return the QuotaProperties object itself.
     */
    public QuotaProperties withName(ResourceName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resourceType property: The name of the resource type. Optional field.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The name of the resource type. Optional field.
     *
     * @param resourceType the resourceType value to set.
     * @return the QuotaProperties object itself.
     */
    public QuotaProperties withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the quotaPeriod property: The time period over which the quota usage values are summarized. For example: *P1D
     * (per one day) *PT1M (per one minute) *PT1S (per one second). This parameter is optional because, for some
     * resources like compute, the period is irrelevant.
     *
     * @return the quotaPeriod value.
     */
    public String quotaPeriod() {
        return this.quotaPeriod;
    }

    /**
     * Get the isQuotaApplicable property: States if quota can be requested for this resource.
     *
     * @return the isQuotaApplicable value.
     */
    public Boolean isQuotaApplicable() {
        return this.isQuotaApplicable;
    }

    /**
     * Get the properties property: Additional properties for the specific resource provider.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Additional properties for the specific resource provider.
     *
     * @param properties the properties value to set.
     * @return the QuotaProperties object itself.
     */
    public QuotaProperties withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (limit() != null) {
            limit().validate();
        }
        if (name() != null) {
            name().validate();
        }
    }
}
