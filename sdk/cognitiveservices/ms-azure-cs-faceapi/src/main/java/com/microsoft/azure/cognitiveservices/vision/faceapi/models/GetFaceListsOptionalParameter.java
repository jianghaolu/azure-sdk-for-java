/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;


/**
 * The GetFaceListsOptionalParameter model.
 */
public class GetFaceListsOptionalParameter {
    /**
     * A value indicating whether the operation should return
     * 'recognitionModel' in response.
     */
    private Boolean returnRecognitionModel;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the returnRecognitionModel value.
     *
     * @return the returnRecognitionModel value
     */
    public Boolean returnRecognitionModel() {
        return this.returnRecognitionModel;
    }

    /**
     * Set the returnRecognitionModel value.
     *
     * @param returnRecognitionModel the returnRecognitionModel value to set
     * @return the GetFaceListsOptionalParameter object itself.
     */
    public GetFaceListsOptionalParameter withReturnRecognitionModel(Boolean returnRecognitionModel) {
        this.returnRecognitionModel = returnRecognitionModel;
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
     * @return the GetFaceListsOptionalParameter object itself.
     */
    public GetFaceListsOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
