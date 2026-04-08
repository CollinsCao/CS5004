package problem2;

public class Armor implements Equipment {
    private final String name;
    private final int defenseBonus;

    public Armor(String name, int defenseBonus) {
        this.name = name;
        this.defenseBonus = defenseBonus;
    }

    @Override
    public int getAttackBonus() {
        return 0;
    }

    @Override
    public int getDefenseBonus() {
        return defenseBonus;
    }

    @Override
    public String getDescription() {
        return name + " (+" + defenseBonus + " DEF)";
    }
}