package calculator;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter length");
        int length = input.nextInt();
        System.out.println("enter breadth");
        int breadth =input.nextInt();
        int primeter = 2*length+2*breadth;
        System.out.println("perimeter"+primeter);
    }
}
