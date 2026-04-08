package problem2;

public class CharacterFactory {

    public static GameCharacter createCharacter(String role, String name) {
        if (role == null) {
            throw new IllegalArgumentException("Role cannot be null.");
        }

        switch (role.toLowerCase()) {
            case "tank":
                return new Warrior(name, 150, 20, 40);
            case "dps":
                return new Archer(name, 100, 40, 15);
            case "support":
                return new Mage(name, 90, 25, 20);
            default:
                throw new IllegalArgumentException("Unknown role: " + role);
        }
    }
}