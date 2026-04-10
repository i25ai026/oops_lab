import java.io.*;

public class FindTheSubstringFile {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");

        if (!file.exists()) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("the quick brown fox jumps over the lazy dog");
            bw.close();
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String text = br.readLine();
        br.close();

        String lowerText = text.toLowerCase();

        int first = lowerText.indexOf("the");
        int last = lowerText.lastIndexOf("the");

        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        if (first == -1 || last == -1 || first == last) {
            bw.write("\"the\" does not occur at least twice.");
            System.out.println("\"the\" does not occur at least twice.");
        } else {
            bw.write("First occurrence at index: " + first);
            bw.newLine();
            bw.write("Last occurrence at index: " + last);
            bw.newLine();

            String result = text.substring(first + 3, last);

            bw.write("Characters between them: " + result);

            System.out.println("First occurrence at index: " + first);
            System.out.println("Last occurrence at index: " + last);
            System.out.println("Characters between them: " + result);
        }

        bw.close();
    }
}