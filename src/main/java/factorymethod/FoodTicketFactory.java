package factorymethod;

public class FoodTicketFactory implements Factory {

    @Override
    public FoodTicket createProduct(String name) {
        return new FoodTicket("황승환");
    }
}
