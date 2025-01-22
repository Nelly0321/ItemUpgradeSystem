package mechanists;

import characters.GameCharacter;

public class DefendState implements CharacterState {
    @Override
    public void execute(GameCharacter character) {
        System.out.println(character.getName() + " defends!");
    }
}
