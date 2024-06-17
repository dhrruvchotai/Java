import java.util.Scanner;

public class lab31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number of each subject: ");
        int tm = sc.nextInt();
        System.out.println("enter obtained marks of 5 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        double per = ((m1+m2+m3+m4+m5)/(tm*5.0))*100;

        if(per>=60){
            System.out.println("First Division");
        }
        else if(per>50 && per<59){
            System.out.println("second division");
        }
        else if(per>40 && per<49){
            System.out.println("third division");
        }
        else{
            System.out.println("fail");
        }
        sc.close();
    }
    
}