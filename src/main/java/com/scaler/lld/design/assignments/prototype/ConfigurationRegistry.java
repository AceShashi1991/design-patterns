package com.scaler.lld.design.assignments.prototype;

import java.util.HashMap;

public class ConfigurationRegistry implements ConfigurationPrototypeRegistry{
    private HashMap<ConfigurationType,Configuration> configurationRegistry = new HashMap<>();
    @Override
    public void addPrototype(Configuration user) {
        configurationRegistry.put(user.getType(),user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return configurationRegistry.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        return (Configuration) configurationRegistry.get(type).cloneObject();
    }
}
