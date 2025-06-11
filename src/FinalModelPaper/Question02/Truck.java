package FinalModelPaper.Question02;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, double speed, String engineType) {
        super(brand, speed, engineType);
    }

    @Override
    public void start() {
        System.out.println("===TRUCK DETAILS===");
        System.out.print("Truck");
        super.start();
        System.out.print(" goods are loading.\n");
        System.out.println("Vehicle brand: " + brand);
        System.out.println("Speed: " + speed);
        engine.engineDetails();
    }
}