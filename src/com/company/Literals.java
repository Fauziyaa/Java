package com.company;

public class Literals {
    public static void main(String[] args) {
        byte age = 30;
        short val = 100;
        int price = 5500;
        long ageDino = 87923233232123L;
        float pi = 3.14F;
        double sq = 9992.31223D;
        char alpha = 'F';
        boolean bol = true;
        String intro = new String("Hey I'm Fauziya");
        System.out.println(intro);
        String name = "Fauziya";
        System.out.println(age);
        System.out.println(name);   //ln means new line
        System.out.print("I Love Programming: "); // No new Line
        System.out.printf("Value of pi is %f\n", pi);        //Format specifier same as C
        System.out.format("Value of price is %d\n", price);  //Same as printf

    }
}
