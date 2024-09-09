import controller.ParkingManager;
import controller.TicketManager;
import entity.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        TicketManager ticketManager = new TicketManager();
        ParkingManager parkingManager = new ParkingManager(new ArrayList<>(),ticketManager);
        intialize(parkingManager);
        testMethods(parkingManager, ticketManager);
    }

    private static void testMethods(ParkingManager parkingManager, TicketManager ticketManager) {

//        findSpaceForTwoWheeler(parkingManager);
        Vehicle vehicle = new Vehicle("BR007",VehicleType.TWO_WHEELER);
        Vehicle vehicle2 = new Vehicle("BR0088",VehicleType.FOUR_WHEELER);
        parkingManager.bookTwoWheelerParkingSpot(ticketManager,vehicle);
//        parkingManager.BookTwoWheelerParkingSpot(ticketManager,vehicle);
        parkingManager.bookFourWheelerParkingSpot(ticketManager,vehicle2);
//        parkingManager.BookFourWheelerParkingSpot(ticketManager,vehicle2);
        parkingManager.exit(vehicle);
        parkingManager.exit(vehicle2);

    }

    private static void intialize(ParkingManager parkingManager) {

        List<ParkingSpot> parkingSpotList = new ArrayList<>();
        for(int i = 0 ; i < 10;i++){
            ParkingSpot parkingSpot = new TwoWheelerSpot(i,0);
            parkingSpotList.add(parkingSpot);
        }for(int i = 10 ; i < 20;i++){
            ParkingSpot parkingSpot = new FourWheelerSpot(i,0);
            parkingSpotList.add(parkingSpot);
        }
        parkingManager.getParkingSpotList().addAll(parkingSpotList);
    }

}