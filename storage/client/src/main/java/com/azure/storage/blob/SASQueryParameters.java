// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob;

import com.azure.storage.blob.models.UserDelegationKey;

import java.net.UnknownHostException;
import java.time.OffsetDateTime;
import java.util.Map;

import static com.azure.storage.blob.Utility.safeURLEncode;

/**
 * Represents the components that make up an Azure Storage SAS' query parameters. This type is not constructed directly
 * by the user; it is only generated by the {@link AccountSASSignatureValues} and {@link ServiceSASSignatureValues}
 * types. Once generated, it can be set on a {@link BlobURLParts} object to be constructed as part of a URL or it can
 * be encoded into a {@code String} and appended to a URL directly (though caution should be taken here in case there
 * are existing query parameters, which might affect the appropriate means of appending these query parameters).
 * NOTE: Instances of this class are immutable to ensure thread safety.
 */
public final class SASQueryParameters {

    private final String version;

    private final String services;

    private final String resourceTypes;

    private final SASProtocol protocol;

    private final OffsetDateTime startTime;

    private final OffsetDateTime expiryTime;

    private final IPRange ipRange;

    private final String identifier;

    private final String keyOid;

    private final String keyTid;

    private final OffsetDateTime keyStart;

    private final OffsetDateTime keyExpiry;

    private final String keyService;

    private final String keyVersion;

    private final String resource;

    private final String permissions;

    private final String signature;

    private final String cacheControl;

    private final String contentDisposition;

    private final String contentEncoding;

    private final String contentLanguage;

    private final String contentType;

