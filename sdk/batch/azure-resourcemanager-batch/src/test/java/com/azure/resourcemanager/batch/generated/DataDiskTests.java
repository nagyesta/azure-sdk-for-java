// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.CachingType;
import com.azure.resourcemanager.batch.models.DataDisk;
import com.azure.resourcemanager.batch.models.StorageAccountType;
import org.junit.jupiter.api.Assertions;

public final class DataDiskTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataDisk model =
            BinaryData
                .fromString(
                    "{\"lun\":1863472171,\"caching\":\"ReadOnly\",\"diskSizeGB\":1918631989,\"storageAccountType\":\"Premium_LRS\"}")
                .toObject(DataDisk.class);
        Assertions.assertEquals(1863472171, model.lun());
        Assertions.assertEquals(CachingType.READ_ONLY, model.caching());
        Assertions.assertEquals(1918631989, model.diskSizeGB());
        Assertions.assertEquals(StorageAccountType.PREMIUM_LRS, model.storageAccountType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataDisk model =
            new DataDisk()
                .withLun(1863472171)
                .withCaching(CachingType.READ_ONLY)
                .withDiskSizeGB(1918631989)
                .withStorageAccountType(StorageAccountType.PREMIUM_LRS);
        model = BinaryData.fromObject(model).toObject(DataDisk.class);
        Assertions.assertEquals(1863472171, model.lun());
        Assertions.assertEquals(CachingType.READ_ONLY, model.caching());
        Assertions.assertEquals(1918631989, model.diskSizeGB());
        Assertions.assertEquals(StorageAccountType.PREMIUM_LRS, model.storageAccountType());
    }
}
