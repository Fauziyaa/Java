package com.company;

class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}

class MyThreadR implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable Thread is Running");
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
    MyThread t1 = new MyThread("Fauziya");      //Thread(String s)
    MyThread t2 = new MyThread("John");
    t1.start();
    t2.start();
    System.out.println("Thread id is: "+t1.getId());
    System.out.println("Thread name is: "+t1.getName());
    System.out.println("Thread id is: "+t2.getId());
    System.out.println("Thread name is: "+t2.getName());

    MyThreadR tr = new MyThreadR();
    Thread trc = new Thread(tr,"Khadi");    //Thread(Runnable r, String s)
    trc.start();
//    trc.setName("Ansa");
    System.out.println("Thread id is: "+trc.getId());
    System.out.println("Thread name is: "+trc.getName());



    }
}
