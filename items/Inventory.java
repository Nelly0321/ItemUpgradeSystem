package items;

import upgrades.UpgradeStrategy;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " added to inventory.");
    }

    public void removeItem(Item item) {
        if (items.remove(item)) {
            System.out.println(item.getName() + " removed from inventory.");
        } else {
            System.out.println(item.getName() + " not found in inventory.");
        }
    }

    public void displayInventory() {
        if (items.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Item item : items) {
                System.out.println("- " + item.getName() + " (" + item.getRarity() + ")");
            }
        }
    }

    public void upgradeItem(Item item, UpgradeStrategy strategy) {
        if (!items.contains(item)) {
            System.out.println("Item not found in inventory.");
            return;
        }
        strategy.upgrade(item);
        System.out.println(item.getName() + " has been upgraded using " + strategy.getClass().getSimpleName());
    }
    public List<Item> getItems() {
        return items;
    }

}
