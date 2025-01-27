// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicenetworking.fluent.models.AssociationInner;
import com.azure.resourcemanager.servicenetworking.models.AssociationSubnet;
import com.azure.resourcemanager.servicenetworking.models.AssociationType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AssociationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AssociationInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"associationType\":\"subnets\",\"subnet\":{\"id\":\"eju\"},\"provisioningState\":\"Canceled\"},\"location\":\"wrlyxwjkcprb\",\"tags\":{\"ysszdnrujqguh\":\"xgjvtbv\"},\"id\":\"uouq\",\"name\":\"prwzwbnguitnwui\",\"type\":\"gazxuf\"}")
                .toObject(AssociationInner.class);
        Assertions.assertEquals("wrlyxwjkcprb", model.location());
        Assertions.assertEquals("xgjvtbv", model.tags().get("ysszdnrujqguh"));
        Assertions.assertEquals(AssociationType.SUBNETS, model.associationType());
        Assertions.assertEquals("eju", model.subnet().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AssociationInner model =
            new AssociationInner()
                .withLocation("wrlyxwjkcprb")
                .withTags(mapOf("ysszdnrujqguh", "xgjvtbv"))
                .withAssociationType(AssociationType.SUBNETS)
                .withSubnet(new AssociationSubnet().withId("eju"));
        model = BinaryData.fromObject(model).toObject(AssociationInner.class);
        Assertions.assertEquals("wrlyxwjkcprb", model.location());
        Assertions.assertEquals("xgjvtbv", model.tags().get("ysszdnrujqguh"));
        Assertions.assertEquals(AssociationType.SUBNETS, model.associationType());
        Assertions.assertEquals("eju", model.subnet().id());
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
