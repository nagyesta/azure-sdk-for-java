// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Products. */
public interface Products {
    /**
     * Lists a collection of products in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Products list representation.
     */
    PagedIterable<ProductContract> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists a collection of products in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| displayName | filter | ge, le, eq, ne,
     *     gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq, ne, gt,
     *     lt | substringof, contains, startswith, endswith |&lt;/br&gt;| terms | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| state | filter | eq | |&lt;/br&gt;| groups | expand
     *     | | |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param expandGroups When set to true, the response contains an array of groups that have visibility to the
     *     product. The default is false.
     * @param tags Products which are part of a specific tag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Products list representation.
     */
    PagedIterable<ProductContract> listByService(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        Boolean expandGroups,
        String tags,
        Context context);

    /**
     * Gets the entity state (Etag) version of the product specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getEntityTag(String resourceGroupName, String serviceName, String productId);

    /**
     * Gets the entity state (Etag) version of the product specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the product specified by its identifier.
     */
    Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String productId, Context context);

    /**
     * Gets the details of the product specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the product specified by its identifier.
     */
    ProductContract get(String resourceGroupName, String serviceName, String productId);

    /**
     * Gets the details of the product specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the product specified by its identifier.
     */
    Response<ProductContract> getWithResponse(
        String resourceGroupName, String serviceName, String productId, Context context);

    /**
     * Delete product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String productId, String ifMatch);

    /**
     * Delete product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param deleteSubscriptions Delete existing subscriptions associated with the product or not.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        String productId,
        String ifMatch,
        Boolean deleteSubscriptions,
        Context context);

    /**
     * Lists a collection of products associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag list representation.
     */
    PagedIterable<TagResourceContract> listByTags(String resourceGroupName, String serviceName);

    /**
     * Lists a collection of products associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| displayName | filter | ge, le, eq, ne,
     *     gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq, ne, gt,
     *     lt | substringof, contains, startswith, endswith |&lt;/br&gt;| terms | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| state | filter | eq | substringof, contains,
     *     startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param includeNotTaggedProducts Include not tagged Products.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag list representation.
     */
    PagedIterable<TagResourceContract> listByTags(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        Boolean includeNotTaggedProducts,
        Context context);

    /**
     * Gets the details of the product specified by its identifier.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the product specified by its identifier.
     */
    ProductContract getById(String id);

    /**
     * Gets the details of the product specified by its identifier.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the product specified by its identifier.
     */
    Response<ProductContract> getByIdWithResponse(String id, Context context);

    /**
     * Delete product.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete product.
     *
     * @param id the resource ID.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param deleteSubscriptions Delete existing subscriptions associated with the product or not.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, String ifMatch, Boolean deleteSubscriptions, Context context);

    /**
     * Begins definition for a new ProductContract resource.
     *
     * @param name resource name.
     * @return the first stage of the new ProductContract definition.
     */
    ProductContract.DefinitionStages.Blank define(String name);
}
