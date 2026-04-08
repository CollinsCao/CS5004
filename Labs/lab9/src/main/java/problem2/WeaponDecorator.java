package problem2;

public class WeaponDecorator extends CharacterDecorator {
    private final Equipment weapon;

    public WeaponDecorator(GameCharacter character, Equipment weapon) {
        super(character);
        this.weapon = weapon;
    }

    @Override
    public int getHealth() {
        return character.getHealth();
    }

    @Override
    public int getAttack() {
        return character.getAttack() + weapon.getAttackBonus();
    }

    @Override
    public int getDefense() {
        return character.getDefense() + weapon.getDefenseBonus();
    }

    @Override
    public void setName(String name) {
        character.setName(name);
    }

    @Override
    public String getName() {
        return character.getName();
    }

    @Override
    public GameCharacter clone() {
        return new WeaponDecorator(character.clone(), weapon);
    }

    @Override
    public String getDescription() {
        return character.getDescription()
                + ", equipped with weapon: " + weapon.getDescription()
                + " -> Final Stats: Name: " + getName()
                + ", HP: " + getHealth()
                + ", ATK: " + getAttack()
                + ", DEF: " + getDefense();
    }
}