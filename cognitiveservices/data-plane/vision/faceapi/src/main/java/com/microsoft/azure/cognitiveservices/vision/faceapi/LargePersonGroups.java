/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi;

import com.azure.common.http.rest.RestVoidResponse;
import com.azure.common.http.rest.SimpleResponse;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.LargePersonGroup;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.RecognitionModel;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.TrainingStatus;
import java.util.List;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * LargePersonGroups.
 */
public interface LargePersonGroups {
    /**
     * Create a new large person group with user-specified largePersonGroupId, name, an optional userData and recognitionModel.
     * &lt;br /&gt; A large person group is the container of the uploaded person data, including face images and face recognition feature, and up to 1,000,000 people.
     * &lt;br /&gt; After creation, use [LargePersonGroup Person - Create](/docs/services/563879b61984550e40cbbe8d/operations/599adcba3a7b9412a4d53f40) to add person into the group, and call [LargePersonGroup - Train](/docs/services/563879b61984550e40cbbe8d/operations/599ae2d16ac60f11b48b5aa4) to get this group ready for [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; The person face, image, and userData will be stored on server until [LargePersonGroup Person - Delete](/docs/services/563879b61984550e40cbbe8d/operations/599ade5c6ac60f11b48b5aa2) or [LargePersonGroup - Delete](/docs/services/563879b61984550e40cbbe8d/operations/599adc216ac60f11b48b5a9f) is called.
     * &lt;br /&gt;
     * * Free-tier subscription quota: 1,000 large person groups.
     * * S0-tier subscription quota: 1,000,000 large person groups.
     * &lt;br /&gt;
     * 'recognitionModel' should be specified to associate with this large person group. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing large person group will use the recognition model that's already associated with the collection. Existing face features in a large person group can't be updated to features extracted by another version of recognition model.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void create(@NonNull String largePersonGroupId);

    /**
     * Create a new large person group with user-specified largePersonGroupId, name, an optional userData and recognitionModel.
     * &lt;br /&gt; A large person group is the container of the uploaded person data, including face images and face recognition feature, and up to 1,000,000 people.
     * &lt;br /&gt; After creation, use [LargePersonGroup Person - Create](/docs/services/563879b61984550e40cbbe8d/operations/599adcba3a7b9412a4d53f40) to add person into the group, and call [LargePersonGroup - Train](/docs/services/563879b61984550e40cbbe8d/operations/599ae2d16ac60f11b48b5aa4) to get this group ready for [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; The person face, image, and userData will be stored on server until [LargePersonGroup Person - Delete](/docs/services/563879b61984550e40cbbe8d/operations/599ade5c6ac60f11b48b5aa2) or [LargePersonGroup - Delete](/docs/services/563879b61984550e40cbbe8d/operations/599adc216ac60f11b48b5a9f) is called.
     * &lt;br /&gt;
     * * Free-tier subscription quota: 1,000 large person groups.
     * * S0-tier subscription quota: 1,000,000 large person groups.
     * &lt;br /&gt;
     * 'recognitionModel' should be specified to associate with this large person group. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing large person group will use the recognition model that's already associated with the collection. Existing face features in a large person group can't be updated to features extracted by another version of recognition model.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<RestVoidResponse> createWithRestResponseAsync(@NonNull String largePersonGroupId);

    /**
     * Create a new large person group with user-specified largePersonGroupId, name, an optional userData and recognitionModel.
     * &lt;br /&gt; A large person group is the container of the uploaded person data, including face images and face recognition feature, and up to 1,000,000 people.
     * &lt;br /&gt; After creation, use [LargePersonGroup Person - Create](/docs/services/563879b61984550e40cbbe8d/operations/599adcba3a7b9412a4d53f40) to add person into the group, and call [LargePersonGroup - Train](/docs/services/563879b61984550e40cbbe8d/operations/599ae2d16ac60f11b48b5aa4) to get this group ready for [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; The person face, image, and userData will be stored on server until [LargePersonGroup Person - Delete](/docs/services/563879b61984550e40cbbe8d/operations/599ade5c6ac60f11b48b5aa2) or [LargePersonGroup - Delete](/docs/services/563879b61984550e40cbbe8d/operations/599adc216ac60f11b48b5a9f) is called.
     * &lt;br /&gt;
     * * Free-tier subscription quota: 1,000 large person groups.
     * * S0-tier subscription quota: 1,000,000 large person groups.
     * &lt;br /&gt;
     * 'recognitionModel' should be specified to associate with this large person group. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing large person group will use the recognition model that's already associated with the collection. Existing face features in a large person group can't be updated to features extracted by another version of recognition model.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> createAsync(@NonNull String largePersonGroupId);

    /**
     * Create a new large person group with user-specified largePersonGroupId, name, an optional userData and recognitionModel.
     * &lt;br /&gt; A large person group is the container of the uploaded person data, including face images and face recognition feature, and up to 1,000,000 people.
     * &lt;br /&gt; After creation, use [LargePersonGroup Person - Create](/docs/services/563879b61984550e40cbbe8d/operations/599adcba3a7b9412a4d53f40) to add person into the group, and call [LargePersonGroup - Train](/docs/services/563879b61984550e40cbbe8d/operations/599ae2d16ac60f11b48b5aa4) to get this group ready for [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; The person face, image, and userData will be stored on server until [LargePersonGroup Person - Delete](/docs/services/563879b61984550e40cbbe8d/operations/599ade5c6ac60f11b48b5aa2) or [LargePersonGroup - Delete](/docs/services/563879b61984550e40cbbe8d/operations/599adc216ac60f11b48b5a9f) is called.
     * &lt;br /&gt;
     * * Free-tier subscription quota: 1,000 large person groups.
     * * S0-tier subscription quota: 1,000,000 large person groups.
     * &lt;br /&gt;
     * 'recognitionModel' should be specified to associate with this large person group. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing large person group will use the recognition model that's already associated with the collection. Existing face features in a large person group can't be updated to features extracted by another version of recognition model.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @param recognitionModel Possible values include: 'recognition_01', 'recognition_02'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void create(@NonNull String largePersonGroupId, String name, String userData, RecognitionModel recognitionModel);

    /**
     * Create a new large person group with user-specified largePersonGroupId, name, an optional userData and recognitionModel.
     * &lt;br /&gt; A large person group is the container of the uploaded person data, including face images and face recognition feature, and up to 1,000,000 people.
     * &lt;br /&gt; After creation, use [LargePersonGroup Person - Create](/docs/services/563879b61984550e40cbbe8d/operations/599adcba3a7b9412a4d53f40) to add person into the group, and call [LargePersonGroup - Train](/docs/services/563879b61984550e40cbbe8d/operations/599ae2d16ac60f11b48b5aa4) to get this group ready for [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; The person face, image, and userData will be stored on server until [LargePersonGroup Person - Delete](/docs/services/563879b61984550e40cbbe8d/operations/599ade5c6ac60f11b48b5aa2) or [LargePersonGroup - Delete](/docs/services/563879b61984550e40cbbe8d/operations/599adc216ac60f11b48b5a9f) is called.
     * &lt;br /&gt;
     * * Free-tier subscription quota: 1,000 large person groups.
     * * S0-tier subscription quota: 1,000,000 large person groups.
     * &lt;br /&gt;
     * 'recognitionModel' should be specified to associate with this large person group. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing large person group will use the recognition model that's already associated with the collection. Existing face features in a large person group can't be updated to features extracted by another version of recognition model.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @param recognitionModel Possible values include: 'recognition_01', 'recognition_02'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<RestVoidResponse> createWithRestResponseAsync(@NonNull String largePersonGroupId, String name, String userData, RecognitionModel recognitionModel);

    /**
     * Create a new large person group with user-specified largePersonGroupId, name, an optional userData and recognitionModel.
     * &lt;br /&gt; A large person group is the container of the uploaded person data, including face images and face recognition feature, and up to 1,000,000 people.
     * &lt;br /&gt; After creation, use [LargePersonGroup Person - Create](/docs/services/563879b61984550e40cbbe8d/operations/599adcba3a7b9412a4d53f40) to add person into the group, and call [LargePersonGroup - Train](/docs/services/563879b61984550e40cbbe8d/operations/599ae2d16ac60f11b48b5aa4) to get this group ready for [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; The person face, image, and userData will be stored on server until [LargePersonGroup Person - Delete](/docs/services/563879b61984550e40cbbe8d/operations/599ade5c6ac60f11b48b5aa2) or [LargePersonGroup - Delete](/docs/services/563879b61984550e40cbbe8d/operations/599adc216ac60f11b48b5a9f) is called.
     * &lt;br /&gt;
     * * Free-tier subscription quota: 1,000 large person groups.
     * * S0-tier subscription quota: 1,000,000 large person groups.
     * &lt;br /&gt;
     * 'recognitionModel' should be specified to associate with this large person group. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing large person group will use the recognition model that's already associated with the collection. Existing face features in a large person group can't be updated to features extracted by another version of recognition model.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @param recognitionModel Possible values include: 'recognition_01', 'recognition_02'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> createAsync(@NonNull String largePersonGroupId, String name, String userData, RecognitionModel recognitionModel);

    /**
     * Delete an existing large person group. Persisted face features of all people in the large person group will also be deleted.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(@NonNull String largePersonGroupId);

    /**
     * Delete an existing large person group. Persisted face features of all people in the large person group will also be deleted.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<RestVoidResponse> deleteWithRestResponseAsync(@NonNull String largePersonGroupId);

    /**
     * Delete an existing large person group. Persisted face features of all people in the large person group will also be deleted.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> deleteAsync(@NonNull String largePersonGroupId);

    /**
     * Retrieve the information of a large person group, including its name, userData and recognitionModel. This API returns large person group information only, use [LargePersonGroup Person - List](/docs/services/563879b61984550e40cbbe8d/operations/599adda06ac60f11b48b5aa1) instead to retrieve person information under the large person group.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LargePersonGroup object if successful.
     */
    LargePersonGroup get(@NonNull String largePersonGroupId);

