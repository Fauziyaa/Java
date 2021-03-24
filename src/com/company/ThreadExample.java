package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
    int i = 0;
    while (i <= 500){
        System.out.println("I'm Thread 1");
        System.out.println("I'm Cooking");
        i++;
    }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i <= 500){
            System.out.println("I'm Thread 2");
            System.out.println("I'm Chatting");
            i++;
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
