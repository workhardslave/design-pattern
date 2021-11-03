package observer;

/**
 * Observer 패턴
 *
 * 객체의 상태 변화를 관찰하는 관찰자들을 객체에 등록하여 상태에 변화가 있을 때마다 메서드 등을 통해 객체가 각 관찰자에게 통지하는 패턴이다.
 * 해당 예제는 인터페이스를 사용하여 관찰자(Observer) 객체에는 update 메서드가 있는 것이 보장된다.
 * 관찰 대상은 이런 특징만 알면 자신의 상태를 통지하고 싶을 때 update 메서드를 호출하면 된다.
 * 인터페이스나 추상 클래스를 사용하기 때문에 관찰자가 누군지 몰라도 된다. (어떤 Observer 객체인지 모른다, import 되어있지 않다. -> 결합도 감소)
 * 또한, 수정 사항이 생기면 관찰자 클래스만 수정하면 된다.
 */
public class Main {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();

        Observer digitObserver = new DigitObserver();
        Observer graphicObserver = new GraphicObserver();
        Observer lambdaObserver = number -> {
            for (int i = 0; i < number; i++) {
                System.out.print("=");
            }
            System.out.println();
        };

        randomGenerator.addObserver(digitObserver);
        randomGenerator.addObserver(graphicObserver);
        randomGenerator.addObserver(lambdaObserver);

        randomGenerator.run();
        randomGenerator.run();
        randomGenerator.run();
    }
}
