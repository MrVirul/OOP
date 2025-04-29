package TUTE4Q2;

public class Engine {
    String engineType;

    public Engine(String engineType){
        this.engineType = engineType;
    }

    public void showEngineDetails(){;
        System.out.println("Engine Type: " + engineType);
    }
}
