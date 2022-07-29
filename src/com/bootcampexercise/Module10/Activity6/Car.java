package com.bootcampexercise.Module10.Activity6;

public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car starts with speed force");
    }

    @Override
    public void stop() {
        System.out.println("Car stops with brake force");
    }
}
