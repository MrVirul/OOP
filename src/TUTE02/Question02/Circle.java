package TUTE02.Question02;

public class Circle {

    private double radius;

    //default constructor
    public  Circle(){
        this.radius = 0.0;
    }
    
    //constructor with parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea01(){
        return Math.PI * radius * radius;
    }

    public double calculateArea02(){
        double radiusFromDiameter = radius / 2;
        return Math.PI * radiusFromDiameter * radiusFromDiameter;
    }
}
