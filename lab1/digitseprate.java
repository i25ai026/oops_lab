import java.util.Scanner;

public class digitseprate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int number = sc.nextInt();
        if (number < 10000 || number > 99999) {
            System.out.println("Error:enter exactly 5 digits!");
        } else {
            int d1 = number / 10000;
            int d2 = (number / 1000) % 10;
            int d3 = (number / 100) % 10;
            int d4 = (number / 10) % 10;
            int d5 = number % 10;
            System.out.println(d1 + "   " + d2 + "   " + d3 + "   " + d4 + "   " + d5);
        }
    }
}
