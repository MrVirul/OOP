package Lab06.Question03;

public class ShapeApp {
    public static void main(String[] args){
        Triangle triangle1 = new Triangle("Triangle", 2,4);
        Rectangle rectangle1 = new Rectangle();

        triangle1.calculateArea();
        rectangle1.calculateArea();

        triangle1.displayShapeDetails();
        rectangle1.displayShapeDetails();
    }
}
