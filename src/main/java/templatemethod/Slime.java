package templatemethod;

public class Slime extends Monster {

    public Slime(char prefix) {
        super(prefix);
    }

    @Override
    public void attack(Character character) {
        System.out.println(this.getCharacterName() + "는(을) " + character.getCharacterName() + "를(을) 공격했다.");
    }

    @Override
    public String getCharacterName() {
        return "슬라임 " + getPrefix();
    }
}
