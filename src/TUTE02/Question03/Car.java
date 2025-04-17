package TUTE02.Question03;

public class Car {
    private String registrationNumber;
    private String modelName;
    private double price;

    public Car(){
        this.registrationNumber = "Not Registered";
        this.modelName = "Not Specified";
        this.price = 0.0;
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Model Name: " + modelName);
        System.out.println("Price: " + price);
    }

    public Car(String registrationNumber, String modelName, double price) {
        this.registrationNumber = "CAB - 8209";
        this.modelName = "Nissan Leaf";
        this.price = 3500000.0;
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Model Name: " + modelName);
        System.out.println("Price: " + price);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayCarDetails() {
        System.out.println("Car Registration Number: " + registrationNumber);
        System.out.println("Car Model Name: " + modelName);
        System.out.println("Car Price: " + price);
    }
}
