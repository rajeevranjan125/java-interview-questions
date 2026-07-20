package Multithreading;

public class MainWithInterface {

    public static void main(String[] args) {

        InnerMainWithInterface t = new InnerMainWithInterface();

        Thread t1 = new Thread(t);

        t1.start();

        System.out.println(Thread.currentThread().getName());
    }
}

/**
 * InnerMainWithInterface
 */
class InnerMainWithInterface implements Runnable {

    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}