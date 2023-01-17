// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The access control configuration. */
@Fluent
public final class FlowAccessControlConfiguration {
    /*
     * The access control configuration for invoking workflow triggers.
     */
    @JsonProperty(value = "triggers")
    private FlowAccessControlConfigurationPolicy triggers;

    /*
     * The access control configuration for accessing workflow run contents.
     */
    @JsonProperty(value = "contents")
    private FlowAccessControlConfigurationPolicy contents;

    /*
     * The access control configuration for workflow actions.
     */
    @JsonProperty(value = "actions")
    private FlowAccessControlConfigurationPolicy actions;

    /*
     * The access control configuration for workflow management.
     */
    @JsonProperty(value = "workflowManagement")
    private FlowAccessControlConfigurationPolicy workflowManagement;

    /** Creates an instance of FlowAccessControlConfiguration class. */
    public FlowAccessControlConfiguration() {
    }

    /**
     * Get the triggers property: The access control configuration for invoking workflow triggers.
     *
     * @return the triggers value.
     */
    public FlowAccessControlConfigurationPolicy triggers() {
        return this.triggers;
    }

    /**
     * Set the triggers property: The access control configuration for invoking workflow triggers.
     *
     * @param triggers the triggers value to set.
     * @return the FlowAccessControlConfiguration object itself.
     */
    public FlowAccessControlConfiguration withTriggers(FlowAccessControlConfigurationPolicy triggers) {
        this.triggers = triggers;
        return this;
    }

    /**
     * Get the contents property: The access control configuration for accessing workflow run contents.
     *
     * @return the contents value.
     */
    public FlowAccessControlConfigurationPolicy contents() {
        return this.contents;
    }

    /**
     * Set the contents property: The access control configuration for accessing workflow run contents.
     *
     * @param contents the contents value to set.
     * @return the FlowAccessControlConfiguration object itself.
     */
    public FlowAccessControlConfiguration withContents(FlowAccessControlConfigurationPolicy contents) {
        this.contents = contents;
        return this;
    }

    /**
     * Get the actions property: The access control configuration for workflow actions.
     *
     * @return the actions value.
     */
    public FlowAccessControlConfigurationPolicy actions() {
        return this.actions;
    }

    /**
     * Set the actions property: The access control configuration for workflow actions.
     *
     * @param actions the actions value to set.
     * @return the FlowAccessControlConfiguration object itself.
     */
    public FlowAccessControlConfiguration withActions(FlowAccessControlConfigurationPolicy actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the workflowManagement property: The access control configuration for workflow management.
     *
     * @return the workflowManagement value.
     */
    public FlowAccessControlConfigurationPolicy workflowManagement() {
        return this.workflowManagement;
    }

    /**
     * Set the workflowManagement property: The access control configuration for workflow management.
     *
     * @param workflowManagement the workflowManagement value to set.
     * @return the FlowAccessControlConfiguration object itself.
     */
    public FlowAccessControlConfiguration withWorkflowManagement(
        FlowAccessControlConfigurationPolicy workflowManagement) {
        this.workflowManagement = workflowManagement;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (triggers() != null) {
            triggers().validate();
        }
        if (contents() != null) {
            contents().validate();
        }
        if (actions() != null) {
            actions().validate();
        }
        if (workflowManagement() != null) {
            workflowManagement().validate();
        }
    }
}
