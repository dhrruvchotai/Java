import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Replaceword{
    public static void main(String[] args) {
        
        try{

            File f1 = new File("temp.txt");
            File f2 = new File("temp1.txt");

            BufferedReader br = new BufferedReader(new FileReader());
            BufferdWriter bf = new BufferdWriter(new FileWriter(f2));

            String s = " ";
            int c = 0;

            String s1 = "word1";
            String s2 = "word2";



            while((s=br.readLine())!null){

                String arr[] = s.split("\\s+");

            } 
            for(int i=0;i<arr.length;i++){
                if(arr[i].equals("word1")){
                    arr[i] = s1;
                }
            }
            for(int j=0;j<arr.length;j++){
               System.out.println("The element is : "+arr[j]);
            }
            
            f1.close();
            f2.close();
            br.close();
            bf.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}