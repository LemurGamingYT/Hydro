package core;

import core.reprs.*;

import java.util.HashMap;

public class Env {
    public HashMap<String, varRepr> variables = new HashMap<>();
    public HashMap<String, funcRepr> functions = new HashMap<>();

    public HashMap<String, moduleRepr> modules = new HashMap<>();

    public void AddVariable(varRepr repr) {
        variables.put(repr.name, repr);
    }

    public varRepr GetVariable(String name) {
        return variables.get(name);
    }

    public void SetVariable(varRepr repr) {
        variables.put(repr.name, repr);
    }

    public void AddFunc(funcRepr repr) {
        functions.put(repr.name, repr);
    }

    public funcRepr GetFunc(String name) {
        return functions.get(name);
    }

    public void AddModule(moduleRepr repr) {
        modules.put(repr.name, repr);
    }

    public moduleRepr GetModule(String name) {
        return modules.get(name);
    }
}
