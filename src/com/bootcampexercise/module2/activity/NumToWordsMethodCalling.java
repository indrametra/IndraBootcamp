package com.bootcampexercise.module2.activity;

public class NumToWordsMethodCalling {
    public static void main(String args[]) {

        greeting();
        System.out.print(numToWordsLogic(30));
        System.out.println();
    }

    public static int numToWordsLogic(int x) {
        return (x + 15);
    }
    public static void greeting(){
        System.out.print("Greetings to everyone who are older than ");

    }
}