package com.bootcampexercise.Module10.Activity1and2and4;

public abstract class Person {

    private int age;

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void introduce(String name, int age) ;
}
