package FacadePattern;

public class HouseKeeping implements HotelService
{
    private int roomNumber;

    public HouseKeeping(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public void cleanRoom(int roomNumber)
    {
        System.out.println("\nHouse Keeping Service");
        System.out.println("Your room number is " + roomNumber + ". We are happy to assist you with your room.");
    }
    @Override
    public void requestServices() {
        cleanRoom(roomNumber);
    }
}
