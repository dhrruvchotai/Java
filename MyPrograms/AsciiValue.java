import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter String :");
        String s = sc.nextLine();
        

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            System.out.println("ascii value of"+((int)c));
        }

    }
}
