package com.company;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val = 0.621371;
        System.out.println("***KiloMetre to Miles converter***");
        System.out.println("Enter KiloMetre ");
        int kilo = sc.nextInt();
        double miles = kilo * val;
        System.out.println(+kilo+ " = " +miles);
    }
}