    /**
     * Retrieve the information of a large person group, including its name, userData and recognitionModel. This API returns large person group information only, use [LargePersonGroup Person - List](/docs/services/563879b61984550e40cbbe8d/operations/599adda06ac60f11b48b5aa1) instead to retrieve person information under the large person group.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<LargePersonGroup>> getWithRestResponseAsync(@NonNull String largePersonGroupId);

    /**
     * Retrieve the information of a large person group, including its name, userData and recognitionModel. This API returns large person group information only, use [LargePersonGroup Person - List](/docs/services/563879b61984550e40cbbe8d/operations/599adda06ac60f11b48b5aa1) instead to retrieve person information under the large person group.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<LargePersonGroup> getAsync(@NonNull String largePersonGroupId);

    /**
     * Retrieve the information of a large person group, including its name, userData and recognitionModel. This API returns large person group information only, use [LargePersonGroup Person - List](/docs/services/563879b61984550e40cbbe8d/operations/599adda06ac60f11b48b5aa1) instead to retrieve person information under the large person group.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LargePersonGroup object if successful.
     */
    LargePersonGroup get(@NonNull String largePersonGroupId, Boolean returnRecognitionModel);

    /**
     * Retrieve the information of a large person group, including its name, userData and recognitionModel. This API returns large person group information only, use [LargePersonGroup Person - List](/docs/services/563879b61984550e40cbbe8d/operations/599adda06ac60f11b48b5aa1) instead to retrieve person information under the large person group.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<LargePersonGroup>> getWithRestResponseAsync(@NonNull String largePersonGroupId, Boolean returnRecognitionModel);

    /**
     * Retrieve the information of a large person group, including its name, userData and recognitionModel. This API returns large person group information only, use [LargePersonGroup Person - List](/docs/services/563879b61984550e40cbbe8d/operations/599adda06ac60f11b48b5aa1) instead to retrieve person information under the large person group.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<LargePersonGroup> getAsync(@NonNull String largePersonGroupId, Boolean returnRecognitionModel);

    /**
     * Update an existing large person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void update(@NonNull String largePersonGroupId);

    /**
     * Update an existing large person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<RestVoidResponse> updateWithRestResponseAsync(@NonNull String largePersonGroupId);

    /**
     * Update an existing large person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> updateAsync(@NonNull String largePersonGroupId);

    /**
     * Update an existing large person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void update(@NonNull String largePersonGroupId, String name, String userData);

    /**
     * Update an existing large person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<RestVoidResponse> updateWithRestResponseAsync(@NonNull String largePersonGroupId, String name, String userData);

    /**
     * Update an existing large person group's display name and userData. The properties which does not appear in request body will not be updated.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> updateAsync(@NonNull String largePersonGroupId, String name, String userData);

    /**
     * Retrieve the training status of a large person group (completed or ongoing).
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the TrainingStatus object if successful.
     */
    TrainingStatus getTrainingStatus(@NonNull String largePersonGroupId);

