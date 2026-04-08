package problem2;

public class Weapon implements Equipment {
    private final String name;
    private final int attackBonus;

    public Weapon(String name, int attackBonus) {
        this.name = name;
        this.attackBonus = attackBonus;
    }

    @Override
    public int getAttackBonus() {
        return attackBonus;
    }

    @Override
    public int getDefenseBonus() {
        return 0;
    }

    @Override
    public String getDescription() {
        return name + " (+" + attackBonus + " ATK)";
    }
}