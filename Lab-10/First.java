import java.io.BufferedReader;
import java.io.FileReader;

public class First {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Data.txt");
            BufferedReader br = new BufferedReader(fr);

            int lines = 0;
            int ch = 0;
            int words = 0;

            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                ch += line.length(); 

                String[] arr = line.split("\\s+");
                words += arr.length;
            }

            System.out.println("lines: " + lines + ", char: " + ch + ", words: " + words);

            fr.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

