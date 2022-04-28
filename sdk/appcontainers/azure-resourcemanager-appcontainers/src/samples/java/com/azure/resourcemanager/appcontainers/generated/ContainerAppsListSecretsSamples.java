// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.Context;

/** Samples for ContainerApps ListSecrets. */
public final class ContainerAppsListSecretsSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2022-01-01-preview/examples/ContainerApps_ListSecrets.json
     */
    /**
     * Sample code: List Container Apps Secrets.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listContainerAppsSecrets(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerApps().listSecretsWithResponse("rg", "testcontainerApp0", Context.NONE);
    }
}
