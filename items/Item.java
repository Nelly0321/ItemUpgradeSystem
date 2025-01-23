package items;

import upgrades.Rarity;

public abstract class Item {
    protected String name;
    protected Rarity rarity;
    protected ItemType type;

    public Item(String name, Rarity rarity, ItemType type) {
        this.name = name;
        this.rarity = rarity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }
<<<<<<< HEAD

    public ItemType getType() {
        return type;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    @Override
    public String toString() {
        return name + " (" + type + ", " + rarity + ")";
    }
=======
   
    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
    
>>>>>>> origin/main
    public abstract void use();
}
