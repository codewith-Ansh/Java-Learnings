class BankAccount {
    double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " - Deposited: " + amount + " | Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance < amount) {
            System.out.println(Thread.currentThread().getName() + " - Insufficient Balance for withdrawal: " + amount);
            return;
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " - Withdrawn: " + amount + " | Balance: " + balance);
    }

    void showFinalBalance() {
        System.out.println("Final Balance: " + balance);
    }
}

class BankTask extends Thread {
    BankAccount account;
    double depositAmount, withdrawAmount;

    BankTask(BankAccount account, double depositAmount, double withdrawAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(depositAmount);
            account.withdraw(withdrawAmount);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BankAccountProgram {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new BankTask(account, 500, 200);
        Thread t2 = new BankTask(account, 1000, 500);
        Thread t3 = new BankTask(account, 1500, 700);

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

        account.showFinalBalance();
    }
}
