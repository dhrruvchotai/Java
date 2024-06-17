import java.io.*;

public class ImgCodeTry {
    public static void main(String[] args) {
        int count = 0;
        try {
            FileInputStream fis = new FileInputStream("DCodeVerse.jpeg");
            FileOutputStream fos = new FileOutputStream("CodedImg.jpeg");

            String s = "Hello my name is dhruv chotai.";
            System.out.println(s.length());
            byte[] byteArray = s.getBytes();

            int b = (fis.read());
            while (b > -1) {
                count++;
                if (count == 100    ) {
                    fos.write(s.length());
                }
                if ((count > 100) && (count < 100 + byteArray.length)) {
                    fos.write(byteArray[count - 100]);
                } else {
                    fos.write(b);
                    b = (fis.read());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Done.");

    }
}
