// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The extended error info. */
@Fluent
public final class ExtendedErrorInfo {
    /*
     * The error code.
     */
    @JsonProperty(value = "code", required = true)
    private ErrorResponseCode code;

    /*
     * The error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * The error message details.
     */
    @JsonProperty(value = "details")
    private List<ExtendedErrorInfo> details;

    /*
     * The inner error.
     */
    @JsonProperty(value = "innerError")
    private Object innerError;

    /** Creates an instance of ExtendedErrorInfo class. */
    public ExtendedErrorInfo() {
    }

    /**
     * Get the code property: The error code.
     *
     * @return the code value.
     */
    public ErrorResponseCode code() {
        return this.code;
    }

    /**
     * Set the code property: The error code.
     *
     * @param code the code value to set.
     * @return the ExtendedErrorInfo object itself.
     */
    public ExtendedErrorInfo withCode(ErrorResponseCode code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The error message.
     *
     * @param message the message value to set.
     * @return the ExtendedErrorInfo object itself.
     */
    public ExtendedErrorInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the details property: The error message details.
     *
     * @return the details value.
     */
    public List<ExtendedErrorInfo> details() {
        return this.details;
    }

    /**
     * Set the details property: The error message details.
     *
     * @param details the details value to set.
     * @return the ExtendedErrorInfo object itself.
     */
    public ExtendedErrorInfo withDetails(List<ExtendedErrorInfo> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the innerError property: The inner error.
     *
     * @return the innerError value.
     */
    public Object innerError() {
        return this.innerError;
    }

    /**
     * Set the innerError property: The inner error.
     *
     * @param innerError the innerError value to set.
     * @return the ExtendedErrorInfo object itself.
     */
    public ExtendedErrorInfo withInnerError(Object innerError) {
        this.innerError = innerError;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (code() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property code in model ExtendedErrorInfo"));
        }
        if (message() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property message in model ExtendedErrorInfo"));
        }
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExtendedErrorInfo.class);
}
