package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate your percentage");
        System.out.println("Enter your Name");
        String name = sc.next();
        int  maths, sci, java, flutter, c;
        float per, sum, cgpa;
        System.out.println("Maths");
        maths = sc.nextInt();
        System.out.println("Science");
        sci = sc.nextInt();
        System.out.println("Java");
        java = sc.nextInt();
        System.out.println("Flutter");
        flutter = sc.nextInt();
        System.out.println("C");
        c = sc.nextInt();
        sum = maths + sci + java + flutter + c;
        per = (sum/500) * 100;
        cgpa = sum/50;
        System.out.println("Congratulations " +name+ " :)");
        System.out.println("Your Percentage is " +per+ " and CGPA is:" +cgpa);


    }
}
