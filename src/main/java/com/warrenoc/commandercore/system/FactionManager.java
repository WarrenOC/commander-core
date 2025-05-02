package com.warrenoc.commandercore.system;

import com.warrenoc.commandercore.api.Faction;
import java.util.HashMap;
import java.util.Map;

public class FactionManager {
    private final Map<String, Faction> factions = new HashMap<>();

    public void registerFaction(Faction faction) {
        factions.put(faction.getFactionId(), faction);
    }

    public Faction getFactionById(String factionId) {
        return factions.get(factionId);
    }

    public Map<String, Faction> getAllFactions() {
        return factions;
    }
}
