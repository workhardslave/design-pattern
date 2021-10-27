package singleton;

/**
 * Lazy Initialization
 *
 * global access한 getInstance 메서드를 호출할 때 인스턴스가 없다면 생성하는 방식이다.
 * 1, 2번의 문제점(사용하지 않을 경우에도 인스턴스를 생성하는 문제)을 해결할 수 있다.
 * 그러나 멀티 스레드 환경에서 동시성 문제가 존재한다.
 */
public class LazyInitialization {

    private static LazyInitialization instance;

    private LazyInitialization() { };

    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }

        return instance;
    }
}
