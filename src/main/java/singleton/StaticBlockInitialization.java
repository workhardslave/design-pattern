package singleton;

/**
 * Static Block Initialization
 *
 * Eager Initialization과 비슷하나 static block을 통해 exception 핸들링을 지원한다.
 * 그러나 클래스 로딩 단계에서 인스턴스를 생성하기 때문에 큰 리소스를 다루는 경우에는 적합하지 않다.
 */
public class StaticBlockInitialization {

    private static StaticBlockInitialization instance;

    private StaticBlockInitialization() { };

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockInitialization getInstance() {
        return instance;
    }
}
