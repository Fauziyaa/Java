package com.company;

interface Bicycle{
    void applyBreak(int increment);
    void speedUp(int decrement);
}

class BmwBicycle implements Bicycle{
    @Override
    public void applyBreak(int decrement){
        System.out.println("Break is applied");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Speed is increased");
    }
}


public class Interfaces {
    public static void main(String[] args) {

    }
}
