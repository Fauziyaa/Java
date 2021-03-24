package com.company;

class MyThreadM1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<=500){
            System.out.println("Thread 1");
            try {
                Thread.sleep(300);          //Thread1 will sleep for 300ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyThreadM2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<=500){
            System.out.println("Thread 2");
            i++;
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyThreadM1 t1 = new MyThreadM1();
        MyThreadM2 t2 = new MyThreadM2();

        t1.start();
//        try {
//            t1.join();      //Thread t1 will end then only t2 will start
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t2.start();
    }
}
