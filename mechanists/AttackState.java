package mechanists;

import characters.GameCharacter;

public class AttackState implements CharacterState {
    @Override
    public void execute(GameCharacter character) {
        System.out.println(character.getName() + " attacks!");
    }
}
