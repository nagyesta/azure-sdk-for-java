// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.DelegationSettingsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalDelegationSettingsInner;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalSettingValidationKeyContractInner;
import com.azure.resourcemanager.apimanagement.models.DelegationSettings;
import com.azure.resourcemanager.apimanagement.models.PortalDelegationSettings;
import com.azure.resourcemanager.apimanagement.models.PortalSettingValidationKeyContract;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DelegationSettingsImpl implements DelegationSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DelegationSettingsImpl.class);

    private final DelegationSettingsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public DelegationSettingsImpl(
        DelegationSettingsClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void getEntityTag(String resourceGroupName, String serviceName) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName);
    }

    public Response<Void> getEntityTagWithResponse(String resourceGroupName, String serviceName, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, context);
    }

    public PortalDelegationSettings get(String resourceGroupName, String serviceName) {
        PortalDelegationSettingsInner inner = this.serviceClient().get(resourceGroupName, serviceName);
        if (inner != null) {
            return new PortalDelegationSettingsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PortalDelegationSettings> getWithResponse(
        String resourceGroupName, String serviceName, Context context) {
        Response<PortalDelegationSettingsInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PortalDelegationSettingsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void update(
        String resourceGroupName, String serviceName, String ifMatch, PortalDelegationSettingsInner parameters) {
        this.serviceClient().update(resourceGroupName, serviceName, ifMatch, parameters);
    }

    public Response<Void> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String ifMatch,
        PortalDelegationSettingsInner parameters,
        Context context) {
        return this.serviceClient().updateWithResponse(resourceGroupName, serviceName, ifMatch, parameters, context);
    }

    public PortalDelegationSettings createOrUpdate(
        String resourceGroupName, String serviceName, PortalDelegationSettingsInner parameters) {
        PortalDelegationSettingsInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, serviceName, parameters);
        if (inner != null) {
            return new PortalDelegationSettingsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PortalDelegationSettings> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        PortalDelegationSettingsInner parameters,
        String ifMatch,
        Context context) {
        Response<PortalDelegationSettingsInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(resourceGroupName, serviceName, parameters, ifMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PortalDelegationSettingsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PortalSettingValidationKeyContract listSecrets(String resourceGroupName, String serviceName) {
        PortalSettingValidationKeyContractInner inner =
            this.serviceClient().listSecrets(resourceGroupName, serviceName);
        if (inner != null) {
            return new PortalSettingValidationKeyContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PortalSettingValidationKeyContract> listSecretsWithResponse(
        String resourceGroupName, String serviceName, Context context) {
        Response<PortalSettingValidationKeyContractInner> inner =
            this.serviceClient().listSecretsWithResponse(resourceGroupName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PortalSettingValidationKeyContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private DelegationSettingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
