// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.models.AccessLevel;
import com.azure.resourcemanager.compute.models.GrantAccessData;

/** Samples for Snapshots GrantAccess. */
public final class SnapshotsGrantAccessSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2022-07-02/examples/snapshotExamples/Snapshot_BeginGetAccess.json
     */
    /**
     * Sample code: Get a sas on a snapshot.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getASasOnASnapshot(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getSnapshots()
            .grantAccess(
                "myResourceGroup",
                "mySnapshot",
                new GrantAccessData().withAccess(AccessLevel.READ).withDurationInSeconds(300),
                com.azure.core.util.Context.NONE);
    }
}
