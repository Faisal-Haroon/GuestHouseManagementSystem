package main;

import controller.*;
import entities.Room;
import entities.Reservation;
import model.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Guest House Management System  ===\n");

        // Guest House
        GuestHouse guestHouse = new GuestHouse(
                new Name("Pearl", "GuestHouse"));

        GuestHouseChain chain = new GuestHouseChain(guestHouse);

        // Rooms
        Room room101 = new Room(101);
        guestHouse.addRoom(room101);

        // Guest
        Guest guest = new Guest(
                new Name("Babar", "Azam"),
                new Address("Street 1", "Lahore", "54000"));

        System.out.println("Guest created: " +
                guest.getName().getFirstName() + " " +
                guest.getName().getLastName());

        // Reservation
        Reservation reservation = new Reservation(
                new Date(), new Date(), new Date(), 5001);

        boolean created = chain.makeReservation(reservation, room101);
        System.out.println("Reservation #5001 created: " + created);

        // Check-in
        boolean checkIn = chain.checkInGuest(guest, 101);
        System.out.println("Guest checked in to Room 101: " + checkIn);

        // Availability
        System.out.println("Room 101 available? " +
                guestHouse.available(101));

        // Check-out
        boolean checkOut = chain.checkOutGuest(101);
        System.out.println("Guest checked out from Room 101: " + checkOut);

        

    }
}
