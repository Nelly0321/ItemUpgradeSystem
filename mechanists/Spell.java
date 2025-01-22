package mechanists;

import characters.GameCharacter;

public abstract class Spell {
    protected GameCharacter target;

    public Spell(GameCharacter target) {
        this.target = target;
    }

    public abstract void cast();
}
