package com.company;

public class TryCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;

        //Without try catch
//        c = a/b;
//        System.out.println("The result is: "+c);    //Program will not go further

        //With try catch
        try{
            c = a/b;
            System.out.println("The result is: "+c);
        }
        catch (Exception e){
            System.out.print("Cannot proceed further, reason is ");
            System.out.println(e);
        }
        System.out.println("End of program");

    }
}
