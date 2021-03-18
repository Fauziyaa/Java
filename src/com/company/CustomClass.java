package com.company;

class Employee{
    int id;
    String name;
    int salary;

     void getDetails(){
         System.out.println("id of Employee is: " +id);
         System.out.println("Name of Employee is: " + name);
    }
    int getSalary(){
         return salary;
    }
}


public class CustomClass {
    public static void main(String[] args) {
        System.out.println("Welcome to custom class");

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.id = 10;
        emp1.name = "Sana Khan";
//        System.out.println(emp1.id);
//        System.out.println(emp1.name);
        emp1.getDetails();
        emp1.salary = 20000;
        int sal = emp1.getSalary();
        System.out.println(sal);

        emp2.id = 11;
        emp2.name = "Abhishek";
        emp2.salary = 10000;
        emp2.getDetails();
        int sal2 = emp2.getSalary();
        System.out.println(sal2);


    }
}
