package singleton;

/**
 * Singleton 패턴
 *
 * 생성자가 여러차례 호출되더라도 인스턴스가 하나만 생성되는 것을 보장한다.
 * 1. Eager Initialization
 * 2. Static Block Initialization
 * 3. Lazy Initialization
 * 4. Thread Safe Singleton
 * 5. Bill Pugh Singleton Implementation
 * 6. Enum Singleton
 */
public class Main {
    public static void main(String[] args) {

        // 1. Eager Initialization
        EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();
        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();

        System.out.println(eagerInitialization1 == eagerInitialization2);

        // 2. Static Block Initialization
        StaticBlockInitialization staticBlockInitialization1 = StaticBlockInitialization.getInstance();
        StaticBlockInitialization staticBlockInitialization2 = StaticBlockInitialization.getInstance();

        System.out.println(staticBlockInitialization1 == staticBlockInitialization2);

        // 3. Lazy Initialization
        LazyInitialization lazyInitialization1 = LazyInitialization.getInstance();
        LazyInitialization lazyInitialization2 = LazyInitialization.getInstance();

        System.out.println(lazyInitialization1 == lazyInitialization2);

        // 4. Thread Safe Singleton
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();

        System.out.println(threadSafeSingleton1 == threadSafeSingleton2);

        // 5. Bill Pugh Singleton Implementation
        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();

        System.out.println(billPughSingleton1 == billPughSingleton2);

        // 6. Enum Singleton
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;

        System.out.println(enumSingleton1 == enumSingleton2);
    }
}
