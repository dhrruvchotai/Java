import java.util.*;
public class lab32 {
    public static void main(String[] args) {
        System.out.println("enter a number= ");
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int count=0;
            int a;
            while(n!=0){
                count++;
            }
            int []b =new int[count];
            int []c =new int[count];
            
            while(n!=0){
                count++;
            }
            for(int i=0;i<=count;i++){
                a=n%10;
                b[i]=a;
                n=n/10;
            }
            for(int j=count;j<=0;j++){
                b[j]=c[count-j];
            }
            for(int k=0;k<=count;k++){
                if(b[k]==c[k]){
                    System.out.println("this number is pelendrome");
                }
                else{
                    System.out.println("this number is not pelendrome");
                }
            }
            sc.close();
   }
}
