package Lab09.Question01;

public abstract class Transport {

    public Transport(String vehicleNumber, double distanceTravel) {
        this.vehicleNumber = vehicleNumber;
        this.distanceTravel = distanceTravel;
    }

    private String vehicleNumber;
    double distanceTravel;

    public abstract double calculateFare();

    public void displayDetails(){
        System.out.println("Vehicle number is " + vehicleNumber);
        System.out.println("Travel Distance " + distanceTravel);
    }
}
