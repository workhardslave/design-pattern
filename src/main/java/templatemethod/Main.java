package templatemethod;

/**
 * Template Method 패턴
 *
 * 비슷한 클래스가 여러 개 작성될 때, 한 곳에 에러가 발생하면 다른 곳에 에러가 발생할 가능성이 높다. (결합도가 높다.)
 * 템플릿 메서드 패턴은 공통된 처리를 상위 클래스에 작성하기 때문에 버그가 발생하면 템플릿 메서드 클래스만 수정하면 된다.
 * 즉, 동일한 기능을 상위 클래스에서 정의하면서 확장/변화가 필요한 부분만 서브 클래스에서 구현할 수 있게 하는 패턴이다.
 */
public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("광전사");
        Wizard wizard = new Wizard("마법사");
        Monster slime = new Slime('A');
        Monster goblin = new Goblin('B');

        warrior.setFlying(true);
        warrior.setFlying(false);

        warrior.attack(slime);
        wizard.attack(slime);
        slime.attack(warrior);
        slime.attack(wizard);

        warrior.attack(goblin);
        wizard.attack(goblin);
        goblin.attack(warrior);
        goblin.attack(wizard);
    }
}
