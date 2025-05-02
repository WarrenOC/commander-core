package com.warrenoc.commandercore.system;

import com.warrenoc.commandercore.api.Faction;

public class DefaultFaction implements Faction {
    private final String name;
    private final String description;
    private final String factionId;

    public DefaultFaction(String name, String description, String factionId) {
        this.name = name;
        this.description = description;
        this.factionId = factionId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getFactionId() {
        return factionId;
    }
}
