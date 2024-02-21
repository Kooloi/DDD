package org.DDD;

import java.util.ArrayList;
import java.util.List;

public class ValueObjectBuilder {
    String className;
    List<String> variables;
    List<String> variableTypes;
    boolean generateToString;
    boolean generateHashCode;
    String addFinalKeyword;
    boolean generateGet;
    public ValueObjectBuilder(String className) {
        this.className = className;
        this.variables = new ArrayList<>();
        this.variableTypes = new ArrayList<>();
        this.generateToString = false;
        this.generateHashCode = false;
       this.addFinalKeyword = "";
    }

    public void addVariable(String variableType, String variableName) {
        this.variableTypes.add(variableType);
        this.variables.add(variableName);
    }

    public List<String> getVariables() {
        return this.variables;
    }

    public List<String> getVariableTypes() {
        return this.variableTypes;
    }



    public ValueObject build() {
        return new ValueObject(this);
    }
}