package Lab09.Question01;

public class TravelApp {
    public static void main(String[] args) {

        Transport bus1 = new Bus("CAB - 8209", 125.0);
        Transport taxi1 = new Taxi("301 - 1809", 41);

        System.out.println();
        bus1.displayDetails();

        System.out.println();
        taxi1.displayDetails();
    }
}
