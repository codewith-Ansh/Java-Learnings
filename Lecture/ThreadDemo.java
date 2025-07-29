public class ThreadDemo implements Runnable {
    // ThreadDemo(String name) {
    //     super(name);
    // }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1500);
            System.out.println(Thread.currentThread().getState());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("In run method; Thread name is: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadDemo myThread = new ThreadDemo();
        Thread t1 = new Thread(myThread);
        t1.start();

        System.out.println(t1);
        // t1.setName("MyThread");
        System.out.println(Thread.currentThread().getName() + " Currently in " + t1.getState());
    }
}