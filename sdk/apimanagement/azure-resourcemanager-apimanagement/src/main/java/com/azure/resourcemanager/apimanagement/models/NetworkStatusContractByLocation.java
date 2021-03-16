// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.NetworkStatusContractByLocationInner;

/** An immutable client-side representation of NetworkStatusContractByLocation. */
public interface NetworkStatusContractByLocation {
    /**
     * Gets the location property: Location of service.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the networkStatus property: Network status in Location.
     *
     * @return the networkStatus value.
     */
    NetworkStatusContract networkStatus();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.NetworkStatusContractByLocationInner object.
     *
     * @return the inner object.
     */
    NetworkStatusContractByLocationInner innerModel();
}
