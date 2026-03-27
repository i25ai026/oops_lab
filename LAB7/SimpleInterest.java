package LAB7;
import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal, rate, months, years, interest, total;

        System.out.print("Enter Principal: ");
        principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        rate = sc.nextDouble();

        System.out.print("Enter Time in Months: ");
        months = sc.nextDouble();

        years = months / 12;

        interest = principal * (rate / 100) * years;
        total = principal + interest;

        System.out.println("Total Interest = " + interest);
        System.out.println("Final Amount = " + total);
    }
}