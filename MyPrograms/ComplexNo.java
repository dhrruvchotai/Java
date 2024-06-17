import java.util.Scanner;
public class ComplexNo{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter c : ");
        int c = sc.nextInt();
        System.out.println("Enter d : ");
        int d = sc.nextInt();

        Complex c1 = new Complex(a,b);
        Complex c2 = new Complex(c,d);
        
        Complex c3 = new Complex();
        c3.add(c1, c2);

        sc.close();
        

    }
}
class Complex{
    int real;
    int img;

    Complex(){
        real = 1;
        img = 1;
    }
    Complex(int a ,int b){
        real = a;
        img = b;
    }
   public void add(Complex c1 , Complex c2){
    real =  c1.real + c2.real;
    img = c2.img + c2.img;
    System.out.println("Real is : " +real);
    System.out.println("Img is : "+img);
   }
}