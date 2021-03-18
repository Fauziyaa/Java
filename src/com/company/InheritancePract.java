package com.company;

class Circle{
    int radius;
  public Circle(){
      System.out.println("Hey.. I'm Circle");
    }
    public Circle(int r){
      this.radius = r;
    }
    public void area(){
        System.out.println("Area of circle is :" + Math.PI*radius*radius);
    }
}

class Cylinder1 extends Circle{
    int height;
   public Cylinder1(){
        System.out.println("Hey... I'm Cylinder");
    }
   public Cylinder1(int r,int h){
       super(r);
       this.height = h;
   }
   public void volume(){
       System.out.println("Volume of cylinder is : " +Math.PI*this.radius*this.radius*height);
   }
}

class Rectangle1{
    int length, width;
    Rectangle1()
    {
        System.out.println("Hey..I'm Rectangle");
    }
    Rectangle1(int l, int w){
        this.length = l;
        this.width = w;
    }
    public void rectArea(){
        System.out.println("Rectangle Area is: " +width*length);
    }
}

class Cuboid extends Rectangle1{
    int height;
    Cuboid(){
        System.out.println("Hey...I'm Cuboid");
    }
    Cuboid(int l, int w, int h){
        super(l, w);
        this.height = h;
    }
    public void cuboidArea(){
        long area = (2L *this.height*this.width)+(2L *this.length*this.width)+(2L *this.length*this.height);
        System.out.println("Cuboid Area is: "+area);
    }
}

public class InheritancePract {
    public static void main(String[] args) {
//        Cylinder1 cl = new Cylinder1();
//        Cylinder1 cl2 = new Cylinder1(10, 20);
//        cl2.area();
//        cl2.volume();

        Cuboid cb1 = new Cuboid();
        Cuboid cb = new Cuboid(10,20, 30);
        cb.cuboidArea();
        cb.rectArea();
    }
}
