package TUTE02.Question03;

public class Car {
    private String registrationNumber;
    private String modelName;
    private double price;

    public Car(){
        this.registrationNumber = "Not Registered";
        this.modelName = "Not Specified";
        this.price = 0.0;
    }

    public Car(String registrationNumber, String modelName, double price) {
        this.registrationNumber = registrationNumber;
        this.modelName = modelName;
        this.price = price;
    }


}
