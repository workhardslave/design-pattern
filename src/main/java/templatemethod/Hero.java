package templatemethod;

public abstract class Hero implements Character {
    private String name;
    private int hp;

    public Hero(String name) {
        this.name = name;
        hp = 100;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}
