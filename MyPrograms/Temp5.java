//To replace One Word to other..................
import java.io.*;
import java.util.Scanner;

public class Temp5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number you want to replace = ");
        String s = sc.nextLine();
        System.out.println("enter the word you want to add = ");
        String s2 = sc.nextLine();
        sc.close();
        int count = 0;

        try{
           BufferedReader br = new BufferedReader(new FileReader("Temp2.txt"));
           BufferedWriter bw = new BufferedWriter(new FileWriter("Temp.txt"));
            String temp = "";
           while((temp = br.readLine()) != null){
           String[] Sabda = temp.split("\\s+"); 

            for(int i=0;i<Sabda.length;i++){
                if(s.equals(Sabda[i])){
                    Sabda[i] = s2;
                    
                    count++;
                }
                bw.write(Sabda[i]+" ");
            }
            bw.write("\n");
           
           }


            br.close();
            bw.close();
            System.out.println(count);
            System.out.println("thai gyu kam.........");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}