public class ThreadPractical1 {

    // 1) Thread subclass that prints numbers 1 to 5
    static class NumberPrinter extends Thread {
        public NumberPrinter(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(getName() + " prints: " + i);
                    Thread.sleep(1000); // 1 second delay
                }
            } catch (InterruptedException e) {
                System.err.println(getName() + " interrupted");
                Thread.currentThread().interrupt();
            }
        }
    }

    // 2) Runnable implementation that prints letters A to E
    static class LetterPrinter implements Runnable {
        private final String name;

        public LetterPrinter(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " prints: " + (char) (i + 64));
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.err.println(Thread.currentThread().getName() + " interrupted");
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        // Create and start the NumberPrinter thread
        NumberPrinter numThread = new NumberPrinter("NumberThread");
        numThread.start();

        try {
            // Wait for NumberPrinter to finish
            numThread.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted while waiting for NumberThread");
            Thread.currentThread().interrupt();
        }

        // Create and start the LetterPrinter thread AFTER numbers are done
        Thread letterThread = new Thread(new LetterPrinter("LetterThread"), "LetterThread");
        letterThread.start();

        try {
            // Wait for LetterPrinter to finish
            letterThread.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted while waiting for LetterThread");
            Thread.currentThread().interrupt();
        }

        System.out.println("Both threads have finished.");
    }
}
