// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.TenantAccessGitsClient;
import com.azure.resourcemanager.apimanagement.models.AccessIdName;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in TenantAccessGitsClient. */
public final class TenantAccessGitsClientImpl implements TenantAccessGitsClient {
    private final ClientLogger logger = new ClientLogger(TenantAccessGitsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final TenantAccessGitsService service;

    /** The service client containing this operation class. */
    private final ApiManagementClientImpl client;

    /**
     * Initializes an instance of TenantAccessGitsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    TenantAccessGitsClientImpl(ApiManagementClientImpl client) {
        this.service =
            RestProxy.create(TenantAccessGitsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiManagementClientTenantAccessGits to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApiManagementClientT")
    private interface TenantAccessGitsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/tenant/{accessName}/git/regeneratePrimaryKey")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> regeneratePrimaryKey(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("accessName") AccessIdName accessName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/tenant/{accessName}/git/regenerateSecondaryKey")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> regenerateSecondaryKey(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("accessName") AccessIdName accessName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Regenerate primary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> regeneratePrimaryKeyWithResponseAsync(
        String resourceGroupName, String serviceName, AccessIdName accessName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (accessName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accessName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .regeneratePrimaryKey(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serviceName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accessName,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Regenerate primary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> regeneratePrimaryKeyWithResponseAsync(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (accessName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accessName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .regeneratePrimaryKey(
                this.client.getEndpoint(),
                resourceGroupName,
                serviceName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accessName,
                accept,
                context);
    }

    /**
     * Regenerate primary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> regeneratePrimaryKeyAsync(
        String resourceGroupName, String serviceName, AccessIdName accessName) {
        return regeneratePrimaryKeyWithResponseAsync(resourceGroupName, serviceName, accessName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Regenerate primary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void regeneratePrimaryKey(String resourceGroupName, String serviceName, AccessIdName accessName) {
        regeneratePrimaryKeyAsync(resourceGroupName, serviceName, accessName).block();
    }

    /**
     * Regenerate primary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> regeneratePrimaryKeyWithResponse(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context) {
        return regeneratePrimaryKeyWithResponseAsync(resourceGroupName, serviceName, accessName, context).block();
    }

    /**
     * Regenerate secondary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> regenerateSecondaryKeyWithResponseAsync(
        String resourceGroupName, String serviceName, AccessIdName accessName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (accessName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accessName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .regenerateSecondaryKey(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serviceName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accessName,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Regenerate secondary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> regenerateSecondaryKeyWithResponseAsync(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (accessName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accessName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .regenerateSecondaryKey(
                this.client.getEndpoint(),
                resourceGroupName,
                serviceName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accessName,
                accept,
                context);
    }

    /**
     * Regenerate secondary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> regenerateSecondaryKeyAsync(
        String resourceGroupName, String serviceName, AccessIdName accessName) {
        return regenerateSecondaryKeyWithResponseAsync(resourceGroupName, serviceName, accessName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Regenerate secondary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void regenerateSecondaryKey(String resourceGroupName, String serviceName, AccessIdName accessName) {
        regenerateSecondaryKeyAsync(resourceGroupName, serviceName, accessName).block();
    }

    /**
     * Regenerate secondary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> regenerateSecondaryKeyWithResponse(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context) {
        return regenerateSecondaryKeyWithResponseAsync(resourceGroupName, serviceName, accessName, context).block();
    }
}
