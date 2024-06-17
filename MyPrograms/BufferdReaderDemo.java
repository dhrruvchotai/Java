import java.io.*;

public class BufferdReaderDemo {
    public static void main(String[] args) {
        
    try{
        FileReader fr = new FileReader("Data.txt");
        BufferedReader br = new BufferedReader(fr);


        while(br.ready()){
            // System.out.println(br.read()); It is for reading an char
            System.out.println(br.readLine());
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }

    }    
}
