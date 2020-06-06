/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;


/**
 * The VerifyFaceToPersonOptionalParameter model.
 */
public class VerifyFaceToPersonOptionalParameter {
    /**
     * Using existing personGroupId and personId for fast loading a specified
     * person. personGroupId is created in PersonGroup - Create. Parameter
     * personGroupId and largePersonGroupId should not be provided at the same
     * time.
     */
    private String personGroupId;

    /**
     * Using existing largePersonGroupId and personId for fast loading a
     * specified person. largePersonGroupId is created in LargePersonGroup -
     * Create. Parameter personGroupId and largePersonGroupId should not be
     * provided at the same time.
     */
    private String largePersonGroupId;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the personGroupId value.
     *
     * @return the personGroupId value
     */
    public String personGroupId() {
        return this.personGroupId;
    }

    /**
     * Set the personGroupId value.
     *
     * @param personGroupId the personGroupId value to set
     * @return the VerifyFaceToPersonOptionalParameter object itself.
     */
    public VerifyFaceToPersonOptionalParameter withPersonGroupId(String personGroupId) {
        this.personGroupId = personGroupId;
        return this;
    }

    /**
     * Get the largePersonGroupId value.
     *
     * @return the largePersonGroupId value
     */
    public String largePersonGroupId() {
        return this.largePersonGroupId;
    }

    /**
     * Set the largePersonGroupId value.
     *
     * @param largePersonGroupId the largePersonGroupId value to set
     * @return the VerifyFaceToPersonOptionalParameter object itself.
     */
    public VerifyFaceToPersonOptionalParameter withLargePersonGroupId(String largePersonGroupId) {
        this.largePersonGroupId = largePersonGroupId;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the VerifyFaceToPersonOptionalParameter object itself.
     */
    public VerifyFaceToPersonOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
