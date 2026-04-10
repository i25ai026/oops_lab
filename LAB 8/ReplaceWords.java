import java.io.*;

public class ReplaceWords {
    public static void main(String[] args) throws Exception {
        File file = new File("sdj.txt");

        if (!file.exists()) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("I WISH IT HAPPENS AGAIN");
            bw.close();
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            content.append(line).append("\n");
        }
        br.close();

        String result = content.toString().replace("his", "her");

        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write(result);
        bw.close();

        System.out.println(result);
    }
}