package com.company;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Practice Question 1 -> array of 5 floats and calculate their sum.

//        float [] number = {2.1f, 2.3f, 6.7f,9.1f,8.5f };
//        float sum = 0;
//        for (int i = 0; i< number.length; i++){
//            sum += number[i];
//        }
//        System.out.printf("Sum of number is : %f\n", sum);

        //Practice Question 2 -> find out whether a given integer is present in an array or not.

//        int [] num = {2, 3, 6, 1, 0};
//        System.out.println("Enter number to search");
//        int find = sc.nextInt();
//        int flag = 0;
//        for (int i = 0; i<num.length; i++){
//            if (num[i] == find){
//                flag = 1;
//                break;
//            }
//        }
//        if (flag == 1){
//            System.out.println("Found");
//        }
//        else
//            System.out.println("Not found");

        //Practice Question 3 -> average marks from an array containing marks of all students in physics using a for-each loop.

//        int [] marks = {50, 91, 45, 78, 88};
//        int sum = 0;
//        for(int element:marks){
//            sum += element;
//        }
//        System.out.println("Average marks of students is "+sum/ marks.length);

        //Practice Question 4 -> add 2X3 matrix
//        int [][] m1 = {{1, 3, 4},
//                       {5, -1, 6}};
//        int [][] m2 = {{5, 1, -2},
//                       {7, -1, 3}};
//        int [][]res = new int[2][3];
//
//        for (int i = 0; i< m1.length; i++){
//            for (int j = 0; j< m1[i].length; j++){
//                res[i][j] = m1[i][j] + m2 [i][j];
//            }
//        }
//        for (int i = 0; i< m1.length; i++){
//            for (int j = 0; j< 3; j++){
//                System.out.print( res[i][j] +"\t");
//            }
//            System.out.println();
//        }
        //Practice Question 5 -> Find Maximum number in array
//        int [] num = {3, 1, 0, 5, 10};
//        int max = -1;
//        for (int i = 0; i< num.length; i++){
//            if (num[i] > max);
//            max = num[i];
//        }
//        System.out.println("Maximum is: "+max);

        //Practice Question 6 -> Find array is sorted or not
//        int [] num = {3, 1, 0, 5, 10};
//        int [] num = {0, 1, 2, 3, 4};
//        int flag = 0;
//        for (int i=0; i< num.length-1; i++){
//            if (num[i]>num[i+1]){
//                flag = 1;
//                break;
//            }
//        }
//        if (flag == 1){
//            System.out.println("unsorted array");
//        }
//        else{
//            System.out.println("sorted");
//        }

        //Practice Question 7 ->Reverse array

        int [] arr = {2,5,1,8,0};
        int i = 0;
        int j = arr.length-1;
        int temp;
        while (i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int value : arr) {
            System.out.print(value + "\t");
        }
        System.out.println();




    }
}
