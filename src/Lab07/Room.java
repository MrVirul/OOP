package Lab07;

public class Room {
    protected int roomNumber;
    protected String guestName;
    protected int numberOfNights;
    protected double discountPerNight = 10.0; 

    // Constructor
    public Room(int roomNumber, String guestName, int numberOfNights) {
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
    }
    public void displayRoomDetails(){
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Guest Name: " + guestName);
    }
    public double calculateRoomCost(){
        return numberOfNights * 150.0;
    }
        public double calculateTotalSalary(){
        return calculateRoomCost() - (numberOfNights * discountPerNight/100);
        }

}