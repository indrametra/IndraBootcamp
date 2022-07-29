package com.bootcampexercise.Module10.Activity1and2and4;

public class AbstractActivity {
    public static void main(String[] args){
        Students S = new Students();
        S.setSchoolName("Sunshine school days");
        S.introduce( "Saara", 25);
        System.out.println("\n&o&o&o&o&o&o&o&o&o&o&o&o&o&o&o&o");

        Person P = new Students();
        P.introduce("Patricy", 16);
        System.out.println("\n&o&o&o&o&o&o&o&o&o&o&o&o&o&o&o&o");

        Employee E = new Employee();
        E.setCompany("Alvin and the Chipmunks");
        E.setSalary(2563);
        E.setjTitle("Nice person");
        E.introduce("Elsa", 12);
        System.out.println("\n&o&o&o&o&o&o&o&o&o&o&o&o&o&o&o&o");
        Person N = new Employee();
        N.introduce("Elisabet", 49);

    }
}
