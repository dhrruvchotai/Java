import java.util.Scanner;
public class Studentdiv{
   
    public static void main(String[]args){

     Scanner sc = new Scanner(System.in);

     int mark[] = new int[5];


        for(int i=0;i<5;i++)
        {
                System.out.print("Enter Marks Of Subject " + i );
                System.out.print(" out of 30 ,");
                System.out.print(" enter : ");


                    mark[i] = sc.nextInt();

                // System.out.println("\n");
        }
            int a=0;

        for(int i=0;i<5;i++)
        {
            
            a = a + mark[i];

        }
        double res =  ((a/150.0)*100);
        System.out.println(res);
        sc.close();
    }

}
