package Multithreading;

public class MainWithClass {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        System.out.println(Thread.currentThread().getName());

        t1.start(); //new thread created and that new thread internally called run method

        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread extends Thread{

    public void run(){
    //    System.out.println(Thread.currentThread().getName());
    }
}
