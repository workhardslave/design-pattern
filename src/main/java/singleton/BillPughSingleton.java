package singleton;

/**
 * Bill Pugh Singleton Implementation
 *
 * inner static help class를 사용하는 방식으이다.
 * 앞에서 언급한 싱글톤 구현 방식의 문제점을 모두 해결하므로 현재 가장 널리 쓰이고 있는 구현 방식이다.
 */
public class BillPughSingleton {

    private BillPughSingleton() { };

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
