package templatemethod;

public class Warrior extends Hero {
    private boolean isFlying = false;

    public Warrior(String name) {
        super(name);
    }

    public void setFlying(boolean flying) {
        if (flying) {
            System.out.println("비행모드 - ON");
        }
        else {
            System.out.println("비행모드 - OFF");
        }
        isFlying = flying;
    }

    @Override
    public void attack(Character character) {
        System.out.println(this.getCharacterName() + "는(은) " + character.getCharacterName() + "를(을) 공격했다.");
    }

    @Override
    public String getCharacterName() {
        return getName();
    }
}