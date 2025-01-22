package items;

import upgrades.Rarity;

public abstract class Item {
    protected String name;
    protected Rarity rarity;

    public Item(String name, Rarity rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }
   
    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
    
    public abstract void use();
}
