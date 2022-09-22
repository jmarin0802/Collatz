package javi.dev.tools.service.Impl;

import javi.dev.tools.model.VariableSet;
import javi.dev.tools.service.InfoHandler;
import org.springframework.stereotype.Service;

@Service
public class InfoHandlerImpl implements InfoHandler {

    @Override
    public VariableSet ConcatText(VariableSet variableSet, String text) {
        return variableSet.concat(text);
    }

    @Override
    public VariableSet ChangeStatus(VariableSet variableSet) {
        return variableSet.changeStatus();
    }

    @Override
    public VariableSet SumNumeric(VariableSet variableSet, int i) {
        return variableSet.Collatz(i);
    }

    public InfoHandlerImpl() {
    }
}
