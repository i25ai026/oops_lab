package operations;

import java.util.Scanner;

public class opercal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int sum = a + b + c;
        double avg = sum / 3.0;
        int product = a * b * c;

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Average = " + avg);

        if (a >= b && a >= c) {
            System.out.println(a + " is greater");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is greater");
        } else {
            System.out.println(c + " is greater");
        }
        if (a <= b && a <= c) {
            System.out.println(a + " is smaller");
        } else if (b <= a && b <= c) {
            System.out.println(b + " is smaller");
        } else {
            System.out.println(c + " is smaller");
        }

        input.close();
    }

}
