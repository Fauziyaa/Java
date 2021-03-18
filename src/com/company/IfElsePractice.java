package com.company;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {

        //Practice Question 1
//        int a = 10;
//        if (a == 11){
//            System.out.println("I'm 11");
//        }
//        else {
//            System.out.println("I'm not 11");
//        }

        //Practice Question 2

        Scanner sc = new Scanner(System.in);
//        int sub1 = sc.nextInt();
//        int sub2 = sc.nextInt();
//        int sub3 = sc.nextInt();
//        int flag = 0;
//        float per1 = sub1/100.0F*100;
//        float per2 = sub2/100.0F*100;
//        float per3 = sub3/100.0F*100;
//
//        if (per1<40 || per1<33){
//            System.out.println("You failed in subject1");
//            flag++;
//        }
//        if (per2<40 || per2<33){
//            System.out.println("You failed in subject2");
//            flag++;
//        }
//        if (per3<40 || per3<33){
//            System.out.println("You failed in subject3");
//            flag++;
//        }
//        if (flag>0){
//            System.out.println("Sorry you are fail");
//        }
//        else
//            System.out.println("Congratulations!! you are pass");

        //Practice Question 2
//        System.out.println("Enter salary");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if (income < 2.5f) {
//            tax = tax + 0;
//        }
//        else if (income > 2.5f && income <= 5.0f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//
//        else if (income > 5.0f && income <=10.0) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 2.5f);
//        }
//        else
//        {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 2.5f);
//        }
//        System.out.println("You need to pay tax: " +tax+ "%");

        //Practice Question 3

//        System.out.println("Enter Number for day from 1-7");
//        int day = sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Please enter valid number");
//        }

        //Practice Question 4
//        System.out.println("Enter year");
//        int year = sc.nextInt();
//        if (year % 400 == 0){
//            System.out.println(year+" is leap year");
//        }
//        else if(year % 100 == 0){
//            System.out.println(year+" is not leap year");
//        }
//        else if (year % 4 == 0){
//            System.out.println(year+" is leap year");
//        }
//        else
//            System.out.println(year+" is not leap year");

        System.out.println("Enter website");
        String website= sc.nextLine();
        if (website.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if (website.endsWith(".org")){
            System.out.println(" Organization website");
        }
        else if (website.endsWith(".in")){
            System.out.println("Indian website");
        }
        else
            System.out.println("Don't know :(");



    }
}
