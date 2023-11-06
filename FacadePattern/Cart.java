package FacadePattern;

public class Cart implements HotelService{

    private int cartNumber;

    public Cart(int cartNumber)
    {
        this.cartNumber = cartNumber;
    }

    public void numberOfCarts(int cartNumber)
    {
        System.out.println("\nCart Service");
        System.out.println("Number of your cart is " + cartNumber + ". We are happy to assist you with your luggage.");
    }
    @Override
    public void requestServices() {
        numberOfCarts(cartNumber);
    }
}
