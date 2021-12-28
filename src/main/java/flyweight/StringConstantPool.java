package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory 클래스
 *
 * Flyweight 인스턴스를 생성 및 공유해주는 역할을 한다.
 */
public class StringConstantPool{

    private static Map<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        Flyweight flyweight = pool.get(key);

        if (flyweight == null) {
            System.out.println("=== 문자열이 " + key + "인 새로운 객체 생성 ===");
            flyweight = new StringLiteral(key);
            pool.put(key, flyweight);
        }

        return flyweight;
    }
}
