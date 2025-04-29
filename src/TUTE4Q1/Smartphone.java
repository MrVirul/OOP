package TUTE4Q1;

public class Smartphone {
    Battery battery;
    Processor processor;

    public Smartphone(int battery, String processor){
        this.battery = new Battery(battery);
        this.processor = new Processor(processor);
    }
    public void showSmartPhoneDetails(){
        System.out.println();
        System.out.println("___Smartphone Details___");
        System.out.println("processor: " + processor.model);
        System.out.println("battery: " + battery.capacity);
    }
}