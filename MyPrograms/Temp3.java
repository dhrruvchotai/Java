//to count the number of words , sentences, charecters.
import java.io.*;
public class Temp3 {
    public static void main(String[] args) {
        try{


            File f1 = new File("Temp.txt");
            int countCharecter = 0;
            int countSentence = 0;
            int countWord = 0;
                
            BufferedReader br = new BufferedReader(new FileReader("Temp.txt"));
            String data = "";

                while((data = br.readLine()) != null){
                    String[] s = data.split("\\s+");
                    countWord+=s.length;
                    countSentence++;
                   
                }
                countCharecter += f1.length();
                System.out.println("Number of Char= "+countCharecter);
                System.out.println("Number of sentence = "+countSentence);
                System.out.println("Number of Words = "+countWord);
                br.close();
            
        }
        catch(Exception e){
           System.out.println("File is not Readble");
        }
        


    }
}
