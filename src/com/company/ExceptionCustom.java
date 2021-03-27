package com.company;

import java.util.Scanner;

class MyExceptionClass extends Exception{
    @Override
    public String getMessage() {
        return "I'm getMessage()";
    }

    @Override
    public String toString() {
        return "I'm toString()";
    }
}

class MinAgeException extends Exception{
    @Override
    public String toString() {
        return "Age should be greater than 18";
    }

    @Override
    public String getMessage() {
        return "You are not valid for the licence";
    }
}


public class ExceptionCustom {
    public static void main(String[] args) {
        int a;
        int age;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        a = sc.nextInt();
//        if (a<10){
//            try{
//                throw new MyExceptionClass();
////                throw new ArithmeticException("Arithmetic exception");
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                System.out.println(e);
//                e.printStackTrace();
//
//            }
//        }
        System.out.println("Enter age");
        age = sc.nextInt();
        if (age>=18){
            System.out.println("You are eligible for applying licence");
        }
        else{
            try{
                throw new MinAgeException();
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        }
        System.out.println("End of program");
    }
}
