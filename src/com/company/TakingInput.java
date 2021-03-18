package com.company;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1:");
        int n1 = sc.nextInt();
        System.out.println("Enter Number 2:");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println("Sum of number is : " + sum);

        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println(name);
        System.out.println("Enter Sentence");
        String sentence = sc.nextLine();
        System.out.println(sentence);

        System.out.println("Check if input is given by user");
        System.out.println("Enter any Integer");
        boolean check = sc.hasNextInt();
        System.out.println(check);

        char grade = 'B';
        grade = (char)(grade + 8);      //type cast
        System.out.println(grade);





    }
}
