package com.company;

import java.util.NoSuchElementException;

interface ParentInterface{
    void math1();
    void math2();
}

interface ChildInterface extends ParentInterface{       //one interface can extends another interface
    void math3();
    void math4();
}

class MySampleClass implements ChildInterface{
    @Override
    public void math1() {               //we need to implement all methods of parent and child
        System.out.println("Math 1 from Parent");
    }

    @Override
    public void math2() {
        System.out.println("Math 2 from Parent");
    }

    @Override
    public void math3() {
        System.out.println("Math 3 from child");
    }

    @Override
    public void math4() {
        System.out.println("Math 4 from child");
    }
}

public class InterfaceWithInheritance {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.math1();
        obj.math2();
        obj.math3();
        obj.math4();
    }
}
