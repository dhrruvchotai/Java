import java.util.Scanner;

public class MethodsofString {
    public static void main(String[] args) {
       
        // Scanner sc = new Scanner(System.in);
        // Scanner sc1 = new Scanner(System.in);
        // System.out.print("Enter a word: ");
        //     String a = sc.next();
        //     System.out.print("Enter a String: ");
        //     String b = sc1.nextLine();
    
        //     System.out.println(a.trim());
        //     System.out.println(b.trim());
        //     System.out.println(b.substring(3, 5));
        // sc.close();
        // sc1.close();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");

        String a = sc.nextLine();

        System.out.println("Enter b: ");
        String b = sc.nextLine();

        if(a.equalsIgnoreCase(b)){
            System.out.println("Strings are equal");
        }
        else{
        System.out.println("Strings are not equal");
        }
        sc.close();


    }
}
