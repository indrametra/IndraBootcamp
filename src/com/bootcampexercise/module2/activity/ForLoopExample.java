package com.bootcampexercise.module2.activity;

public class ForLoopExample {
    public static void main(String args[])
    {
        int sum=0;
        for (int i = 1; i<=10; i++){
            sum = sum +i;
        }
        System.out.println("Sum of first 10 numbers is " + sum);
    }
}