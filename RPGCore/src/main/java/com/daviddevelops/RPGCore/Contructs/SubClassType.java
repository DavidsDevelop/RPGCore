package com.daviddevelops.RPGCore.Contructs;

public enum SubClassType {

    ARCANE_ARCHER(ClassType.FIGHTER), BATTLE_MASTER(ClassType.FIGHTER), KNIGHT(ClassType.FIGHTER), SAMURAI(ClassType.FIGHTER),
    ASSASSIN(ClassType.ROGUE), SCOUT(ClassType.ROGUE), SWASHBUCKLER(ClassType.ROGUE), INQUISITIVE(ClassType.ROGUE),
    BEAST_MASTER(ClassType.RANGER), HUNTER(ClassType.RANGER), RANGER(ClassType.RANGER),
    TANKER(ClassType.BARBARIAN), BERSERKER(ClassType.BARBARIAN),
    LIFE_CLERIC(ClassType.CLERIC), DEATH_CLERIC(ClassType.CLERIC),
    ICE_MAGE(ClassType.MAGE), BURST_MAGE(ClassType.MAGE), FIRE_MAGE(ClassType.MAGE);

    private final ClassType type;

    private SubClassType(ClassType type) {
        this.type = type;
    }
}
