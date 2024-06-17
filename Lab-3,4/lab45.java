import java.util.*;
public class lab45 {
   public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
   
    System.out.println("enter A String= ");
    String s=sc.nextLine();

   
    for(int i=(s.length())/2;i<s.length();i++){
        System.out.println(s.charAt(i));
    }
    System.out.println(s.length());
    sc.close(); sc.close();

}
}
