package factorymethod;

public class FoodTicket implements Product {
    private String owner;

    public FoodTicket(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "님의 식권을 사용합니다.");
    }
}
