package factorymethod;

/**
 * Factory Method 패턴
 *
 * 객체를 생성하는 부분을 하위 클래스에게 위임한다.
 * 클래스 간의 결합도를 낮춘다. (클라이언트의 코드에 영향을 주지 않는다.)
 */
public class Main {
    public static void main(String[] args) {
        Factory idCardFactory = new IDCardFactory();
        Product idCard1 = idCardFactory.createProduct("홍길동");
        Product idCard2 = idCardFactory.createProduct("한석봉");

        idCard1.use();
        idCard2.use();

        Factory foodTicketFactory = new FoodTicketFactory();
        Product foodTicket1 = foodTicketFactory.createProduct("황승환");
        Product foodTicket2 = foodTicketFactory.createProduct("송재현");

        foodTicket1.use();
        foodTicket2.use();
    }
}
