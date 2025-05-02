package com.warrenoc.commandercore.system;

import com.warrenoc.commandercore.api.UnitDefinition;
import java.util.HashMap;
import java.util.Map;

public class UnitManager {
    private final Map<String, UnitDefinition> units = new HashMap<>();

    public void registerUnit(UnitDefinition unit) {
        units.put(unit.getName(), unit);
    }

    public UnitDefinition getUnitByName(String name) {
        return units.get(name);
    }

    public Map<String, UnitDefinition> getAllUnits() {
        return units;
    }
}
