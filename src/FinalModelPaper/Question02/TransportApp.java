package FinalModelPaper.Question02;

public class TransportApp {
    public static void main(String[] args) {
        Engine dieselEngine = new Engine();
        Engine turboDieselEngine = new Engine();

        Driver busDriver = new Driver("senesh","A01");
        Bus bus = new Bus("benz",120.0,dieselEngine,50,busDriver);

        Driver truckDriver = new Driver("Virul","A02");
        Truck truck = new Truck("TATA", 50.00, truckDriver, 100.0,turboDieselEngine);

        bus.start();
        System.out.println(busDriver);
        truck.start();
    }
}