    /**
     * Retrieve the training status of a large person group (completed or ongoing).
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<TrainingStatus>> getTrainingStatusWithRestResponseAsync(@NonNull String largePersonGroupId);

    /**
     * Retrieve the training status of a large person group (completed or ongoing).
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<TrainingStatus> getTrainingStatusAsync(@NonNull String largePersonGroupId);

    /**
     * List all existing large person groups’s largePersonGroupId, name, userData and recognitionModel.&lt;br /&gt;
     * * Large person groups are stored in alphabetical order of largePersonGroupId.
     * * "start" parameter (string, optional) is a user-provided largePersonGroupId value that returned entries have larger ids by string comparison. "start" set to empty to indicate return from the first item.
     * * "top" parameter (int, optional) specifies the number of entries to return. A maximal of 1000 entries can be returned in one call. To fetch more, you can specify "start" with the last retuned entry’s Id of the current call.
     * &lt;br /&gt;
     * For example, total 5 large person groups: "group1", ..., "group5".
     * &lt;br /&gt; "start=&amp;top=" will return all 5 groups.
     * &lt;br /&gt; "start=&amp;top=2" will return "group1", "group2".
     * &lt;br /&gt; "start=group2&amp;top=3" will return "group3", "group4", "group5".
     *
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List&lt;LargePersonGroup&gt; object if successful.
     */
    List<LargePersonGroup> list();

