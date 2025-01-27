// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NginxPrivateIpAddress model. */
@Fluent
public final class NginxPrivateIpAddress {
    /*
     * The privateIPAddress property.
     */
    @JsonProperty(value = "privateIPAddress")
    private String privateIpAddress;

    /*
     * The privateIPAllocationMethod property.
     */
    @JsonProperty(value = "privateIPAllocationMethod")
    private NginxPrivateIpAllocationMethod privateIpAllocationMethod;

    /*
     * The subnetId property.
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /** Creates an instance of NginxPrivateIpAddress class. */
    public NginxPrivateIpAddress() {
    }

    /**
     * Get the privateIpAddress property: The privateIPAddress property.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The privateIPAddress property.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the NginxPrivateIpAddress object itself.
     */
    public NginxPrivateIpAddress withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The privateIPAllocationMethod property.
     *
     * @return the privateIpAllocationMethod value.
     */
    public NginxPrivateIpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: The privateIPAllocationMethod property.
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the NginxPrivateIpAddress object itself.
     */
    public NginxPrivateIpAddress withPrivateIpAllocationMethod(
        NginxPrivateIpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the subnetId property: The subnetId property.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The subnetId property.
     *
     * @param subnetId the subnetId value to set.
     * @return the NginxPrivateIpAddress object itself.
     */
    public NginxPrivateIpAddress withSubnetId(String subnetId) {
        this.subnetId = subnetId;
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
