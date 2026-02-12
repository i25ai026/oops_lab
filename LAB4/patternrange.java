package LAB4;
import java.util.Scanner;

class PatternCounter {
    public int countPattern(int a, int b, String pattern) {
        int count = 0;

        for (int i = a; i <= b; i++) {
            String num = String.valueOf(i);
            if (num.contains(pattern))
                count++;
        }

        return count;
    }
}

public class patternrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatternCounter pc = new PatternCounter();

        System.out.print("Enter range (a b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter pattern: ");
        String pattern = sc.next();

        int result = pc.countPattern(a, b, pattern);

        System.out.println("The number of times " + pattern +
                " occurred between " + a + " and " + b + ": " + result);
    }
}
