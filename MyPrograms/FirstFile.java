import java.io.*;

public class FirstFile {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("FirstFile.txt");
            String s = "Hello, my namms is dhruv.";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
