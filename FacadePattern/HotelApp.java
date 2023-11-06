package FacadePattern;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("WELCOME TO HOTEL SERVICES");
        do {
            System.out.println("\nChoose services you need!");
            System.out.println("[1] VALET PARKING\n" +
                               "[2] ROOM CLEANING\n" +
                               "[3] LUGGAGE CART\n" +
                               "[4] EXIT");
            System.out.print("Enter choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.print("\nEnter your plate number: ");
                    String plateNumber = scan.nextLine();

                    HotelService valet = new Valet(plateNumber);
                    FrontDesk frontDesk = new FrontDesk();
                    frontDesk.service(valet);
                    break;
                case 2:
                    System.out.print("\nEnter your room number: ");
                    int roomNumber = scan.nextInt();

                    HotelService houseKeeping = new HouseKeeping(roomNumber);
                    frontDesk = new FrontDesk();
                    frontDesk.service(houseKeeping);
                    break;
                case 3:
                    System.out.print("\nEnter number of cart you need: ");
                    int numberOfCarts = scan.nextInt();

                    HotelService cart = new Cart(numberOfCarts);
                    frontDesk = new FrontDesk();
                    frontDesk.service(cart);
                    break;
                case 4:
                    System.out.println("\nThank you for using our services. Enjoy the rest of your day!");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please choose again.");
            }
        } while (choice != 4);
    }
}
