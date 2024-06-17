import java.io.*;

public class Temp4 {
    public static void main(String[] args) {
        mergeFiles("Temp.txt", "Temp2.txt", "Temp3.txt");
    }

    public static void mergeFiles(String file1, String file2, String mergedFile) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile))) {

            String line;

            // Merge data from file1
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Merge data from file2
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files merged successfully!");
        } catch (IOException e) {
            System.err.println("Error merging files: " + e.getMessage());
        }
    }
}
