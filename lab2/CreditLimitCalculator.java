import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accountNumber;
        double beginningBalance, charges, credits, creditLimit;

        System.out.print("Enter account number (-1 to quit): ");
        accountNumber = sc.nextInt();

        while (accountNumber != -1) {
            System.out.print("Enter beginning balance: ");
            beginningBalance = sc.nextDouble();

            System.out.print("Enter total charges this month: ");
            charges = sc.nextDouble();

            System.out.print("Enter total credits this month: ");
            credits = sc.nextDouble();

            System.out.print("Enter credit limit: ");
            creditLimit = sc.nextDouble();

            double newBalance = beginningBalance + charges - credits;

            System.out.println("New balance: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            }

            System.out.print("\nEnter account number : ");
            accountNumber = sc.nextInt();
        }
    }
}
