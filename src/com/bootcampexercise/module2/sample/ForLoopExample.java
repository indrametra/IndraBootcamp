package com.bootcampexercise.module2.sample;

public class ForLoopExample {
    public static void main(String args[])     {
        // we want perform sun of first 10 numbers starting from 1
        int sum=0; //initialize sum variables
        for (int i = 1; i<=10; i++){ //for loop repeats the action until the condition is true
            //initial, no og counts, increment.decrement
            sum = sum +i;
        }
        System.out.println("Sum of first 10 numbers is " + sum);
    }
}
