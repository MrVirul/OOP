package Lab09.Question01;

import java.util.SplittableRandom;

public class Taxi extends Transport{

    public Taxi(String vehicleNumber, double distanceTravel) {
        super(vehicleNumber, distanceTravel);
    }

    @Override
    public double calculateFare(){
        return distanceTravel * 20 + 50;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Total fare is : " + calculateFare());
    }

}
