package com.example.jug.complex.rest;

import java.time.Instant;
import java.util.Collection;

/**
 * @author Filip Hrisafov
 */
public class ProcessInstanceQueryRequest {

    protected String processInstanceId;
    protected Collection<String> processDefinitionKeys;
    protected Boolean active;
    protected Instant startedBefore;

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public Collection<String> getProcessDefinitionKeys() {
        return processDefinitionKeys;
    }

    public void setProcessDefinitionKeys(Collection<String> processDefinitionKeys) {
        this.processDefinitionKeys = processDefinitionKeys;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Instant getStartedBefore() {
        return startedBefore;
    }

    public void setStartedBefore(Instant startedBefore) {
        this.startedBefore = startedBefore;
    }
}
