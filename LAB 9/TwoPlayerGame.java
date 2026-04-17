import java.util.*;

public class TwoPlayerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Player 1, enter a number: ");
        sc.nextInt();

        System.out.print("Player 2, enter a number: ");
        sc.nextInt();

        int p1 = rand.nextInt(100);
        int p2 = rand.nextInt(100);

        System.out.println("Player 1 random number: " + p1);
        System.out.println("Player 2 random number: " + p2);

        if (p1 > p2) {
            System.out.println("Player 1 wins!");
            System.out.println("Points: " + (p1 - p2));
        } else if (p2 > p1) {
            System.out.println("Player 2 wins!");
            System.out.println("Points: " + (p2 - p1));
        } else {
            System.out.println("It's a tie!");
        }

        sc.close();
    }
}