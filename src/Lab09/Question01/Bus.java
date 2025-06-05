package Lab09.Question01;

public class Bus extends Transport{

    public Bus(String vehicleNumber, double distanceTravel) {
        super(vehicleNumber, distanceTravel);
    }

    @Override
    public double calculateFare(){
        return distanceTravel * 10;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Total fare is : " + calculateFare());
    }

}
