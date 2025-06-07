package Lab09.Question01;

public class TravelApp {
    public static void main(String[] args) {
        Bus bus = new Bus("CAb - 1234",5);
        Taxi taxi = new Taxi("MNA - 1468" , 10);

        bus.calculateFare();
        taxi.calculateFare();

        bus.displayDetails();
        System.out.println();
        taxi.displayDetails();
    }



}
