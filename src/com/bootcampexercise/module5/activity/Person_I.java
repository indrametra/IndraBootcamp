package com.bootcampexercise.module5.activity;

public class Person_I {
    //Attributes
    private String name;
    private int age;
    //TODO: write getter for String name
    public String getName() {
        return name;
    }

    //TODO: write getter for int age
    public int getAge() {
        return age;
    }
    //TODO: write setter for String name
    public void setName(String name) {
        this.name = name;
    }

    //TODO: write setter for int age
    public void setAge(int age) {
        this.age = age;
    }
//Behavior
    //TODO: write default constructor. Print 'I'm Person_I constructor'

    public Person_I() {
        System.out.println("I am person_I construcotr");
        System.out.println("-----------------------------");
    }
    //TODO: Write parameterized constructor with variables name and age
    public Person_I(String name, int age) {
        this.name = name;
        this.age = age;
    }




}
