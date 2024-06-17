import java.io.*;

public class ImgDecodeTry {
    public static void main(String[] args) {
        int count=0;

        try{

        FileInputStream fis = new FileInputStream("CodedImg.jpeg");
            
        int read = 0;
        int b = (fis.read());
        while (b > -1) {
         count++;

         if(count==100){
            System.out.println("The length is : "+b);
            for(int i=0;i<b;i++){
                b = fis.read();
                char ch = ((char)b);
                System.out.print(ch);
            }

         }

         else{
            b=fis.read();
         }

           
        }

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
