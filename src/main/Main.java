package main;

import controller.*;
import entities.Room;
import entities.RoomType;
import entities.Reservation;
import model.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Guest House Management System =====\n");

       
        GuestHouse guestHouse = new GuestHouse(
                new Name("Vantage Lodge", "GuestHouse"));
        GuestHouseChain chain = new GuestHouseChain(guestHouse);

        System.out.println("Guest House created: Vantage Lodge GuestHouse");

        
        Room room101 = new Room(101);
        guestHouse.addRoom(room101);
        System.out.println("Room added: Room 101");

       
        Guest guest = new Guest(
                new Name("Babar", "Azam"),
                new Address("Street 1", "Lahore", "54000"));

        System.out.println("Guest created: Babar Azam");

        
        RoomType roomType = new RoomType(
                RoomKind.SUITE,
                new Money(12000));

        System.out.println("Room Type: " + roomType.getKind());
        System.out.println("Room Cost per night: " +
                roomType.getCost().getAmount());

       
        Reservation reservation = new Reservation(
                new Date(), new Date(), new Date(), 5001);

        boolean created = chain.makeReservation(reservation, room101);
        System.out.println("Reservation created (ID 5001): " + created);

       
        boolean checkIn = chain.checkInGuest(guest, 101);
        System.out.println("Guest checked in to Room 101");

      
        System.out.println("Is Room 101 available? " +
                guestHouse.available(101));

      
        boolean checkOut = chain.checkOutGuest(101);
        System.out.println("Guest checked out from Room 101");

       
        boolean cancelled = chain.cancelReservation(5001);
        System.out.println("Reservation cancelled (ID 5001): " + cancelled);

        
    }
}
