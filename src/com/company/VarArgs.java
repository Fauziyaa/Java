package com.company;

public class VarArgs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

    static int sum(int ...arr){         //Can be run with 0 arguments
        //int arr is act as int [] arr
        int result = 0;
        for (int a:arr){
            result += a;
        }
        return result;
    }
    static int multiply(int x, int ...arr){     //one argument is compulsory
        int result = x;
        for(int a:arr){
            result *= a;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Sum of noting is: " +sum());    //can be run without args
        System.out.println("Sum of 4 and 5 is: " +sum(4,5));
        System.out.println("Sum of 4, 2, and 5 is: " +sum(4,2,5));
        System.out.println("Sum of 4, 2, 3, and 5 is: " +sum(4,2,3,5));

//        System.out.println("Sum of noting is: " +multiply());//Throw error without args
        System.out.println("Multiply of 4 and 5 is: " +multiply(1,4,5));
        System.out.println("Multiply of 4, 2, and 5 is: " +multiply(1,4,2,5));
        System.out.println("Multiply of 4, 2, 3, and 5 is: " +multiply(1,4,2,3,5));
    }
}
