package OOP;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // handle exception
            }
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2 - Count: " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                // handle exception
            }
        }
    }
}

public class ThreadingClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
    }
}