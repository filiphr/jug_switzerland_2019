package com.example.jug.complex;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.MapperConfig;

/**
 * @author Filip Hrisafov
 */
@MapperConfig(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface SpringMappingConfig {

}
