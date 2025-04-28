package Lab07Q1;

public class HotelApp {

    public static void main(String[] args) {

        StandardRoom standardRoom1 = new StandardRoom(101, "Virul ", 3 , true);
        LuxurySuit luxurySuit1 = new LuxurySuit(102, "Senesh ", 5 , true, true);

        standardRoom1.displayRoomDetails();
        System.out.println("Your total cost with discount is: " + standardRoom1.calculateRoomCost(10));

        luxurySuit1.displayRoomDetails();
        System.out.println("Your total cost with discount is: " + luxurySuit1.calculateRoomCost(10));
    }
}
