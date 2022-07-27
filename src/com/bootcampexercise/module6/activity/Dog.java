package com.bootcampexercise.module6.activity;

public class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Dog says: 'Wuf Wuf'!");
    }

    //TODO: Create method sleep() and its implementation should print out string "Dog is sleeping!"
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");    }

    public Dog() {
    }
}
