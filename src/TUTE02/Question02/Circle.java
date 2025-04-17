package TUTE02.Question02;

import java.util.Scanner;

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

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea01(){
        return Math.PI * radius * radius;
    }

    public double calculateArea02(){
        double radiusFromDiameter = radius / 2;
        return Math.PI * radiusFromDiameter * radiusFromDiameter;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Circle circle1 = new Circle();

        System.out.print("Enter the radius of the circle: ");
        input.circle1.setRadius(input.nextDouble());
        circle1.calculateArea01();
    }
}

