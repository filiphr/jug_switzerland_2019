package com.example.jug.complex;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.jug.complex.rest.ProcessInstanceResponse;
import com.example.jug.complex.runtime.ProcessDefinition;
import com.example.jug.complex.runtime.ProcessInstance;

/**
 * @author Filip Hrisafov
 */
@Mapper(uses = {
    UrlMappingUtils.class,
    VariableMapperService.class
}, config = SpringMappingConfig.class)
public interface ProcessInstanceMapper {

    @Mapping(target = "id", source = "processInstance.id")
    @Mapping(target = "name", source = "processInstance.name")
    @Mapping(target = "processDefinitionName", source = "processDefinition.name")
    @Mapping(target = "url", source = "processInstance.id", qualifiedBy = UrlMappingUtils.ProcessInstanceUrl.class)
    @Mapping(target = "processDefinitionUrl", source = "processInstance.processDefinitionId", qualifiedByName = UrlMappingUtils.PROCESS_DEFINITION_URL)
    ProcessInstanceResponse createResponse(ProcessInstance processInstance, ProcessDefinition processDefinition);

}
