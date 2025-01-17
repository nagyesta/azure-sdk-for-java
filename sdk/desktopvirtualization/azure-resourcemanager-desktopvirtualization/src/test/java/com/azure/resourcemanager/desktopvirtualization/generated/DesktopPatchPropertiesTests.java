// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.DesktopPatchProperties;
import org.junit.jupiter.api.Assertions;

public final class DesktopPatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DesktopPatchProperties model =
            BinaryData
                .fromString("{\"description\":\"ikvmkqzeqqk\",\"friendlyName\":\"tfz\"}")
                .toObject(DesktopPatchProperties.class);
        Assertions.assertEquals("ikvmkqzeqqk", model.description());
        Assertions.assertEquals("tfz", model.friendlyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DesktopPatchProperties model =
            new DesktopPatchProperties().withDescription("ikvmkqzeqqk").withFriendlyName("tfz");
        model = BinaryData.fromObject(model).toObject(DesktopPatchProperties.class);
        Assertions.assertEquals("ikvmkqzeqqk", model.description());
        Assertions.assertEquals("tfz", model.friendlyName());
    }
}
