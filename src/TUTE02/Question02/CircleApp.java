package TUTE02.Question02;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        circle.setRadius(radius);

        double areaUsingRadius = circle.calculateArea();
        System.out.println("Area of the circle using radius: " + areaUsingRadius);

        System.out.print("Enter the diameter of the circle: ");
        double diameter = scanner.nextDouble();

        double areaUsingDiameter = circle.calculateArea(diameter);
        System.out.println("Area of the circle using diameter: " + areaUsingDiameter);

        scanner.close();
    }
}

