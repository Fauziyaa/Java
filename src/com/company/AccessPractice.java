package com.company;

class Cylinder{
    private int radius;
    private int height;

    public void setRadius(int r){
        radius = r;
    }
    public void setHeight(int h){
        height = h;
    }

    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public float surface(){
        float pi = 3.14f;
        return ( 2 * pi * height * radius) + (2 * pi * radius * radius );

    }
    public float volume(){
        float pi = 3.14f;
        return pi*radius*radius*height;
    }
}

class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        length = 4;
        breadth = 5;
    }
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    public int getLength() {
        return length;
    }
}

public class AccessPractice {
    public static void main(String[] args) {
//    Cylinder cl = new Cylinder();
//    cl.setHeight(10);
//    cl.setRadius(20);
//        System.out.println("Height is : "+ cl.getHeight());
//        System.out.println("Radius is: "+cl.getRadius());
//        System.out.println("Surface of cylinder is: "+cl.surface());
//        System.out.println("Volume of cylinder is: "+cl.volume());


    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(33,45);
        System.out.println(r1.getLength());
        System.out.println(r2.getLength());
    }
}
