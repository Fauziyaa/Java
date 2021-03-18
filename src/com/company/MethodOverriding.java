package com.company;
class A{
    public void math1(){
        System.out.println("I'm method 1 from class A");
    }
    public void print(){
        System.out.println("Class A");
    }
}

class B extends A{
    //Method overriding
    @Override
    public void math1(){
        System.out.println("I'm method 1 from class B");

    }
    public void math2(){
        System.out.println("I'm method 2 from class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.math1();

        B b = new B();
        b.math1();
        b.math2();
    }
}
