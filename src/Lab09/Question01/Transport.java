package Lab09.Question01;

public abstract class Transport {
    private String vehicleNumber;
    protected int distanceTraveled;

    public Transport(String vehicleNumber, int distanceTraveled) {
        this.vehicleNumber = vehicleNumber;
        this.distanceTraveled = distanceTraveled;
    }

    public abstract int calculateFare();
    public void displayDetails(){
        System.out.println("Vehicle number is : " + vehicleNumber);
        System.out.println("Traveled distance is : " + distanceTraveled);
    }
}
