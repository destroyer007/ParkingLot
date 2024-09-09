package controller;

import entity.ParkingSpot;
import entity.Ticket;
import entity.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TicketManager {
    List<Ticket> ticketList;

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public TicketManager() {
        this.ticketList = new ArrayList<>();
    }

    public void createTicket(ParkingSpot parkingSpot, Vehicle vehicle) {
        Ticket ticket = new Ticket((int) (parkingSpot.getId() + System.currentTimeMillis()), 1, vehicle, 0);
        ticketList.add(ticket);
    }

    public Ticket findTicket(Vehicle vehicle) {
        for (Ticket ticket : ticketList) {
            if (ticket.getVehicle() == vehicle && ticket.getEndTime() == -1) {
                System.out.println("ticket=" + ticket.toString());
                return ticket;
            }
        }
        System.out.println("no ticket found");
        return null;
    }

    public void closeTicket(Ticket closeTicket) {
        for (Ticket ticket : ticketList) {
            if (ticket == closeTicket) {
                System.out.println("ticket found to close=" + ticket.toString());
                ticket.setEndTime((int) System.currentTimeMillis());
                return;
            }
        }
        System.out.println("no ticket found to close");
    }
}
