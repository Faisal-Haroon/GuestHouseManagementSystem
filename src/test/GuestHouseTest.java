package test;
import org.junit.Test;
import static org.junit.Assert.*;

import controller.GuestHouse;
import entities.Room;
import entities.Reservation;
import model.*;

import java.util.Date;

public class GuestHouseTest {

    @Test
    public void testCreateReservation_Success() {

        // Arrange
        GuestHouse house =
            new GuestHouse(new Name("Shigri", "House"));

        Room room = new Room(101);
        house.addRoom(room);

        Reservation res =
            new Reservation(new Date(), new Date(), new Date(), 1);

        // Act
        boolean result = house.createReservation(res, room);

        // Assert
        assertTrue(result);
    }


    @Test
    public void testCreateReservation_Null() {

        GuestHouse house =
            new GuestHouse(new Name("Shigri", "House"));

        Room room = new Room(101);

        boolean result =
            house.createReservation(null, room);

        assertFalse(result);
    }

    @Test
    public void testCheckInGuest() {

        GuestHouse house =
            new GuestHouse(new Name("Shigri", "House"));

        Room room = new Room(101);
        house.addRoom(room);

        Guest guest =
            new Guest(new Name("Ali","Khan"),
            new Address("St1","Karachi","54000"));

        boolean result =
            house.checkInGuest(guest, 101);

        assertTrue(result);
    }

    @Test
    public void testAvailable() {

        GuestHouse house =
            new GuestHouse(new Name("Shigri","House"));

        Room room = new Room(101);
        house.addRoom(room);

        boolean result =
            house.available(101);

        assertTrue(result);
    }
}