    /**
     * List all existing large person groups’s largePersonGroupId, name, userData and recognitionModel.&lt;br /&gt;
     * * Large person groups are stored in alphabetical order of largePersonGroupId.
     * * "start" parameter (string, optional) is a user-provided largePersonGroupId value that returned entries have larger ids by string comparison. "start" set to empty to indicate return from the first item.
     * * "top" parameter (int, optional) specifies the number of entries to return. A maximal of 1000 entries can be returned in one call. To fetch more, you can specify "start" with the last retuned entry’s Id of the current call.
     * &lt;br /&gt;
     * For example, total 5 large person groups: "group1", ..., "group5".
     * &lt;br /&gt; "start=&amp;top=" will return all 5 groups.
     * &lt;br /&gt; "start=&amp;top=2" will return "group1", "group2".
     * &lt;br /&gt; "start=group2&amp;top=3" will return "group3", "group4", "group5".
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<List<LargePersonGroup>>> listWithRestResponseAsync();

    /**
     * List all existing large person groups’s largePersonGroupId, name, userData and recognitionModel.&lt;br /&gt;
     * * Large person groups are stored in alphabetical order of largePersonGroupId.
     * * "start" parameter (string, optional) is a user-provided largePersonGroupId value that returned entries have larger ids by string comparison. "start" set to empty to indicate return from the first item.
     * * "top" parameter (int, optional) specifies the number of entries to return. A maximal of 1000 entries can be returned in one call. To fetch more, you can specify "start" with the last retuned entry’s Id of the current call.
     * &lt;br /&gt;
     * For example, total 5 large person groups: "group1", ..., "group5".
     * &lt;br /&gt; "start=&amp;top=" will return all 5 groups.
     * &lt;br /&gt; "start=&amp;top=2" will return "group1", "group2".
     * &lt;br /&gt; "start=group2&amp;top=3" will return "group3", "group4", "group5".
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<List<LargePersonGroup>> listAsync();

    /**
     * List all existing large person groups’s largePersonGroupId, name, userData and recognitionModel.&lt;br /&gt;
     * * Large person groups are stored in alphabetical order of largePersonGroupId.
     * * "start" parameter (string, optional) is a user-provided largePersonGroupId value that returned entries have larger ids by string comparison. "start" set to empty to indicate return from the first item.
     * * "top" parameter (int, optional) specifies the number of entries to return. A maximal of 1000 entries can be returned in one call. To fetch more, you can specify "start" with the last retuned entry’s Id of the current call.
     * &lt;br /&gt;
     * For example, total 5 large person groups: "group1", ..., "group5".
     * &lt;br /&gt; "start=&amp;top=" will return all 5 groups.
     * &lt;br /&gt; "start=&amp;top=2" will return "group1", "group2".
     * &lt;br /&gt; "start=group2&amp;top=3" will return "group3", "group4", "group5".
     *
     * @param start List large person groups from the least largePersonGroupId greater than the "start".
     * @param top The number of large person groups to list.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List&lt;LargePersonGroup&gt; object if successful.
     */
    List<LargePersonGroup> list(String start, Integer top, Boolean returnRecognitionModel);

