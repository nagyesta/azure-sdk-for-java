// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.connectedvmware.fluent.models.InventoryItemProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The cluster inventory item. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "inventoryType")
@JsonTypeName("Cluster")
@Fluent
public final class ClusterInventoryItem extends InventoryItemProperties {
    /** {@inheritDoc} */
    @Override
    public ClusterInventoryItem withManagedResourceId(String managedResourceId) {
        super.withManagedResourceId(managedResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInventoryItem withMoRefId(String moRefId) {
        super.withMoRefId(moRefId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInventoryItem withMoName(String moName) {
        super.withMoName(moName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
