package singleton;

/**
 * Eager Initialization
 *
 * 가장 간단한 형태의 싱글톤 구현 형태이다.
 * 싱글톤 클래스의 인스턴스를 로딩 단계에서 생성한다.
 * 그러나 애플리케이션에서 해당 인스턴스를 사용하지 않더라도 인스턴스를 생성하기 때문에 낭비가 발생할 수 있다.
 * 또한, Exception에 대한 핸들링도 지원하지 않는다.
 */
public class EagerInitialization {
    private static final EagerInitialization INSTANCE = new EagerInitialization();
    
    private EagerInitialization() { };
    
    public static EagerInitialization getInstance() {
        return INSTANCE;
    }
}
