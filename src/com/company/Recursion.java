package com.company;

public class Recursion {
    static int factorial(int n){
        if (n==0 ||  n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    static int factorial_usingLoop(int n){
      int fact = 1;
       for(int i=1; i<=n; i++){
           fact *= i;
        }
       return fact;
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Factorial of "+x+" using recursion: "+factorial(x));
        System.out.println("Factorial of "+x+" using loop: "+factorial_usingLoop(x));

    }
}
