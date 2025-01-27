// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.SignalRUsageName;
import org.junit.jupiter.api.Assertions;

public final class SignalRUsageNameTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SignalRUsageName model =
            BinaryData.fromString("{\"value\":\"s\",\"localizedValue\":\"gbquxigj\"}").toObject(SignalRUsageName.class);
        Assertions.assertEquals("s", model.value());
        Assertions.assertEquals("gbquxigj", model.localizedValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SignalRUsageName model = new SignalRUsageName().withValue("s").withLocalizedValue("gbquxigj");
        model = BinaryData.fromObject(model).toObject(SignalRUsageName.class);
        Assertions.assertEquals("s", model.value());
        Assertions.assertEquals("gbquxigj", model.localizedValue());
    }
}
