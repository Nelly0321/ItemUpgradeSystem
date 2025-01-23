package characters;

public abstract class GameCharacter {
    protected String name;
    protected int health;
    protected int attackPower;

    public GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public abstract void attack(GameCharacter target);

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
