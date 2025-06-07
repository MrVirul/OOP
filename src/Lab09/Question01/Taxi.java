package Lab09.Question01;

public class Taxi extends Transport{
    @Override
    public int calculateFare() {
        return 20 * distanceTraveled + 50;
    }

    public Taxi(String vehicleNumber, int distanceTraveled) {
        super(vehicleNumber, distanceTraveled);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total fare is : " + calculateFare());
    }
}
