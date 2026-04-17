class BankAccount {
    private int balance = 600;

    public synchronized void deposit(int amount) {
        while (balance > 2000) {
            try { wait(); } catch (Exception e) {}
        }

        balance += amount;
        System.out.println("Father deposits: " + amount + " | Balance: " + balance);

        if (balance > 2000)
            notify();
    }

    public synchronized void withdraw(int amount) {
        while (balance <= 2000) {
            try { wait(); } catch (Exception e) {}
        }

        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Son withdraws: " + amount + " | Balance: " + balance);
        }

        if (balance < 500)
            notify();
    }
}

class Father extends Thread {
    BankAccount acc;

    Father(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        java.util.Random rand = new java.util.Random();

        while (true) {
            int amt = rand.nextInt(200) + 1;
            acc.deposit(amt);

            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class Son extends Thread {
    BankAccount acc;

    Son(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        java.util.Random rand = new java.util.Random();

        while (true) {
            int amt = rand.nextInt(150) + 1;
            acc.withdraw(amt);

            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

public class BankThreadDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        Father f = new Father(acc);
        Son s = new Son(acc);

        f.start();
        s.start();
    }
}