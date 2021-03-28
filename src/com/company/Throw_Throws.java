package com.company;
import java.util.Scanner;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius can't be negative";
    }

    @Override
    public String getMessage() {
        return "Please try again";
    }
}


public class Throw_Throws {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result;
        return result = Math.PI*r*r;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result;
        return result = a/b;
    }
    public static void main(String[] args) {
        try{
            int c = divide(6,0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception occurred!");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius(-ve)");
        int ar = sc.nextInt();
        try {
            double res = area(ar);
            System.out.println("Area is: "+res);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

    }
}
