package flyweight;

/**
 * Flyweight 패턴
 *
 * 인스턴스가 필요할 때마다 매번 생성하지 않고 가능한 한 공유하여 메모리를 절약하는 패턴이다.
 * String 객체를 생성하는 리터럴 방식의 String Constant Pool이 해당 패턴을 적용한 대표적인 예시이다.
 */
public class Main {
    public static void main(String[] args) {
        String[] strArr = {"AA", "BB", "CC", "DD"};

        for (int i = 0; i < 10; i++) {
            Flyweight flyweight = StringConstantPool.getFlyweight(strArr[(int) (Math.random() * 4)]);
            flyweight.print();
        }
    }
}
