import java.util.Scanner;

public class MethodHexaDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number : ");
        int a = sc.nextInt();

        String s = Integer.toHexString(a);

        System.out.println("Hexa decimal of "+a+ "is : "+s);

    }
}
