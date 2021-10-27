package singleton;

/**
 * Thread Safe Singleton
 *
 * 3번 문제를 해결하기 위해 synchronized 키워드를 사용한다.
 * getInstance 메서드 내에 진입하는 스레드가 하나로 보장되기 때문에 멀티 스레드 환경에서 동작한다.
 * 그러나 synchronized 자체에 대한 비용이 크기 때문에 싱글톤 인스턴스 호출이 잦은 애플리케이션에서 성능이 떨어진다.
 * 이러한 문제점을 해결하기 위해 double checked locking 방식을 통해 인스턴스가 null일 때만 synchronized가 동작하도록 한다.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() { };

//    public static synchronized ThreadSafeSingleton getInstance() {
//        if (instance == null) {
//            instance = new ThreadSafeSingleton();
//        }
//
//        return instance;
//    }

    // double checked locking
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}
