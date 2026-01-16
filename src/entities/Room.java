package entities;
import model.Guest;

public class Room {
    private int number;
    private Guest occupied; 

    public Room(int number) {
        this.number = number;
    }

    public void createGuest() {
       
        System.out.println("Guest creation process started for room: " + number);
    }

    // Getters and Setters
    public int getNumber() { 
        return number; 
    }
    public void setNumber(int number) { 
        this.number = number; 
    }
    public Guest getOccupied() {
         return occupied; 
        }
    public void setOccupied(Guest occupied) {
         this.occupied = occupied; 
        }
}