package com.company;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Practice Question 1 -> Print Pattern
//        for (int i = 0; i<5 ; i++){
//            for(int j = 5; j> i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Practice Question 2 -> Sum n even numbers
//        int n = 0;
//        int sum = 0;
//        while (n<=10){
//            sum = sum + (2*n);
//            n++;
//        }
//        System.out.println("Sum of even number is "+sum);

        //Practice Question 3 -> Table of given number
//        System.out.println("Enter number to get Multiplication Table");
//        int n = sc.nextInt();
//        for (int i = 1; i<=10; i++){
//            System.out.println(n+ " x " +i+ " = " +n*i);
//        }

        //Practice Question 4 -> Table of given number without using * operator
//        System.out.println("Enter number to get Multiplication Table");
//        int n = sc.nextInt();
//        for (int i = 1; i<=10; i++){
//            int table;
//            table = 0;
//            for (int j=1; j<=i; j++){
//                table = table + n;
//            }
//            System.out.println(n+ " x " +i+ " = " +table);
//        }

        //Practice Question 5 -> Table of 10 in reverse format
//        System.out.println("Enter number to get Multiplication Table");
//        int n = sc.nextInt();
//        for (int i = 10; i>=1; i--){
//            System.out.println(n+ " x " +i+ " = " +n*i);
//        }

        //Practice Question 6 -> find factorial of a given number using for loops.
        System.out.println("Enter number to get Factorial");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact = i * fact;
        }
        System.out.printf("Factorial of %d number is: %d", n, fact);



    }
}
