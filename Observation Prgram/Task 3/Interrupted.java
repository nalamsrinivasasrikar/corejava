package exceptions;
public class Interrupted {
    public static void main(String[] args) {
        try {
            Thread.sleep(2000);
            System.out.println("Thread completed");
            //Handling interruptions in multithreaded programs
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}