package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    void refill() {
        System.out.println("Refilling this pen....");
    }

    @Override
    void write() {
        System.out.println("Writing...");
    }

    public void Nib(){
        System.out.println("Change Nib");
    }
}

interface BasicAnimal{
    void eat(String food);
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Hey I'm monkey and i can jump");
    }

    public void bite(){
        System.out.println("Biting...");
    }

}
class Human extends Monkey implements BasicAnimal{
    public void eat(String food){
        System.out.println("I'm eating a  "+food);
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    public void dancing(){
        System.out.println("I'm human and dancing");
    }
}

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}
class SmartTelephone extends Telephone{
    @Override
    void ring(){
        System.out.println("Ringing Phone...");
    }
    @Override
     void lift(){
        System.out.println("Pick up the call");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnect the call");
    }
    void screenTouch(){
        System.out.println("Smart Telephone touch screen");
    }
}

interface TVRemote{
    void keypad();
    void mouse();
}
class TV{
    void screen(){
        System.out.println("HD Screen");
    }
    void speaker(){
        System.out.println("High volume speaker");
    }
    void cables(){
        System.out.println("More cables in old tv");
    }
}

class SmartTV extends TV implements TVRemote{
    @Override
    public void keypad() {
        System.out.println("Type here...");
    }

    @Override
    public void mouse() {
        System.out.println("Working with mouse");
    }

    @Override
    void cables() {
        System.out.println("Less cables in smart tv");
    }

    void internet(){
        System.out.println("Connect to internet");
    }
}

public class Abstract_Interface_Practice {
    public static void main(String[] args) {
//        FountainPen fp = new FountainPen();
//        fp.write();
//        fp.refill();
//        fp.refill();

//        Pen p = new FountainPen();
//        p.refill();

//        Human akash = new Human();
//        akash.eat("Biryani");
//        akash.sleep();
//        akash.bite();
//        akash.jump();
//        akash.dancing();

//        BasicAnimal animal = new Human();
//        animal.eat("Apple");
//        animal.sleep();

//        Telephone oldTele = new SmartTelephone();
//        oldTele.disconnect();
//        oldTele.ring();
//        oldTele.lift();
//        oldTele.screenTouch();      //Can't access

        SmartTV LG = new SmartTV();
        LG.cables();
        LG.screen();

        TVRemote remote = new SmartTV();
        remote.keypad();
        remote.mouse();



    }
}
