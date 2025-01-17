// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Whether to automatically redirect HTTP traffic to HTTPS traffic. Note that this is a easy way to set up this rule and
 * it will be the first rule that gets executed.
 */
public final class HttpsRedirect extends ExpandableStringEnum<HttpsRedirect> {
    /** Static value Enabled for HttpsRedirect. */
    public static final HttpsRedirect ENABLED = fromString("Enabled");

    /** Static value Disabled for HttpsRedirect. */
    public static final HttpsRedirect DISABLED = fromString("Disabled");

    /**
     * Creates or finds a HttpsRedirect from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HttpsRedirect.
     */
    @JsonCreator
    public static HttpsRedirect fromString(String name) {
        return fromString(name, HttpsRedirect.class);
    }

    /**
     * Gets known HttpsRedirect values.
     *
     * @return known HttpsRedirect values.
     */
    public static Collection<HttpsRedirect> values() {
        return values(HttpsRedirect.class);
    }
}
