package com.example.jug.complex;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.mapstruct.Named;
import org.mapstruct.Qualifier;

/**
 * @author Filip Hrisafov
 */
public class UrlMappingUtils {

    public static final String PROCESS_DEFINITION_URL = "processDefinitionUrl";

    @Qualifier
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.CLASS)
    public @interface ProcessInstanceUrl { }


    @Named(PROCESS_DEFINITION_URL)
    public static String processDefinitionUrl(String processDefinitionId) {
        return "process-api/repository/process-definitions/" + processDefinitionId;
    }

    @ProcessInstanceUrl
    public static String processInstanceUrl(String processInstanceId) {
        return "process-api/runtime/process-instances/" + processInstanceId;
    }



}
