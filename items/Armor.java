package items;

import upgrades.Rarity;

public class Armor extends Item {
    private int defense;

    public Armor(String name, Rarity rarity, int defense) {
        super(name, rarity, ItemType.ARMOR);
        this.defense = defense;
    }

    @Override
    public void use() {
        System.out.println("Equipping " + name + " with defense: " + defense);
    }

    public int getDefense() {
        return defense;
    }
}
