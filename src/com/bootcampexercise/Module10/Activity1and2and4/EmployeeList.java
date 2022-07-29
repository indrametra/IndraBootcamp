package com.bootcampexercise.Module10.Activity1and2and4;

import java.util.ArrayList;
import java.util.List;

import static com.bootcampexercise.Module10.Activity1and2and4.Employee.getHighestPaidEmp;

public class EmployeeList  {
    public List<Employee> employees = new ArrayList<Employee>();
     public static void main(String[] args){
        EmployeeList list1 = new EmployeeList();
        list1.employees.add(new Employee("Nice person", "Alvin and the Chipmunks",2563 ));
        list1.employees.add(new Employee("Director", "Alvin and the Chipmunks", 2564 ));
        list1.employees.add(new Employee("Alvin", "Alvin and the Chipmunks", 12360 ));
        list1.employees.add(new Employee("Operator", "Alvin and the Chipmunks", 1564 ));
        list1.employees.add(new Employee("Lawyer", "Alvin and the Chipmunks", 312564 ));
//       getHighestPaidEmp(list1);

         System.out.println("The Employee whose salary is the highest is " + getHighestPaidEmp(list1));
    }


}
