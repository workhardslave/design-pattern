package singleton;

/**
 * 앞에서 언급한 모든 방법들은 자바 리플렉션을 통해서 싱글톤을 위반할 수 있기 때문에 완전히 안전하지 못하다.
 * enum을 이용해 싱글톤을 구현하면 이러한 문제점을 해결할 수 있다.
 * 그러나 1, 2번과 같이 사용하지 않았을 경우의 메모리 문제를 해결할 수 없다.
 */
public enum EnumSingleton {
    INSTANCE;
}
