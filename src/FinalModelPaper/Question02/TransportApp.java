package FinalModelPaper.Question02;

public class TransportApp {
    public static void main(String[] args) {

        Driver busDriver = new Driver("Vrul" , "A1231");
        Bus bus = new Bus("Benze",123.21,"dieselEngine",busDriver);

        Driver truckDriver = new Driver("senesh","A001");
        Truck truck = new Truck("TATA",123.22,"diesel");

        bus.start();
        System.out.println();
        truck.start();
    }
}
