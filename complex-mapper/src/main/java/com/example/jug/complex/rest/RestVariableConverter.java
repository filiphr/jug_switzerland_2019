package com.example.jug.complex.rest;

/**
 * @author Filip Hrisafov
 */
public interface RestVariableConverter {

    String getTypeName();

    Object convertToRestVariable(Object value);

}
