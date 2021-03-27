package com.company;

class Practice1A extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<=500){
            System.out.println("Good Morning");
            i++;
        }
    }
}
class Practice1B extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<=500){
            System.out.println("Welcome");
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            i++;
        }
    }
}

class Practice2 implements Runnable{
    public Practice2(){
        Thread currThread = Thread.currentThread();
        Thread t1 = new Thread(currThread, "Fauziya");
        System.out.println("Current Thread: " +currThread);
        System.out.println("Thread Created: "+t1);
        t1.start();

    }
    @Override
    public void run() {
        System.out.println("Running the thread");
    }

}

public class ThreadPractice {
    public static void main(String[] args) {
    Practice1A t1 = new Practice1A();
    Practice1B t2 = new Practice1B();

   new Practice2();

    t1.setName("Thread11111");
    t2.setName("Thread22222");
    t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);

    t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t2.start();

    System.out.println("Priority of Thread 1 is: "+t1.getPriority());
    System.out.println("Priority of Thread 2 is: "+t2.getPriority());

    System.out.println("State of Thread 1 is: "+t1.getState());
    System.out.println("State of Thread 2 is: "+t2.getState());

//    System.out.println(Thread.currentThread());


    }
}
