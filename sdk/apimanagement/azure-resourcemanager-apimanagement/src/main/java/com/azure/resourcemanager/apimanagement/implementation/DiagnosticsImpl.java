// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.DiagnosticsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.DiagnosticContractInner;
import com.azure.resourcemanager.apimanagement.models.DiagnosticContract;
import com.azure.resourcemanager.apimanagement.models.Diagnostics;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DiagnosticsImpl implements Diagnostics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiagnosticsImpl.class);

    private final DiagnosticsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public DiagnosticsImpl(
        DiagnosticsClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DiagnosticContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<DiagnosticContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new DiagnosticContractImpl(inner1, this.manager()));
    }

    public PagedIterable<DiagnosticContract> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context) {
        PagedIterable<DiagnosticContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new DiagnosticContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String diagnosticId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, diagnosticId);
    }

    public Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String diagnosticId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, diagnosticId, context);
    }

    public DiagnosticContract get(String resourceGroupName, String serviceName, String diagnosticId) {
        DiagnosticContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, diagnosticId);
        if (inner != null) {
            return new DiagnosticContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticContract> getWithResponse(
        String resourceGroupName, String serviceName, String diagnosticId, Context context) {
        Response<DiagnosticContractInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, diagnosticId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticContract createOrUpdate(
        String resourceGroupName, String serviceName, String diagnosticId, DiagnosticContractInner parameters) {
        DiagnosticContractInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, serviceName, diagnosticId, parameters);
        if (inner != null) {
            return new DiagnosticContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticContract> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String diagnosticId,
        DiagnosticContractInner parameters,
        String ifMatch,
        Context context) {
        Response<DiagnosticContractInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(resourceGroupName, serviceName, diagnosticId, parameters, ifMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticContract update(
        String resourceGroupName,
        String serviceName,
        String diagnosticId,
        String ifMatch,
        DiagnosticContractInner parameters) {
        DiagnosticContractInner inner =
            this.serviceClient().update(resourceGroupName, serviceName, diagnosticId, ifMatch, parameters);
        if (inner != null) {
            return new DiagnosticContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticContract> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String diagnosticId,
        String ifMatch,
        DiagnosticContractInner parameters,
        Context context) {
        Response<DiagnosticContractInner> inner =
            this
                .serviceClient()
                .updateWithResponse(resourceGroupName, serviceName, diagnosticId, ifMatch, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, String diagnosticId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, diagnosticId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String diagnosticId, String ifMatch, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, diagnosticId, ifMatch, context);
    }

    private DiagnosticsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
