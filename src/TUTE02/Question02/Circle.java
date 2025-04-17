package TUTE02.Question02;

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return (22 / 7.0) * radius * radius;
    }

    public double calculateArea(double diameter) {
        double radius = diameter / 2;
        return (22 / 7.0) * radius * radius;
    }
}


