import java.util.Scanner;

public class lab33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            System.out.println("A is largest");
            if(a>c){
                System.out.println("A is largest");
            }
            else{
                System.out.println("C is largest");
            }
        }
        else{
            if(b>c){
                System.out.println("B is largest");
            }
            else{
                System.out.println("C is largest");
            }
        }
        sc.close();
    } 
      
}
