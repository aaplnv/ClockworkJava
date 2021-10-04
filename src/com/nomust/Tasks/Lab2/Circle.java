package com.nomust.Tasks.Lab2;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calcPerimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return "Circle: " + "\n" +
                "radius=" + radius + "\n" +
                "perimeter (calculated)=" + calcPerimeter();
    }
}
