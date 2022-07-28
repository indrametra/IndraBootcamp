package com.bootcampexercise.module8.activity;

//Needs to be completed

import java.util.HashSet;
import java.util.Set;


public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        SetActivity m = new SetActivity();
        //Also try adding a few duplicate entries to this set.
        HashSet names = new HashSet();
        names.add("Narcise");
        names.add("Cactuss");
        names.add("Lily");
        names.add("Rose");
        names.add("Cactuss");
        names.add("Narcise");

        //TODO: 2 - Call print method to print the set passed as its parameter.
        m.print(names);
    }

    void print(Set set) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.
        for (Object obj : set) {
            System.out.println(obj.toString());
        }
    }
}
