package com.bootcampexercise.module5.activity;

import com.bootcampexercise.module5.activity.Employee_I;
import com.bootcampexercise.module5.activity.Person_I;

public class InheritanceActivity {
    public static void main(String[] args) {

        // Create Person object p. Write code to and set name of Person as Sarah Johnson
        // and age as 21
        Person_I p = new Person_I();
        p.setName("Sarah Johnson");
        p.setAge(21);

        System.out.println("-----------------------------");

        //Create Employee object e and
        // set salary as 70000.00, title as Developer, age as 32 and name as Shawn Cun
        Employee_I e = new Employee_I();
        e.setSalary(70000);
        e.setTitle("Developer");

        // Print Info using Employee object
        System.out.println("Employee's name is   : " + e.getName());
        System.out.println("Employee's age is    : " + e.getAge());
        System.out.println("Employee's title is  : " + e.getTitle());
        System.out.println("Employee's salary is : " + e.getSalary());

        // Print Info using Person object

        System.out.println("-----------------------------");
        System.out.println("Person's Name is    : " + p.getName());
        System.out.println("Person's Age is     : " + p.getAge());
    }
}
