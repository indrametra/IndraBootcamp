package com.bootcampexercise.Module10.Activity6;

public class InterfaceActivityClass {
    public static void main(String[] args){
        Bike b = new Bike();
        Car p = new Car();
        System.out.println("How car starts its move?");
        p.start();
        System.out.println("\nHow car stops its move?");
        p.stop();
        System.out.println("----------------------------");

        System.out.println("With what bike start its move?");
        b.start();
        System.out.println("\nWith what bike its move?");
        b.stop();
        System.out.println("----------------------------");


    }
}
