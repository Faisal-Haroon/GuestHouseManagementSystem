package test;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import controller.GuestHouse;
import controller.GuestHouseChain;
import entities.Room;
import entities.Reservation;
import model.*;

import java.util.Date;

public class GuestHouseChainTest {

    @Test
   public void testMakeReservation() {

        GuestHouse guestHouse =
                new GuestHouse(new Name("Shigri", "GuestHouse"));

        GuestHouseChain chain =
                new GuestHouseChain(guestHouse);

        Room room = new Room(101);
        guestHouse.addRoom(room);

        Reservation res =
                new Reservation(new Date(), new Date(), new Date(), 5001);

        boolean result =
                chain.makeReservation(res, room);

        assertTrue(result);
    }

    @Test
    public void testCheckInGuest() {

        GuestHouse guestHouse =
                new GuestHouse(new Name("Shigri", "GuestHouse"));

        GuestHouseChain chain =
                new GuestHouseChain(guestHouse);

        Room room = new Room(101);
        guestHouse.addRoom(room);

        Guest guest = new Guest(
                new Name("Babar", "Azam"),
                new Address("Street 1", "Lahore", "54000"));

        boolean result =
                chain.checkInGuest(guest, 101);

        assertTrue(result);
    }

    @Test
    public void testCancelReservation() {

        GuestHouse guestHouse =
                new GuestHouse(new Name("Shigri", "GuestHouse"));

        GuestHouseChain chain =
                new GuestHouseChain(guestHouse);

        Room room = new Room(101);
        guestHouse.addRoom(room);

        Reservation res =
                new Reservation(new Date(), new Date(), new Date(), 5001);

        chain.makeReservation(res, room);

        boolean result =
                chain.cancelReservation(5001);

        assertTrue(result);
    }
}
