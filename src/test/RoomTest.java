package test;

import org.junit.Test;
import static org.junit.Assert.*;

import entities.Room;
import model.Guest;
import model.Name;
import model.Address;

public class RoomTest {

    // Room Creation
    @Test
    public void testRoomCreation() {

        Room room = new Room(101);

        int number = room.getNumber();

        assertEquals(101, number);
    }

    @Test
    public void testSetOccupied() {

        Room room = new Room(102);

        Guest guest =
            new Guest(
                new Name("Ali","Raza"),
                new Address("St 2","Lahore","54000")
            );

        room.setOccupied(guest);

        assertNotNull(room.getOccupied());
        assertEquals("Ali",
            room.getOccupied().getName().getFirstName());
    }

    //Empty room Check
    @Test
    public void testRoomInitiallyEmpty() {

        Room room = new Room(103);

        assertNull(room.getOccupied());
    }

    // change Room Number boundary
    @Test
    public void testSetRoomNumber() {

        Room room = new Room(1);

        room.setNumber(999);

        assertEquals(999, room.getNumber());
    }
}
