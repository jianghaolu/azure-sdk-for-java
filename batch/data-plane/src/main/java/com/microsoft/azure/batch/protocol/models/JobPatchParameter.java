// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of changes to be made to a job.
 */
public class JobPatchParameter {
    /**
     * The priority of the job.
     * Priority values can range from -1000 to 1000, with -1000 being the
     * lowest priority and 1000 being the highest priority. If omitted, the
     * priority of the job is left unchanged.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * The action the Batch service should take when all tasks in the job are
     * in the completed state.
     * If omitted, the completion behavior is left unchanged. You may not
     * change the value from terminatejob to noaction - that is, once you have
     * engaged automatic job termination, you cannot turn it off again. If you
     * try to do this, the request fails with an 'invalid property value' error
     * response; if you are calling the REST API directly, the HTTP status code
     * is 400 (Bad Request). Possible values include: 'noAction',
     * 'terminateJob'.
     */
    @JsonProperty(value = "onAllTasksComplete")
    private OnAllTasksComplete onAllTasksComplete;

    /**
     * The execution constraints for the job.
     * If omitted, the existing execution constraints are left unchanged.
     */
    @JsonProperty(value = "constraints")
    private JobConstraints constraints;

    /**
     * The pool on which the Batch service runs the job's tasks.
     * You may change the pool for a job only when the job is disabled. The
     * Patch Job call will fail if you include the poolInfo element and the job
     * is not disabled. If you specify an autoPoolSpecification specification
     * in the poolInfo, only the keepAlive property can be updated, and then
     * only if the auto pool has a poolLifetimeOption of job. If omitted, the
     * job continues to run on its current pool.
     */
    @JsonProperty(value = "poolInfo")
    private PoolInformation poolInfo;

    /**
     * A list of name-value pairs associated with the job as metadata.
     * If omitted, the existing job metadata is left unchanged.
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Get priority values can range from -1000 to 1000, with -1000 being the lowest priority and 1000 being the highest priority. If omitted, the priority of the job is left unchanged.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set priority values can range from -1000 to 1000, with -1000 being the lowest priority and 1000 being the highest priority. If omitted, the priority of the job is left unchanged.
     *
     * @param priority the priority value to set
     * @return the JobPatchParameter object itself.
     */
    public JobPatchParameter withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get if omitted, the completion behavior is left unchanged. You may not change the value from terminatejob to noaction - that is, once you have engaged automatic job termination, you cannot turn it off again. If you try to do this, the request fails with an 'invalid property value' error response; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request). Possible values include: 'noAction', 'terminateJob'.
     *
     * @return the onAllTasksComplete value
     */
    public OnAllTasksComplete onAllTasksComplete() {
        return this.onAllTasksComplete;
    }

    /**
     * Set if omitted, the completion behavior is left unchanged. You may not change the value from terminatejob to noaction - that is, once you have engaged automatic job termination, you cannot turn it off again. If you try to do this, the request fails with an 'invalid property value' error response; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request). Possible values include: 'noAction', 'terminateJob'.
     *
     * @param onAllTasksComplete the onAllTasksComplete value to set
     * @return the JobPatchParameter object itself.
     */
    public JobPatchParameter withOnAllTasksComplete(OnAllTasksComplete onAllTasksComplete) {
        this.onAllTasksComplete = onAllTasksComplete;
        return this;
    }

    /**
     * Get if omitted, the existing execution constraints are left unchanged.
     *
     * @return the constraints value
     */
    public JobConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set if omitted, the existing execution constraints are left unchanged.
     *
     * @param constraints the constraints value to set
     * @return the JobPatchParameter object itself.
     */
    public JobPatchParameter withConstraints(JobConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get you may change the pool for a job only when the job is disabled. The Patch Job call will fail if you include the poolInfo element and the job is not disabled. If you specify an autoPoolSpecification specification in the poolInfo, only the keepAlive property can be updated, and then only if the auto pool has a poolLifetimeOption of job. If omitted, the job continues to run on its current pool.
     *
     * @return the poolInfo value
     */
    public PoolInformation poolInfo() {
        return this.poolInfo;
    }

    /**
     * Set you may change the pool for a job only when the job is disabled. The Patch Job call will fail if you include the poolInfo element and the job is not disabled. If you specify an autoPoolSpecification specification in the poolInfo, only the keepAlive property can be updated, and then only if the auto pool has a poolLifetimeOption of job. If omitted, the job continues to run on its current pool.
     *
     * @param poolInfo the poolInfo value to set
     * @return the JobPatchParameter object itself.
     */
    public JobPatchParameter withPoolInfo(PoolInformation poolInfo) {
        this.poolInfo = poolInfo;
        return this;
    }

    /**
     * Get if omitted, the existing job metadata is left unchanged.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set if omitted, the existing job metadata is left unchanged.
     *
     * @param metadata the metadata value to set
     * @return the JobPatchParameter object itself.
     */
    public JobPatchParameter withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

}
