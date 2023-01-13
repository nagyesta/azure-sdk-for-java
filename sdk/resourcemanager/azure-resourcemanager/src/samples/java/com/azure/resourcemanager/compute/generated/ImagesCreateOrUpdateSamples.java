// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.fluent.models.ImageInner;
import com.azure.resourcemanager.compute.models.DiskEncryptionSetParameters;
import com.azure.resourcemanager.compute.models.ImageDataDisk;
import com.azure.resourcemanager.compute.models.ImageOSDisk;
import com.azure.resourcemanager.compute.models.ImageStorageProfile;
import com.azure.resourcemanager.compute.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import java.util.Arrays;

/** Samples for Images CreateOrUpdate. */
public final class ImagesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/imageExamples/Image_CreateFromASnapshot.json
     */
    /**
     * Sample code: Create a virtual machine image from a snapshot.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAVirtualMachineImageFromASnapshot(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getImages()
            .createOrUpdate(
                "myResourceGroup",
                "myImage",
                new ImageInner()
                    .withLocation("West US")
                    .withStorageProfile(
                        new ImageStorageProfile()
                            .withOsDisk(
                                new ImageOSDisk()
                                    .withSnapshot(
                                        new SubResource()
                                            .withId(
                                                "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot"))
                                    .withOsType(OperatingSystemTypes.LINUX)
                                    .withOsState(OperatingSystemStateTypes.GENERALIZED))
                            .withZoneResilient(false)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/imageExamples/Image_CreateFromAManagedDisk.json
     */
    /**
     * Sample code: Create a virtual machine image from a managed disk.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAVirtualMachineImageFromAManagedDisk(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getImages()
            .createOrUpdate(
                "myResourceGroup",
                "myImage",
                new ImageInner()
                    .withLocation("West US")
                    .withStorageProfile(
                        new ImageStorageProfile()
                            .withOsDisk(
                                new ImageOSDisk()
                                    .withManagedDisk(
                                        new SubResource()
                                            .withId(
                                                "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/myManagedDisk"))
                                    .withOsType(OperatingSystemTypes.LINUX)
                                    .withOsState(OperatingSystemStateTypes.GENERALIZED))
                            .withZoneResilient(true)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/imageExamples/Image_CreateFromABlobWithDiskEncryptionSet.json
     */
    /**
     * Sample code: Create a virtual machine image from a blob with DiskEncryptionSet resource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAVirtualMachineImageFromABlobWithDiskEncryptionSetResource(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getImages()
            .createOrUpdate(
                "myResourceGroup",
                "myImage",
                new ImageInner()
                    .withLocation("West US")
                    .withStorageProfile(
                        new ImageStorageProfile()
                            .withOsDisk(
                                new ImageOSDisk()
                                    .withBlobUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd")
                                    .withDiskEncryptionSet(
                                        new DiskEncryptionSetParameters()
                                            .withId(
                                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}"))
                                    .withOsType(OperatingSystemTypes.LINUX)
                                    .withOsState(OperatingSystemStateTypes.GENERALIZED))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/imageExamples/Image_CreateFromAManagedDiskWithDiskEncryptionSet.json
     */
    /**
     * Sample code: Create a virtual machine image from a managed disk with DiskEncryptionSet resource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAVirtualMachineImageFromAManagedDiskWithDiskEncryptionSetResource(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getImages()
            .createOrUpdate(
                "myResourceGroup",
                "myImage",
                new ImageInner()
                    .withLocation("West US")
                    .withStorageProfile(
                        new ImageStorageProfile()
                            .withOsDisk(
                                new ImageOSDisk()
                                    .withSnapshot(
                                        new SubResource()
                                            .withId(
                                                "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot"))
                                    .withDiskEncryptionSet(
                                        new DiskEncryptionSetParameters()
                                            .withId(
                                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}"))
                                    .withOsType(OperatingSystemTypes.LINUX)
                                    .withOsState(OperatingSystemStateTypes.GENERALIZED))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/imageExamples/Image_Create_DataDiskFromABlobIncluded.json
     */
    /**
     * Sample code: Create a virtual machine image that includes a data disk from a blob.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAVirtualMachineImageThatIncludesADataDiskFromABlob(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getImages()
            .createOrUpdate(
                "myResourceGroup",
                "myImage",
                new ImageInner()
                    .withLocation("West US")
                    .withStorageProfile(
                        new ImageStorageProfile()
                            .withOsDisk(
                                new ImageOSDisk()
                                    .withBlobUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd")
                                    .withOsType(OperatingSystemTypes.LINUX)
                                    .withOsState(OperatingSystemStateTypes.GENERALIZED))
                            .withDataDisks(
                                Arrays
                                    .asList(
                                        new ImageDataDisk()
                                            .withBlobUri(
                                                "https://mystorageaccount.blob.core.windows.net/dataimages/dataimage.vhd")
                                            .withLun(1)))
                            .withZoneResilient(false)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/imageExamples/Image_CreateFromASnapshotWithDiskEncryptionSet.json
     */
    /**
     * Sample code: Create a virtual machine image from a snapshot with DiskEncryptionSet resource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAVirtualMachineImageFromASnapshotWithDiskEncryptionSetResource(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getImages()
            .createOrUpdate(
                "myResourceGroup",
                "myImage",
                new ImageInner()
                    .withLocation("West US")
                    .withStorageProfile(
                        new ImageStorageProfile()
                            .withOsDisk(
                                new ImageOSDisk()
                                    .withManagedDisk(
                                        new SubResource()
                                            .withId(
                                                "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/myManagedDisk"))
                                    .withDiskEncryptionSet(
                                        new DiskEncryptionSetParameters()
                                            .withId(
                                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}"))
                                    .withOsType(OperatingSystemTypes.LINUX)
                                    .withOsState(OperatingSystemStateTypes.GENERALIZED))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/imageExamples/Image_Create_DataDiskFromASnapshotIncluded.json
     */
    /**
     * Sample code: Create a virtual machine image that includes a data disk from a snapshot.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAVirtualMachineImageThatIncludesADataDiskFromASnapshot(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getImages()
            .createOrUpdate(
                "myResourceGroup",
                "myImage",
                new ImageInner()
                    .withLocation("West US")
                    .withStorageProfile(
                        new ImageStorageProfile()
                            .withOsDisk(
                                new ImageOSDisk()
                                    .withSnapshot(
                                        new SubResource()
                                            .withId(
                                                "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot"))
                                    .withOsType(OperatingSystemTypes.LINUX)
                                    .withOsState(OperatingSystemStateTypes.GENERALIZED))
                            .withDataDisks(
                                Arrays
                                    .asList(
                                        new ImageDataDisk()
                                            .withSnapshot(
                                                new SubResource()
                                                    .withId(
                                                        "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot2"))
                                            .withLun(1)))
                            .withZoneResilient(true)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/imageExamples/Image_CreateFromABlob.json
     */
    /**
     * Sample code: Create a virtual machine image from a blob.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAVirtualMachineImageFromABlob(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getImages()
            .createOrUpdate(
                "myResourceGroup",
                "myImage",
                new ImageInner()
                    .withLocation("West US")
                    .withStorageProfile(
                        new ImageStorageProfile()
                            .withOsDisk(
                                new ImageOSDisk()
                                    .withBlobUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd")
                                    .withOsType(OperatingSystemTypes.LINUX)
                                    .withOsState(OperatingSystemStateTypes.GENERALIZED))
                            .withZoneResilient(true)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/imageExamples/Image_CreateFromAVM.json
     */
    /**
     * Sample code: Create a virtual machine image from an existing virtual machine.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAVirtualMachineImageFromAnExistingVirtualMachine(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getImages()
            .createOrUpdate(
                "myResourceGroup",
                "myImage",
                new ImageInner()
                    .withLocation("West US")
                    .withSourceVirtualMachine(
                        new SubResource()
                            .withId(
                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVM")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/imageExamples/Image_Create_DataDiskFromAManagedDiskIncluded.json
     */
    /**
     * Sample code: Create a virtual machine image that includes a data disk from a managed disk.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAVirtualMachineImageThatIncludesADataDiskFromAManagedDisk(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getImages()
            .createOrUpdate(
                "myResourceGroup",
                "myImage",
                new ImageInner()
                    .withLocation("West US")
                    .withStorageProfile(
                        new ImageStorageProfile()
                            .withOsDisk(
                                new ImageOSDisk()
                                    .withManagedDisk(
                                        new SubResource()
                                            .withId(
                                                "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/myManagedDisk"))
                                    .withOsType(OperatingSystemTypes.LINUX)
                                    .withOsState(OperatingSystemStateTypes.GENERALIZED))
                            .withDataDisks(
                                Arrays
                                    .asList(
                                        new ImageDataDisk()
                                            .withManagedDisk(
                                                new SubResource()
                                                    .withId(
                                                        "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/myManagedDisk2"))
                                            .withLun(1)))
                            .withZoneResilient(false)),
                com.azure.core.util.Context.NONE);
    }
}
