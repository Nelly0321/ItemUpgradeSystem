package characters;

<<<<<<< HEAD
import items.Inventory;
import items.Item;

=======
>>>>>>> origin/main
public abstract class GameCharacter {
    protected String name;
    protected int health;
    protected int attackPower;

    private Inventory inventory;

    public GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;

        this.inventory = new Inventory();
    }

    public abstract void attack(GameCharacter target);
    
    public void addItem(Item item){
        inventory.addItem(item);
    }

    public void takeInventory(Inventory inv){
        inventory.addAllItems(inv);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " takes " + damage + " damage.");
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    public void defend() {
        System.out.println(name + " is defending!");
    }
}
