package decorator;

/**
 * Decorator 패턴
 *
 * 기본 객체에 추가적인 기능을 동적으로 유연하게 덧붙이는 패턴이다.
 * Wrapping 클래스가 점점 많아지면 객체의 정체를 알기 힘들다는 단점이 있다.
 */
public class Main {
    public static void main(String[] args) {
        new Scaffold(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new TextWidget("hello world")
                                        )
                                )
                        )
                )
        );
    }
}
