package com.company;

interface Bicycle{
    int a = 40;
    void applyBreak(int increment);
    void speedUp(int decrement);

}

interface BicycleBody{
    void color();       //All methods in interface are public by default
    void tiers();
}


class BmwBicycle implements Bicycle, BicycleBody{
    @Override
    public void applyBreak(int decrement){      //need to write public when override methods of interface
        System.out.println("Break is applied");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Speed is increased");
    }

    @Override
    public void color() {
        System.out.println("red color");
    }

    @Override
    public void tiers() {
        System.out.println("CEAT tiers");
    }
}



public class Interfaces {
    public static void main(String[] args) {
//            Bicycle b = new Bicycle();  //Can't create object of interface
            BmwBicycle bmw = new BmwBicycle();
    bmw.applyBreak(3);
    bmw.speedUp(2);
    bmw.color();
    bmw.tiers();
        System.out.println(bmw.a); //we can only use attribute of interface
//        bmw.a = 10;     //Can't change attributes of interface as it is final

    }
}
