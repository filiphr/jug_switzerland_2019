package com.example.jug.complex.runtime;

import java.util.Date;
import java.util.List;

/**
 * @author Filip Hrisafov
 */
public class ProcessInstance {

    protected String id;
    protected String name;
    protected Date startTime;

    protected String processDefinitionId;

    protected List<VariableInstance> variables;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public List<VariableInstance> getVariables() {
        return variables;
    }

    public void setVariables(List<VariableInstance> variables) {
        this.variables = variables;
    }
}
