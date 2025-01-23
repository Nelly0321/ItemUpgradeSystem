package mechanists;

import characters.GameCharacter;

public class PoisonSpell extends Spell {
    public PoisonSpell(GameCharacter target) {
        super(target);
    }

    @Override
    public void cast() {
        System.out.println("Casting poison spell on " + target.getName());
    }
}
