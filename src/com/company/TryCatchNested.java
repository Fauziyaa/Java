package com.company;

import java.util.Scanner;

public class TryCatchNested {
    public static void main(String[] args) {
        int[] marks = new int[3];
        int index, num;
        marks[0] = 10;
        marks[1] = 2;
        marks[2] = 7;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter index of array");
            index = sc.nextInt();
            System.out.println("Enter number you want to divide the value with");
            num = sc.nextInt();

            try {
                System.out.println("The value at array index entered is: "+marks[index]);
                System.out.println("The value of array-value/number is: "+marks[index]/num);
            }
            catch (ArithmeticException e){
                System.out.println("ArithmeticException occurred!");
                System.out.println(e);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry! this index is not available");
                System.out.println(e);
            }
            catch (Exception e){
                System.out.println("Other exception is occurred!");
                System.out.println(e);
            }

        }
        catch (Exception e){
            System.out.println("Please Enter correct input");
            System.out.println(e);
        }

        System.out.println("End of Program :)");
    }
}
