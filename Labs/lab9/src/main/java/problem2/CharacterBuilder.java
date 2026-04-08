package problem2;

public class CharacterBuilder {
    private String type;
    private String name;
    private int health;
    private int attack;
    private int defense;
    private Equipment weapon;
    private Equipment armor;

    public CharacterBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public CharacterBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CharacterBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    public CharacterBuilder setAttack(int attack) {
        this.attack = attack;
        return this;
    }

    public CharacterBuilder setDefense(int defense) {
        this.defense = defense;
        return this;
    }

    public CharacterBuilder addWeapon(Equipment weapon) {
        this.weapon = weapon;
        return this;
    }

    public CharacterBuilder addArmor(Equipment armor) {
        this.armor = armor;
        return this;
    }

    public GameCharacter build() {
        if (type == null) {
            throw new IllegalArgumentException("Character type cannot be null.");
        }

        GameCharacter character;

        switch (type.toLowerCase()) {
            case "warrior":
                character = new Warrior(name, health, attack, defense);
                break;
            case "mage":
                character = new Mage(name, health, attack, defense);
                break;
            case "archer":
                character = new Archer(name, health, attack, defense);
                break;
            default:
                throw new IllegalArgumentException("Unknown character type: " + type);
        }

        if (weapon != null) {
            character = new WeaponDecorator(character, weapon);
        }

        if (armor != null) {
            character = new ArmorDecorator(character, armor);
        }

        return character;
    }
}