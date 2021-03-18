package com.company;

public class PrecAssoc {
    public static void main(String[] args) {
        //Precedence and Associativity
        int p = 4 * 5 - 6/2;
        /*
        Highest precedence goes to * and /.
        They are then evaluated on the basis of left to right Associativity
        p = 4 * 5 - 6/2
          = 20 - 6/2
          = 20 - 3
          = 17
        */
        System.out.println(p);
        int q = 10/5 + 2*3;
         /*
        Highest precedence goes to * and /.
        They are then evaluated on the basis of left to right Associativity
        q = 10 / 5 + 2*3
          = 2 + 2*3
          = 2 + 6
          = 8
        */
        System.out.println(q);

        // Quick Quiz
        //Expression 1
        int x = 10;
        int y = 25;
        int s = x-y/2;
        System.out.println(s);

        //Expression 2
        int b = 1;
        int c = 4;
        int a = 5;
        int r = b*b - (4*a*c) / (2*a);
        System.out.println(r);
        /*
        r = 1*1 - (4*5*4) / (2*5);
          = 1*1 - 80 / 10
          = 1 - 80 / 10
          = 1 - 8
          = -7
        */

        /*
        Expression 3
        What will be the result of the following expression:
        float a = 7/4 * 9/2
        Explanation: First 7/4=1.75 but answer will be 1 because int divide by int ans will be in integer
        then 1 * 9 = 9 again int multiply by int answer will be in integer
        then 9 / 2 = 4.5 but answer will be 4 because int divide by int ans will be in integer
        So in order to solve the issue divide the number in float
        a = 7/4.0f * 9/2.0f
        so First 7/4.0 = 1.75 because int/float answer will be in float
        1.75*9 = 15.75
        15.75 / 2.0
        7.875
        */

        System.out.println(7/4.0f * 9/2.0f);

        /*
        Find the value of the following expression:
        int a = 7*49/7 + 35/7
                343/7 + 35/7
                49 + 35/7
                49 + 5
                54
        */

    }
}
