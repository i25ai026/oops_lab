package LAB6;
class Bank {

    double deposit(double amount, double balance) {
        return balance + amount;
    }

    double withdraw(double amount, double balance) {
        if (balance >= amount) {
            return balance - amount;
        } else {
            return 0;
        }
    }
}

public class BankTest {
    public static void main(String[] args) {

        Bank b = new Bank();

        double balance = 1000.0;

        balance = b.deposit(500.0, balance);
        System.out.println("Balance after deposit: " + balance);

        balance = b.withdraw(300.0, balance);
        System.out.println("Balance after withdrawal: " + balance);

        balance = b.withdraw(1500.0, balance);
        System.out.println("Balance after withdrawal: " + balance);
    }
}
