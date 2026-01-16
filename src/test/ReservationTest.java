package test;

import org.junit.Test;
import static org.junit.Assert.*;

import entities.Reservation;
import java.util.Date;

public class ReservationTest {

    // constructor Test 
    @Test
    public void testReservationCreation() {

        Date today = new Date();

        Reservation r =
          new Reservation(today, today, today, 10);

        assertEquals(10, r.getNumber());
    }

    
    @Test
    public void testSetNumber() {

        Reservation r =
          new Reservation(new Date(), new Date(), new Date(), 1);

        r.setNumber(99);

        assertEquals(99, r.getNumber());
    }
}
