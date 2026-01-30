import java.util.Scanner;

public class ParkingCharges {

    public static double calculateCharges(double hours) {
        double charge = 2.0;

        if (hours > 3) {
            charge += Math.ceil(hours - 3) * 0.5;
        }

        if (charge > 10.0) {
            charge = 10.0;
        }

        return charge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hours;
        double totalReceipts = 0.0;

        System.out.print("Enter hours parked : ");
        hours = sc.nextDouble();

        while (hours != -1) {
            double charge = calculateCharges(hours);
            System.out.println("Charge for this customer: $" + charge);

            totalReceipts += charge;

            System.out.print("\nEnter hours parked (-1 to quit): ");
            hours = sc.nextDouble();
        }

        System.out.println("\nTotal receipts for yesterday: $" + totalReceipts);
        sc.close();
    }
}

