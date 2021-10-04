package com.nomust.Tasks.Task3;

import com.nomust.Tasks.Task3.Shape.Circle;
import com.nomust.Tasks.Task3.Shape.Rectangle;
import com.nomust.Tasks.Task3.Shape.Rectangle.Square;

public class TestShape {
    public static void main() {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
       // System.out.println(s1.getRadius()); // getRadius is not implemented in Shape
        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
       // Shape s2 = new Shape(); // Can't create without implemented abstract functions
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3); System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
       // System.out.println(s3.getLength());// Again. getLength is not implemented in Shape
        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
       // System.out.println(s4.getSide());// Again. getLength is not implemented in Shape


        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
       // System.out.println(r2.getSide()); // And again. getSide is not implemented in Rectangle
        System.out.println(r2.getLength());
        Shape.Rectangle.Square sq1 = (Shape.Rectangle.Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }
}
