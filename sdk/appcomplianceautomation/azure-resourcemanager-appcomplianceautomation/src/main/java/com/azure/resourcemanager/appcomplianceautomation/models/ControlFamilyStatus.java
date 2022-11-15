// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Indicates the control family status. */
public final class ControlFamilyStatus extends ExpandableStringEnum<ControlFamilyStatus> {
    /** Static value Healthy for ControlFamilyStatus. */
    public static final ControlFamilyStatus HEALTHY = fromString("Healthy");

    /** Static value Unhealthy for ControlFamilyStatus. */
    public static final ControlFamilyStatus UNHEALTHY = fromString("Unhealthy");

    /**
     * Creates or finds a ControlFamilyStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ControlFamilyStatus.
     */
    @JsonCreator
    public static ControlFamilyStatus fromString(String name) {
        return fromString(name, ControlFamilyStatus.class);
    }

    /**
     * Gets known ControlFamilyStatus values.
     *
     * @return known ControlFamilyStatus values.
     */
    public static Collection<ControlFamilyStatus> values() {
        return values(ControlFamilyStatus.class);
    }
}
