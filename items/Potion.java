package items;

import upgrades.Rarity;

public class Potion extends Item {
    private int healAmount;

    public Potion(String name, Rarity rarity, int healAmount) {
        super(name, rarity);
        this.healAmount = healAmount;
    }

    @Override
    public void use() {
        System.out.println("Using " + name + " to heal for " + healAmount + " health.");
    }

    public int getHealAmount() {
        return healAmount;
    }
}
