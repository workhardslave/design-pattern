package templatemethod;

public class Wizard extends Hero {
    private int mp;

    public Wizard(String name) {
        super(name);
        mp = 100;
    }

    @Override
    public void attack(Character character) {
        mp -= 10;
        System.out.println(this.getCharacterName() + "는(은) " + character.getCharacterName() + "를(을) 마법으로 공격했다.");
    }

    @Override
    public String getCharacterName() {
        return getName();
    }
}
