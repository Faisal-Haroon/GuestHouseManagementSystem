package controller;

import entities.Room;
import entities.Reservation;
import model.Guest;
import model.Name;

import java.util.ArrayList;
import java.util.List;

public class GuestHouse {

    private Name name;

    private List<Room> rooms;
    private List<Reservation> reservations;

    public GuestHouse(Name name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    // addRoom()
public void addRoom(Room room) {

    if (room == null) {
        return;
    }

    rooms.add(room);
}
   
    // createReservation()
    public boolean createReservation(Reservation reservation, Room room) {

        if (reservation == null || room == null) {
            return false;
        }

        if (room.getOccupied() != null) {
            return false;
        }

        reservations.add(reservation);
        return true;
    }

    // checkinGuest()
    public boolean checkInGuest(Guest guest, int roomNumber) {

        if (guest == null) {
            return false;
        }

        for (Room room : rooms) {
            if (room.getNumber() == roomNumber) {

                if (room.getOccupied() != null) {
                    return false;
                }

                room.setOccupied(guest);
                return true;
            }
        }
        return false;
    }

    // checkOutGuest()
    public boolean checkOutGuest(int roomNumber) {

        for (Room room : rooms) {
            if (room.getNumber() == roomNumber) {

                if (room.getOccupied() == null) {
                    return false;
                }

                room.setOccupied(null);
                return true;
            }
        }
        return false;
    }

    // available()
    public boolean available(int roomNumber) {

        for (Room room : rooms) {
            if (room.getNumber() == roomNumber) {
                return room.getOccupied() == null;
            }
        }
        return false;
    }

    // cancelReservation()
    public boolean cancelReservation(int reservationNumber) {

        if (reservations == null || reservations.isEmpty()) {
            return false;
        }

        for (Reservation r : reservations) {
            if (r.getNumber() == reservationNumber) {
                reservations.remove(r);
                return true;
            }
        }
        return false;
    }

    public Name getName() {
        return name;
    }
}
