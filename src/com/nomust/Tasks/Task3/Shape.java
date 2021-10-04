package com.nomust.Tasks.Task3;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {}
    public Shape(String color, boolean filled) {}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();

    public static class Circle extends Shape {
        protected double radius;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return radius * Math.PI * Math.PI;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return "Circle: radius=" + radius;
        }
    }

    public static class Rectangle extends Shape {
        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        protected double width;
        protected double length;

        public Rectangle() {
        }

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public Rectangle(double width, double length, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        @Override
        public double getArea() {
            return width * length;
        }

        @Override
        public double getPerimeter() {
            return 2 * (width+length);
        }

        @Override
        public String toString() {
            return "Rectangle: width=" + width + " and length=" + length;
        }

        public static class Square extends Rectangle {

            public Square() {
            }

            public Square(double side) {
                super(side, side);
            }

            public Square(double side, String color, boolean filled) {
                super(side, side, color, filled);
            }

            public double getSide() {
                return width;
            }

            public void setSide(double side) {
                width = side;
                length = side;
            }

            @Override
            public double getArea() {
                return width * length;
            }

            @Override
            public double getPerimeter() {
                return 2 * (width + length);
            }

            @Override
            public String toString() {
                return "Square: side=" + width;
            }
        }
    }


}
