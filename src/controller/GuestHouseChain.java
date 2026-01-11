package controller;

import model.Guest;
import entities.Reservation;
import entities.Room;
import model.ReserverPayer;
import controller.GuestHouse;   
public class GuestHouseChain {

    private GuestHouse guestHouse; 

    public GuestHouseChain(GuestHouse guestHouse) {
        this.guestHouse = guestHouse;
    }

  
    // Make Reservation
    public boolean makeReservation(Reservation reservation, Room room) {

        if (!canMakeReservation(room)) {
            return false;
        }

        return guestHouse.createReservation(reservation, room);
    }

    // Cancel Reservation
    public boolean cancelReservation(int reservationNumber) {

        if (!canCancelReservation(reservationNumber)) {
            return false;
        }

        return guestHouse.cancelReservation(reservationNumber);
    }

    // Check-in Guest
    public boolean checkInGuest(Guest guest, int roomNumber) {

        if (!canCheckInGuest(roomNumber)) {
            return false;
        }

        return guestHouse.checkInGuest(guest, roomNumber);
    }

    // Check-out Guest
    public boolean checkOutGuest(int roomNumber) {

        if (!canCheckOutGuest(roomNumber)) {
            return false;
        }

        return guestHouse.checkOutGuest(roomNumber);
    }

    // Can Make Reservation?
    public boolean canMakeReservation(Room room) {

        if (room == null) {
            return false;
        }

        return room.getOccupied() == null;
    }

    // Can Cancel Reservation?
    public boolean canCancelReservation(int reservationNumber) {

        return reservationNumber > 0;
    }

    // Create ReserverPayer
    public ReserverPayer createReserverPayer(ReserverPayer reserverPayer) {

        if (reserverPayer == null) {
            return null;
        }

        reserverPayer.create();
        return reserverPayer;
    }

    // Can Check-in Guest?
    public boolean canCheckInGuest(int roomNumber) {

        return guestHouse.available(roomNumber);
    }

    // Can Check-out Guest?
    public boolean canCheckOutGuest(int roomNumber) {

        return !guestHouse.available(roomNumber);
    }
}
