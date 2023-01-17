// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

/** Samples for IntegrationAccounts ListByResourceGroup. */
public final class IntegrationAccountsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccounts_ListByResourceGroup.json
     */
    /**
     * Sample code: List integration accounts by resource group name.
     *
     * @param manager Entry point to LogicManager.
     */
    public static void listIntegrationAccountsByResourceGroupName(
        com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccounts().listByResourceGroup("testResourceGroup", null, com.azure.core.util.Context.NONE);
    }
}
