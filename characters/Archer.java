package characters;

public class Archer extends GameCharacter {
    private int range;

    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower); // Call the super class constructor with all three parameters
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(this.name + " attacks " + target.getName() + " with a bow!");
    }

    public int getRange() {
        return range;
    }
}
