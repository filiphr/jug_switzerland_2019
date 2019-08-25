package com.example.jug.complex;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.jug.complex.rest.RestVariable;
import com.example.jug.complex.rest.RestVariableConverter;
import com.example.jug.complex.runtime.VariableInstance;

/**
 * @author Filip Hrisafov
 */
public class VariableMapperService {

    protected Map<String, RestVariableConverter> variableConverters;

    public RestVariable convert(VariableInstance variableInstance) {
        if (variableInstance == null) {
            return null;
        }

        RestVariable restVariable = new RestVariable();

        restVariable.setName(variableInstance.getName());
        restVariable.setType(variableInstance.getTypeName());
        RestVariableConverter converter = findConverter(variableInstance.getTypeName());
        if (converter != null) {
            restVariable.setValue(converter.convertToRestVariable(variableInstance.getValue()));
        }

        return restVariable;

    }

    protected RestVariableConverter findConverter(String typeName) {
        return variableConverters.get(typeName);
    }

    public void setVariableConverters(List<RestVariableConverter> variableConverters) {
        this.variableConverters = variableConverters.stream()
            .collect(Collectors.toMap(RestVariableConverter::getTypeName, Function.identity()));
    }
}
