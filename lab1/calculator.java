package calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        Operations op = new Operations();

        System.out.println("Sum = " + op.add(a, b));
        System.out.println("Difference = " + op.subtract(a, b));
        System.out.println("Product = " + op.multiply(a, b));
        System.out.println("Quotient = " + op.divide(a, b));

        sc.close();
    }

}
