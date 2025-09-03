import java.util.Random;

class TicketSystem {
    int ticketsAvailable = 10;
    Random random = new Random();

    public void bookTicket(int count) {
        ticketsAvailable -= count;
        System.out.println(Thread.currentThread().getName() + " - Booked " + count + " tickets | Tickets left: " + ticketsAvailable);
    }

    public void cancelTicket(int count) {
        ticketsAvailable += count;
        System.out.println(Thread.currentThread().getName() + " - Cancelled " + count + " tickets | Tickets left: " + ticketsAvailable);
    }
}

class UserSession extends Thread {
    TicketSystem system;
    Random random = new Random();

    UserSession(TicketSystem system) {
        this.system = system;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            int toBook = random.nextInt(3) + 1; // 1–3
            system.bookTicket(toBook);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            int toCancel = random.nextInt(2) + 1; // 1–2
            system.cancelTicket(toCancel);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class TicketSystemProgram {
    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();

        Thread t1 = new UserSession(system);
        Thread t2 = new UserSession(system);
        Thread t3 = new UserSession(system);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final tickets available: " + system.ticketsAvailable);
    }
}
