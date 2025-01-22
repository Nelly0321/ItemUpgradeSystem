package mechanists;

import characters.GameCharacter;

public class FireSpell extends Spell {
    public FireSpell(GameCharacter target) {
        super(target);
    }

    @Override
    public void cast() {
        System.out.println("Casting fire spell on " + target.getName());
    }
}
