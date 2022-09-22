package javi.dev.tools.service;

import javi.dev.tools.model.VariableSet;

public interface InfoHandler {
    VariableSet ConcatText(VariableSet variableSet, String text);
    VariableSet ChangeStatus(VariableSet variableSet);
    VariableSet SumNumeric(VariableSet variableSet, int i);
}
