import java.util.Scanner;

public class Kmstomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a in kms: ");
        double a = sc.nextDouble();
        double b = 0.6*a;
      System.out.println("a in miles = "+b);
        sc.close();
    }
}
