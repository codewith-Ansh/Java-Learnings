// Thread class using Inheritance
class NumberPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread class using Runnable Interface
class CharPrinter implements Runnable {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Character: " + c);
            try {
                Thread.sleep(700); // pause for 0.7 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        // Using inheritance
        NumberPrinter t1 = new NumberPrinter();

        // Using Runnable interface
        CharPrinter cp = new CharPrinter();
        Thread t2 = new Thread(cp);

        // Start both threads
        t1.start();
        t2.start();

        System.out.println("Main thread finished starting child threads!");
    }
}
