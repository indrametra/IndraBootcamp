package com.bootcampexercise.module6.activity;

public class AnimalActivity {

    public static void main(String arg[]) {

        //TODO: Use interfaces to declare identifiers instead of the actual classes
        Animal cat = new Cat();
        //TODO: Create Dog using interface Animal
        Animal dog = new Dog ();

        Mammal mammal = new Mammal("Flexy");

        //TODO: For mammal set animal to cat
        mammal.setAnimal(cat);
        mammal.animalIsSleeping();
        //TODO: execute for mammal animalIsSleeping()
        mammal.animalIsSpeaking();
        //TODO: execute for mammal animalIsSpeaking()
        Mammal mammal1 = new Mammal("Elsa");
        //TODO: For mammal set animal to dog
        mammal1.setAnimal(dog);
        //TODO: execute for mammal animalIsSleeping()
        mammal1.animalIsSleeping();
        //TODO: execute for mammal animalIsSpeaking()
        mammal1.animalIsSpeaking();
    }
}