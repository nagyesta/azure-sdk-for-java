// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager;
import com.azure.resourcemanager.appcomplianceautomation.models.ReportResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ReportOperationsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"id\":\"oty\",\"status\":\"Failed\",\"tenantId\":\"njbkcnxdhbttkph\",\"reportName\":\"pnvjtoqnermclf\",\"offerGuid\":\"phoxus\",\"timeZone\":\"rpabg\",\"triggerTime\":\"2021-05-19T18:27:36Z\",\"nextTriggerTime\":\"2021-06-14T01:08:13Z\",\"lastTriggerTime\":\"2021-08-09T16:13:09Z\",\"subscriptions\":[\"zq\",\"gxywpmue\",\"fjz\",\"fqkquj\"],\"resources\":[],\"complianceStatus\":{},\"provisioningState\":\"Canceled\"},\"id\":\"obglaocqxtcc\",\"name\":\"g\",\"type\":\"udxytlmoyrx\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        AppComplianceAutomationManager manager =
            AppComplianceAutomationManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ReportResource response = manager.reportOperations().getWithResponse("micykvceoveilo", Context.NONE).getValue();

        Assertions.assertEquals("phoxus", response.properties().offerGuid());
        Assertions.assertEquals("rpabg", response.properties().timeZone());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-19T18:27:36Z"), response.properties().triggerTime());
    }
}
