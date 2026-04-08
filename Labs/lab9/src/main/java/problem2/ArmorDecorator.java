package problem2;

public class ArmorDecorator extends CharacterDecorator {
    private final Equipment armor;

    public ArmorDecorator(GameCharacter character, Equipment armor) {
        super(character);
        this.armor = armor;
    }

    @Override
    public int getHealth() {
        return character.getHealth();
    }

    @Override
    public int getAttack() {
        return character.getAttack() + armor.getAttackBonus();
    }

    @Override
    public int getDefense() {
        return character.getDefense() + armor.getDefenseBonus();
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
        return new ArmorDecorator(character.clone(), armor);
    }

    @Override
    public String getDescription() {
        return character.getDescription()
                + ", equipped with armor: " + armor.getDescription()
                + " -> Final Stats: Name: " + getName()
                + ", HP: " + getHealth()
                + ", ATK: " + getAttack()
                + ", DEF: " + getDefense();
    }
}