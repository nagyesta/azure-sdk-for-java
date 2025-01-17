// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for CertificateObjectGlobalRulestack List. */
public final class CertificateObjectGlobalRulestackListSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2022-08-29/examples/CertificateObjectGlobalRulestack_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: CertificateObjectGlobalRulestack_List_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void certificateObjectGlobalRulestackListMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.certificateObjectGlobalRulestacks().list("praval", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2022-08-29/examples/CertificateObjectGlobalRulestack_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: CertificateObjectGlobalRulestack_List_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void certificateObjectGlobalRulestackListMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.certificateObjectGlobalRulestacks().list("praval", com.azure.core.util.Context.NONE);
    }
}
