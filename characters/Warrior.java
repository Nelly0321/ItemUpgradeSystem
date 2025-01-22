package characters;

public class Warrior extends GameCharacter {
    private int shield;

    public Warrior(String name, int health, int attackPower, int shield) {
        super(name, health, attackPower);
        this.shield = shield;
    }

    @Override
    public void attack(GameCharacter target) {
        target.takeDamage(attackPower + 5); // Extra damage due to strength
        System.out.println(name + " attacks " + target.getName());
    }

    public int getShield() {
        return shield;
    }

    public void defend() {
        System.out.println(name + " raises their shield!");
    }
}
