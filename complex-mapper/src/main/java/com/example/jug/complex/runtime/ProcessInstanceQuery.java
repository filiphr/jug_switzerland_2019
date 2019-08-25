package com.example.jug.complex.runtime;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author Filip Hrisafov
 */
public interface ProcessInstanceQuery {

    ProcessInstanceQuery processInstanceId(String processInstanceId);

    ProcessInstanceQuery processDefinitionKeys(Set<String> processDefinitionKeys);

    ProcessInstanceQuery active();

    ProcessInstanceQuery startedBefore(Date beforeTime);

    List<ProcessInstance> list();

    long count();

}
