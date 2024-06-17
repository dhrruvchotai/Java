import java.util.Scanner;

public class lab471 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number n= ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println("");
        }
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j>i;j--){
                System.out.print('*');
            }
            System.out.println("");
            sc.close();
        }
    }
}
