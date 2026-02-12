package LAB4;
import java.util.Scanner;

class PerfectChecker {
    public boolean isPerfect(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
            if (freq[s.charAt(i)] > 1)
                return false;
        }
        return true;
    }
}

public class perfectstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PerfectChecker pc = new PerfectChecker();

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        if (pc.isPerfect(s))
            System.out.println("Perfect String");
        else
            System.out.println("Not a Perfect String");
    }
}

    

