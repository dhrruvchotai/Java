import java.io.*;

public class ImgReadWrite {
    public static void main(String[] args) {
    
        try{
        FileInputStream fis = new FileInputStream("DCodeVerse.jpeg");
        FileOutputStream fos = new FileOutputStream("NewImage.jpeg");

        
        int b = (fis.read());
        while(b>-1){
            fos.write(b);
            b = (fis.read());
            fis.close();
            fos.close();
        }

            
    }
    catch(Exception e){
        e.printStackTrace();
    }
    System.out.println("Done.");
    }
}
