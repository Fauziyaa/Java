package com.company;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int [] marks = {50, 77, 82, 35, 89};
        int [] arr = new int [10] ;
//        System.out.println(marks[0]);
//        System.out.println(marks.length);
        System.out.println("Printing array using loop");
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("Printing array in reverse order");
        for (int i = marks.length - 1; i>=0; i--){
            System.out.println(marks[i]);
        }
        System.out.println("Printing array using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }

        System.out.println("Printing 2D-Array");
        int[][] flat = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < flat.length; i++){
            for (int j = 0; j<flat[i].length; j++){
                flat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i< flat.length; i++){
            for (int j=0; j<flat[i].length; j++){
                System.out.print(flat[i][j] +"\t");
            }
            System.out.println();
        }

    }
}
