package com.jotiba.practice.staticDemo;

public class Shape {
    int radius;
    static String type;

    public void print(){
        System.out.println("Radius of the shape is: " + radius + " and shape is: " + type);
    }

    public static void main(String[] args) {
        Shape.type = "Circle";

        Shape circle1 = new Shape();
        circle1.radius = 5;
        circle1. print();

        Shape circle2 = new Shape();
        circle2.radius = 3;
        circle2. print();

        Shape circle3 = new Shape();
        circle3.radius = 7;
        circle3.print();
    }
}
