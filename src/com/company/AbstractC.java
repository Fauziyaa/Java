package com.company;

abstract class Parent{
    int a = 40;
    public void sayHi(){
        System.out.println("Hi everyone");
    }
    Parent(){
        System.out.println("I'm abstract constructor");
    }
    abstract public void greet();
    abstract public void keep();

}

class Child1 extends Parent{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    Child1(){
        System.out.println("I'm child1 constructor");
    }
    @Override
    public void keep() {
        System.out.println("Keep it up");
    }
}

abstract class Child2 extends Parent{       //If you extends abstract class you must have to implement
                                           //all methods of abstract class.else you have to make child class as abstract class
    public void hey(){

    }
}

public class AbstractC {
    public static void main(String[] args) {
//        Parent p = new Parent(); //Can't make object of abstract class
        Child1 c1 = new Child1();
//        Child2 c2 = new Child2(); //Can't make object of abstract class
        c1.a = 10;      //Can modify properties of abstract class
        c1.greet();
        c1.sayHi();
        Parent cp = new Child1();
        cp.greet();
        cp.sayHi();

    }
}
