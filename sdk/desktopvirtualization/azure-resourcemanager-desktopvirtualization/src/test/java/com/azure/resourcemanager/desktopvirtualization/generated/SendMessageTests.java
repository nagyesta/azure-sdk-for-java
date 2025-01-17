// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.SendMessage;
import org.junit.jupiter.api.Assertions;

public final class SendMessageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SendMessage model =
            BinaryData
                .fromString("{\"messageTitle\":\"iakp\",\"messageBody\":\"qqmtedltmmji\"}")
                .toObject(SendMessage.class);
        Assertions.assertEquals("iakp", model.messageTitle());
        Assertions.assertEquals("qqmtedltmmji", model.messageBody());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SendMessage model = new SendMessage().withMessageTitle("iakp").withMessageBody("qqmtedltmmji");
        model = BinaryData.fromObject(model).toObject(SendMessage.class);
        Assertions.assertEquals("iakp", model.messageTitle());
        Assertions.assertEquals("qqmtedltmmji", model.messageBody());
    }
}