    /**
     * List all existing large person groups’s largePersonGroupId, name, userData and recognitionModel.&lt;br /&gt;
     * * Large person groups are stored in alphabetical order of largePersonGroupId.
     * * "start" parameter (string, optional) is a user-provided largePersonGroupId value that returned entries have larger ids by string comparison. "start" set to empty to indicate return from the first item.
     * * "top" parameter (int, optional) specifies the number of entries to return. A maximal of 1000 entries can be returned in one call. To fetch more, you can specify "start" with the last retuned entry’s Id of the current call.
     * &lt;br /&gt;
     * For example, total 5 large person groups: "group1", ..., "group5".
     * &lt;br /&gt; "start=&amp;top=" will return all 5 groups.
     * &lt;br /&gt; "start=&amp;top=2" will return "group1", "group2".
     * &lt;br /&gt; "start=group2&amp;top=3" will return "group3", "group4", "group5".
     *
     * @param start List large person groups from the least largePersonGroupId greater than the "start".
     * @param top The number of large person groups to list.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<List<LargePersonGroup>>> listWithRestResponseAsync(String start, Integer top, Boolean returnRecognitionModel);

    /**
     * List all existing large person groups’s largePersonGroupId, name, userData and recognitionModel.&lt;br /&gt;
     * * Large person groups are stored in alphabetical order of largePersonGroupId.
     * * "start" parameter (string, optional) is a user-provided largePersonGroupId value that returned entries have larger ids by string comparison. "start" set to empty to indicate return from the first item.
     * * "top" parameter (int, optional) specifies the number of entries to return. A maximal of 1000 entries can be returned in one call. To fetch more, you can specify "start" with the last retuned entry’s Id of the current call.
     * &lt;br /&gt;
     * For example, total 5 large person groups: "group1", ..., "group5".
     * &lt;br /&gt; "start=&amp;top=" will return all 5 groups.
     * &lt;br /&gt; "start=&amp;top=2" will return "group1", "group2".
     * &lt;br /&gt; "start=group2&amp;top=3" will return "group3", "group4", "group5".
     *
     * @param start List large person groups from the least largePersonGroupId greater than the "start".
     * @param top The number of large person groups to list.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<List<LargePersonGroup>> listAsync(String start, Integer top, Boolean returnRecognitionModel);

    /**
     * Queue a large person group training task, the training task may not be started immediately.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void train(@NonNull String largePersonGroupId);

    /**
     * Queue a large person group training task, the training task may not be started immediately.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<RestVoidResponse> trainWithRestResponseAsync(@NonNull String largePersonGroupId);

    /**
     * Queue a large person group training task, the training task may not be started immediately.
     *
     * @param largePersonGroupId Id referencing a particular large person group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> trainAsync(@NonNull String largePersonGroupId);
}
