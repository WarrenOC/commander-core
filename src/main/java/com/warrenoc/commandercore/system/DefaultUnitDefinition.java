package com.warrenoc.commandercore.system;

import com.warrenoc.commandercore.api.UnitDefinition;

public class DefaultUnitDefinition implements UnitDefinition {
    private final String name;
    private final String description;
    private final int cost;
    private final int health;
    private final int attackPower;

    public DefaultUnitDefinition(String name, String description, int cost, int health, int attackPower) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.health = health;
        this.attackPower = attackPower;
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
    public int getCost() {
        return cost;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }
}
