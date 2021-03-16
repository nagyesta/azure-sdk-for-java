// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.GatewayApisClient;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiContractInner;
import com.azure.resourcemanager.apimanagement.models.ApiContract;
import com.azure.resourcemanager.apimanagement.models.AssociationContract;
import com.azure.resourcemanager.apimanagement.models.GatewayApis;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class GatewayApisImpl implements GatewayApis {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GatewayApisImpl.class);

    private final GatewayApisClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public GatewayApisImpl(
        GatewayApisClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ApiContract> listByService(String resourceGroupName, String serviceName, String gatewayId) {
        PagedIterable<ApiContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, gatewayId);
        return Utils.mapPage(inner, inner1 -> new ApiContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ApiContract> listByService(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        String filter,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<ApiContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, gatewayId, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new ApiContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String gatewayId, String apiId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, gatewayId, apiId);
    }

    public Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String apiId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, gatewayId, apiId, context);
    }

    public ApiContract createOrUpdate(String resourceGroupName, String serviceName, String gatewayId, String apiId) {
        ApiContractInner inner = this.serviceClient().createOrUpdate(resourceGroupName, serviceName, gatewayId, apiId);
        if (inner != null) {
            return new ApiContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApiContract> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        String apiId,
        AssociationContract parameters,
        Context context) {
        Response<ApiContractInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(resourceGroupName, serviceName, gatewayId, apiId, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApiContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, String gatewayId, String apiId) {
        this.serviceClient().delete(resourceGroupName, serviceName, gatewayId, apiId);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String apiId, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, gatewayId, apiId, context);
    }

    private GatewayApisClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
