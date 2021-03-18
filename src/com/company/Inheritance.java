package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I'm setting value for x from base class");
        this.x = x;
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(20);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(98);
        d.setY(88);
        System.out.println(d.getX());      //Derived class object can access base class method
        System.out.println(d.getY());
        System.out.println(d.x);
    }
}
