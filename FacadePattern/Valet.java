package FacadePattern;

public class Valet implements HotelService{

    private String plateNumber;

    public Valet(String plateNumber)
    {
        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle(String plateNumber)
    {
        System.out.println("\nValet Parking Service");
        System.out.println("Your vehicle plate number is " + plateNumber + ". We are happy to assist you with your parking.");
    }
    @Override
    public void requestServices() {
        pickUpVehicle(plateNumber);
    }
}
