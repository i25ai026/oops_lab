import java.util.Scanner;

class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    Invoice(String pNo, String pDesc, int qty, double price) {
        partNumber = pNo;
        partDescription = pDesc;
        quantity = (qty > 0) ? qty : 0;
        pricePerItem = (price > 0) ? price : 0.0;
    }

    double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Part Number: ");
        String pNo = sc.nextLine();

        System.out.print("Enter Description: ");
        String desc = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter Price per Item: ");
        double price = sc.nextDouble();

        Invoice i = new Invoice(pNo, desc, qty, price);

        System.out.println("\nInvoice Amount = " + i.getInvoiceAmount());
    }
}

