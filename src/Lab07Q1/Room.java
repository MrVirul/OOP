package Lab07Q1;

public class Room {
    protected int roomNumber;
    protected String guestName;
    protected int numberOfNights;

    // Constructor
    public Room(int roomNumber, String guestName, int numberOfNights) {
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
    }
    public void displayRoomDetails(){
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Number of Nights: " + numberOfNights);
    }
    public double calculateRoomCost() {
        return numberOfNights * 150.0;
    }
    public double calculateRoomCost(double discountPerNight) {
            
        return calculateRoomCost() - (numberOfNights * discountPerNight) /100;
        }

}