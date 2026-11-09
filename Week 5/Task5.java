
class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1: " + i);

            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println("Thread 1 interrupted.");
            }
        }
    }
}

class MessageTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 2: Learning Java Multithreading");
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrupted.");
            }
        }
    }
}


public class Task5 {
    public static void main(String[] args) {
        System.out.println("Starting both threads...\n");
        Thread t1 = new Thread(new NumberTask());
        Thread t2 = new Thread(new MessageTask());

        t1.start();
        t2.start();
    }
}