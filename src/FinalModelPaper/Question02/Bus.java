
package FinalModelPaper.Question02;

public class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus(String brand, double speed, String engineType, Driver driver) {
        super(brand, speed, engineType);
        this.driver = driver;
    }

    @Override
    public void start() {
        System.out.println("===BUS DETAILS===");
        System.out.print("Bus");
        super.start();
        System.out.print(" Passengers are boarding.\n");
        System.out.println("Vehicle brand: " + brand);
        System.out.println("Speed: " + speed);
        engine.engineDetails();
        driver.displayDriverDetails();
        System.out.println("Passenger capacity : 50");
    }
}