// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the alternative option specified by the Publisher for this image when this image is deprecated. */
@Fluent
public final class AlternativeOption {
    /*
     * Describes the type of the alternative option.
     */
    @JsonProperty(value = "type")
    private AlternativeType type;

    /*
     * Indicates the alternative option value specified by the Publisher. This is the Offer name when the type is Offer
     * or the Plan name when the type is Plan.
     */
    @JsonProperty(value = "value")
    private String value;

    /** Creates an instance of AlternativeOption class. */
    public AlternativeOption() {
    }

    /**
     * Get the type property: Describes the type of the alternative option.
     *
     * @return the type value.
     */
    public AlternativeType type() {
        return this.type;
    }

    /**
     * Set the type property: Describes the type of the alternative option.
     *
     * @param type the type value to set.
     * @return the AlternativeOption object itself.
     */
    public AlternativeOption withType(AlternativeType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: Indicates the alternative option value specified by the Publisher. This is the Offer name
     * when the type is Offer or the Plan name when the type is Plan.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Indicates the alternative option value specified by the Publisher. This is the Offer name
     * when the type is Offer or the Plan name when the type is Plan.
     *
     * @param value the value value to set.
     * @return the AlternativeOption object itself.
     */
    public AlternativeOption withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
