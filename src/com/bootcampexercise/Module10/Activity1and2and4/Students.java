package com.bootcampexercise.Module10.Activity1and2and4;

public class Students extends Person {
    private String schoolName;


    public String getSchoolName() {
        return schoolName=null;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void introduce(String schoolName) {

    }

    public void introduce(String name, int age) {
        if (schoolName == null) {
            System.out.println("My name is " + name + " and I am " + age + " years old. And do not care about education.");
        } else {
            System.out.println("My name is " + name + " and I am " + age + " years old.\n I study in university \"" + schoolName+"\"");
        }
    }
}
