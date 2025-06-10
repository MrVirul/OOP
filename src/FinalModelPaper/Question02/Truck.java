package FinalModelPaper.Question02;

public class Truck extends Vehicle{
    private double loadCapacity;
    public Truck(String brand, double speed, Driver driver,double loadCapacity, Engine engine) {
        super(brand, speed,engine);
        this.driver = driver;
        this.loadCapacity = loadCapacity;
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("===TRUCK DETAILS===");
        System.out.print("Truck");
        super.start();
        System.out.print(" goods are loading.\n");
    }
}
