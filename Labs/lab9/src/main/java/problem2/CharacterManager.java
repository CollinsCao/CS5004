package problem2;

public class CharacterManager {

    public void demonstrate() {
        System.out.println("========== Problem 2: Game Character Creation System ==========");

        GameCharacter tank = CharacterFactory.createCharacter("tank", "Brutus");
        GameCharacter dps = CharacterFactory.createCharacter("dps", "SwiftArrow");
        GameCharacter support = CharacterFactory.createCharacter("support", "Mystic");

        System.out.println("\nFactory-created characters:");
        System.out.println(tank.getDescription());
        System.out.println(dps.getDescription());
        System.out.println(support.getDescription());

        Equipment sword = new Weapon("Flame Sword", 15);
        Equipment heavyArmor = new Armor("Steel Armor", 20);

        GameCharacter customCharacter = new CharacterBuilder()
                .setType("warrior")
                .setName("CustomHero")
                .setHealth(130)
                .setAttack(30)
                .setDefense(25)
                .addWeapon(sword)
                .addArmor(heavyArmor)
                .build();

        System.out.println("\nBuilt custom character:");
        System.out.println(customCharacter.getDescription());

        GameCharacter clonedTank = tank.clone();
        clonedTank.setName("Brutus Clone");

        System.out.println("\nCloned character:");
        System.out.println(clonedTank.getDescription());

        Equipment bow = new Weapon("Long Bow", 12);
        Equipment leatherArmor = new Armor("Leather Armor", 8);

        GameCharacter decoratedDps = new ArmorDecorator(
                new WeaponDecorator(dps, bow),
                leatherArmor
        );

        System.out.println("\nDecorated character:");
        System.out.println(decoratedDps.getDescription());
    }
}
