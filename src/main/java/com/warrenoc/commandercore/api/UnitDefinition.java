package com.warrenoc.commandercore.api;

public interface UnitDefinition {
    String getName();  // Unit name (e.g., "Archer")
    String getDescription();  // Unit description (e.g., "A skilled archer.")
    int getCost();  // Cost in some currency (can be used for hiring logic)
    int getHealth();  // Unit health
    int getAttackPower();  // Unit's attack power or other stats

    // Other optional attributes:
    // - Special abilities (e.g., ranged, flying)
    // - Unit rarity
}
