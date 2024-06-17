import java.util.Scanner;
public class First{
    public static void main(String[] args) {
        Mutliplication m1 = new Mutliplication();
        m1.multiply();

        // int c = Integer.parseInt(args[0]);
        // int d = Integer.parseInt(args[1]);
        // m1.mulcommand(c, d);
    }
}
class Mutliplication{
    Scanner sc = new Scanner(System.in);

    public void multiply(){
        try{
            System.out.println("Enter a : ");
            int a = sc.nextInt();
            System.out.println("Enter b : ");
            int b = sc.nextInt();
            
                System.out.println("The multiply is : "+(a*b));
        }
        catch(Exception e){
            System.out.println("Enter only integer numbers");
        }

    }
    // public void mulcommand(int a , int b){
    //     try{
    //         System.out.println("Multiply is : "+(a*b));
    //     }
    //     catch(Exception e){
    //         System.out.println("Enter only integer numbers");
    //     }
    // } // This is not working solve this
}