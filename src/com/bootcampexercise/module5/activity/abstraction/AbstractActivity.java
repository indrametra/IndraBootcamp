package com.bootcampexercise.module5.activity.abstraction;

public class AbstractActivity {
    public static void main(String args[]) {
        System.out.println("-------------------");
        Circle circle = new Circle(10);
        circle.setColor("blue");

//
        System.out.println("Circle perimeter = "+ circle.calculatePerimeter());
        System.out.println("Circle Area = "+circle.calculateArea());
        System.out.println(circle.color);
        // set and Print color of rectangle
        // Give area of rectangle
        // Print perimeter of rectangle
        System.out.println("-------------------");
        Rectangle rectangle = new Rectangle(7, 5);
        rectangle.setColor("red");

//
        System.out.println("Rectangle perimeter = "+ rectangle.calculatePerimeter());
        System.out.println("Rectangle Area = "+rectangle.calculateArea());
        System.out.println(rectangle.color);
        // set and Print color of circle
        // Give area of circle
        // Print perimeter of circle
    }
}
