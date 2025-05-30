package Lab06.Question03;

public class Shape {
    private String shapeName;

    public Shape() {
        this.shapeName = "Null";
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public void displayShapeDetails(){
        System.out.println("Shanpe name is : " + shapeName);
    }
    public double calculateArea(){
        return 0.0;
    }
}
