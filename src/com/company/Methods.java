/*
Static methods means these methods are associated with class and can be access without making objects.
If we don't use static keyword before methods than it means this method is separate from class so if you
want to access this method you need to make object of this class and by using that object you can refer

Eg: Suppose in office there is one cooler for all the employees. if higher manager demand to bring this office than
he can use it directly. but every employee have their personal cooler than manager can't access it directly he need to
make some permission Id so that he can make.
*/
package com.company;

public class Methods {
    static int sum(int x, int y){   //If use static no need to make objects to call methods
        int s;
        s = x+y;
        return s;
    }
    int multiply(int p, int q){     //If static is not use then make objects to call methods
        int m;
        m = p*q;
        return p;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;
        int d, e;
        c = sum(a,b);
        System.out.println(c);
        Methods obj = new Methods();
        Methods obj1 = new Methods();

        d = obj.multiply(a, b);
        System.out.println(d);
        e = obj1.multiply(a,b);
        System.out.println(e);

    }
}
