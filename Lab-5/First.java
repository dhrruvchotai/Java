import java.util.Scanner;

public class First{
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        Circle c1 = new Circle();


        double d = c1.calculate(r);

        System.out.println(d);
        sc.close();


    }
}
class Circle{

    double radius;

    public double calculate(double radius){
        double res = Math.PI*radius*radius;
        return res;

    }
}