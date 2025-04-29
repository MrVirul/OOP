package TUTE4Q2;

public class Car extends Vehicle {
    String model;
    Engine engine;

    public Car(String brand, int speed, String model, String engineType) {
        super(brand, speed);
        this.model = model;
        this.engine = new Engine(engineType);
    }
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("Model: " + model);
        engine.showEngineDetails();
    }

}
