package com.warrenoc.commandercore;

import com.warrenoc.commandercore.api.Faction;
import com.warrenoc.commandercore.api.UnitDefinition;
import com.warrenoc.commandercore.system.FactionManager;
import com.warrenoc.commandercore.system.UnitManager;
import com.warrenoc.commandercore.system.DefaultFaction;
import com.warrenoc.commandercore.system.DefaultUnitDefinition;

public class CommanderCoreMod {
    // Faction and Unit Managers
    private static final FactionManager factionManager = new FactionManager();
    private static final UnitManager unitManager = new UnitManager();

    public static void registerFactionsAndUnits() {
        // Register factions
        Faction faction1 = new DefaultFaction("Epic Knights", "A faction of mighty warriors.", "epic_knights");
        factionManager.registerFaction(faction1);

        // Register units
        UnitDefinition archer = new DefaultUnitDefinition("Archer", "A skilled archer.", 100, 50, 15);
        unitManager.registerUnit(archer);
    }

    // Call this method in your mod's initialization
    public static void init() {
        registerFactionsAndUnits();
    }
}
