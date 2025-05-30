package Lab06.Question03;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle() {
        super();
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(String shapeName, double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }

    @Override
    public void displayShapeDetails(){
        System.out.println();
        super.displayShapeDetails();
        System.out.println("Area of rectangle is : " +calculateArea());
    }
}
