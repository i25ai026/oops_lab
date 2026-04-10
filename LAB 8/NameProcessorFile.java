import java.io.*;
import java.util.*;

public class NameProcessorFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] names = new String[10];

        for (int i = 0; i < 10; i++) {
            names[i] = br.readLine();
        }
        br.close();

        String[] modified = new String[10];

        for (int i = 0; i < 10; i++) {
            if (names[i] != null && names[i].length() > 3)
                modified[i] = names[i].substring(3);
            else
                modified[i] = "";
        }

        Arrays.sort(modified);

        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        for (String name : modified) {
            bw.write(name);
            bw.newLine();
            System.out.println(name);
        }

        bw.close();
    }
}