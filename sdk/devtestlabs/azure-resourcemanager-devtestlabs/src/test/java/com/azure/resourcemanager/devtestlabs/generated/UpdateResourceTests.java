// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.UpdateResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class UpdateResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateResource model =
            BinaryData.fromString("{\"tags\":{\"wvxysl\":\"cqaqtdoqmcbx\"}}").toObject(UpdateResource.class);
        Assertions.assertEquals("cqaqtdoqmcbx", model.tags().get("wvxysl"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateResource model = new UpdateResource().withTags(mapOf("wvxysl", "cqaqtdoqmcbx"));
        model = BinaryData.fromObject(model).toObject(UpdateResource.class);
        Assertions.assertEquals("cqaqtdoqmcbx", model.tags().get("wvxysl"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
