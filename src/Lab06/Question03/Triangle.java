package Lab06.Question03;

public class Triangle extends Shape{
    private double base;
    private double heigh;

    public Triangle() {
        super();
        this.base = 0.0;
        this.heigh = 0.0;
    }

    public Triangle(String shapeName, double base, double heigh) {
        super(shapeName);
        this.base = base;
        this.heigh = heigh;
    }

    @Override
    public double calculateArea(){
        return (base * heigh) / 2;
    }

    @Override
    public void displayShapeDetails(){
        System.out.println();
        super.displayShapeDetails();
        System.out.println("Are of Triangle is : " + calculateArea());
    }
}
