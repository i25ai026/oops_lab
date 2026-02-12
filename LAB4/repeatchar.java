package LAB4;
class FrequencyChecker {
    public void printChars(String s, int n) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] > n) {
                System.out.print(s.charAt(i) + " ");
                freq[s.charAt(i)] = 0;
            }
        }
    }
}

public class repeatchar {
    public static void main(String[] args) {
        FrequencyChecker fc = new FrequencyChecker();
        String s = "aabcdeaagdtdyuhuyftyfjbubhbbsadfdsf";
        int n = 3;
        fc.printChars(s, n);
    }
}

