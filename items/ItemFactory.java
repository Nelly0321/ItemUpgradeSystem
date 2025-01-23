package items;

import upgrades.Rarity;

public class ItemFactory {
    public static Item createItem(String type, String name, Rarity rarity) {
        switch (type.toLowerCase()) {
            case "weapon":
                return new Weapon(name, rarity, 5);
            case "armor":
                return new Armor(name, rarity, 10);
            case "potion":
                return new Potion(name, rarity, 3);
            default:
                throw new IllegalArgumentException("Unknown item type: " + type);
        }
    }
}
