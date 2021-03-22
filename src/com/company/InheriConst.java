package com.company;
//Constructor in Inheritance
class Base1{
    Base1(){
        System.out.println("I'm Default constructor of base class");
    }
    Base1(int a){
        System.out.println("I'm overloaded constructor of base class a: "+a);
    }
}

class Derived1 extends Base1{
    Derived1(){
//        super(0);
        System.out.println("I'm Default constructor of derived class");
    }
    Derived1(int a, int b){
        super(a);
        System.out.println("I'm overloaded constructor of derived class b: "+b);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I'm Default constructor of derived class");
    }
    ChildOfDerived(int a, int b, int c){
        super(a,b);
        System.out.println("I'm overloaded constructor of child of derived class c: "+c);
    }
}

public class InheriConst {
    public static void main(String[] args) {
//        Base1 b = new Base1();        //Call base1's default constructor
//        Base1 b2 = new Base1(10);
//        Derived1 d = new Derived1();
        Derived1 d1 = new Derived1(10, 20);
//        ChildOfDerived cd = new ChildOfDerived();
//        ChildOfDerived cd = new ChildOfDerived(98,88,72);


    }
}
