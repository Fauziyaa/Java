package com.company;

public class IncDecOp {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        System.out.println("i++ = "+ i++);
        System.out.println("i = "+ i);
        System.out.println("j++ = "+ ++j);
        System.out.println("j = "+ j);

        int p = 20;
        int q = p++;  //p++ => p = p + 1 so first q is assigned p(20) then value of p will be incremented
        System.out.println("q = " + q);
        System.out.println("p = " + p);

        int x = 25;
        int y = ++x; //so first value of x will be incremented then assigned to y
        System.out.println("y = " + y);




    }
}
