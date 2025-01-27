// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of provisioned clusters that contain secrets. */
@Fluent
public class ProvisionedClustersPropertiesWithSecrets {
    /*
     * AAD profile for the provisioned cluster.
     */
    @JsonProperty(value = "aadProfile")
    private AadProfile aadProfile;

    /*
     * WindowsProfile - Profile for Windows VMs in the Provisioned Cluster.
     */
    @JsonProperty(value = "windowsProfile")
    private WindowsProfile windowsProfile;

    /*
     * HttpProxyConfig - Configurations for provisioning the cluster with HTTP proxy servers.
     */
    @JsonProperty(value = "httpProxyConfig")
    private HttpProxyConfig httpProxyConfig;

    /** Creates an instance of ProvisionedClustersPropertiesWithSecrets class. */
    public ProvisionedClustersPropertiesWithSecrets() {
    }

    /**
     * Get the aadProfile property: AAD profile for the provisioned cluster.
     *
     * @return the aadProfile value.
     */
    public AadProfile aadProfile() {
        return this.aadProfile;
    }

    /**
     * Set the aadProfile property: AAD profile for the provisioned cluster.
     *
     * @param aadProfile the aadProfile value to set.
     * @return the ProvisionedClustersPropertiesWithSecrets object itself.
     */
    public ProvisionedClustersPropertiesWithSecrets withAadProfile(AadProfile aadProfile) {
        this.aadProfile = aadProfile;
        return this;
    }

    /**
     * Get the windowsProfile property: WindowsProfile - Profile for Windows VMs in the Provisioned Cluster.
     *
     * @return the windowsProfile value.
     */
    public WindowsProfile windowsProfile() {
        return this.windowsProfile;
    }

    /**
     * Set the windowsProfile property: WindowsProfile - Profile for Windows VMs in the Provisioned Cluster.
     *
     * @param windowsProfile the windowsProfile value to set.
     * @return the ProvisionedClustersPropertiesWithSecrets object itself.
     */
    public ProvisionedClustersPropertiesWithSecrets withWindowsProfile(WindowsProfile windowsProfile) {
        this.windowsProfile = windowsProfile;
        return this;
    }

    /**
     * Get the httpProxyConfig property: HttpProxyConfig - Configurations for provisioning the cluster with HTTP proxy
     * servers.
     *
     * @return the httpProxyConfig value.
     */
    public HttpProxyConfig httpProxyConfig() {
        return this.httpProxyConfig;
    }

    /**
     * Set the httpProxyConfig property: HttpProxyConfig - Configurations for provisioning the cluster with HTTP proxy
     * servers.
     *
     * @param httpProxyConfig the httpProxyConfig value to set.
     * @return the ProvisionedClustersPropertiesWithSecrets object itself.
     */
    public ProvisionedClustersPropertiesWithSecrets withHttpProxyConfig(HttpProxyConfig httpProxyConfig) {
        this.httpProxyConfig = httpProxyConfig;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (aadProfile() != null) {
            aadProfile().validate();
        }
        if (windowsProfile() != null) {
            windowsProfile().validate();
        }
        if (httpProxyConfig() != null) {
            httpProxyConfig().validate();
        }
    }
}
