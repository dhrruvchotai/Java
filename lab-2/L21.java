// Write a program to get 2 numbers from the user and print the sum of two numbers using command line and Scanner class.
import java.util.Scanner;

public class L21 {
    public static void main(String[] args) {

        // Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.print("Using Scanner:");
        System.out.println(a+b);

        // command Line
        int c = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        
        System.out.print("Using CommandLine:");
        System.out.println(c+d);

        sc.close();
    }
}