    /**
     * Creates a new {@link SASQueryParameters} object.
     *
     * @param queryParamsMap
     *         All query parameters for the request as key-value pairs
     * @param removeSASParametersFromMap
     *         When {@code true}, the SAS query parameters will be removed from queryParamsMap
     */
    SASQueryParameters(Map<String, String[]> queryParamsMap, boolean removeSASParametersFromMap)
            throws UnknownHostException {

        String[] queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_SERVICE_VERSION);
        if (queryValue != null) {
            this.version = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_SERVICE_VERSION);
            }
        } else {
            this.version = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_SERVICES);
        if (queryValue != null) {
            this.services = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_SERVICES);
            }
        } else {
            this.services = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_RESOURCES_TYPES);
        if (queryValue != null) {
            this.resourceTypes = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_RESOURCES_TYPES);
            }
        } else {
            this.resourceTypes = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_PROTOCOL);
        if (queryValue != null) {
            this.protocol = SASProtocol.parse(queryValue[0]);
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_PROTOCOL);
            }
        } else {
            this.protocol = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_START_TIME);
        if (queryValue != null) {
            this.startTime = Utility.parseDate(queryValue[0]);
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_START_TIME);
            }
        } else {
            this.startTime = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_EXPIRY_TIME);
        if (queryValue != null) {
            this.expiryTime = Utility.parseDate(queryValue[0]);
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_EXPIRY_TIME);
            }
        } else {
            this.expiryTime = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_IP_RANGE);
        if (queryValue != null) {
            this.ipRange = IPRange.parse(queryValue[0]);
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_IP_RANGE);
            }
        } else {
            this.ipRange = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_SIGNED_IDENTIFIER);
        if (queryValue != null) {
            this.identifier = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_SIGNED_IDENTIFIER);
            }
        } else {
            this.identifier = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_SIGNED_OBJECT_ID);
        if (queryValue != null) {
            this.keyOid = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_SIGNED_OBJECT_ID);
            }
        } else {
            this.keyOid = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_SIGNED_TENANT_ID);
        if (queryValue != null) {
            this.keyTid = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_SIGNED_TENANT_ID);
            }
        } else {
            this.keyTid = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_SIGNED_KEY_START);
        if (queryValue != null) {
            this.keyStart = Utility.parseDate(queryValue[0]);
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_SIGNED_KEY_START);
            }
        } else {
            this.keyStart = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_SIGNED_KEY_EXPIRY);
        if (queryValue != null) {
            this.keyExpiry = Utility.parseDate(queryValue[0]);
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_SIGNED_KEY_EXPIRY);
            }
        } else {
            this.keyExpiry = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_SIGNED_KEY_SERVICE);
        if (queryValue != null) {
            this.keyService = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_SIGNED_KEY_SERVICE);
            }
        } else {
            this.keyService = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_SIGNED_KEY_VERSION);
        if (queryValue != null) {
            this.keyVersion = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_SIGNED_KEY_VERSION);
            }
        } else {
            this.keyVersion = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_SIGNED_RESOURCE);
        if (queryValue != null) {
            this.resource = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_SIGNED_RESOURCE);
            }
        } else {
            this.resource = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_SIGNED_PERMISSIONS);
        if (queryValue != null) {
            this.permissions = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_SIGNED_PERMISSIONS);
            }
        } else {
            this.permissions = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_SIGNATURE);
        if (queryValue != null) {
            this.signature = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_SIGNATURE);
            }
        } else {
            this.signature = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_CACHE_CONTROL);
        if (queryValue != null) {
            this.cacheControl = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_CACHE_CONTROL);
            }
        } else {
            this.cacheControl = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_CONTENT_DISPOSITION);
        if (queryValue != null) {
            this.contentDisposition = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_CONTENT_DISPOSITION);
            }
        } else {
            this.contentDisposition = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_CONTENT_ENCODING);
        if (queryValue != null) {
            this.contentEncoding = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_CONTENT_ENCODING);
            }
        } else {
            this.contentEncoding = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_CONTENT_LANGUAGE);
        if (queryValue != null) {
            this.contentLanguage = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_CONTENT_LANGUAGE);
            }
        } else {
            this.contentLanguage = null;
        }

        queryValue = queryParamsMap.get(Constants.UrlConstants.SAS_CONTENT_TYPE);
        if (queryValue != null) {
            this.contentType = queryValue[0];
            if (removeSASParametersFromMap) {
                queryParamsMap.remove(Constants.UrlConstants.SAS_CONTENT_TYPE);
            }
        } else {
            this.contentType = null;
        }
    }

    /**
     * Creates a new {@link SASQueryParameters} object. These objects are only created internally by
     * *SASSignatureValues classes.
     *
     * @param version
     *         A {@code String} representing the storage version.
     * @param services
     *         A {@code String} representing the storage services being accessed (only for Account SAS).
     * @param resourceTypes
     *         A {@code String} representing the storage resource types being accessed (only for Account SAS).
     * @param protocol
     *         A {@code String} representing the allowed HTTP protocol(s) or {@code null}.
     * @param startTime
     *         A {@code java.util.Date} representing the start time for this SAS token or {@code null}.
     * @param expiryTime
     *         A {@code java.util.Date} representing the expiry time for this SAS token.
     * @param ipRange
     *         A {@link IPRange} representing the range of valid IP addresses for this SAS token or {@code null}.
     * @param identifier
     *         A {@code String} representing the signed identifier (only for Service SAS) or {@code null}.
     * @param resource
     *         A {@code String} representing the storage container or blob (only for Service SAS).
     * @param permissions
     *         A {@code String} representing the storage permissions or {@code null}.
     * @param signature
     *         A {@code String} representing the signature for the SAS token.
     */
    SASQueryParameters(String version, String services, String resourceTypes, SASProtocol protocol,
            OffsetDateTime startTime, OffsetDateTime expiryTime, IPRange ipRange, String identifier,
            String resource, String permissions, String signature, String cacheControl, String contentDisposition,
            String contentEncoding, String contentLanguage, String contentType, UserDelegationKey key) {

        this.version = version;
        this.services = services;
        this.resourceTypes = resourceTypes;
        this.protocol = protocol;
        this.startTime = startTime;
        this.expiryTime = expiryTime;
        this.ipRange = ipRange;
        this.identifier = identifier;
        this.resource = resource;
        this.permissions = permissions;
        this.signature = signature;
        this.cacheControl = cacheControl;
        this.contentDisposition = contentDisposition;
        this.contentEncoding = contentEncoding;
        this.contentLanguage = contentLanguage;
        this.contentType = contentType;

        if (key != null) {
            this.keyOid = key.signedOid();
            this.keyTid = key.signedTid();
            this.keyStart = key.signedStart();
            this.keyExpiry = key.signedExpiry();
            this.keyService = key.signedService();
            this.keyVersion = key.signedVersion();
        } else {
            this.keyOid = null;
            this.keyTid = null;
            this.keyStart = null;
            this.keyExpiry = null;
            this.keyService = null;
            this.keyVersion = null;
        }
    }

    /**
     * @return The storage version
     */
    public String version() {
        return version;
    }

    /**
     * @return The storage services being accessed (only for Account SAS). Please refer to {@link AccountSASService} for
     * more details.
     */
    public String services() {
        return services;
    }

    /**
     * @return The storage resource types being accessed (only for Account SAS). Please refer to
     * {@link AccountSASResourceType} for more details.
     */
    public String resourceTypes() {
        return resourceTypes;
    }

    /**
     * @return The allowed HTTP protocol(s) or {@code null}. Please refer to {@link SASProtocol} for more details.
     */
    public SASProtocol protocol() {
        return protocol;
    }

    /**
     * @return The start time for this SAS token or {@code null}.
     */
    public OffsetDateTime startTime() {
        return startTime;
    }

    /**
     * @return The expiry time for this SAS token.
     */
    public OffsetDateTime expiryTime() {
        return expiryTime;
    }

    /**
     * @return {@link IPRange}
     */
    public IPRange ipRange() {
        return ipRange;
    }

    /**
     * @return The signed identifier (only for {@link ServiceSASSignatureValues}) or {@code null}. Please see
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/establishing-a-stored-access-policy">here</a>
     * for more information.
     */
    public String identifier() {
        return identifier;
    }

    /**
     * @return The storage container or blob (only for {@link ServiceSASSignatureValues}).
     */
    public String resource() {
        return resource;
    }

    /**
     * @return Please refer to {@link AccountSASPermission}, {@link BlobSASPermission}, or {@link ContainerSASPermission}
     * for more details.
     */
    public String permissions() {
        return permissions;
    }

    /**
     * @return The signature for the SAS token.
     */
    public String signature() {
        return signature;
    }

    /**
     * @return The Cache-Control header value when a client accesses the resource with this sas token.
     */
    public String cacheControl() {
        return cacheControl;
    }

    /**
     * @return The Content-Disposition header value when a client accesses the resource with this sas token.
     */
    public String contentDisposition() {
        return contentDisposition;
    }

    /**
     * @return The Content-Encoding header value when a client accesses the resource with this sas token.
     */
    public String contentEncoding() {
        return contentEncoding;
    }

    /**
     * @return The Content-Language header value when a client accesses the resource with this sas token.
     */
    public String contentLanguage() {
        return contentLanguage;
    }

    /**
     * @return The Content-Type header value when a client accesses the resource with this sas token.
     */
    public String contentType() {
        return contentType;
    }

    public String keyOid() {
        return keyOid;
    }

    public String keyTid() {
        return keyTid;
    }

    public OffsetDateTime keyStart() {
        return keyStart;
    }

    public OffsetDateTime keyExpiry() {
        return keyExpiry;
    }

    public String keyService() {
        return keyService;
    }

    public String keyVersion() {
        return keyVersion;
    }

    UserDelegationKey userDelegationKey() {
        return new UserDelegationKey()
                .signedExpiry(this.keyExpiry)
                .signedOid(this.keyOid)
                .signedService(this.keyService)
                .signedStart(this.keyStart)
                .signedTid(this.keyTid)
                .signedVersion(this.keyVersion);
    }

    private void tryAppendQueryParameter(StringBuilder sb, String param, Object value) {
        if (value != null) {
            if (sb.length() == 0) {
                sb.append('?');
            } else {
                sb.append('&');
            }
            sb.append(safeURLEncode(param)).append('=').append(safeURLEncode(value.toString()));
        }
    }

    /**
     * Encodes all SAS query parameters into a string that can be appended to a URL.
     *
     * @return A {@code String} representing all SAS query parameters.
     */
    public String encode() {
        /*
         We should be url-encoding each key and each value, but because we know all the keys and values will encode to
         themselves, we cheat except for the signature value.
         */
        String[] params = {
            Constants.UrlConstants.SAS_SERVICE_VERSION,
            Constants.UrlConstants.SAS_SERVICES,
            Constants.UrlConstants.SAS_RESOURCES_TYPES,
            Constants.UrlConstants.SAS_PROTOCOL,
            Constants.UrlConstants.SAS_START_TIME,
            Constants.UrlConstants.SAS_EXPIRY_TIME,
            Constants.UrlConstants.SAS_IP_RANGE,
            Constants.UrlConstants.SAS_SIGNED_IDENTIFIER,
            Constants.UrlConstants.SAS_SIGNED_OBJECT_ID,
            Constants.UrlConstants.SAS_SIGNED_TENANT_ID,
            Constants.UrlConstants.SAS_SIGNED_KEY_START,
            Constants.UrlConstants.SAS_SIGNED_KEY_EXPIRY,
            Constants.UrlConstants.SAS_SIGNED_KEY_SERVICE,
            Constants.UrlConstants.SAS_SIGNED_KEY_VERSION,
            Constants.UrlConstants.SAS_SIGNED_RESOURCE,
            Constants.UrlConstants.SAS_SIGNED_PERMISSIONS,
            Constants.UrlConstants.SAS_SIGNATURE,
            Constants.UrlConstants.SAS_CACHE_CONTROL,
            Constants.UrlConstants.SAS_CONTENT_DISPOSITION,
            Constants.UrlConstants.SAS_CONTENT_ENCODING,
            Constants.UrlConstants.SAS_CONTENT_LANGUAGE,
            Constants.UrlConstants.SAS_CONTENT_TYPE
        };
        StringBuilder sb = new StringBuilder();
        for (String param : params) {
            switch (param) {
                case Constants.UrlConstants.SAS_SERVICE_VERSION:
                    tryAppendQueryParameter(sb, param, this.version);
                    break;
                case Constants.UrlConstants.SAS_SERVICES:
                    tryAppendQueryParameter(sb, param, this.services);
                    break;
                case Constants.UrlConstants.SAS_RESOURCES_TYPES:
                    tryAppendQueryParameter(sb, param, this.resourceTypes);
                    break;
                case Constants.UrlConstants.SAS_PROTOCOL:
                    tryAppendQueryParameter(sb, param, this.protocol);
                    break;
                case Constants.UrlConstants.SAS_START_TIME:
                    tryAppendQueryParameter(sb, param,
                            this.startTime == null ? null : Utility.ISO_8601_UTC_DATE_FORMATTER.format(this.startTime));
                    break;
                case Constants.UrlConstants.SAS_EXPIRY_TIME:
                    tryAppendQueryParameter(sb, param,
                            this.expiryTime == null ? null : Utility.ISO_8601_UTC_DATE_FORMATTER.format(this.expiryTime));
                    break;
                case Constants.UrlConstants.SAS_IP_RANGE:
                    tryAppendQueryParameter(sb, param, this.ipRange);
                    break;
                case Constants.UrlConstants.SAS_SIGNED_IDENTIFIER:
                    tryAppendQueryParameter(sb, param, this.identifier);
                    break;
                case Constants.UrlConstants.SAS_SIGNED_OBJECT_ID:
                    tryAppendQueryParameter(sb, param, this.keyOid);
                    break;
                case Constants.UrlConstants.SAS_SIGNED_TENANT_ID:
                    tryAppendQueryParameter(sb, param, this.keyTid);
                    break;
                case Constants.UrlConstants.SAS_SIGNED_KEY_START:
                    tryAppendQueryParameter(sb, param,
                            this.keyStart == null ? null : Utility.ISO_8601_UTC_DATE_FORMATTER.format(this.keyStart));
                    break;
                case Constants.UrlConstants.SAS_SIGNED_KEY_EXPIRY:
                    tryAppendQueryParameter(sb, param,
                            this.keyExpiry == null ? null : Utility.ISO_8601_UTC_DATE_FORMATTER.format(this.keyExpiry));
                    break;
                case Constants.UrlConstants.SAS_SIGNED_KEY_SERVICE:
                    tryAppendQueryParameter(sb, param, this.keyService);
                    break;
                case Constants.UrlConstants.SAS_SIGNED_KEY_VERSION:
                    tryAppendQueryParameter(sb, param, this.keyVersion);
                    break;
                case Constants.UrlConstants.SAS_SIGNED_RESOURCE:
                    tryAppendQueryParameter(sb, param, this.resource);
                    break;
                case Constants.UrlConstants.SAS_SIGNED_PERMISSIONS:
                    tryAppendQueryParameter(sb, param, this.permissions);
                    break;
                case Constants.UrlConstants.SAS_SIGNATURE:
                    tryAppendQueryParameter(sb, param, this.signature);
                    break;
                case Constants.UrlConstants.SAS_CACHE_CONTROL:
                    tryAppendQueryParameter(sb, param, this.cacheControl);
                    break;
                case Constants.UrlConstants.SAS_CONTENT_DISPOSITION:
                    tryAppendQueryParameter(sb, param, this.contentDisposition);
                    break;
                case Constants.UrlConstants.SAS_CONTENT_ENCODING:
                    tryAppendQueryParameter(sb, param, this.contentEncoding);
                    break;
                case Constants.UrlConstants.SAS_CONTENT_LANGUAGE:
                    tryAppendQueryParameter(sb, param, this.contentLanguage);
                    break;
                case Constants.UrlConstants.SAS_CONTENT_TYPE:
                    tryAppendQueryParameter(sb, param, this.contentType);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid URL constant.");
            }
        }
        return sb.toString();
    }
}
