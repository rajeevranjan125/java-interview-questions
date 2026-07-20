package Multithreading;

public class Sleep {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("start");

        for(int i=0;i<5;i++){
            Thread.sleep(2000);
            System.out.println(i);
        }

        System.out.println("end");
    }
}
