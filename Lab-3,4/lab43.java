import java.util.*;
public class lab43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0;
        double ave;
        double[]arr=new double[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextDouble();
            sum=sum+arr[i];

        }
            ave=sum/4;
            System.out.println(ave);
            sc.close();
    }
}
