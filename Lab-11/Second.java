import java.io.File;

public class Second {
    public static void main(String[] args) {
        File f1 = new File(args[0]);

        if(f1.exists()){
            System.out.println("The File length in byte is :"+f1.length());
        }
        else if(f1.isDirectory()){

            System.out.println("Absolute path of directory is : "+f1.getAbsolutePath());

            File arr[] = f1.listFiles();
            if(arr!=null)
            {for(int i=0;i<arr.length;i++){
                if((arr[0].isFile())){
                    System.out.println("File name is "+(arr[0].getName()));
                }
            }}
          
        }
        else{
            System.out.println("it is nothing.");
        }
    }
}
