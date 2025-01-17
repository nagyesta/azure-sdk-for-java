// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for IngestionSettings ListTokens. */
public final class IngestionSettingsListTokensSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2021-01-15-preview/examples/IngestionSettings/ListTokensIngestionSetting_example.json
     */
    /**
     * Sample code: List ingestion setting tokens.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listIngestionSettingTokens(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.ingestionSettings().listTokensWithResponse("default", com.azure.core.util.Context.NONE);
    }
}
