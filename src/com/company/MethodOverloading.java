package com.company;
//Same method with different parameter
public class MethodOverloading {
   static void foo(){
        System.out.println("Good Morning");
    }
    static void foo(int a){
        System.out.println("Good Morning " +a+ " times");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning " +a+ " and "+b+ " times");

    }
    static void foo(float a, float b){      //same number of arguments but different data type is allowed

    }
//    static float foo(float a, float b){      // same arguments with different return type is not allowed
//        return 3.14f;
//    }

    static void foo(Number a){

    }
    public static void main(String[] args) {
        foo();
        foo(10);
        foo(30, 50);
    }
}
