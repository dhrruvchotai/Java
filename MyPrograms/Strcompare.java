import java.util.Scanner;

public class Strcompare {
    public static void main(String[]args){
        String a = "dhruv";
        String b = "dhruv";

        String e,d;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter e: ");
        e = sc.nextLine();

        System.out.println("enter d: ");
        d = sc.nextLine();

        boolean c = a.equals(b);

            System.out.println("a equals b or not :" +c);
            System.out.println("e equals d or not :"+e.equals(d));
         
            System.out.println("enter any number: ");
            boolean b1 = sc.hasNextInt();
            System.out.println(b1);
            sc.close();
    }
}
