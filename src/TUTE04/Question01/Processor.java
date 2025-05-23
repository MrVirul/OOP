package TUTE04.Question01;

public class Processor {
    String model;

    public Processor(String model) {
        this.model = model;
    }
    public Processor() {
        this.model = "Unknown";
    }
    public void showProcessorDetails(){
        System.out.println("Processor model: " + model);
    }
}
