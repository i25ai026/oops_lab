import java.io.*;

public class CapitalizeWordsFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String text = br.readLine();
        br.close();

        String[] words = text.split(" ");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write(result.trim());
        bw.close();

        System.out.println(result.trim());
    }
}