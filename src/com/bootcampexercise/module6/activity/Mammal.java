package com.bootcampexercise.module6.activity;

public class Mammal {
      private Animal myAnimal;
    private String name;

    public Mammal(String name) {
        this.name = name;
    }

    public void setAnimal(Animal animal) {
        myAnimal = animal;
    }

    public void animalIsSleeping() {

        System.out.println("Animal with name: " + name);
        myAnimal.sleep();
        //TODO: write code so that Animal sleep implementation is used

    }

    public void animalIsSpeaking() {
        System.out.println("Animal with name: " + name);
        myAnimal.animalSound();
       //TODO: write code so that Animal animalSound implementation is used

    }
}
