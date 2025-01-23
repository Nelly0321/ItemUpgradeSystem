package upgrades;

import items.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public enum Rarity {
    COMMON,
    UNCOMMON,
    RARE,
    EPIC,
    LEGENDARY;

    private List<Item> items = new ArrayList<>();
    private static final Random random = new Random();

    // Method to initialize items for each rarity
    public void initializeItems() {
        switch (this) {
            case COMMON:
                items.add(new Weapon("Wooden Sword", Rarity.COMMON, 1));
                items.add(new Armor("Iron Dagger", Rarity.COMMON, 1));
                items.add(new Weapon("Rusty Sword", Rarity.COMMON, 1));
                break;
            case UNCOMMON:
                items.add(new Weapon("Steel Sword", Rarity.UNCOMMON, 2));
                items.add(new Armor("Iron Cleaver", Rarity.UNCOMMON, 2));
                items.add(new Armor("Mithril Blade", Rarity.UNCOMMON, 2));
                break;
            case RARE:
                items.add(new Weapon("Golden Sword", Rarity.RARE, 3));
                items.add(new Weapon("Silver Saber", Rarity.RARE, 3));
                items.add(new Armor("Elven Blade", Rarity.RARE, 3));
                break;
            case EPIC:
                items.add(new Armor("Dragon Slayer", Rarity.EPIC, 4));
                items.add(new Armor("Phoenix Blade", Rarity.EPIC, 4));
                items.add(new Potion("Excalibur", Rarity.EPIC, 4));
                break;
            case LEGENDARY:
                items.add(new Weapon("Soul Reaver", Rarity.LEGENDARY, 5));
                items.add(new Weapon("King's Sword", Rarity.LEGENDARY, 5));
                items.add(new Weapon("Destiny's Edge", Rarity.LEGENDARY, 5));
                break;
        }
    }

    // Get all items for this rarity
    public List<Item> getItems() {
        return items;
    }

    // Get a random item for this rarity
    public Item getRandomItem() {
        return items.get(random.nextInt(items.size()));
    }
 
    // Get the next rarity (increment rarity level)
    public Rarity next() {
        int nextOrdinal = this.ordinal() + 1;
        if (nextOrdinal < Rarity.values().length) {
            return Rarity.values()[nextOrdinal];
        }
        return this; // If at max rarity, return the current rarity
    }

    // Get the previous rarity (decrement rarity level)
    public Rarity previous() {
        int prevOrdinal = this.ordinal() - 1;
        if (prevOrdinal >= 0) {
            return Rarity.values()[prevOrdinal];
        }
        return this; // If at min rarity, return the current rarity
    }
}
