package com.bootcampexercise.module2.activity;

public class NumToWordsMethodCalling {
    public static void main(String args[]) {

        printWord();
        System.out.print(numToWordsLogic(30));
        System.out.println();
    }

    public static int numToWordsLogic(int x) {
        return (x + 15);
    }
    public static void printWord(){
        System.out.print("Greetings to everyone who are older than ");

    }
}