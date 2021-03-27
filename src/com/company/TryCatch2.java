package com.company;

import java.util.Scanner;

public class TryCatch2 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        int index, num;
        boolean flag = true;
        marks[0] = 10;
        marks[1] = 2;
        marks[2] = 7;
        while (flag){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter index of array");
                index = sc.nextInt();
                try{
                    System.out.println("Value at given index is "+marks[index]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Invalid array index");
                }
            }
            catch (Exception e){
                System.out.println("Other exception");
            }

        }
        System.out.println("Exit from program");

    }
}
