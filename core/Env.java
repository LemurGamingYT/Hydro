package core;

import core.reprs.funcRepr;
import core.reprs.intRepr;
import core.reprs.varRepr;

import java.util.HashMap;

public class Env {
    public HashMap<String, varRepr> variables = new HashMap<>();
    public HashMap<String, funcRepr> functions = new HashMap<>();

    public void AddVariable(varRepr repr) {
        variables.put(repr.name, repr);
    }

    public varRepr GetVariable(String name) {
        return variables.get(name);
    }

    public void SetVariable(varRepr repr) {
        variables.put(repr.name, repr);
    }

    public void RemoveVariable(String name) {
        variables.remove(name);
    }

    public void AddFunc(funcRepr repr) {
        functions.put(repr.name, repr);
    }

    public funcRepr GetFunc(String name) {
        return functions.get(name);
    }
}
