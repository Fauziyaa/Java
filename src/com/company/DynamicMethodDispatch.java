package com.company;

class Phone{
    Phone(){
        System.out.println("I'm phone");
    }
    public void calling(){
        System.out.println("Calling from Phone");
    }
    public void showTime(){
        System.out.println("Time is 2:46");
    }
}

class SmartPhone extends Phone{
    SmartPhone(){
        System.out.println("I'm smartphone");
    }
    SmartPhone(int a){
        System.out.println("I'm smartphone a " +a);
    }
    public void calling(){
        System.out.println("Calling from Smart Phone");
    }

    public void music(){
        System.out.println("Playing music...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        Phone phone = new Phone();
//        phone.calling();
//        phone.showTime();
//
//        SmartPhone smart = new SmartPhone();
//        SmartPhone smart1 = new SmartPhone(10);
//        smart.calling();
//        smart.music();
//        smart.showTime();

        Phone obj = new SmartPhone();    //Dynamic Method Dispatch
        obj.showTime();
        obj.calling();
//        obj.music();    //Not Allowed

//        SmartPhone obj1 = new Phone();  //Not allowed
    }
}
