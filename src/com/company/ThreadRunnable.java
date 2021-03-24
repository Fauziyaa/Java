package com.company;

class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
    while (i <= 500){
        System.out.println("I'm Runnable thread 1");
        i++;
    }
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i <= 500){
            System.out.println("I'm Runnable thread 2");
            i++;
        }
    }
}

public class ThreadRunnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);      //Thread(Runnable r)

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }

}
