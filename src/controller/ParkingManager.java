package controller;

import entity.ParkingSpot;
import entity.Ticket;
import entity.Vehicle;
import entity.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {
    private TicketManager ticketManager;
    List<ParkingSpot> parkingSpotList;

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public ParkingManager(List<ParkingSpot> parkingSpotList, TicketManager ticketManager) {
        this.parkingSpotList = parkingSpotList;
        this.ticketManager = ticketManager;

    }


    public void bookTwoWheelerParkingSpot(TicketManager ticketManager, Vehicle vehicle) {
        List<ParkingSpot> availableParkingSpotList = findSpace(vehicle.getVehicleType());
        if(availableParkingSpotList.size() != 0){
            System.out.println("plot booked="+availableParkingSpotList.get(0).getId());
            availableParkingSpotList.get(0).setAvailable(false);
            ticketManager.createTicket(availableParkingSpotList.get(0),vehicle);
        }
    }

    public void bookFourWheelerParkingSpot(TicketManager ticketManager, Vehicle vehicle) {
        List<ParkingSpot> availableParkingSpotList = findSpace(vehicle.getVehicleType());
        if(availableParkingSpotList.size() != 0){
            System.out.println("plot booked="+availableParkingSpotList.get(0).getId());
            availableParkingSpotList.get(0).setAvailable(false);
            ticketManager.createTicket(availableParkingSpotList.get(0),vehicle);
        }
    }


    private  List<ParkingSpot> findSpace( VehicleType vehicleType) {
        List<ParkingSpot> availableParkingSpotList = new ArrayList<>();
        System.out.println("AvailableParkingSpotList are below");
        for(ParkingSpot parkingSpot : parkingSpotList){
            if(parkingSpot.getVehicleType() == vehicleType && parkingSpot.getAvailable() == true){
                availableParkingSpotList.add(parkingSpot);
//                System.out.println(parkingSpot.getId());
            }
        }
        return  availableParkingSpotList;
    }

    public void exit(Vehicle vehicle) {
        Ticket ticket = ticketManager.findTicket(vehicle);
        ticket.setEndTime((int) System.currentTimeMillis());
        System.out.println(calculateAmount());
        ticketManager.closeTicket(ticket);

    }

    private int calculateAmount() {
        return 100;
    }
}
