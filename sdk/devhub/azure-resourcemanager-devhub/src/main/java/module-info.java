// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.devhub {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.devhub;
    exports com.azure.resourcemanager.devhub.fluent;
    exports com.azure.resourcemanager.devhub.fluent.models;
    exports com.azure.resourcemanager.devhub.models;

    opens com.azure.resourcemanager.devhub.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.devhub.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
