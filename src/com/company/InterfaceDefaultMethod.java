package com.company;
// 1-6 normal flow from 7 concept of default method starts
interface Camera{           //Step1 define all interfaces
    void takeSnap();
    void recordVideo();
//    private void quality(){
//        System.out.println("Good...");
//    }
    default void recording4K(){
//        quality();        //Private method is accessible only within that interface
        System.out.println("Recording 4k videos...");       //7. If you want to implement a method in interface then you have to write DEFAULT keyword then implement it
    }


}

interface Wifi{             //Step1 define all interfaces
    String[] availableNetworks();
    void connectNetwork(String networkName);

}
interface Gallery{          //Step1 define all interfaces
    void showImages();
}

class BasicPhone{       //Step2 make parent class
  public void calling(long number){
        System.out.println("Calling " +number);
    }

   public void showTime(){
        System.out.println("Time is 1.39pm");
    }
}

class MySmartPhone extends BasicPhone implements Camera, Wifi, Gallery{     //step 3 Extend parent class and implement interfaces
    @Override
    public void takeSnap() {                //4. override all methods on interface is compulsory
        System.out.println("Taking snaps....");
    }

    @Override
    public void recordVideo() {             //4. override all methods on interface is compulsory
        System.out.println("Recording videos...");
    }

    @Override
    public void connectNetwork(String networkName) {     //4. override all methods on interface is compulsory
        System.out.println("Connecting to "+networkName);
    }

    @Override
    public String[] availableNetworks() {           //4. override all methods on interface is compulsory
        System.out.println("Available networks: ");
        String[] networkList = {"TPLink", "Jio182","StarNet"};
        return networkList;
    }

    @Override
    public void showImages() {          //4. override all methods on interface is compulsory
        System.out.println("There are 100 images in your gallery");
    }

    @Override
    public void showTime() {        //override parent(Inheritance) method is NOT COMPULSORY
        System.out.println("Time is 12:00am");
    }

    @Override
    public void recording4K() {
        System.out.println("Recording 4k videos from smartPhone"); //9.override default method of interface is NOT COMPULSORY
    }
}


public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        MySmartPhone mi = new MySmartPhone();
        mi.calling(9898295723L);        //5. Calling parent method
        mi.showTime();                         //6. Calling implemented interfaces method
        mi.connectNetwork("Kahani123");
        mi.takeSnap();
        String[] str = mi.availableNetworks();
        for (String net:str) {
            System.out.println(net);
        }
        mi.showImages();
//        mi.recording4K();       //8.Calling default method of interface
//        mi.recording4K();      //10.Calling override default method of interface
//        mi.quality();           //private methods of interface is not allowed to call from outside

    }
}
