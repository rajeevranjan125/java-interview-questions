package Multithreading;

public class ThreadLifeCycle {

    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();

        System.out.println("After creating thread.." + worker.currentThread().getName());

        worker.start();

        System.out.println("After start(): " + worker.currentThread().getName());

        worker.join();

        System.out.println("After join(): " + worker.currentThread().getName());
        System.out.println("After join(): " + worker.currentThread().getName());
        System.out.println("After join(): " + worker.currentThread().getName());
        System.out.println("After join(): " + worker.currentThread().getName());

    }

}

class Worker extends Thread {

    @Override
    public void run() {
        try {

            System.out.println("1.worker stated..");
            System.out.println("2.worker sleep for 2 seconds..");
            Thread.sleep(2000);
            System.out.println("3.Woerker finished");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
