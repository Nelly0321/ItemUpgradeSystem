package items;

import upgrades.Rarity;

public class Weapon extends Item {
    private int damage;

    public Weapon(String name, Rarity rarity, int damage) {
        super(name, rarity);
        this.damage = damage;
    }

    @Override
    public void use() {
        System.out.println("Equipping " + name + " with damage: " + damage);
    }

    public int getDamage() {
        return damage;
    }
}
