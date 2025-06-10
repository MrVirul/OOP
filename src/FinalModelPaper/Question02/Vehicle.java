package FinalModelPaper.Question02;

public class Vehicle {
     String brand;
     double speed;
    Driver driver;
    Engine engine;

    public Vehicle(String brand, double speed,Engine engine) {
        this.brand = brand;
        this.speed = speed;
        Engine engine1 = new Engine();
        this.engine = engine;
    }

    public void start(){
        System.out.print(" is starting...");
    }
}
