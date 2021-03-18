package com.company;

import java.util.Scanner;

public class MethodPractice {

    static void table(int n){
        for (int i = 0; i<=10; i++){
            System.out.println(+n +" x " +i+ " = " +n*i);
        }
    }
    static void pattern(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();


        }
    }

    static void pattern2(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i; j++){
                System.out.print("*");
            }
            for (int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static int sumRec(int n){
        //Base Condition to terminate recursion
        if (n==1){
            return 1;
        }
        return n+sumRec(n-1);
    }
    static int fib(int n){
        if(n == 1){
            return 0;
        }
        else if (n == 2){
            return 1;
        }
        else
        {
            return fib(n-1) + fib(n-2);
        }


    }

    static int avg(int ...arr){
        int sum = 0;
        int average = 0;
        for (int i = 0; i< arr.length; i++){
            sum+=arr[i];
        }
        average = sum/ arr.length;
        return average;

    }
    static void printRec(int n){
        if (n == 0){
            return;
        }
        System.out.print("* ");
        printRec(n-1);
    }
    static void patternRec(int n, int i) {
        if(n==0){
            return;
        }
        printRec(i);
        System.out.println();

        patternRec(n-1,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Practice Question 1->print the multiplication table of a number n.
//        int var = sc.nextInt();
//        System.out.println("Enter number to get multiplication table");
//        table(var);

        //Practice Question 2->print the pattern.
//        System.out.println("Enter number of stars");
//        int star = sc.nextInt();
//        pattern(star);

        //Practice Question 3->print the pattern 2.
//        System.out.println("Enter number of stars");
//        int star = sc.nextInt();
//        pattern2(star);

        //Practice Question 4->recursive function to calculate the sum of first n natural numbers.
//        System.out.println("Enter number");
//        int number = sc.nextInt();
//        System.out.println("Sum of number is :" +sumRec(number));

        //Practice Question 5-> Fibonacci   //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, fib(1) = 0
//        System.out.println("Enter number");
//        int number = sc.nextInt();
//        System.out.println("Fibonacci :" + fib(number));

        //Practice Question 6-> average of numbers passed as arguments.
//        System.out.println("Average is  :" + avg(1,2,3));

        //Practice Question 7->Repeat pattern printing using recursion
        System.out.println("Enter number of stars");
        int star = sc.nextInt();
        patternRec(star, 1);



    }


}
