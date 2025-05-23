package TUTE04.Question02;

public class Vehicle {

    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void showVehicleDetails(){
        System.out.println();
        System.out.println("___Vehicle Details___");
        System.out.println( "Brand: " + brand);
        System.out.println( "Speed: " + speed);
    }
}
