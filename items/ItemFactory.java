package items;

import upgrades.Rarity;

public class ItemFactory {
    public static Item createItem(String type, String name, Rarity rarity) {
        switch (type.toLowerCase()) {
            case "armor":
                return new Armor(name, rarity, 50);
            case "potion":
                return new Potion(name, rarity, 100);
            case "weapon":
                return new Weapon(name, rarity, 20);
            default:
                return null;
        }
    }
}
