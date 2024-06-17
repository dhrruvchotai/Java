import java.util.*;
public class lab42 {
   public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int v=0;
    int cons=0;
    System.out.println("enter A String= ");
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++){
       if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ){
        v++;
       }
       else{
        cons++;
    }
       
    }
   System.out.println(v);
   System.out.println(cons);
   sc.close();
   }
 
}
