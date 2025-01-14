// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.models.UpdateGroup;
import com.azure.resourcemanager.containerservicefleet.models.UpdateStage;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UpdateStageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateStage model =
            BinaryData
                .fromString(
                    "{\"name\":\"kfthwxmntei\",\"groups\":[{\"name\":\"pvkmijcmmxdcuf\"},{\"name\":\"fsrpymzidnse\"},{\"name\":\"cxtbzsg\"}],\"afterStageWaitInSeconds\":121296393}")
                .toObject(UpdateStage.class);
        Assertions.assertEquals("kfthwxmntei", model.name());
        Assertions.assertEquals("pvkmijcmmxdcuf", model.groups().get(0).name());
        Assertions.assertEquals(121296393, model.afterStageWaitInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateStage model =
            new UpdateStage()
                .withName("kfthwxmntei")
                .withGroups(
                    Arrays
                        .asList(
                            new UpdateGroup().withName("pvkmijcmmxdcuf"),
                            new UpdateGroup().withName("fsrpymzidnse"),
                            new UpdateGroup().withName("cxtbzsg")))
                .withAfterStageWaitInSeconds(121296393);
        model = BinaryData.fromObject(model).toObject(UpdateStage.class);
        Assertions.assertEquals("kfthwxmntei", model.name());
        Assertions.assertEquals("pvkmijcmmxdcuf", model.groups().get(0).name());
        Assertions.assertEquals(121296393, model.afterStageWaitInSeconds());
    }
}
