// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.ConfigurationProperties;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ServerRole;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ServerRoleGroupConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationProperties model =
            BinaryData
                .fromString(
                    "{\"description\":\"hurzafblj\",\"dataType\":\"Integer\",\"allowedValues\":\"toqcjmklja\",\"requiresRestart\":true,\"serverRoleGroupConfigurations\":[{\"role\":\"Worker\",\"value\":\"tqajzyulpkudjkrl\",\"defaultValue\":\"bzhfepgzgqexz\",\"source\":\"c\"},{\"role\":\"Coordinator\",\"value\":\"c\",\"defaultValue\":\"ierhhbcsglummaj\",\"source\":\"aodxo\"},{\"role\":\"Coordinator\",\"value\":\"bdxkqpxokaj\",\"defaultValue\":\"npime\",\"source\":\"stxgc\"}],\"provisioningState\":\"Succeeded\"}")
                .toObject(ConfigurationProperties.class);
        Assertions.assertEquals(true, model.requiresRestart());
        Assertions.assertEquals(ServerRole.WORKER, model.serverRoleGroupConfigurations().get(0).role());
        Assertions.assertEquals("tqajzyulpkudjkrl", model.serverRoleGroupConfigurations().get(0).value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationProperties model =
            new ConfigurationProperties()
                .withRequiresRestart(true)
                .withServerRoleGroupConfigurations(
                    Arrays
                        .asList(
                            new ServerRoleGroupConfiguration()
                                .withRole(ServerRole.WORKER)
                                .withValue("tqajzyulpkudjkrl"),
                            new ServerRoleGroupConfiguration().withRole(ServerRole.COORDINATOR).withValue("c"),
                            new ServerRoleGroupConfiguration()
                                .withRole(ServerRole.COORDINATOR)
                                .withValue("bdxkqpxokaj")));
        model = BinaryData.fromObject(model).toObject(ConfigurationProperties.class);
        Assertions.assertEquals(true, model.requiresRestart());
        Assertions.assertEquals(ServerRole.WORKER, model.serverRoleGroupConfigurations().get(0).role());
        Assertions.assertEquals("tqajzyulpkudjkrl", model.serverRoleGroupConfigurations().get(0).value());
    }
}
