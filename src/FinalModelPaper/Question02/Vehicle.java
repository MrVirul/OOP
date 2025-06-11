
package FinalModelPaper.Question02;

public class Vehicle {
    String brand;
    double speed;
    Driver driver;
    Engine engine;  // Make sure this is initialized

    public Vehicle(String brand, double speed, String engineType) {
        this.brand = brand;
        this.speed = speed;
        this.engine = new Engine(engineType);  // Properly initialize the engine field
    }

    public void start(){
        System.out.print(" is starting...");
    }
}