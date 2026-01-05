package controller;

import entities.Room;
import model.Guest;
import entities.Reservation;
import java.util.ArrayList;
import java.util.List;

public class GuestHouse {

    private String name;
    private List<Room> rooms;
    private List<Reservation> reservations;

    public GuestHouse(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addRoom(Room room) {
        if (room != null) {
            rooms.add(room);
        }
    }

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

    // Check-out Guest
    public boolean checkOutGuest(int roomNumber) {

        for (Room room : rooms) {
            if (room.getNumber() == roomNumber) {

                if (room.getOccupied() == null) {
                    return false; // already empty
                }

                room.setOccupied(null);
                return true;
            }
        }
        return false;
    }

    // Check availability
    public boolean available(int roomNumber) {

        for (Room room : rooms) {
            if (room.getNumber() == roomNumber) {
                return room.getOccupied() == null;
            }
        }
        return false;
    }

    // Cancel Reservation (CCP Q1)
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

    public String getName() {
        return name;
    }
}
