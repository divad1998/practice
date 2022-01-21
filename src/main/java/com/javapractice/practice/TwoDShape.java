package com.javapractice.practice;

public class TwoDShape {

    public double radius;
    public String name;

//    TwoDShape(double radiusHolder, String nameHolder) {
//        radius = radiusHolder;
//        name = nameHolder;
//    }

    void area() {};

}

class Circle extends TwoDShape {

    Circle(double radiusHolder, String nameHolder) {

        //super(radiusHolder, nameHolder);
        super.radius = radiusHolder;
        super.name = nameHolder;
    }
    void area() {
        System.out.println("Area of " + name + " is: " + Math.PI * radius * radius);
    }

    TwoDShape returnType(int which) {
        if (which == 0 ? true : false) {
            return new TwoDShape();
        } else {
            return new Circle(radius, name);
        }

    }

    public static void main(String[] args) {
        Circle circle = new Circle(4.5, "Circle");
        circle.area();

        var t = (Circle) circle.returnType(1);

        System.out.println(t.toString());

    }
}