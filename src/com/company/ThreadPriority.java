package com.company;

class MyThreadPrior extends Thread{
    public MyThreadPrior(String name){
        super(name);
    }
    @Override
    public void run() {
        int i = 0;
        while (i<=500){
            System.out.println(getName()+" is running");
            i++;
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
    MyThreadPrior thread1 = new MyThreadPrior("Anas");
    MyThreadPrior thread2 = new MyThreadPrior("Sana");
    MyThreadPrior thread3 = new MyThreadPrior("Rabin");
    MyThreadPrior thread4 = new MyThreadPrior("John(Most Important)");
    MyThreadPrior thread5 = new MyThreadPrior("Katrine");
    thread4.setPriority(Thread.MAX_PRIORITY);
    thread3.setPriority(Thread.NORM_PRIORITY);
    thread2.setPriority(Thread.MIN_PRIORITY);
    thread5.setPriority(8);
    thread1.setPriority(9);

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    thread5.start();


    }
}
