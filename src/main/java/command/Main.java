package command;

/**
 * Command 패턴
 *
 * 객체의 행위(메서드)를 클래스로 만들어 캡슐화하는 패턴이다.
 * 어떤 객체 A에서 다른 객체 B의 메서드를 실행하려면, 객체 B를 참조하고 있어야 하는 의존성이 발생한다. (import)
 * Command 패턴을 통해 의존성을 제거할 수 있고, 따라서 높은 유지보수성, 유연한 시스템 확장성을 갖게된다.
 */
public class Main {
    public static void main(String[] args) {
        new DrawingApp("Command");
    }
}
