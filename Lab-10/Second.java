import java.io.*;

public class Second {

    public static void main(String[] args) {

        String word1 = "Dhruv";
        String word2 = "D";

        try {
            File f1 = new File("Data.txt");
            File f2 = new File("Data1.txt");

            BufferedReader r1 = new BufferedReader(new FileReader(f1));
            BufferedWriter w2 = new BufferedWriter(new FileWriter(f2));

            String line = r1.readLine();
            int count= 0;

            while (line != null) {
                String changedLine = "";

                String a[]=line.split("\\s+");
                
                for(int i=0;i<a.length;i++){
                    if(a[i].equals(word1)){
                        count++;
                        changedLine+=word2+" ";
                    }else{
                        changedLine+=a[i]+" ";
                    }
                }
                
                w2.write(changedLine);
                w2.newLine();
                line = r1.readLine();
            }

            r1.close();
            w2.close();
            

            System.out.println("Replacements Counts: " +count);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}