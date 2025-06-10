package FinalModelPaper.Question02;

public class Bus extends Vehicle{
    private int passengerCapacity;

    public Bus(String brand, double speed, Engine engine, int passengerCapacity, Driver driver) {
        super(brand, speed, engine);
        this.driver = driver;
        this.passengerCapacity = passengerCapacity;

    }

    @Override
    public void start() {
        System.out.println("===BUS DETAILS===");
        System.out.print("Bus");
        super.start();
        System.out.print(" Passengers are boarding.\n");
        System.out.println("Vehicle brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Engine type: " + engine.engineType);
        System.out.println("Driver name: " );

    }
}
