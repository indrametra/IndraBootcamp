package com.bootcampexercise.Module10.Activity6;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("   Qoooo   ");
        System.out.println("   |   |  ");
        System.out.println("    \\ /   ");
        System.out.println("    ( )   ");
        System.out.println("     -  ");
    }

    @Override
    public void stop() {
        System.out.println("  ______");
        System.out.println("  | \\ / |");
        System.out.println("  |  X  |");
        System.out.println("  | / \\ |");
        System.out.println("  ------");

    }
}
