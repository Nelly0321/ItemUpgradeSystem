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
        Inventory inventory = new Inventory();
        inventory.addItem(ItemFactory.createItem("weapon", "Sword of Destiny", Rarity.LEGENDARY));
        inventory.addItem(ItemFactory.createItem("potion", "Healing Potion", Rarity.COMMON));

        // Print initial inventory
        System.out.println("Initial Inventory:");
        System.out.println(inventory);

        // Upgrade an item
        UpgradeStrategy upgradeStrategy = new CommonToGreatUpgrade();
        upgradeStrategy.upgrade(inventory.getItems().get(1)); // Upgrade the second item

        System.out.println("\nInventory after upgrade:");
        System.out.println(inventory);

        // Simulate gameplay
        warrior.attack(mage);
        mage.defend();
    }
}
