// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devhub.fluent.models.OperationListResultInner;
import org.junit.jupiter.api.Test;

public final class OperationListResultInnerTests {
    @Test
    public void testDeserialize() {
        OperationListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"quvgjxpybczme\",\"isDataAction\":true,\"display\":{\"provider\":\"pbsphrupidgs\",\"resource\":\"bejhphoycmsxa\",\"operation\":\"hdxbmtqio\",\"description\":\"zehtbmu\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"},{\"name\":\"izhwlrxy\",\"isDataAction\":false,\"display\":{\"provider\":\"ijgkdm\",\"resource\":\"azlobcufpdznrbt\",\"operation\":\"qjnqglhqgnufoooj\",\"description\":\"ifsqesaagdfmg\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"},{\"name\":\"rifkwm\",\"isDataAction\":true,\"display\":{\"provider\":\"izntocipao\",\"resource\":\"jpsq\",\"operation\":\"mpoyfd\",\"description\":\"ogknygjofjdd\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"}],\"nextLink\":\"upewnwreitjzy\"}")
                .toObject(OperationListResultInner.class);
    }

    @Test
    public void testSerialize() {
        OperationListResultInner model = new OperationListResultInner();
        model = BinaryData.fromObject(model).toObject(OperationListResultInner.class);
    }
}
