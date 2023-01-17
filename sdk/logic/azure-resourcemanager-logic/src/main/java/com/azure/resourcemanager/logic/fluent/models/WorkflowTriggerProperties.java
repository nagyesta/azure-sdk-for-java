// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.logic.models.ResourceReference;
import com.azure.resourcemanager.logic.models.WorkflowState;
import com.azure.resourcemanager.logic.models.WorkflowStatus;
import com.azure.resourcemanager.logic.models.WorkflowTriggerProvisioningState;
import com.azure.resourcemanager.logic.models.WorkflowTriggerRecurrence;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The workflow trigger properties. */
@Immutable
public final class WorkflowTriggerProperties {
    /*
     * Gets the provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowTriggerProvisioningState provisioningState;

    /*
     * Gets the created time.
     */
    @JsonProperty(value = "createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * Gets the changed time.
     */
    @JsonProperty(value = "changedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime changedTime;

    /*
     * Gets the state.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowState state;

    /*
     * Gets the status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowStatus status;

    /*
     * Gets the last execution time.
     */
    @JsonProperty(value = "lastExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastExecutionTime;

    /*
     * Gets the next execution time.
     */
    @JsonProperty(value = "nextExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime nextExecutionTime;

    /*
     * Gets the workflow trigger recurrence.
     */
    @JsonProperty(value = "recurrence", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowTriggerRecurrence recurrence;

    /*
     * Gets the reference to workflow.
     */
    @JsonProperty(value = "workflow", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceReference workflow;

    /** Creates an instance of WorkflowTriggerProperties class. */
    public WorkflowTriggerProperties() {
    }

    /**
     * Get the provisioningState property: Gets the provisioning state.
     *
     * @return the provisioningState value.
     */
    public WorkflowTriggerProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the createdTime property: Gets the created time.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the changedTime property: Gets the changed time.
     *
     * @return the changedTime value.
     */
    public OffsetDateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Get the state property: Gets the state.
     *
     * @return the state value.
     */
    public WorkflowState state() {
        return this.state;
    }

    /**
     * Get the status property: Gets the status.
     *
     * @return the status value.
     */
    public WorkflowStatus status() {
        return this.status;
    }

    /**
     * Get the lastExecutionTime property: Gets the last execution time.
     *
     * @return the lastExecutionTime value.
     */
    public OffsetDateTime lastExecutionTime() {
        return this.lastExecutionTime;
    }

    /**
     * Get the nextExecutionTime property: Gets the next execution time.
     *
     * @return the nextExecutionTime value.
     */
    public OffsetDateTime nextExecutionTime() {
        return this.nextExecutionTime;
    }

    /**
     * Get the recurrence property: Gets the workflow trigger recurrence.
     *
     * @return the recurrence value.
     */
    public WorkflowTriggerRecurrence recurrence() {
        return this.recurrence;
    }

    /**
     * Get the workflow property: Gets the reference to workflow.
     *
     * @return the workflow value.
     */
    public ResourceReference workflow() {
        return this.workflow;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (recurrence() != null) {
            recurrence().validate();
        }
        if (workflow() != null) {
            workflow().validate();
        }
    }
}
