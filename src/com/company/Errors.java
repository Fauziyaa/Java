package com.company;

import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
        //SYNTAX ERROR
//        int a = 10;
//        b = 20        //Throws syntax error for variable declaration and missing ;

        //LOGICAL ERROR
        //Print Prime number between 1 to 10
        //2, 3, 5, 7
        System.out.println(2);
        for (int i = 1; i<5; i++){
            System.out.println(2*i+1);      //I want to print prime no. but logic is for odd no.
        }

        //RUNTIME ERROR -> EXCEPTIONS   //bad input
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //Enter 0 to see exception
        System.out.printf("1000 divided by %d is: %d", n, 1000/n);
    }
}
