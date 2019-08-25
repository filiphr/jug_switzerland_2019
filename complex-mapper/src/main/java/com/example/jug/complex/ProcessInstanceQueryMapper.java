package com.example.jug.complex;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ObjectFactory;

import com.example.jug.complex.rest.ProcessInstanceQueryRequest;
import com.example.jug.complex.runtime.ProcessInstanceQuery;
import com.example.jug.complex.runtime.RuntimeService;

/**
 * @author Filip Hrisafov
 */
@Mapper(config = SpringMappingConfig.class, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ProcessInstanceQueryMapper {

    ProcessInstanceQuery createQuery(ProcessInstanceQueryRequest request, @Context RuntimeService runtimeService);

    @BeforeMapping
    default void beforeQueryMapping(@MappingTarget ProcessInstanceQuery query, ProcessInstanceQueryRequest request) {
        if (Boolean.TRUE.equals(request.getActive())) {
            query.active();
        }
    }

    @AfterMapping
    default void afterQueryMapping(@MappingTarget ProcessInstanceQuery query, ProcessInstanceQueryRequest request) {
        if (Boolean.TRUE.equals(request.getActive())) {
            query.active();
        }
    }

    @ObjectFactory
    default ProcessInstanceQuery createQuery(@Context RuntimeService runtimeService) {
        return runtimeService.createProcessInstanceQuery();
    }

}
