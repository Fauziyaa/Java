package com.company;

interface Camera1{
    void takeSnap();
    void recordVideo();
    default void recording4K(){
        System.out.println("Recording 4k videos...");
    }


}

interface Gallery1{          //Step1 define all interfaces
    void showImages();
}

class BasicPhone1{
    public void calling(long number){
        System.out.println("Calling " +number);
    }

    public void showTime(){
        System.out.println("Time is 1.39pm");
    }
}

class MySmartPhone1 extends BasicPhone1 implements Camera1, Gallery1{
    @Override
    public void takeSnap() {
        System.out.println("Taking snaps....");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording videos...");
    }

    @Override
    public void showImages() {
        System.out.println("There are 100 images in your gallery");
    }

    @Override
    public void showTime() {
        System.out.println("Time is 12:00am");
    }

    @Override
    public void recording4K() {
        System.out.println("Recording 4k videos from smartPhone");
    }

    public void MyPersonalClass(){
        System.out.println("Personal class of smart phone");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Camera1 c1 = new MySmartPhone1();       //This is smart phone but use it as camera
        c1.recording4K();       //Can call all the method of camera1
        c1.takeSnap();         //Can call all the method of camera1

//        c1.showImages();        //Can't not call other interface methods
//        c1.MyPersonalClass();    //Can't not call other class methods

        MySmartPhone1 samsung = new MySmartPhone1();        //Can call all the method implemented in smart phone class
        samsung.MyPersonalClass();
        samsung.recording4K();
        samsung.takeSnap();
    }
}
