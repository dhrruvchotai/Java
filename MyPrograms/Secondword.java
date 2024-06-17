import java.util.Scanner;

public class Secondword {
   public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int n;
     System.out.println("Enter n:");
     n = sc.nextInt();

     for(int i=1;i<n;i++){

        sc.next(); 
     }
     
     if(sc.hasNext()){
        String b = sc.next();
       System.out.println(b);
       sc.close();
    
   }

}

}
