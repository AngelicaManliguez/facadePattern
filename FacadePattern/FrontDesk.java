package FacadePattern;

public class FrontDesk {

    private HotelService valet;
    private HotelService houseKeeping;
    private HotelService cart;

    public FrontDesk()
    {
        this.valet = valet;
        this.houseKeeping = houseKeeping;
        this.cart = cart;
    }

    public void service(HotelService hotelService)
    {
        hotelService.requestServices();
    }

}
