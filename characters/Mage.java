package characters;

import items.Inventory;
import items.Item;

public class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int health, int attackPower, int mana) {
        super(name, health, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {
        if (mana >= 10) {
            target.takeDamage(attackPower + 10); // Extra damage due to magic
            mana -= 10; // Consumes mana
            System.out.println(name + " casts a spell on " + target.getName());
        } else {
            System.out.println(name + " doesn't have enough mana to attack.");
        }
    }
    public void addItem(Item item){
        super.addItem(item);
    }

    public void takeInventory(Inventory inv){
        super.takeInventory(inv);
    }
    public void defend() {
        System.out.println(name + " is casting a magical shield!");
    }

    public int getMana() {
        return mana;
    }
}
