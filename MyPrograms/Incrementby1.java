import java.util.Scanner;

public class Incrementby1 {
    public static void main(String[] args) {
        System.out.println("enter a string:");
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();

        for (int i=0;i<a.length();i++){
          char ch =  a.charAt(i);
          // System.out.println(ch);
          ch++;
          System.out.print(ch);
          sc.close();
         
        } 
    }
}
