package items;

import upgrades.UpgradeStrategy;
import upgrades.Rarity;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Inventory {
    private Map<Rarity, List<Item>> rarityMap;

    public Inventory() {
        rarityMap = new HashMap<>();
        for (Rarity rarity : Rarity.values()) {
            rarityMap.put(rarity, new ArrayList<>());
        }
    }

    // Add a single item to the inventory
    public void addItem(Item item) {
        rarityMap.get(item.getRarity()).add(item);
        System.out.println(item.getName() + " added to inventory (" + item.getRarity() + ").");
    }

    // Add all items from another inventory
    public void addAllItems(Inventory otherInventory) {
        for (Map.Entry<Rarity, List<Item>> entry : otherInventory.rarityMap.entrySet()) {
            Rarity rarity = entry.getKey();
            List<Item> itemsToAdd = entry.getValue();

            rarityMap.get(rarity).addAll(itemsToAdd);
            for (Item item : itemsToAdd) {
                System.out.println(item.getName() + " added to inventory (" + rarity + ").");
            }
        }
    }

    // Remove a single item from the inventory
    public void removeItem(Item item) {
        if (rarityMap.get(item.getRarity()).remove(item)) {

            System.out.println(item.getName() + " removed from inventory.");
        } else {
            System.out.println(item.getName() + " not found in inventory.");
        }
    }

    public void displayInventory() {
        boolean isEmpty = true;
        System.out.println("Inventory:");
        for (Map.Entry<Rarity, List<Item>> entry : rarityMap.entrySet()) {
            Rarity rarity = entry.getKey();
            List<Item> items = entry.getValue();
            if (!items.isEmpty()) {
                isEmpty = false;
                System.out.println(rarity + ":");
                for (Item item : items) {
                    System.out.println("- " + item.getName());
                }
            }
        }
        if (isEmpty) {
            System.out.println("The inventory is empty.");
        }
    }


    public void upgradeItem(Item item, UpgradeStrategy strategy) {
        if (!rarityMap.containsValue(item)) {
            System.out.println("Item not found in inventory.");
            return;
        }
        strategy.upgrade(this,item);
        System.out.println(item.getName() + " has been upgraded using " + strategy.getClass().getSimpleName());
    }
    
    public List<Item> getItemsByRarity(Rarity rarity) {
        return rarityMap.getOrDefault(rarity, Collections.emptyList());
    }

    public List<Item> getItems() {
        List<Item> allItems = new ArrayList<>();
        for (List<Item> items : rarityMap.values()) {
            allItems.addAll(items);
        }
        return allItems;
    }
}
