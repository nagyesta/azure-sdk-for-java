// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.IntegrationServiceEnvironmentNetworkHealthsClient;
import com.azure.resourcemanager.logic.fluent.models.IntegrationServiceEnvironmentSubnetNetworkHealthInner;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentNetworkHealths;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSubnetNetworkHealth;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public final class IntegrationServiceEnvironmentNetworkHealthsImpl
    implements IntegrationServiceEnvironmentNetworkHealths {
    private static final ClientLogger LOGGER = new ClientLogger(IntegrationServiceEnvironmentNetworkHealthsImpl.class);

    private final IntegrationServiceEnvironmentNetworkHealthsClient innerClient;

    private final com.azure.resourcemanager.logic.LogicManager serviceManager;

    public IntegrationServiceEnvironmentNetworkHealthsImpl(
        IntegrationServiceEnvironmentNetworkHealthsClient innerClient,
        com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Map<String, IntegrationServiceEnvironmentSubnetNetworkHealth>> getWithResponse(
        String resourceGroup, String integrationServiceEnvironmentName, Context context) {
        Response<Map<String, IntegrationServiceEnvironmentSubnetNetworkHealthInner>> inner =
            this.serviceClient().getWithResponse(resourceGroup, integrationServiceEnvironmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .entrySet()
                    .stream()
                    .collect(
                        Collectors
                            .toMap(
                                Map.Entry::getKey,
                                inner1 ->
                                    new IntegrationServiceEnvironmentSubnetNetworkHealthImpl(
                                        inner1.getValue(), this.manager()))));
        } else {
            return null;
        }
    }

    public Map<String, IntegrationServiceEnvironmentSubnetNetworkHealth> get(
        String resourceGroup, String integrationServiceEnvironmentName) {
        Map<String, IntegrationServiceEnvironmentSubnetNetworkHealthInner> inner =
            this.serviceClient().get(resourceGroup, integrationServiceEnvironmentName);
        if (inner != null) {
            return Collections
                .unmodifiableMap(
                    inner
                        .entrySet()
                        .stream()
                        .collect(
                            Collectors
                                .toMap(
                                    Map.Entry::getKey,
                                    inner1 ->
                                        new IntegrationServiceEnvironmentSubnetNetworkHealthImpl(
                                            inner1.getValue(), this.manager()))));
        } else {
            return Collections.emptyMap();
        }
    }

    private IntegrationServiceEnvironmentNetworkHealthsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.logic.LogicManager manager() {
        return this.serviceManager;
    }
}
