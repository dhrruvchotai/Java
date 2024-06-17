import java.io.*;

public class FirstFileRead {
public static void main(String[] args) {
    
    try{
        FileInputStream fis = new FileInputStream("FirstFile.txt");
        
        int a = fis.read();
        while(a>-1){
            System.out.print((char)(a));
            a = fis.read();
        }
        fis.close();
    }
   catch(Exception e){
    e.printStackTrace();
   }

}
}
