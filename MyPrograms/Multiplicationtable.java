import java.util.Scanner;

public class Multiplicationtable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.err.printf("%d * %d = %d",n,i,n*i);
            System.out.println("");
        }
        sc.close();
    }
}