package problem2;

public abstract class CharacterDecorator extends GameCharacter {
    protected GameCharacter character;

    public CharacterDecorator(GameCharacter character) {
        super(character.getName(), character.getHealth(), character.getAttack(), character.getDefense());
        this.character = character;
    }
}