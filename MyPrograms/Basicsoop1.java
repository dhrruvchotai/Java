import java.util.Scanner;

class Box{
    int height;
    int width;
    int breadth;

    public void Getuser(){

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter height: ");
        height = sc.nextInt();

        System.out.println("Enter width: ");
        width = sc.nextInt();

        System.out.println("Enter breadth: ");
        breadth = sc.nextInt();

        sc.close();

    }

    public int Calculate(int a,int b,int c){
        int ans = a*b*c;
        return ans;
       
}
}
public class Basicsoop1{
    public static void main(String[] args) {

        Box b1 = new Box();
        b1.Getuser();
    
        int ans1 = b1.Calculate(b1.height,b1.width,b1.breadth);
        System.out.println("The Volume is :"+ans1);

    }
}
