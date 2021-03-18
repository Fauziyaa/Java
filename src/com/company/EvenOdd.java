package com.company;

public class EvenOdd {
    public static void main(String[] args) {
        /*
        n = 0, 1, 2, 3, 4, 5
        2*n = 0, 2, 4, 6, 8, 10 Even number
        2*n+1 = 1, 3, 5, 7, 9, 11 Odd number
        */
        int n = 10;
        for (int i = 0; i<=n ; i++){
            int odd = 2 * i + 1;
            System.out.println(odd);
        }
    }
}
