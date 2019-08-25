package com.example.jug.simple;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

/**
 * @author Filip Hrisafov
 */
//@Mapper(uses = CarMapper.class, componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface GarageMapper {

    GarageDto map(Garage garage);

}
