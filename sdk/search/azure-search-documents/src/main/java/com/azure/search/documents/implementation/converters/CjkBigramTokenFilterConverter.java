// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.converters;

import com.azure.search.documents.indexes.models.CjkBigramTokenFilter;
import com.azure.search.documents.indexes.models.CjkBigramTokenFilterScripts;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.indexes.implementation.models.CjkBigramTokenFilter} and
 * {@link CjkBigramTokenFilter}.
 */
public final class CjkBigramTokenFilterConverter {
    /**
     * Maps from {@link com.azure.search.documents.indexes.implementation.models.CjkBigramTokenFilter} to
     * {@link CjkBigramTokenFilter}.
     */
    public static CjkBigramTokenFilter map(com.azure.search.documents.indexes.implementation.models.CjkBigramTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        CjkBigramTokenFilter cjkBigramTokenFilter = new CjkBigramTokenFilter();

        String name = obj.getName();
        cjkBigramTokenFilter.setName(name);

        Boolean outputUnigrams = obj.isOutputUnigrams();
        cjkBigramTokenFilter.setOutputUnigrams(outputUnigrams);

        if (obj.getIgnoreScripts() != null) {
            List<CjkBigramTokenFilterScripts> ignoreScripts =
                obj.getIgnoreScripts().stream().map(CjkBigramTokenFilterScriptsConverter::map).collect(Collectors.toList());
            cjkBigramTokenFilter.setIgnoreScripts(ignoreScripts);
        }
        return cjkBigramTokenFilter;
    }

    /**
     * Maps from {@link CjkBigramTokenFilter} to
     * {@link com.azure.search.documents.indexes.implementation.models.CjkBigramTokenFilter}.
     */
    public static com.azure.search.documents.indexes.implementation.models.CjkBigramTokenFilter map(CjkBigramTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.indexes.implementation.models.CjkBigramTokenFilter cjkBigramTokenFilter =
            new com.azure.search.documents.indexes.implementation.models.CjkBigramTokenFilter();

        String name = obj.getName();
        cjkBigramTokenFilter.setName(name);

        Boolean outputUnigrams = obj.isOutputUnigrams();
        cjkBigramTokenFilter.setOutputUnigrams(outputUnigrams);

        if (obj.getIgnoreScripts() != null) {
            List<com.azure.search.documents.indexes.implementation.models.CjkBigramTokenFilterScripts> ignoreScripts =
                obj.getIgnoreScripts().stream().map(CjkBigramTokenFilterScriptsConverter::map).collect(Collectors.toList());
            cjkBigramTokenFilter.setIgnoreScripts(ignoreScripts);
        }
        return cjkBigramTokenFilter;
    }

    private CjkBigramTokenFilterConverter() {
    }
}
