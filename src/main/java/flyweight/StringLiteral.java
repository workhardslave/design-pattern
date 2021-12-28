package flyweight;

/**
 * ConcreteFlyweight 클래스
 *
 * Flyweight 인터페이스의 내용을 정의한다. (실제로 공유될 객체)
 */
public class StringLiteral implements Flyweight {

    private String data;

    public StringLiteral(String data) {
        this.data = data;
    }

    @Override
    public void print() {
        System.out.println("StringLiteral [data=" + data +"]");
    }
}
