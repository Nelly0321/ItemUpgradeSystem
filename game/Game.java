package game;

import characters.*;
import items.*;
import upgrades.*;
import mechanists.*;


public class Game {

    public static void main(String[] args) {
        // Initialize characters
        GameCharacter warrior = new Warrior("Conan", 200, 50, 30); // Example values
        GameCharacter mage = new Mage("Gandalf", 150, 70, 100);     // Example values

        // Create inventory
        Inventory inventoryForWarrior = new Inventory();
        inventoryForWarrior.addItem(ItemFactory.createItem("weapon", "Sword of Destiny", Rarity.LEGENDARY));
        inventoryForWarrior.addItem(ItemFactory.createItem("potion", "Healing Potion", Rarity.COMMON));

        // Print initial inventory
        System.out.println("Initial Inventory:");
        System.out.println(inventoryForWarrior);
        warrior.takeInventory(inventoryForWarrior);
        // Upgrade an item
        UpgradeStrategy upgradeStrategy = new CommonUpgradeStrategy();
        upgradeStrategy.upgrade(inventoryForWarrior, inventoryForWarrior.getItems().get(1)); // Upgrade the second item

        System.out.println("\nInventory after upgrade:");
        System.out.println(inventoryForWarrior);

        // Simulate gameplay
        warrior.attack(mage);
        mage.defend();
    }
}
