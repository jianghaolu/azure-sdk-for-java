// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BlobIndexerPDFTextRotationAlgorithm. */
public final class BlobIndexerPDFTextRotationAlgorithm
        extends ExpandableStringEnum<BlobIndexerPDFTextRotationAlgorithm> {
    /** Static value none for BlobIndexerPDFTextRotationAlgorithm. */
    public static final BlobIndexerPDFTextRotationAlgorithm NONE = fromString("none");

    /** Static value detectAngles for BlobIndexerPDFTextRotationAlgorithm. */
    public static final BlobIndexerPDFTextRotationAlgorithm DETECT_ANGLES = fromString("detectAngles");

    /**
     * Creates or finds a BlobIndexerPDFTextRotationAlgorithm from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BlobIndexerPDFTextRotationAlgorithm.
     */
    @JsonCreator
    public static BlobIndexerPDFTextRotationAlgorithm fromString(String name) {
        return fromString(name, BlobIndexerPDFTextRotationAlgorithm.class);
    }

    /** @return known BlobIndexerPDFTextRotationAlgorithm values. */
    public static Collection<BlobIndexerPDFTextRotationAlgorithm> values() {
        return values(BlobIndexerPDFTextRotationAlgorithm.class);
    }
}
