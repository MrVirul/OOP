package TUTE4Q1;

public class Battery {
    int capacity;

    public Battery(int capacity) {
        this.capacity = capacity;
    }

    public Battery() {
        this.capacity = 0;
    }

    public void showBatteryDetails(){
        System.out.println("Battery capacity: " + capacity + " mAh");
    }
}
