package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class InvalidIndex extends Exception{
    @Override
    public String getMessage() {
        return "Invalid array index";
    }

    @Override
    public String toString() {
        return "Try again";
    }
}


public class ErrorPractice {

    public static void practice2(int a, int b){
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("HaHa");
            System.out.println(e);
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
            System.out.println(e);
        }
    }
    public static void practice3() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[5];
        int j = 10;
        for (int i = 0; i<arr.length; i++){
            arr[i] = j;
            j++;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of array you have only 5 chance");
        int i = 5;
        while (i>0){
            try{
                int input = sc.nextInt();
                System.out.println("Entered Index value is "+input);
                System.out.println("Value at given index is "+arr[input]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                i--;
                System.out.println("Invalid array index");
            }
            finally {
                System.out.println("Number of chances left: "+i);
            }
        }



    }
    public static void main(String[] args) {
        //Practice 1 -> WAP to demonstrate 3 types of error
        int age = 20;
        int year_born = 2000-age;   //Logical error current_year - age
//        if(age=20) ->Syntax error
//        String a = null;
//        System.out.println(a.charAt(0));    //Null pointer exception
//        File file = new File("E://abc.txt");
//        FileReader reader = new FileReader(file);   //File not found exception

        //Practice 1.1 -> Handle above exception
        try{
            String a = null;
            System.out.println(a.charAt(0));
        }
        catch (NullPointerException e){
            System.out.println("Null value because of "+e);
        }

        try{
            File file = new File("E://abc.txt");
            FileReader reader = new FileReader(file);
        }
        catch (FileNotFoundException e){
            System.out.println("Sorry File not found");
            System.out.println("because of = " + e);
        }

        //Practice 2 ->prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.

//        System.out.println("Enter value of a and b ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        practice2(a, b);

        //Practice 3   program that allows you to given. If max retries exceed 5 print "errors".
        try {
            practice3();
        }
        catch (Exception e){
        }
    }
}
