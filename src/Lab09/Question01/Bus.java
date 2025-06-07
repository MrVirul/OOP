package Lab09.Question01;

public class Bus extends Transport{

    @Override
    public int calculateFare() {
        return 10 * distanceTraveled;
    }

    public Bus(String vehicleNumber, int distanceTraveled) {
        super(vehicleNumber, distanceTraveled);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total fare is : " + calculateFare());
    }
}
