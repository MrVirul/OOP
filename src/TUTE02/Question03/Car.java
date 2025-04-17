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


}
