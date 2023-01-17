// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.AssemblyDefinitionInner;
import com.azure.resourcemanager.logic.fluent.models.WorkflowTriggerCallbackUrlInner;

/** An instance of this class provides access to all the operations defined in IntegrationAccountAssembliesClient. */
public interface IntegrationAccountAssembliesClient {
    /**
     * List the assemblies for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of assembly definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssemblyDefinitionInner> list(String resourceGroupName, String integrationAccountName);

    /**
     * List the assemblies for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of assembly definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssemblyDefinitionInner> list(
        String resourceGroupName, String integrationAccountName, Context context);

    /**
     * Get an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an assembly for an integration account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AssemblyDefinitionInner> getWithResponse(
        String resourceGroupName, String integrationAccountName, String assemblyArtifactName, Context context);

    /**
     * Get an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an assembly for an integration account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssemblyDefinitionInner get(String resourceGroupName, String integrationAccountName, String assemblyArtifactName);

    /**
     * Create or update an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @param assemblyArtifact The assembly artifact.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the assembly definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AssemblyDefinitionInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String integrationAccountName,
        String assemblyArtifactName,
        AssemblyDefinitionInner assemblyArtifact,
        Context context);

    /**
     * Create or update an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @param assemblyArtifact The assembly artifact.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the assembly definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssemblyDefinitionInner createOrUpdate(
        String resourceGroupName,
        String integrationAccountName,
        String assemblyArtifactName,
        AssemblyDefinitionInner assemblyArtifact);

    /**
     * Delete an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String integrationAccountName, String assemblyArtifactName, Context context);

    /**
     * Delete an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String integrationAccountName, String assemblyArtifactName);

    /**
     * Get the content callback url for an integration account assembly.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the content callback url for an integration account assembly along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkflowTriggerCallbackUrlInner> listContentCallbackUrlWithResponse(
        String resourceGroupName, String integrationAccountName, String assemblyArtifactName, Context context);

    /**
     * Get the content callback url for an integration account assembly.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the content callback url for an integration account assembly.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkflowTriggerCallbackUrlInner listContentCallbackUrl(
        String resourceGroupName, String integrationAccountName, String assemblyArtifactName);
}
