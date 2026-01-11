package main;

import controller.*;
import entities.Room;
import entities.Reservation;
import model.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Create basic objects
        Name guestHouseName = new Name("Pearl", "Inn");
        GuestHouse guestHouse = new GuestHouse(guestHouseName);

        GuestHouseChain chain = new GuestHouseChain(guestHouse);

        // Create Rooms
        Room room1 = new Room(101);
        Room room2 = new Room(102);

        guestHouse.addRoom(room1);
        guestHouse.addRoom(room2);

        // Create Guest
        Name guestName = new Name("Ali", "Khan");
        Address address = new Address("Street 1", "Lahore", "54000");
        Guest guest = new Guest(guestName, address);

        // Create Reservation
        Reservation reservation = new Reservation(
                new Date(),
                new Date(),
                new Date(),
                1
        );

        // Make Reservation
        boolean reserved = chain.makeReservation(reservation, room1);
        System.out.println("Reservation created: " + reserved);

        // Check-in Guest
        boolean checkIn = chain.checkInGuest(guest, 101);
        System.out.println("Guest checked in: " + checkIn);

        // Check availability
        // boolean available = chain.available(101);
        // System.out.println("Room 101 available: " + available);

        // Check-out Guest
        boolean checkOut = chain.checkOutGuest(101);
        System.out.println("Guest checked out: " + checkOut);

        // Cancel Reservation
        boolean cancelled = chain.cancelReservation(1);
        System.out.println("Reservation cancelled: " + cancelled);
    }
}
