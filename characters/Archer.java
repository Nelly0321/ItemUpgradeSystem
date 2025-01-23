package characters;

import items.Inventory;
import items.Item;

public class Archer extends GameCharacter {
    private int range;

    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower); // Call the super class constructor with all three parameters
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(this.name + " attacks " + target.getName() + " with a bow!");
    }

    public void addItem(Item item){
        super.addItem(item);
    }

    public void takeInventory(Inventory inv){
        super.takeInventory(inv);
    }
    
    public int getRange() {
        return range;
    }
}
