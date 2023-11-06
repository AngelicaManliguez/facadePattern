package FacadePattern;

public class Cart implements HotelService{

    private int numberOfCarts;

    public Cart(int numberOfCarts)
    {
        this.numberOfCarts = numberOfCarts;
    }

    public void requestCart(int numberOfCarts)
    {
        System.out.println("\nCart Service");
        System.out.println("Number of your cart is " + numberOfCarts + ". We are happy to assist you with your luggage.");
    }
    @Override
    public void requestServices() {
        requestCart(numberOfCarts);
    }
}
