// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.defendereasm.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.defendereasm.models.ResourceBaseProperties;

public final class ResourceBasePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceBaseProperties model =
            BinaryData.fromString("{\"provisioningState\":\"Failed\"}").toObject(ResourceBaseProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceBaseProperties model = new ResourceBaseProperties();
        model = BinaryData.fromObject(model).toObject(ResourceBaseProperties.class);
    }
}
